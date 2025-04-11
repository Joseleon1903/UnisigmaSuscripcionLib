package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.ServicioSistema;
import com.unipago.unisigma.tool.repositorio.ServicioSistemaRepository;
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


    public ServicioSistema buscarServiciosSistemaPorId(Integer servicioId) {
        return servicioSistemaRepository.findById(servicioId);
    }
}
