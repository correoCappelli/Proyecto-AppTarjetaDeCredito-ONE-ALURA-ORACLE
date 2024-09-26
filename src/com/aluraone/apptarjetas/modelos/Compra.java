package com.aluraone.apptarjetas.modelos;

public class Compra {

    public Compra(String descripcion, int valorItem) {
        this.descripcion = descripcion;
        this.valorItem = valorItem;
    }

    private String descripcion;

    private  int valorItem;

    public String getDescripcion() {
        return descripcion;
    }

    public int getValorItem() {
        return valorItem;
    }
}
