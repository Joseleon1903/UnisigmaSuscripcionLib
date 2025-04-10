package com.unipago.unisigma.tool.service;

import com.unipago.unisigma.tool.domain.ParametroDefinicionNotificacion;
import com.unipago.unisigma.tool.domain.ParametroEjecucionNotificacion;

import java.util.List;

public class ValidarParametrosDefinicionService {


    public void validar(List<ParametroDefinicionNotificacion> parametrosDefinicion, List<ParametroEjecucionNotificacion> parametrosEjecucionNotificacion){

        System.out.println("entering ValidarParametrosDefinicionService validar...");


        for(ParametroDefinicionNotificacion parametroDefinicion: parametrosDefinicion){
            System.out.println("Verificando si el parametro: " + parametroDefinicion + " fue proporcionado...");
            System.out.println("Verificando solicitud size: " + parametrosEjecucionNotificacion.size());
            int posicionParametro = parametrosEjecucionNotificacion.indexOf(parametroDefinicion.getParametroId());

//            System.out.println("Parametro: " + parametroDefinicion.getParametroDefinicionNotificacionId());
//            String placeHolder = parametroDefinicion.getParametroDefinicionNotificacionId();
//            System.out.println("Obteniendo el valor por defecto...");
//            String valor = parametroDefinicion.getValorDefecto();
//            System.out.println("Valor por defecto: " + valor);
//            System.out.println("posicionParametro " + posicionParametro);
//
//            if(!(posicionParametro < 0)){
//                System.out.println("Parametro proporcionado, tomando el valor proporcionado...");
//                valor = ValidationUtil.validateNullOrEmtpyStrings(context.getParametrosGeneracionSolicitud().get(posicionParametro).getValor()) ? valor : context.getParametrosGeneracionSolicitud().get(posicionParametro).getValor();
//            }else{
//                System.out.println("Parametro no fue proporcionado!");
//                motivoId = ParametrosUSConstantes.Motivos.EXISTEN_PARAMETROS_DE_DEFINICION_NOTIFIACION_QUE_NO_FUERON_PROPORCIONADOS;
//            }
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



    }





}
