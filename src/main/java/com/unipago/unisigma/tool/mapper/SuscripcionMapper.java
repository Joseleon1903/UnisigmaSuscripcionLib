package com.unipago.unisigma.tool.mapper;

import com.unipago.unisigma.tool.domain.DefinicionNotificacion;
import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
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

    public RowMapper<SuscripcionNotificacion> suscripcionNotificacionRowMapper() {
        return (rs, rowNum) ->  new SuscripcionNotificacion(rs.getInt("SUSCRIPCION_NOTIFICACION_ID"),
                rs.getInt("SERVICIO_ID"), rs.getInt("ENTIDAD_ID"), rs.getNString("ESTADO")
        );
    }
}
