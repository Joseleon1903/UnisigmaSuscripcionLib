package com.unipago.unisigma.tool.repositorio.query;

public class QueryUtil {

    public static String BUSCAR_SUSCRIPCIONES ="SELECT SUSCRIPCION_NOTIFICACION_ID, SERVICIO_ID, ENTIDAD_ID, ESTADO FROM SUSCRIPCION_NOTIFICACION";

    public static String BUSCAR_SERVICIO_SISTEMA ="SELECT  \n" +
            "SERVICIO_ID,\n" +
            "DESCRIPCION,\n" +
            "FECHA_INICIO_DISPONIBILIDAD,\n" +
            "PROCESO_SUBPROCESO_ID,\n" +
            "REGIMEN_ID,\n" +
            "SEGURO_ID,\n" +
            "NOMBRE_COLA,\n" +
            "HORARIO_REQUERIDO,\n" +
            "TIPO_SERVICIO_ID,\n" +
            "ORDEN_EJECUCION,\n" +
            "CLAVE_PROCESO_ARCHIVO,\n" +
            "CLAVE_SUBPROCESO_ARCHIVO,\n" +
            "ESTADO,\n" +
            "SERVICIO_PADRE_ID,\n" +
            "FACTURABLE\n" +
            "FROM SERVICIO_SISTEMA ";

    public static String BUSCAR_DEFINICION_NITIFICACION= "SELECT d.DEFINICION_NOTIFICACION_ID,\n" +
            "d.TIPO_NOTIFICACION_ID,\n" +
            "D.ASUNTO,\n" +
            "d.MENSAJE,\n" +
            "d.DESTINATARIOS_DINAMICOS,\n" +
            "d.ESTADO FROM sigma_utils.Definicion_Notificacion d \n" +
            "JOIN sigma_utils.DEFINICION_NOT_SVC_NOTIFICABLE sne on d.DEFINICION_NOTIFICACION_ID = sne.DEFINICION_NOTIFICACION_ID\n" +
            "join sigma_utils.SERVICIO_NOTIFICABLE_ENTIDAD sn on sn.SERVICIO_NOTIFICABLE_ENT_ID = sne.SERVICIO_NOTIFICABLE_ENT_ID\n" +
            "WHERE sn.servicio_Id = :servicioId \n" +
            "AND d.tipo_Notificacion_Id = :tipoNotificacion \n" +
            "AND ((sn.entidad_Id = :entidadId AND sn.tipo_Configuracion = 1) \n" +
            "\t\t\t\t\t\t\tOR (sn.tipo_Entidad_Id = :tipoEntidadId AND sn.tipo_Configuracion = 2) \n" +
            "\t\t\t\t\t\t\tOR sn.tipo_Configuracion = 3) \n" +
            "\t\t\t\t\t\t\tORDER BY sn.tipo_Configuracion ASC";
}
