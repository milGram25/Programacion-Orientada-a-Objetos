
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
        
        //Buscar objeto en el inventario
        System.out.println("Productos que desea agregar: ");
        nombre = sc.nextLine();
        indexInv=buscarProducto(nombre,inventario);
        if(indexInv==-1){
            return;
        }
        
        //Obtener cantidad a ingresar
        System.out.println("Cuantos quieres agregar?");
        numProductos = validarEnteros();
        
        //Crear producto auxiliar
        Producto agregar = new Producto();
        agregar.setNombre(inventario.get(indexInv).getNombre());
        agregar.setCantidad(inventario.get(indexInv).getCantidad());
        agregar.setPrecio(inventario.get(indexInv).getPrecio());
        
        //Buscar el indice en el carrito. Si aun no existe, retorna -1
        indexCar=buscarProducto(nombre,carrito);
        
        //Agregar si no existe
        if(indexCar==-1){
            //Comprobar que haya suficiente inventario
            if(numProductos<inventario.get(indexInv).getCantidad()){
            System.out.println("Agregando producto al carrito");
            agregar.setCantidad(numProductos);
            carrito.add(agregar);
            } else {
                System.out.println("Inventario insuficiente");
                return;
            }
            //Comprobar que haya suficiente inventario
        } else if ((carrito.get(indexCar).getCantidad()+numProductos)<inventario.get(indexInv).getCantidad()){
            carrito.get(indexCar).setCantidad(carrito.get(indexCar).getCantidad()+numProductos);
        //Salir si no hay suficiente
        } else {
            System.out.println("Inventario insuficiente");
            return;
        }
        inventario.get(indexInv).setCantidad(inventario.get(indexInv).getCantidad()-numProductos);
        
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
