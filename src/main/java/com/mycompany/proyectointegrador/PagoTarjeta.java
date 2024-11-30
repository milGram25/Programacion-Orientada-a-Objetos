package com.mycompany.proyectointegrador;

import java.util.*;
import static com.mycompany.proyectointegrador.ProyectoIntegrador.validarEntrada;
import static com.mycompany.proyectointegrador.ProyectoIntegrador.validarFecha;

/**
 *
 * @author mil_g
 */
public class PagoTarjeta extends Pago{
    
    private String numeroCuenta,CVV,mes,anio;
    
    public PagoTarjeta(double monto) {
        super(monto);
    }    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero de Tarjeta: ").append(numeroCuenta);
        sb.append("\nCVV: ").append(CVV);
        sb.append("\nFecha de vencimiento: ").append(mes).append("/").append(anio);
        return sb.toString();
    }
    
    @Override
    public void realizarPago(){
        Scanner sc=new Scanner(System.in);
        String salir;
        numeroCuenta=validarEntrada("numero de tarjeta",16);
        
        CVV=validarEntrada("CVV",3);
        
        do{
        anio=validarEntrada("año de vencimiento",2);
        }while(validarFecha(Integer.parseInt(anio),24,99));
        
        do{
        mes=validarEntrada("mes de vencimiento",2);
        }while(validarFecha(Integer.parseInt(mes),1,12));
        
        System.out.println(this);
        
        boolean flag=true;
        
        while(flag){
        System.out.println("""
                           Si desea modificar los datos, ingrese Y
                           Si los datos son correctos, ingrese N""");
        salir=sc.nextLine();
            switch (salir) {
                case "Y" -> realizarPago();
                case "N" -> {
                    flag=false;
                }
                default -> System.out.println("Opcion invalida");
            }
        }
        
        System.out.println("Cobro realizado por $"+getMonto());
        
    }
}
