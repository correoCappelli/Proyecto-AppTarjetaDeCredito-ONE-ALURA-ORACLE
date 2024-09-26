package com.aluraone.apptarjetas.modelos;

import com.aluraone.apptarjetas.interfaces.Credito;

import java.util.ArrayList;
import java.util.List;


public class DeCredito extends Tarjetas implements Credito{


    public DeCredito(String titular, double saldo, String tipo, int clave) {
        super(titular, saldo, tipo, clave);
        this.calcularCreditoTarjeta();
    }

    @Override
    public String toString() {
        return this.getTitular();
    }

    @Override
    public void calcularCreditoTarjeta() {
        if(this.getSaldo()>=1000){
            this.creditoTarjeta = 10000;
        }else {
            this.creditoTarjeta = 1000;
        }
    }

    @Override
    public int getCreditoTarjeta() {
        return super.getCreditoTarjeta();
    }
}
