package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.ParametroDefinicionNotificacion;
import com.unipago.unisigma.tool.domain.ParametroEjecucionNotificacion;
import com.unipago.unisigma.tool.repositorio.SuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidarParametrosDefinicionService {

    private final SuscripcionRepository suscripcionRepository;

    @Autowired
    public ValidarParametrosDefinicionService(SuscripcionRepository suscripcionRepository) {
        this.suscripcionRepository = suscripcionRepository;
    }

    public void validaParametrosServicios(Integer servicioId, List<ParametroEjecucionNotificacion> parametrosEjecucionNotificacion){


        //buscar parametro definicion servicio


    }

    public boolean validar(List<ParametroDefinicionNotificacion> parametrosDefinicion,
                           List<ParametroEjecucionNotificacion> parametrosEjecucionNotificacion) {

        System.out.println("entering ValidarParametrosDefinicionService validar...");

        if (parametrosDefinicion.size() != parametrosEjecucionNotificacion.size()) {
            System.out.println("entering ValidarParametrosDefinicionService validar...");
            return false;
        }

        for (ParametroDefinicionNotificacion parametroDefinicion : parametrosDefinicion) {
            System.out.println("Verificando si el parametro: " + parametroDefinicion + " fue proporcionado...");
            System.out.println("Verificando solicitud size: " + parametrosEjecucionNotificacion.size());

            System.out.println("Obteniendo el valor por defecto...");

            String valor = parametroDefinicion.getValorDefecto();
            System.out.println("Valor por defecto: " + valor);

            System.out.println("validando parametro ejecucion ");
            boolean existeParametroEje = false;
            for (ParametroEjecucionNotificacion pEje : parametrosEjecucionNotificacion) {
                if (pEje.getParametroId().equals(parametroDefinicion.getParametroId())) {
                    existeParametroEje = true;
                }
            }

            System.out.println("validando existeParametroEje: " + existeParametroEje);
            if (!existeParametroEje) {
                return false;
            }

//
//            System.out.println("Validando que se poseea valor para el parametro Definicion...");
//            if(!ValidationUtil.validateNullOrEmtpyStrings(valor)){
//                motivoId = 0;
//                System.out.println("Valor proporcionado, sustituyendolo el parametro por el valor");
//                mensaje = mensaje.replace(placeHolder, valor);
//                asunto = asunto.replace(placeHolder, valor);
//
//                System.out.println("Creando el parametro solicitud notificacion...");
//                ParametroSolicitudNotificacionType parametroSolicitud = new ParametroSolicitudNotificacionType();
//
//                parametroSolicitud.setParametroDefinicionNotificacionId(parametroDefinicion.getParametroDefinicionNotificacionId());
//                parametroSolicitud.setCodigoParametroDefinicionNotificacion(parametroDefinicion.getParametroDefinicionNotificacionId());
//                parametroSolicitud.setValor(valor);
//
//                System.out.println("Agregando el parametro solicitud a la lista local...");
//                parametrosSolicitudNotificacion.add(parametroSolicitud);
//                context.getParametrosEnSolicitud().add(parametroDefinicion.getParametroDefinicionNotificacionId());
//            }else{
//                System.out.println("Existe validacion Incumplida, asignando motivo de error...");
//                if(motivoId == 0){
//                    motivoId = ParametrosUSConstantes.Motivos.EXISTEN_PARAMETROS_DE_DEFINICION_NOTIFIACION_QUE_NO_POSEEN_VALOR;
//                }
//                break;
//            }
        }
//
//        if(motivoId == 0){
//            System.out.println("Validacion de los parametros exitosa!");
//            context.setAsunto(asunto);
//            context.setMensaje(mensaje);
//            context.getParametrosSolicitudNotificacionViaCorreo().addAll(parametrosSolicitudNotificacion);
//        }else{
//            System.out.println("Validacion de los parametros fallida, se obtuvo el motivo: " + motivoId);
//            context.setMotivoIdViaCorreo(motivoId);
//        }
//
//        return motivoId == 0;


        return true;
    }





}
