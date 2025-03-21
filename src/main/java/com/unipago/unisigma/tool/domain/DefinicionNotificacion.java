package com.unipago.unisigma.tool.domain;

public class DefinicionNotificacion {

    private Integer definicionNotificacionId;
    private Short tipoNotificacionId;
    private String asunto;
    private String mensaje;
    private Boolean destinatariosDinamicos;
    private String estado;

    public DefinicionNotificacion(Integer definicionNotificacionId, Short tipoNotificacionId, String asunto, String mensaje, Boolean destinatariosDinamicos, String estado) {
        this.definicionNotificacionId = definicionNotificacionId;
        this.tipoNotificacionId = tipoNotificacionId;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.destinatariosDinamicos = destinatariosDinamicos;
        this.estado = estado;
    }

    public DefinicionNotificacion() {
    }

    public Integer getDefinicionNotificacionId() {
        return definicionNotificacionId;
    }

    public void setDefinicionNotificacionId(Integer definicionNotificacionId) {
        this.definicionNotificacionId = definicionNotificacionId;
    }

    public Short getTipoNotificacionId() {
        return tipoNotificacionId;
    }

    public void setTipoNotificacionId(Short tipoNotificacionId) {
        this.tipoNotificacionId = tipoNotificacionId;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getDestinatariosDinamicos() {
        return destinatariosDinamicos;
    }

    public void setDestinatariosDinamicos(Boolean destinatariosDinamicos) {
        this.destinatariosDinamicos = destinatariosDinamicos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DefinicionNotificacion{" +
                "definicionNotificacionId=" + definicionNotificacionId +
                ", tipoNotificacionId=" + tipoNotificacionId +
                ", asunto='" + asunto + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", destinatariosDinamicos=" + destinatariosDinamicos +
                ", estado='" + estado + '\'' +
                '}';
    }
}