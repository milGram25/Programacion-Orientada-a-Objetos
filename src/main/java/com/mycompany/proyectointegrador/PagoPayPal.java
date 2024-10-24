package com.mycompany.proyectointegrador;

/**
 *
 * @author mil_g
 */
public class PagoPayPal extends Pago{
    
    private String correo,contrasena;

    public PagoPayPal(String correo, String contrasena, int monto) {
        super(monto);
        this.correo = correo;
        this.contrasena = contrasena;
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
    
    
}
