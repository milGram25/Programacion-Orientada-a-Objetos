/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectointegrador;

/**
 *
 * @author mil_g
 */
public class Bancos {
    private String banco, cinter, name;

    public Bancos(String banco, String cinter, String name) {
        this.banco = banco;
        this.cinter = cinter;
        this.name = name;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCinter() {
        return cinter;
    }

    public void setCinter(String cinter) {
        this.cinter = cinter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
