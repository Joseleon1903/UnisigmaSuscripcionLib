package com.unipago.unisigma.tool.repositorio;

import com.unipago.unisigma.tool.domain.ServicioSistema;
import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.repositorio.query.QueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServicioSistemaRepository {

    private static final Logger log = LoggerFactory.getLogger(SuscripcionRepository.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ServicioSistemaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ServicioSistema> findAll() {
        log.info("Entering findAll");
        log.info("Ejecutando query:"+QueryUtil.BUSCAR_SERVICIO_SISTEMA);

        List<ServicioSistema> result = jdbcTemplate.query(QueryUtil.BUSCAR_SERVICIO_SISTEMA,
                (rs, rowNum) ->
                        new ServicioSistema(
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
                        )
        );
        log.info("query result: "+ result.size());
        log.info("terminando ejecucion query");
        return result;
    }


}
