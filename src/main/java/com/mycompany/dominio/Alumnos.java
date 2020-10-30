package com.mycompany.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alumnos")
public class Alumnos implements Serializable {
    
    //--------------------------------------------------------------------------
    @Id
    @Column
    private String numControl;
    @Column
    private String nombre;
    @Column
    private double promedio;
    @Column
    private int semestre;
    @Column
    private boolean activo;
    @Column
    private char sexo;

    //--------------------------------------------------------------------------

    public Alumnos() {}
    
    //--------------------------------------------------------------------------
    public Alumnos(String numControl, String nombre, double promedio, int semestre, boolean activo, char sexo) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.promedio = promedio;
        this.semestre = semestre;
        this.activo = activo;
        this.sexo = sexo;
    }
    
    //--------------------------------------------------------------------------
    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    //--------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //--------------------------------------------------------------------------
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    //--------------------------------------------------------------------------
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    //--------------------------------------------------------------------------
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //--------------------------------------------------------------------------
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //--------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Alumnos{" + "numControl=" + numControl +
        ", nombre=" + nombre + ", promedio=" + promedio +
        ", semestre=" + semestre + ", activo=" + activo + ", sexo=" + sexo + '}';
    }
    
    //--------------------------------------------------------------------------
}
