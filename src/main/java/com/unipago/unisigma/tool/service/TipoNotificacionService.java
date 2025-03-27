package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.TipoNotificacion;
import com.unipago.unisigma.tool.repositorio.TipoNotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoNotificacionService {

    private final TipoNotificacionRepository tipoNotificacionRepository;

    @Autowired
    public TipoNotificacionService(TipoNotificacionRepository tipoNotificacionRepository) {
        this.tipoNotificacionRepository = tipoNotificacionRepository;
    }

    public TipoNotificacion findEntidadPorId(Short tipoNotificacion){
        return tipoNotificacionRepository.findTipoNotificacion(tipoNotificacion);
    }
}
