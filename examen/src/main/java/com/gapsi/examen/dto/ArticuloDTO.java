package com.gapsi.examen.dto;

public class ArticuloDTO {

    private String idArticulo;
    private String nombre;
    private String descripcion;
    private float precio;
    private String modelo;

    public ArticuloDTO(String idArticulo, String nombre, String descripcion, float precio, String modelo) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.modelo = modelo;
    }

    public ArticuloDTO() {
    }

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
