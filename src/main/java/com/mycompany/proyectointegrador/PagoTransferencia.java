package com.mycompany.proyectointegrador;

import java.util.*;
import static com.mycompany.proyectointegrador.ProyectoIntegrador.validarEnteros;

/**
 *
 * @author mil_g
 */
public class PagoTransferencia extends Pago{
    
    private int referencia;
    private String banco, cinter, name;
    
    //Constructor
    public PagoTransferencia(double monto) {
        super(monto);
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    public void crearReferencia(){
        Random random=new Random();
        referencia=random.nextInt(1000000-10000)+10000;
    }
    
    
    public void realizarPago(String bancoSelec)
    {
        int bancoEscogido=0;
        /*System.out.println("""
                           En cual banco realizara la transferencia del pago?
                           1. BBVA
                           2. Santander
                           3. Banorte
                           4. NU
                           5. Klar
                           6. Banco Azteca
                           7. HSBC""");
        bancoEscogido=validarEnteros()-1;*/
        ArrayList<Bancos> bancos =new ArrayList<>();
        Bancos BBVA=new Bancos("BBVA","190253000129563975","CINEPOLIADO S.A. de C.V.");
        bancos.add(BBVA);
        Bancos Santander=new Bancos("Santander","190812562112956397","CINEPOLIADO S.A. de C.V.");
        bancos.add(Santander);
        Bancos Banorte=new Bancos("Banorte","123456789987654321","CINEPOLIADO S.A. de C.V.");
        bancos.add(Banorte);
        Bancos NU=new Bancos("NU","246802468012345678","CINEPOLIADO");
        bancos.add(NU);
        Bancos Klar=new Bancos("Klar","369121518024680123","CINEPOLIADO");
        bancos.add(Klar);
        Bancos BancoAzteca=new Bancos("Banco Azteca","090253000129563975","CINEPOLIADO");
        bancos.add(BancoAzteca);
        Bancos HSBC=new Bancos("HSBC","190253000129563910","CINEPOLIADO S.A. de C.V.");
        bancos.add(HSBC);
        for(int i=0;i<bancos.size();i++){
            if(bancos.get(i).getBanco().equals(bancoSelec)){
                banco=bancos.get(bancoEscogido).getBanco();
                cinter=bancos.get(bancoEscogido).getCinter();
                name=bancos.get(bancoEscogido).getName();
                crearReferencia();
            }
        }
        System.out.println(this);
        
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nCLABE: ").append(cinter);
        sb.append("\nBanco: ").append(banco);
        sb.append("\nNombre del Destinatario: ").append(name);
        sb.append("\nMonto a pagar: $").append(getMonto());
        sb.append("\nReferencia: ").append(referencia);
        sb.append("\nConcepto: Adquisicion de mercancia");
        return sb.toString();
    }
    //Monto, banco, referencia, cuenta de quien recibe (Interbancaria de 18D)
}
