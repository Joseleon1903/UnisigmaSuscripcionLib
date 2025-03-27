package com.unipago.unisigma.tool.controllers;


import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.service.SuscripcionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suscripcion/notificacion")
public class SuscripcionControllers {

	private static final Logger log = LoggerFactory.getLogger(SuscripcionControllers.class);

	private final SuscripcionService suscripcionService;

	@Autowired
	public SuscripcionControllers(SuscripcionService suscripcionService) {
		this.suscripcionService = suscripcionService;
	}

	@RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	@ResponseBody
	public List<SuscripcionNotificacion> findAll() {
		log.info("Entering findById");
		return suscripcionService.buscarSucripciones();
	}

	@RequestMapping(value = "/find", produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	@ResponseBody
	public SuscripcionNotificacion findbyEntidadServicio(@RequestParam("entidadId") Integer entidadId,@RequestParam("servicioId") Integer servicioId) {
		log.info("Entering findbyEntidadServicio");
		return suscripcionService.buscarSucripcionPorEntidadAndServicio(entidadId, servicioId);
	}

}
