package com.unipago.unisigma.tool.controllers;

import com.unipago.unisigma.tool.domain.Entidad;
import com.unipago.unisigma.tool.service.EntidadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entidad")
public class EntidadController {

    private static final Logger log = LoggerFactory.getLogger(EntidadController.class);

    private final EntidadService entidadService;

    @Autowired
    public EntidadController(EntidadService entidadService) {
        this.entidadService = entidadService;
    }

    @RequestMapping( value = "/find", produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    @ResponseBody
    public Entidad findbyId(@RequestParam("entidadId") Integer entidadId) {
        log.info("Entering findById");
        return entidadService.findEntidadPorId(entidadId);
    }

    @RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    @ResponseBody
    public List<Entidad> findAllEntidad() {
        log.info("Entering findById");
        return entidadService.findAllEntidad();
    }
}
