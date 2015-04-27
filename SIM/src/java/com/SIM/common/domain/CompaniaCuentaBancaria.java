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
public class CompaniaCuentaBancaria {
    
    //Atributos
    private int id;
    private String numeroCuenta;
    private String tipoCuenta;
    private String tipoDivisa;
    private boolean estado;
    private String pais;
    private String provincia;
    private String nombreDueno;
    private String apellidosDueno;

    public CompaniaCuentaBancaria() {
    }

    public CompaniaCuentaBancaria(int id, String numeroCuenta, String tipoCuenta, String tipoDivisa, boolean estado, String pais, String provincia, String nombreDueno, String apellidosDueno) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.tipoDivisa = tipoDivisa;
        this.estado = estado;
        this.pais = pais;
        this.provincia = provincia;
        this.nombreDueno = nombreDueno;
        this.apellidosDueno = apellidosDueno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoDivisa() {
        return tipoDivisa;
    }

    public void setTipoDivisa(String tipoDivisa) {
        this.tipoDivisa = tipoDivisa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getApellidosDueno() {
        return apellidosDueno;
    }

    public void setApellidosDueno(String apellidosDueno) {
        this.apellidosDueno = apellidosDueno;
    }

    @Override
    public String toString() {
        return "CompaniaCuentaBancaria: " + "id: " + id + ", numeroCuenta: " + numeroCuenta 
                + ", tipoCuenta: " + tipoCuenta + ", tipoDivisa: " + tipoDivisa + ", estado. " + estado 
                + ", pais: " + pais + ", provincia: " + provincia + ", nombreDueno: " + nombreDueno 
                + ", apellidosDueno: " + apellidosDueno + ". \n";
    }
}//Fin de la clase CompaniaCuentaBancaria