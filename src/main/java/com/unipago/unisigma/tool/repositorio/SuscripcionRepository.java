package com.unipago.unisigma.tool.repositorio;

import com.unipago.unisigma.tool.domain.DefinicionNotificacion;
import com.unipago.unisigma.tool.domain.ParametroDefinicionNotificacion;
import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.mapper.ParametroDefinicionNotificacionMapper;
import com.unipago.unisigma.tool.mapper.SuscripcionMapper;
import com.unipago.unisigma.tool.repositorio.query.QueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
        log.info("Ejecutando query: "+QueryUtil.BUSCAR_SUSCRIPCIONES);

        List<SuscripcionNotificacion> result = jdbcTemplate.query(
                QueryUtil.BUSCAR_SUSCRIPCIONES,
                (rs, rowNum) ->
                        new SuscripcionNotificacion(rs.getInt("SUSCRIPCION_NOTIFICACION_ID"),
                                rs.getInt("SERVICIO_ID"), rs.getInt("ENTIDAD_ID"), rs.getNString("ESTADO"))
        );
        log.info("query result: "+ result.size());
        log.info("terminando ejecucion query");
        return result;
    }

    public DefinicionNotificacion findDefinicionNotificacion(Integer servicioId, Short tipoNotificacion,
                                                             Integer entidadId, Short tipoEntidadId) {
        log.info("Entering findDefinicionNotificacion");
        log.info("Ejecutando query: "+QueryUtil.BUSCAR_DEFINICION_NITIFICACION);

        DefinicionNotificacion result = jdbcTemplate.queryForObject(
                QueryUtil.BUSCAR_DEFINICION_NITIFICACION,
                new Object[]{servicioId,tipoNotificacion, entidadId, tipoEntidadId },
                new SuscripcionMapper().definicionNotificacionRowMapper());
        log.info("query result: "+ result);
        log.info("terminando ejecucion query");
        return result;
    }

    public SuscripcionNotificacion buscarSucripcionPorEntidadAndServicio(Integer entidadId, Integer serrvicioId) {
        log.info("Entering findAll");
        log.info("Entering findDefinicionNotificacion");
        log.info("Ejecutando query: "+QueryUtil.BUSCAR_SUSCRIPCION_NOTIFICACION_ENTIDAD_SERVICIO);

        SuscripcionNotificacion result = jdbcTemplate.queryForObject(
                QueryUtil.BUSCAR_SUSCRIPCION_NOTIFICACION_ENTIDAD_SERVICIO,
                new Object[]{entidadId, serrvicioId },
                new SuscripcionMapper().suscripcionNotificacionRowMapper());
        log.info("query result: "+ result);
        log.info("terminando ejecucion query");
        return result;
    }

    public List<ParametroDefinicionNotificacion> findParametroDefinicionAll(Integer definicionNotificacionId) {
        log.info("Entering findAll");
        log.info("Ejecutando query: "+QueryUtil.BUSCAR_PARAMETRO_DEFINICION_NOTIFICACION);

        List<ParametroDefinicionNotificacion> result = jdbcTemplate.query(
                QueryUtil.BUSCAR_PARAMETRO_DEFINICION_NOTIFICACION,
                new Object[]{definicionNotificacionId},
                new ParametroDefinicionNotificacionMapper().parametroDefinicionNotificacionRowMapper());
        log.info("query result: "+ result.size());
        log.info("terminando ejecucion query");
        return result;
    }

}