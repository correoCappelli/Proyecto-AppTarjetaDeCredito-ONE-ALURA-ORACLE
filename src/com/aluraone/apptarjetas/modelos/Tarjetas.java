package com.aluraone.apptarjetas.modelos;

import com.aluraone.apptarjetas.interfaces.Credito;

import java.util.ArrayList;
import java.util.List;

public class Tarjetas {



    protected int creditoTarjeta;

    private String titular;

    private double saldo;

    private String tipo;

    private int clave;

    private List<Compra> listaDeCompras;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public Tarjetas(String titular, double saldo, String tipo, int clave) {

        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
        this.clave = clave;
        this.listaDeCompras = new ArrayList<>();
    }

    public int getCreditoTarjeta() {
        return creditoTarjeta;
    }

    public void setCreditoTarjeta(int creditoTarjeta) {
        this.creditoTarjeta = creditoTarjeta;
    }
}
