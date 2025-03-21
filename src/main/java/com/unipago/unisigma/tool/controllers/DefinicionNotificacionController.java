package com.unipago.unisigma.tool.controllers;

import com.unipago.unisigma.tool.domain.DefinicionNotificacion;
import com.unipago.unisigma.tool.service.DefinicionNotificacionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/definicion/notificacion")
public class DefinicionNotificacionController {

    private static final Logger log = LoggerFactory.getLogger(DefinicionNotificacionController.class);

    private final DefinicionNotificacionService definicionNotificacionService;

    @Autowired
    public DefinicionNotificacionController(DefinicionNotificacionService definicionNotificacionService) {
        this.definicionNotificacionService = definicionNotificacionService;
    }


    @RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    @ResponseBody
    public DefinicionNotificacion findDefinicionNotificacion(@RequestParam(value = "servicioId") Integer servicioId,
                                                             @RequestParam("tipoNotificacion") Short tipoNotificacion,
                                                             @RequestParam("entidadId")Integer entidadId,
                                                             @RequestParam( value= "tipoEntidadId",required = false)Short tipoEntidadId) {
        log.info("Entering findDefinicionNotificacion");
        return definicionNotificacionService.findDefinicionNotificacion(servicioId, tipoNotificacion, entidadId, tipoEntidadId);
    }





}