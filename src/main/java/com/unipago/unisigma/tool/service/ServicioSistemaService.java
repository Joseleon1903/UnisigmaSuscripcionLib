package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.ServicioSistema;
import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.fake.FakeDataUtil;
import com.unipago.unisigma.tool.repositorio.ServicioSistemaRepository;
import com.unipago.unisigma.tool.repositorio.SuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioSistemaService {

    private final ServicioSistemaRepository servicioSistemaRepository;

    @Autowired
    public ServicioSistemaService(ServicioSistemaRepository servicioSistemaRepository) {
        this.servicioSistemaRepository = servicioSistemaRepository;
    }

    public List<ServicioSistema> buscarServiciosSistema (){
        return servicioSistemaRepository.findAll();
    }


}
