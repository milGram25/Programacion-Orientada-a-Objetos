package com.mycompany.proyectointegrador;

import java.util.*;

/**
 *
 * @author mil_g
 */
public class PagoPayPal extends Pago{
    
    private String correo,contrasena;

    public PagoPayPal(int monto) {
        super(monto);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
        
    
    }
    public void realizarPago(PagoPayPal cuentaPaypal){
        Scanner scanner = new Scanner(System.in);
        
        while (true ){
            System.out.println("Por favor ingrese el correo asociado a su cuenta de PayPal");
            correo = scanner.nextLine();
            //Verifica que el correo contenga el simbolo @
            if (correo.contains ("@")){
            break;
            } else {System.out.println("El correo electronico presenta problemas, por favor ingrese un correo electronico valido");
            }
        }
        System.out.println("Ingresa la contrasenya de tu cuenta de PayPal");
        while(true){
        contrasena = scanner.nextLine();
        if(!contrasena.isEmpty()){
            System.out.println("El Pago se ha efectuado con exito, se descontaron $"+getMonto()+" de "+ correo);
            break;
        } else {
            System.out.println("No ha ingresado ninguna contraseña");
        }
        }
    }   
}