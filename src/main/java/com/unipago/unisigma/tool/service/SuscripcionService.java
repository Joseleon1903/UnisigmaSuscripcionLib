package com.unipago.unisigma.tool.service;


import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.fake.FakeDataUtil;
import com.unipago.unisigma.tool.repositorio.SuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuscripcionService {

    private List<SuscripcionNotificacion> fakeData =  new ArrayList<SuscripcionNotificacion>();

    private final SuscripcionRepository suscripcionRepository;

    @Autowired
    public SuscripcionService(SuscripcionRepository suscripcionRepository) {
        this.suscripcionRepository = suscripcionRepository;
        this.fakeData = FakeDataUtil.optenerData();
    }

    public List<SuscripcionNotificacion> buscarSucripciones (){
        return suscripcionRepository.findAll();
    }

    public SuscripcionNotificacion buscarSucripcionPorEntidadAndServicio (Integer entidadId, Integer serrvicioId){
        return suscripcionRepository.buscarSucripcionPorEntidadAndServicio(entidadId, serrvicioId);
    }

}