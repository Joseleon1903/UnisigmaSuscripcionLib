package com.unipago.unisigma.tool.fake;

import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;

import java.util.ArrayList;
import java.util.List;

public class FakeDataUtil {


    public static List<SuscripcionNotificacion> optenerData(){
        List<SuscripcionNotificacion> suscripciones = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            suscripciones.add(new SuscripcionNotificacion(
                    i,
                    100 + i,
                    200 + i,
                    i % 2 == 0 ? "Activo" : "Inactivo"
            ));
        }
        return suscripciones;
     }

}
