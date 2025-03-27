package com.unipago.unisigma.tool.domain;

import java.util.Date;

public class Entidad {

    private Integer entidadId;
    private Short claveEntidad;
    private String sigla;
    private String descripcion;
    private Boolean participaAfiliacionAutomatica;
    private String estado;
    private Short tipoEntidadId;
    private String rnc;
    private Date fechaInscripcion;
    private String numeroAcreditacion;
    private Integer entidadSupervisoraId;
    private Short regimenId;
    private Integer usuarioId;
    private Short tipoFondoId;
    private Short tipoEmpleadorId;
    private Short municipioId;
    private Boolean aplicaFacturacion;

    public Entidad(Integer entidadId, Short claveEntidad, String sigla, String descripcion, Boolean participaAfiliacionAutomatica, String estado, Short tipoEntidadId, String rnc, Date fechaInscripcion, String numeroAcreditacion, Integer entidadSupervisoraId, Short regimenId, Integer usuarioId, Short tipoFondoId, Short tipoEmpleadorId, Short municipioId, Boolean aplicaFacturacion) {
        this.entidadId = entidadId;
        this.claveEntidad = claveEntidad;
        this.sigla = sigla;
        this.descripcion = descripcion;
        this.participaAfiliacionAutomatica = participaAfiliacionAutomatica;
        this.estado = estado;
        this.tipoEntidadId = tipoEntidadId;
        this.rnc = rnc;
        this.fechaInscripcion = fechaInscripcion;
        this.numeroAcreditacion = numeroAcreditacion;
        this.entidadSupervisoraId = entidadSupervisoraId;
        this.regimenId = regimenId;
        this.usuarioId = usuarioId;
        this.tipoFondoId = tipoFondoId;
        this.tipoEmpleadorId = tipoEmpleadorId;
        this.municipioId = municipioId;
        this.aplicaFacturacion = aplicaFacturacion;
    }

    public Entidad(Integer entidadId) {
        this.entidadId = entidadId;
    }

    public Entidad() {
    }

    public Entidad(int entidadId, short tipoEntidadId, short claveEntidad, String sigla, String descripcion, short regimenId, boolean participaAfiliacionAut, String rnc, int entidadSupervisoraId, String estado) {
        this.entidadId = entidadId;
        this.claveEntidad = claveEntidad;
        this.sigla = sigla;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoEntidadId = tipoEntidadId;
        this.rnc = rnc;
        this.entidadSupervisoraId = entidadSupervisoraId;
        this.regimenId = regimenId;
        this.participaAfiliacionAutomatica = participaAfiliacionAut;
    }

    public Integer getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(Integer entidadId) {
        this.entidadId = entidadId;
    }

    public Short getClaveEntidad() {
        return claveEntidad;
    }

    public void setClaveEntidad(Short claveEntidad) {
        this.claveEntidad = claveEntidad;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getParticipaAfiliacionAutomatica() {
        return participaAfiliacionAutomatica;
    }

    public void setParticipaAfiliacionAutomatica(Boolean participaAfiliacionAutomatica) {
        this.participaAfiliacionAutomatica = participaAfiliacionAutomatica;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Short getTipoEntidadId() {
        return tipoEntidadId;
    }

    public void setTipoEntidadId(Short tipoEntidadId) {
        this.tipoEntidadId = tipoEntidadId;
    }

    public String getRnc() {
        return rnc;
    }

    public void setRnc(String rnc) {
        this.rnc = rnc;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getNumeroAcreditacion() {
        return numeroAcreditacion;
    }

    public void setNumeroAcreditacion(String numeroAcreditacion) {
        this.numeroAcreditacion = numeroAcreditacion;
    }

    public Integer getEntidadSupervisoraId() {
        return entidadSupervisoraId;
    }

    public void setEntidadSupervisoraId(Integer entidadSupervisoraId) {
        this.entidadSupervisoraId = entidadSupervisoraId;
    }

    public Short getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(Short regimenId) {
        this.regimenId = regimenId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Short getTipoFondoId() {
        return tipoFondoId;
    }

    public void setTipoFondoId(Short tipoFondoId) {
        this.tipoFondoId = tipoFondoId;
    }

    public Short getTipoEmpleadorId() {
        return tipoEmpleadorId;
    }

    public void setTipoEmpleadorId(Short tipoEmpleadorId) {
        this.tipoEmpleadorId = tipoEmpleadorId;
    }

    public Short getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(Short municipioId) {
        this.municipioId = municipioId;
    }

    public Boolean getAplicaFacturacion() {
        return aplicaFacturacion;
    }

    public void setAplicaFacturacion(Boolean aplicaFacturacion) {
        this.aplicaFacturacion = aplicaFacturacion;
    }

    @Override
    public String toString() {
        return "Entidad{" +
                "entidadId=" + entidadId +
                ", claveEntidad=" + claveEntidad +
                ", sigla='" + sigla + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", participaAfiliacionAutomatica=" + participaAfiliacionAutomatica +
                ", estado='" + estado + '\'' +
                ", tipoEntidadId=" + tipoEntidadId +
                ", rnc='" + rnc + '\'' +
                ", fechaInscripcion=" + fechaInscripcion +
                ", numeroAcreditacion='" + numeroAcreditacion + '\'' +
                ", entidadSupervisoraId=" + entidadSupervisoraId +
                ", regimenId=" + regimenId +
                ", usuarioId=" + usuarioId +
                ", tipoFondoId=" + tipoFondoId +
                ", tipoEmpleadorId=" + tipoEmpleadorId +
                ", municipioId=" + municipioId +
                ", aplicaFacturacion=" + aplicaFacturacion +
                '}';
    }
}
