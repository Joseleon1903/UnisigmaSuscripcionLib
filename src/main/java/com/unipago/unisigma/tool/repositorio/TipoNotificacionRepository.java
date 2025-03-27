package com.unipago.unisigma.tool.repositorio;

import com.unipago.unisigma.tool.domain.TipoNotificacion;
import com.unipago.unisigma.tool.mapper.TipoNotificacionMapper;
import com.unipago.unisigma.tool.repositorio.query.QueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TipoNotificacionRepository {

    private static final Logger log = LoggerFactory.getLogger(TipoNotificacionRepository.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TipoNotificacionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public TipoNotificacion findTipoNotificacion(Short tipoNotificacionId) {
        log.info("Entering findDefinicionNotificacion");
        log.info("Ejecutando query: "+QueryUtil.BUSCAR_TIPO_NOTIFCACION_POR_ID);

        TipoNotificacion result = jdbcTemplate.queryForObject(
                QueryUtil.BUSCAR_TIPO_NOTIFCACION_POR_ID,
                new Object[]{tipoNotificacionId },
                new TipoNotificacionMapper().tipoNotificacionRowMapper());
        log.info("query result: "+ result);
        log.info("terminando ejecucion query");
        return result;
    }

}
