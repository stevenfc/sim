/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIM.common.domain;

/**
 *
 * @author Merlin Matamoros
 */
public class Banco {
    
    //Atributos
    private int id;
    private String codigoIdentificadorBanco;
    private String nombre;
    private String email;
    private String ciudad;
    private String fax;
    private String zip;
    private String pais;
    private String telefono;
    private String direccion;
    private String estadoPais;
    private boolean activo;

    public Banco() {
    }

    public Banco(int id, String codigoIdentificadorBanco, String nombre, String email, String ciudad, String fax, String zip, String pais, String telefono, String direccion, String estadoPais, boolean activo) {
        this.id = id;
        this.codigoIdentificadorBanco = codigoIdentificadorBanco;
        this.nombre = nombre;
        this.email = email;
        this.ciudad = ciudad;
        this.fax = fax;
        this.zip = zip;
        this.pais = pais;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadoPais = estadoPais;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoIdentificadorBanco() {
        return codigoIdentificadorBanco;
    }

    public void setCodigoIdentificadorBanco(String codigoIdentificadorBanco) {
        this.codigoIdentificadorBanco = codigoIdentificadorBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoPais() {
        return estadoPais;
    }

    public void setEstadoPais(String estadoPais) {
        this.estadoPais = estadoPais;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "BANCO:" + "id: " + id + ", codigoIdentificadorBanco: " + codigoIdentificadorBanco 
                + ", nombre: " + nombre + ", email: " + email + ", ciudad: " + ciudad + ", fax: " + fax 
                + ", zip: " + zip + ", pais:" + pais + ", telefono: " + telefono + ", direccion: " + direccion 
                + ", estadoPais: " + estadoPais + ", activo: " + activo + ".\n";
    }    
}//Fin de la casle Banco