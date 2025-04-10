package com.unipago.unisigma.tool.util;

public class ConstanteApp {

    public static class TipoDato {
        public static final String FECHA = "D";
        public static final String NUMERO = "N";
        public static final String CARACTER = "C";
        public static final String PERIODO = "P";

        private TipoDato() {
        }
    }
    public static class Formatos {
        public static final String FORMATO_PERIODO = "yyyyMM";
        public static final String FORMATO_FECHA_ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss";
        public static final String FORMATO_FECHA_PLSQL = "YYYY-MM-DD HH24:MI:SS";
        public static final String FORMATO_FECHA_DATE_TO_PLSQL = "yyyy-MM-dd HH:mm:ss";
        public static final String FORMATO_FECHA_PARAMETROS_VALOR = "dd/MM/yyyy";
        public static final String FORMATO_HORA_PARAMETROS_VALOR = "HH:mm:ss";
        public static final String FORMATO_HORA_NOMBRE_LBTR = "ddMMyyyyHHmmss";
        public static final String FORMATO_NOTIFICACION = "dd/MM/yyyy hh:mm:ss a";
        public static final String FORMATO_FECHA_YYYYMMDDHH24MISS = "yyyyMMddHHmmss";
        public static final String FORMATO_FECHA_NOMBRE_GENERACION_ARCHIVOS = "ddMMyyyy";
        public static final String FORMATO_FECHA_NOMBRE_NACHA = "ddMMyy";
        public static final String FORMATO_FECHA_CABECERA_NACHA = "yyMMdd";
        public static final String FORMATO_HORA_CABECERA_NACHA = "HHmm";
        public static final String FORMATO_FECHA_NOT_REPORTE = "dd MMM yy";
    }

}
