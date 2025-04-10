package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.Entidad;
import com.unipago.unisigma.tool.repositorio.EntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadService {

    private final EntidadRepository entidadRepository;

    @Autowired
    public EntidadService(EntidadRepository entidadRepository) {
        this.entidadRepository = entidadRepository;
    }

    public Entidad findEntidadPorId(Integer entidadId){
        return entidadRepository.findEntidadById(entidadId);
    }

    public List<Entidad> findAllEntidad() {
        return entidadRepository.findAll();
    }
}
