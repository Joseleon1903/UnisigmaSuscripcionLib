package com.unipago.unisigma.tool.mapper;

import com.unipago.unisigma.tool.domain.ParametroDefinicionNotificacion;
import org.springframework.jdbc.core.RowMapper;

public class ParametroDefinicionNotificacionMapper {

    public RowMapper<ParametroDefinicionNotificacion> parametroDefinicionNotificacionRowMapper() {
        return (rs, rowNum) -> new ParametroDefinicionNotificacion(
                rs.getString("PARAMETRO_DEFINICION_NOT_ID"),
                rs.getString("DESCRIPCION"),
                rs.getString("TIPO_DATO"),
                rs.getString("VALOR_DEFECTO"),
                rs.getString("ESTADO")
        );
    }


}
