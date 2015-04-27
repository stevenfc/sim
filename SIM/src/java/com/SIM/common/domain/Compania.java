package com.SIM.common.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Merlin Matamoros
 */
public class Compania {
    
    //Atributos
    private int id;
    private String nombre;
    private byte[] logo;
    private String correo;
    private String telefono;
    private String cedulaJuridica;
    private String pais;
    private String direccion;

    public Compania() {
    }

    public Compania(int id, String nombre, byte[] logo, String correo, String telefono, String cedulaJuridica, String pais, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
        this.correo = correo;
        this.telefono = telefono;
        this.cedulaJuridica = cedulaJuridica;
        this.pais = pais;
        this.direccion = direccion;
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

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "COMPAÑÍA: " + "id: " + id + ", nombre: " + nombre + ", logo: " + logo 
                + ", correo: " + correo + ", telefono: " + telefono + ", cedulaJuridica: " 
                + cedulaJuridica + ", pais: " + pais + ", direccion: " + direccion + ". \n";
    }
}//Fin de la clase Compania