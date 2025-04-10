package com.unipago.unisigma.tool.domain;

public class ParametroEjecucionNotificacion {

    private String parametroId;
    private String descripcion;
    private String estado;
    private String tipoDato;
    private String valor;

    public ParametroEjecucionNotificacion(String parametroId, String descripcion, String estado, String tipoDato, String valor) {
        this.parametroId = parametroId;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoDato = tipoDato;
        this.valor = valor;
    }

    public ParametroEjecucionNotificacion() {
    }

    public String getParametroId() {
        return parametroId;
    }

    public void setParametroId(String parametroId) {
        this.parametroId = parametroId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ParametroEjecucionNotificacion{" +
                "parametroId='" + parametroId + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", tipoDato='" + tipoDato + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
