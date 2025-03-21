package com.unipago.unisigma.tool.mapper;

import com.unipago.unisigma.tool.domain.DefinicionNotificacion;
import org.springframework.jdbc.core.RowMapper;

public class SuscripcionMapper {

    public RowMapper<DefinicionNotificacion> definicionNotificacionRowMapper() {
        return (rs, rowNum) -> new DefinicionNotificacion(
                rs.getInt("DEFINICION_NOTIFICACION_ID"),
                rs.getShort("TIPO_NOTIFICACION_ID"),
                rs.getString("ASUNTO"),
                rs.getString("MENSAJE"),
                rs.getBoolean("DESTINATARIOS_DINAMICOS"),
                rs.getString("ESTADO")

        );
    }
}
