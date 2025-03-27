package com.unipago.unisigma.tool.controllers;

import com.unipago.unisigma.tool.domain.TipoNotificacion;
import com.unipago.unisigma.tool.service.TipoNotificacionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tipoNotificacion")
public class TipoNotificacionController {

    private static final Logger log = LoggerFactory.getLogger(TipoNotificacionController.class);

    private final TipoNotificacionService tipoNotificacionService;

    @Autowired
    public TipoNotificacionController(TipoNotificacionService tipoNotificacionService) {
        this.tipoNotificacionService = tipoNotificacionService;
    }

    @RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    @ResponseBody
    public TipoNotificacion findById(@RequestParam("tipoNotificacionId") Short tipoNotificacionId) {
        log.info("Entering findById");
        return tipoNotificacionService.findEntidadPorId(tipoNotificacionId);
    }


}
