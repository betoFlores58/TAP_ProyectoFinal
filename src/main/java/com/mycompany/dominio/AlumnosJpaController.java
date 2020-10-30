package com.mycompany.dominio;

import com.mycompany.dominio.exceptions.NonexistentEntityException;
import com.mycompany.dominio.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AlumnosJpaController implements Serializable {

    //--------------------------------------------------------------------------
    private EntityManagerFactory emf = null;
    
    //--------------------------------------------------------------------------
    public AlumnosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("miBaseDatos");
    }

    //--------------------------------------------------------------------------
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //--------------------------------------------------------------------------
    public void create(Alumnos alumnos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumnos);
            em.getTransaction().commit();
            
        }
        catch (Exception ex)
        {
            if (findAlumnos(alumnos.getNumControl()) != null)
            {
                throw new PreexistingEntityException("Alumnos " + alumnos + " already exists.", ex);
            }
            throw ex;
        }
        finally
        {
            if (em != null)
                em.close();
        }
    }

    //--------------------------------------------------------------------------
    public void edit(Alumnos alumnos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            alumnos = em.merge(alumnos);
            em.getTransaction().commit();
        }
        catch (Exception ex)
        {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0)
            {
                String id = alumnos.getNumControl();
                if (findAlumnos(id) == null)
                {
                    throw new NonexistentEntityException("The alumnos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        }
        finally
        {
            if (em != null)
                em.close();
        }
    }

    //--------------------------------------------------------------------------
    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumnos alumnos;
            try
            {
                alumnos = em.getReference(Alumnos.class, id);
                alumnos.getNumControl();
            }
            catch (EntityNotFoundException enfe)
            {
                throw new NonexistentEntityException("The alumnos with id " + id + " no longer exists.", enfe);
            }
            
            em.remove(alumnos);
            em.getTransaction().commit();
        }
        finally
        {
            if (em != null)
                em.close();
        }
    }

    //--------------------------------------------------------------------------
    public List<Alumnos> findAlumnosEntities()
    {
        return findAlumnosEntities(true, -1, -1);
    }

    public List<Alumnos> findAlumnosEntities(int maxResults, int firstResult)
    {
        return findAlumnosEntities(false, maxResults, firstResult);
    }

    private List<Alumnos> findAlumnosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Alumnos.class));
            Query q = em.createQuery(cq);
            
            if (!all)
            {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            
            return q.getResultList();
        }
        finally
        {
            em.close();
        }
    }

    public Alumnos findAlumnos(String id)
    {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Alumnos.class, id);
        }
        finally
        {
            em.close();
        }
    }

    public int getAlumnosCount() {
        EntityManager em = getEntityManager();
        
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Alumnos> rt = cq.from(Alumnos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            
            return ((Long) q.getSingleResult()).intValue();
        }
        finally
        {
            em.close();
        }
    }
}
