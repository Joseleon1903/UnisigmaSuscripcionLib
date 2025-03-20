package com.unipago.unisigma.tool.controllers;


import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.service.SuscripcionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	public SuscripcionNotificacion findById() {
		log.info("Entering findById");
		SuscripcionNotificacion sus = suscripcionService.buscarPorId(2);

		return sus;
	}



}
