package com.unipago.unisigma.tool.mapper;

import com.unipago.unisigma.tool.domain.ServicioSistema;
import org.springframework.jdbc.core.RowMapper;

public class ServicioSistemaMapper {

    public RowMapper<ServicioSistema> servicioSistemaRowMapper() {
        return (rs, rowNum) -> new ServicioSistema(
                rs.getInt("SERVICIO_ID"),
                rs.getNString("DESCRIPCION"),
                rs.getLong("PROCESO_SUBPROCESO_ID"),
                rs.getShort("REGIMEN_ID"),
                rs.getShort("SEGURO_ID"),
                rs.getNString("NOMBRE_COLA"),
                rs.getBoolean("HORARIO_REQUERIDO"),
                rs.getShort("TIPO_SERVICIO_ID"),
                rs.getNString("ESTADO"),
                rs.getInt("SERVICIO_PADRE_ID"),
                null,
                null,
                rs.getBoolean("FACTURABLE")
        );
    }

}
