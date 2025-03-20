package com.unipago.unisigma.tool.controllers;


import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.service.SuscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suscripcion/notificacion")
public class SuscripcionControllers {

	private final SuscripcionService suscripcionService;

	@Autowired
	public SuscripcionControllers(SuscripcionService suscripcionService) {
		this.suscripcionService = suscripcionService;
	}

	@RequestMapping(produces= MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	@ResponseBody
	public SuscripcionNotificacion findById() {

		SuscripcionNotificacion sus = suscripcionService.buscarPorId(2);
		return sus;
	}



}
