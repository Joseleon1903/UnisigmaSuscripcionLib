package com.unipago.unisigma.tool.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ValidationUtil {

    public static final int EMPTY_INTEGER_VALUE = 0;
    public static final BigDecimal EMPTY_BIG_DECIMAL = new BigDecimal(EMPTY_INTEGER_VALUE);
    public static final Long EMPTY_LONG_VALUE = 0L;

    public ValidationUtil(){}

    /**
     *
     * Valida que los valores pasados como argumentos no sean Nulos o esten Vacios.
     *
     * @param strgs
     *            Arreglo de valores a validar.
     * @return true si los valores estan nulos o vacios.
     */
    public static boolean validateNullOrEmtpyStrings(String... strgs) {

        for (String str : strgs) {
            if (str == null || str.trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     * valida que los valores pasados como argumentos no sean nulos o menor que 0.
     *
     * @param ints
     *            Arreglo de valores enteros a validar
     * @return true si los valores estan nulos o son menores que 0.
     */
    public static boolean validateEmtpyInteger(Integer... ints) {
        boolean valid = false;

        for (Integer integer : ints) {
            if (integer == null || integer <= EMPTY_INTEGER_VALUE) {
                valid = true;
                break;
            }
        }

        return valid;
    }

    /**
     * valida que los valores pasados como argumentos no sean nulos o menor que 0.
     *
     * @param shorts
     *            Arreglo de valores enteros a validar
     * @return true si los valores estan nulos o son menores que 0.
     */
    public static boolean validateEmtpyShort(Short... shorts) {
        boolean valid = false;

        for (Short s : shorts) {
            if (s == null || s <= EMPTY_INTEGER_VALUE) {
                valid = true;
                break;
            }
        }

        return valid;
    }

    /**
     * valida que los valores pasados como argumentos no sean nulos o menor que 0.
     *
     * @param longs
     *            Arreglo de valores long a validar
     * @return true si los valores estan nulos o son menores que 0.
     */
    public static boolean validateEmtpyLong(Long... longs) {
        boolean valid = false;

        for (Long integer : longs) {
            if (integer == null || integer <= EMPTY_INTEGER_VALUE) {
                valid = true;
                break;
            }
        }

        return valid;
    }

    /**
     * valida que los valores pasados como argumentos no sean nulos o menor que 0.
     *
     * @param doubles
     *            Arreglo de valores long a validar
     * @return true si los valores estan nulos o son menores que 0.
     */
    public static boolean validateEmtpyDouble(Double... doubles) {
        boolean valid = false;

        for (Double d : doubles) {
            if (d == null || d == EMPTY_INTEGER_VALUE) {
                valid = true;
                break;
            }
        }

        return valid;
    }

    /**
     * valida que los valores pasados como argumentos no sean nulos o menor que 0.
     *
     * @param bigs
     *            Arreglo de valores long a validar
     * @return true si los valores estan nulos o son menores que 0.
     */
    public static boolean validateEmtpyBigDecimal(BigDecimal... bigs) {
        boolean valid = false;

        for (BigDecimal d : bigs) {
            if (d == null || d.compareTo(EMPTY_BIG_DECIMAL) == 0) {
                valid = true;
                break;
            }
        }

        return valid;
    }

    /**
     * valida que los valores pasados como argumentos no sean nulos
     *
     * @param objs
     *            Arreglo de objetos a validar que no sean nulos.
     * @return retorna true si los valores estan nulos, false en caso contrario
     */
    public static boolean validateNotNull(Object... objs) {

        for (Object obj : objs) {
            if (obj == null) {
                return true;
            }
        }

        return false;
    }

    /**
     * valida que la lista pasada como parametro no sea nula o vacia.
     *
     * @param list
     *            Lista a Validar.
     * @return true si la lista es nula o vacia, false en caso contrario.
     */
    public static boolean isNullOrEmptyList(List<?> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }

        return false;
    }

    /**
     * valida que la lista pasada como parametro no sea nula o vacia.
     *
     * @param collection
     *            Lista a Validar.
     * @return true si la lista es nula o vacia, false en caso contrario.
     */
    public static boolean isNullOrEmptyCollection(Collection<?>... collection) {
        if(collection == null){
            return true;
        }

        for (Collection<?> coll : collection) {
            if (coll == null || coll.isEmpty()) {
                return true;
            }
        }

        return false;
    }



    /**
     * Valida si el tipo de datos pasado por par�metro es v�lido
     * @param tipoDatos - tipo de dato del valor
     * @param valor- valor a comprobar su tipo de dato.
     * @return TRUE si el tipo de dato es valor es valido, en caso contrario false.
     */
    public static boolean esTipoDatoValido(String tipoDatos , String valor){
        if (tipoDatos.equalsIgnoreCase(ConstanteApp.TipoDato.FECHA)) {
            return esTipoDatoFechaValido(valor);
        } else if (tipoDatos.equalsIgnoreCase(ConstanteApp.TipoDato.NUMERO)) {
            return esTipoDatoNumeroValido(valor);
        }else {
            return true;
        }
    }

    /**
     *
     * @param valor
     * @return
     */
    private static boolean esTipoDatoFechaValido(String valor) {
        SimpleDateFormat sdf = new SimpleDateFormat(ConstanteApp.Formatos.FORMATO_FECHA_PARAMETROS_VALOR);
        try {
            sdf.setLenient(false);
            sdf.parse(valor);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private static boolean esTipoDatoNumeroValido(String valor) {

        try{
            return StringUtils.isNumeric(valor);
        }catch(NumberFormatException ex){
            return false;
        }
    }

    /**
     * Capacidad que valida que si el objeto provisto como parametro esta contenido entre valores provistos.
     * @param dato objeto a verificar
     * @param valores posible valores del objeto
     * @return TRUE si esta dentro de los posible valores o si el dato es nulo
     */
    public static boolean validarPosiblesValores(Object dato, Object... valores) {
        if (dato == null) {
            return true;
        }

        boolean valid = false;

        for (Object obj : valores) {
            if (dato.equals(obj)) {
                valid = true;
                break;
            }
        }

        return valid;
    }

    /**
     * Capacidad valida si dos colecciones tiene valores comunes
     *
     * @param coleccion1
     * @param collecion2
     * @return true si existe al menos un elemento comun entre las colecciones
     */
    @SuppressWarnings("rawtypes")
    public static boolean listasContieneElementoComunes(Collection coleccion1, Collection collecion2) {

        for(Object elemento: coleccion1) {
            if(collecion2.contains(elemento)) {
                return true;
            }
        }

        return false;
    }






    /**
     * Valida que el dato pasado por par�metro sea suplido. No est� nulo o el signo num�rico que lo representa ( 0 ).
     *
     * @param valor
     * @author Carlos V�squez <i>[cjvasquez@unipago.com.do]</i>
     * @since Orden Atencion 5
     */
    public static void validarDatoRequerido(String... valor) throws Exception {
        if( ValidationUtil.validateNullOrEmtpyStrings(valor) ){
            throw new Exception();
        }
    }






    /**
     * Valida que el valor suplido por par�metro est� dentro de los posibles valores
     *
     * @param dato -Dato a evaluar
     * @param valores - VarArgs con los posibles valores
     * @throws Exception Cuando el dato a evaluar no esta nulo y su valor no esta dentro de los permitido.
     * @author Carlos V�squez <i>[cjvasquez@unipago.com.do]</i>
     * @since Orden Atencion 6
     * @see {@link ValidationUtil#validarPosiblesValores(Object, Object...)}
     */
    public static void validarValorNoPermitido(Object dato, Object... valores) throws Exception{

        if(!validateNotNull(dato) && !validarPosiblesValores(dato, valores)){
            throw new Exception();
        }
    }

    /**
     * Valida que los valores de la lista suplido por par�metro est� dentro de los posibles valores
     *
     * @param valores - VarArgs con los posibles valores
     * @throws Exception Cuando la lista no esta nula y sus valor no estan dentro de los permitido.
     * @author Getzels De Los Santos <i>[gdelossantos@unipago.com.do]</i>
     * @since Orden Atencion 17
     */
    public static void validarValorNoPermitidoList(List<?> datos, Object... valores) throws Exception{

        if(!isNullOrEmptyList(datos)){
            for(Object dato : datos){
                if(!validarPosiblesValores(dato, valores)){
                    throw new Exception();
                }
            }
        }
    }

    /**
     * Valida que la lista proporcionada no se encuentre nula o vacia.
     *
     * @param valor: dato a evaluar
     * @author Ramon Rodriguez <i>[rerodriguez@unipago.com.do]</i>
     * @since Orden Atencion 7
     */
    public static void validarDatoRequerido(List<?> valor) throws Exception {
        if (isNullOrEmptyList(valor)) {
            throw new Exception();
        }
    }

    /**
     * Valida que la fecha inicial no sea mayor que la fecha final, si es mayor lanza excepcion {@link FechaInvalidaException}
     *
     * @param fechaInicial
     * @param fechaFinal
     * @author Efra�n Toribio <i>[rerodriguez@unipago.com.do]</i>
     * @since Orden Atenci�n 16
     */
    public static void validarFechaInvalida(Date fechaInicial, Date fechaFinal) throws Exception {
        if (!validarRangoFecha(fechaInicial, fechaFinal)) {
            throw new Exception();
        }
    }

    /**
     * Valida que la fecha inicial no sea mayor que la fecha final, solo cuando sean especificados ambas fechas.
     *
     * @param fechaInicial
     * @param fechaFinal
     * @return true si se cumple las siguientes condiciones:
     *         <ul>
     *          <li>si la fecha inicial es null y la fecha final no es null.<li>
     *          <li>si la fecha final es null y la fecha inicial no es null.<li>
     *         	<li>si la fecha inicial no es mayor que la fecha final.<li>
     *         </ul> 
     *         false si no se cumple ningunas de las condiciones mencionadas anteriormente.
     * @author Miguel Presinal <i>[mpresinal@unipago.com.do]</i>
     * @since OAT-9
     */
    public static boolean validarRangoFecha(Date fechaInicial, Date fechaFinal) {

        if( (fechaInicial != null && fechaFinal != null) && (fechaInicial.after(fechaFinal)) ){
            return false;
        }
        return true;
    }

    /**
     * Valida que la periodo inicial no sea mayor que el periodo final, solo cuando sean especificados ambos periodos.
     *
     * @param periodoInicial
     * @param periodoFinal
     * @return true si se cumple las siguientes condiciones:
     *         <ul>
     *          <li>si la periodo inicial es null y la periodo final no es null.<li>
     *          <li>si la periodo final es null y la periodo inicial no es null.<li>
     *         	<li>si la periodo inicial no es mayor que la periodo final.<li>
     *         </ul> 
     *         false si no se cumple ningunas de las condiciones mencionadas anteriormente.
     * @author Miguel Presinal <i>[mpresinal@unipago.com.do]</i>
     * @since OAT-9
     */
    public static boolean validarRangoPerido(Integer periodoInicial, Integer periodoFinal) {
        if( (periodoInicial != null && periodoFinal != null) && (periodoInicial > periodoFinal) ){
            return false;
        }
        return true;
    }
    
}
