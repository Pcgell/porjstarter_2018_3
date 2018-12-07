package edu.ujcv.progra1.edu.ujcv.progra1.models;

public class Cliente {

    private String primerNombre;
    private String primerApellido;
    private String codigoCliente;
    private String identidad;

    public Cliente( String identidad, String primerNombre, String primerApellido, String codigoCliente) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.codigoCliente = codigoCliente;
        this.identidad = identidad;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }
}
