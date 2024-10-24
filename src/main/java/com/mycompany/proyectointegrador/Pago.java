/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectointegrador;

/**
 *
 * @author mil_g
 */
public abstract class Pago {
    
    private int monto;

    public Pago(int monto) {
        this.monto = monto;
    }
    
    public void realizarPago(){
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
