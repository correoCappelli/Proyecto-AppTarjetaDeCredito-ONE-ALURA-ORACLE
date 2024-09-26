package com.aluraone.apptarjetas.calculos;

import com.aluraone.apptarjetas.interfaces.Credito;
import com.aluraone.apptarjetas.modelos.DeCredito;


public class CompraConTarjetaACredito {
    public void ComprarACredito(DeCredito o, int importe){

            o.setCreditoTarjeta(o.getCreditoTarjeta() - importe);

    }
}
