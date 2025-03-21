package com.unipago.unisigma.tool.domain;

import java.io.Serializable;

public class ServicioSistema implements Serializable {

    private Integer servicioId;
    private String descripcion;
    private Long procesoSubprocesoId;
    private Short regimenId;
    private Short seguroId;
    private String nombreCola;
    private boolean horarioRequerido;
    private Short tipoServicioId;
    private String estado;
    private Integer servicioPadreId;
    private String claveProcesoArchivo;
    private String claveSubprocesoArchivo;
    private boolean facturable;

    public ServicioSistema(Integer servicioId, String descripcion, Long procesoSubprocesoId, Short regimenId, Short seguroId, String nombreCola, boolean horarioRequerido, Short tipoServicioId, String estado, Integer servicioPadreId, String claveProcesoArchivo, String claveSubprocesoArchivo, boolean facturable) {
        this.servicioId = servicioId;
        this.descripcion = descripcion;
        this.procesoSubprocesoId = procesoSubprocesoId;
        this.regimenId = regimenId;
        this.seguroId = seguroId;
        this.nombreCola = nombreCola;
        this.horarioRequerido = horarioRequerido;
        this.tipoServicioId = tipoServicioId;
        this.estado = estado;
        this.servicioPadreId = servicioPadreId;
        this.claveProcesoArchivo = claveProcesoArchivo;
        this.claveSubprocesoArchivo = claveSubprocesoArchivo;
        this.facturable = facturable;
    }

    public ServicioSistema() {
    }

    public Integer getServicioId() {
        return servicioId;
    }

    public void setServicioId(Integer servicioId) {
        this.servicioId = servicioId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getProcesoSubprocesoId() {
        return procesoSubprocesoId;
    }

    public void setProcesoSubprocesoId(Long procesoSubprocesoId) {
        this.procesoSubprocesoId = procesoSubprocesoId;
    }

    public Short getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(Short regimenId) {
        this.regimenId = regimenId;
    }

    public Short getSeguroId() {
        return seguroId;
    }

    public void setSeguroId(Short seguroId) {
        this.seguroId = seguroId;
    }

    public String getNombreCola() {
        return nombreCola;
    }

    public void setNombreCola(String nombreCola) {
        this.nombreCola = nombreCola;
    }

    public boolean isHorarioRequerido() {
        return horarioRequerido;
    }

    public void setHorarioRequerido(boolean horarioRequerido) {
        this.horarioRequerido = horarioRequerido;
    }

    public Short getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(Short tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getServicioPadreId() {
        return servicioPadreId;
    }

    public void setServicioPadreId(Integer servicioPadreId) {
        this.servicioPadreId = servicioPadreId;
    }

    public String getClaveProcesoArchivo() {
        return claveProcesoArchivo;
    }

    public void setClaveProcesoArchivo(String claveProcesoArchivo) {
        this.claveProcesoArchivo = claveProcesoArchivo;
    }

    public String getClaveSubprocesoArchivo() {
        return claveSubprocesoArchivo;
    }

    public void setClaveSubprocesoArchivo(String claveSubprocesoArchivo) {
        this.claveSubprocesoArchivo = claveSubprocesoArchivo;
    }

    public boolean isFacturable() {
        return facturable;
    }

    public void setFacturable(boolean facturable) {
        this.facturable = facturable;
    }

    @Override
    public String toString() {
        return "ServicioSistema{" +
                "servicioId=" + servicioId +
                ", descripcion='" + descripcion + '\'' +
                ", procesoSubprocesoId=" + procesoSubprocesoId +
                ", regimenId=" + regimenId +
                ", seguroId=" + seguroId +
                ", nombreCola='" + nombreCola + '\'' +
                ", horarioRequerido=" + horarioRequerido +
                ", tipoServicioId=" + tipoServicioId +
                ", estado='" + estado + '\'' +
                ", servicioPadreId=" + servicioPadreId +
                ", claveProcesoArchivo='" + claveProcesoArchivo + '\'' +
                ", claveSubprocesoArchivo='" + claveSubprocesoArchivo + '\'' +
                ", facturable=" + facturable +
                '}';
    }
}
