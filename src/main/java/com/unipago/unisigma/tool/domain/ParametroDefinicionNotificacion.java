package com.unipago.unisigma.tool.domain;

public class ParametroDefinicionNotificacion {

    private String parametroId;
    private String descripcion;
    private String estado;
    private String tipoDato;
    private String valorDefecto;

    public ParametroDefinicionNotificacion(String parametroId, String descripcion, String estado, String tipoDato, String valorDefecto) {
        this.parametroId = parametroId;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoDato = tipoDato;
        this.valorDefecto = valorDefecto;
    }

    public ParametroDefinicionNotificacion() {
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

    public String getValorDefecto() {
        return valorDefecto;
    }

    public void setValorDefecto(String valorDefecto) {
        this.valorDefecto = valorDefecto;
    }

    @Override
    public String toString() {
        return "ParametroDefinicionNotificacion{" +
                "parametroId='" + parametroId + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                ", tipoDato='" + tipoDato + '\'' +
                ", valorDefecto='" + valorDefecto + '\'' +
                '}';
    }
}
