package com.unipago.unisigma.tool.domain;

public class TipoNotificacion {

    private Short tipoNotificacionId;
    private String descripcion;
    private String estado;

    public TipoNotificacion(Short tipoNotificacionId, String descripcion, String estado) {
        this.tipoNotificacionId = tipoNotificacionId;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public TipoNotificacion() {
    }

    public Short getTipoNotificacionId() {
        return tipoNotificacionId;
    }

    public void setTipoNotificacionId(Short tipoNotificacionId) {
        this.tipoNotificacionId = tipoNotificacionId;
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

    @Override
    public String toString() {
        return "TipoNotificacion{" +
                "tipoNotificacionId=" + tipoNotificacionId +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
