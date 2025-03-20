package com.unipago.unisigma.tool.domain;

import java.io.Serializable;

public class SuscripcionNotificacion implements Serializable {

    private Integer suscripcionNotificacionId;
    private Integer entidadId;
    private Integer servicioId;
    private String estado;

    public SuscripcionNotificacion(Integer suscripcionNotificacionId, Integer entidadId, Integer servicioId, String estado) {
        this.suscripcionNotificacionId = suscripcionNotificacionId;
        this.entidadId = entidadId;
        this.servicioId = servicioId;
        this.estado = estado;
    }

    public SuscripcionNotificacion() {
    }

    public Integer getSuscripcionNotificacionId() {
        return suscripcionNotificacionId;
    }

    public void setSuscripcionNotificacionId(Integer suscripcionNotificacionId) {
        this.suscripcionNotificacionId = suscripcionNotificacionId;
    }

    public Integer getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(Integer entidadId) {
        this.entidadId = entidadId;
    }

    public Integer getServicioId() {
        return servicioId;
    }

    public void setServicioId(Integer servicioId) {
        this.servicioId = servicioId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "SuscripcionNotificacion{" +
                "suscripcionNotificacionId=" + suscripcionNotificacionId +
                ", entidadId=" + entidadId +
                ", servicioId=" + servicioId +
                ", estado='" + estado + '\'' +
                '}';
    }
}
