package com.gapsi.examen.domain.entity;

import com.sun.istack.NotNull;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 10, max = 10)
    @Column(name = "id_articulo", updatable = false, length = 10)
    private String idArticulo;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre", updatable = false)
    private String nombre;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion", updatable = true)
    private String descripcion;

    @Basic(optional = false)
    @NotNull
    @Min(value = 1)
    @Max(value = 999999)
    @Column(name = "precio", updatable = false)
    private float precio;

    @Basic(optional = false)
    @NotNull
    @Size(min = 10, max = 10)
    @Column(name = "modelo", updatable = true)
    private String modelo;

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
