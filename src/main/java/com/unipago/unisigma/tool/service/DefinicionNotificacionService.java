package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.DefinicionNotificacion;
import com.unipago.unisigma.tool.domain.ParametroDefinicionNotificacion;
import com.unipago.unisigma.tool.repositorio.SuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefinicionNotificacionService {

    private final SuscripcionRepository suscripcionRepository;

    @Autowired
    public DefinicionNotificacionService(SuscripcionRepository suscripcionRepository) {
        this.suscripcionRepository = suscripcionRepository;
    }

    public DefinicionNotificacion findDefinicionNotificacion(Integer servicioId, Short tipoNotificacion,
                                                             Integer entidadId, Short tipoEntidadId){
        return suscripcionRepository.findDefinicionNotificacion(servicioId, tipoNotificacion, entidadId, tipoEntidadId);
    }

    public List<ParametroDefinicionNotificacion> findParametrosDefinicionNotificacion(Integer definicionId){
        return suscripcionRepository.findParametroDefinicionAll(definicionId);
    }

}
