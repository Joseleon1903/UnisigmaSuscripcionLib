package com.unipago.unisigma.tool.repositorio;

import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuscripcionRepository {

    private static final Logger log = LoggerFactory.getLogger(SuscripcionRepository.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SuscripcionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<SuscripcionNotificacion> findAll() {
        log.info("Entering findAll");
        log.info("Ejecutando query");

        List<SuscripcionNotificacion> result = jdbcTemplate.query(
                "SELECT SUSCRIPCION_NOTIFICACION_ID, SERVICIO_ID, ENTIDAD_ID, ESTADO FROM SUSCRIPCION_NOTIFICACION",
                (rs, rowNum) ->
                        new SuscripcionNotificacion(rs.getInt("SUSCRIPCION_NOTIFICACION_ID"),
                                rs.getInt("SERVICIO_ID"), rs.getInt("ENTIDAD_ID"), rs.getNString("ESTADO"))
        );
        log.info("query result: "+ result.size());
        log.info("terminando ejecucion query");
        return result;
    }

}
