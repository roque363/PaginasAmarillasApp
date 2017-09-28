package com.roque.paginasamarillasapp.models;

/**
 * Created by ROQUE on 27/09/2017.
 */

public class Empresa {
    private int id;
    private String nombre;
    private String rubro;
    private String direccion;
    private String telefono;
    private String correo;
    private String url;
    private String info;
    private int imgId;

    public Empresa(){

    }

    public Empresa(int id, String nombre, String rubro, String direccion, String telefono, String correo, String url, String info, int imgId) {
        this.id = id;
        this.nombre = nombre;
        this.rubro = rubro;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.url = url;
        this.info = info;
        this.imgId = imgId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", rubro='" + rubro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", url='" + url + '\'' +
                ", info='" + info + '\'' +
                ", imgId=" + imgId +
                '}';
    }
}
