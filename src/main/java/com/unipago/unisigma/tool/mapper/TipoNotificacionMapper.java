package com.unipago.unisigma.tool.mapper;

import com.unipago.unisigma.tool.domain.TipoNotificacion;
import org.springframework.jdbc.core.RowMapper;

public class TipoNotificacionMapper {

    public RowMapper<TipoNotificacion> tipoNotificacionRowMapper() {
        return (rs, rowNum) -> new TipoNotificacion(
                rs.getShort("TIPO_NOTIFICACION_ID"),
                rs.getString("DESCRIPCION"),
                rs.getString("ESTADO")
        );
    }
}
