package com.unipago.unisigma.tool.repositorio;

import com.unipago.unisigma.tool.domain.Entidad;
import com.unipago.unisigma.tool.mapper.EntidadMapper;
import com.unipago.unisigma.tool.repositorio.query.QueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EntidadRepository {

    private static final Logger log = LoggerFactory.getLogger(SuscripcionRepository.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EntidadRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Entidad findEntidadById(Integer entidadId ) {
        log.info("Entering findEntidadById");
        log.info("Ejecutando query: "+ QueryUtil.BUSCAR_ENTIDAD_POR_ID);

        Entidad result = jdbcTemplate.queryForObject(
                QueryUtil.BUSCAR_ENTIDAD_POR_ID,
                new Object[]{entidadId },
                new EntidadMapper().entidadRowMapper());
        log.info("query result: "+ result);
        log.info("terminando ejecucion query");
        return result;
    }




}
