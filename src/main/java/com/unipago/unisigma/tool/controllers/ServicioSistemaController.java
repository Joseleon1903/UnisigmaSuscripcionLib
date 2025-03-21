package com.unipago.unisigma.tool.controllers;

import com.unipago.unisigma.tool.domain.ServicioSistema;
import com.unipago.unisigma.tool.service.ServicioSistemaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servicio/sistema")
public class ServicioSistemaController {

    private static final Logger log = LoggerFactory.getLogger(ServicioSistemaController.class);

    private final ServicioSistemaService servicioSistemaService;

    @Autowired
    public ServicioSistemaController(ServicioSistemaService servicioSistemaService) {
        this.servicioSistemaService = servicioSistemaService;
    }

    @RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    @ResponseBody
    public List<ServicioSistema> findAll() {
        log.info("Entering findById");
        return servicioSistemaService.buscarServiciosSistema();
    }




}