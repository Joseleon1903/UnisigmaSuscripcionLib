package com.unipago.unisigma.tool.service;


import com.unipago.unisigma.tool.domain.SuscripcionNotificacion;
import com.unipago.unisigma.tool.fake.FakeDataUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuscripcionService {

    private List<SuscripcionNotificacion> fakeData =  new ArrayList<SuscripcionNotificacion>();


    public SuscripcionService() {
        this.fakeData = FakeDataUtil.optenerData();
    }

    public SuscripcionNotificacion buscarPorId (Integer id){
        return fakeData.get(id);
    }




}
