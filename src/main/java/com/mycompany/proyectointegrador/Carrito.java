
package com.mycompany.proyectointegrador;

import static com.mycompany.proyectointegrador.ProyectoIntegrador.*;
import java.util.*;

public  class Carrito {
    
    static Scanner sc=new Scanner(System.in);
    static ArrayList <Producto> carrito = new ArrayList< >();
    int monto;

    public Carrito() {
    }
    
    public void agregarCarrito(){
        String nombre;
        int numProductos,indexInv,indexCar;
        Producto aux;
        System.out.println("Productos que desea agregar: ");
        nombre = sc.nextLine();
        indexInv=buscarProducto(nombre,inventario);
        if(indexInv==-1){
            return;
        }
        System.out.println("Cuantos quieres agregar?");
        numProductos = validarEnteros();
        Producto agregar = inventario.get(indexInv);
        indexCar=buscarProducto(nombre,carrito);
        if(indexCar==-1){
            agregar.setCantidad(numProductos);
            carrito.add(agregar);
        } else if ((carrito.get(indexCar).getCantidad()+numProductos)<inventario.get(indexInv).getCantidad()){
            carrito.get(indexCar).setCantidad(carrito.get(indexCar).getCantidad()+numProductos);
        } else {
            System.out.println("Nel perro, ya no hay tanto");
        }
        
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public static void setCarrito(ArrayList<Producto> carrito) {
        Carrito.carrito = carrito;
    }
    
    public int getMonto(){
        for (Producto carrito1 : carrito) {
            monto=(int) (monto+(carrito1.getCantidad()*carrito1.getPrecio()));
        }
        return monto;
    }
}
