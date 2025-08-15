package com.unipago.unisigma.tool.mapper;

import com.unipago.unisigma.tool.domain.DefinicionNotificacion;
import com.unipago.unisigma.tool.domain.Entidad;
import org.springframework.jdbc.core.RowMapper;

public class EntidadMapper {

    public RowMapper<Entidad> entidadRowMapper() {
        return (rs, rowNum) -> new Entidad(
                rs.getInt("ENTIDAD_ID"),
                rs.getShort("TIPO_ENTIDAD_ID"),
                rs.getShort("CLAVE_ENTIDAD"),
                rs.getString("SIGLA"),
                rs.getString("DESCRIPCION"),
                rs.getShort("REGIMEN_ID"),
                rs.getBoolean("PARTICIPA_AFILIACION_AUT"),
                rs.getString("RNC"),
                rs.getInt("ENTIDAD_SUPERVISORA_ID"),
                rs.getString("ESTADO")

        );
    }
}