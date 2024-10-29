/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectointegrador;
import static com.mycompany.proyectointegrador.Carrito.carrito;
import java.util.*;

/**
 *
 * @author
 * Equipo:
 * De la Cruz García Cindy Stefania
 * García Romo Milton
 * González Rodríguez Carlos
 * Santana Christopher
 * 
 * 
 */
public class ProyectoIntegrador 
{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Producto> inventario =new ArrayList<>();
    
    
    public static void main(String[] args) 
    {
        int mainMenu;
        boolean salir=true;
        do{
        System.out.println("""
                           Soy:
                           1.Comprador
                           2.Vendedor
                           3.Salir del punto de venta""");
        mainMenu=validarEnteros();
        switch(mainMenu){
            case 1 -> menuCarrito();
            case 2 -> menuInventario();
            case 3 -> salir=false;
            default -> System.out.println("Opcion invalida");
        }
        }while(salir);
        System.out.println("Hasta Pronto!");
    }
    
    public static void menuInventario()
    {
        boolean seguir=true;
        int menu;
        do{
            //Escoger opcion
            System.out.println("""
                               Que accion desea realizar
                               1. Ingresar productos nuevos
                               2. Mostrar inventario completo
                               3. Mostrar producto especifico
                               4. Modificar producto
                               5. Eliminar producto
                               6. Volver al menu principal""");
            menu=validarEnteros();
            sc.nextLine();
            
            //Entrar al menu
            switch(menu){
                case 1 -> ingresarProducto();
                case 2 -> mostrarInventario(inventario);
                case 3 -> mostrarProducto();
                case 4 -> modificarProducto();
                case 5 -> eliminarProducto();
                case 6 -> seguir=false;
                default -> System.out.println("Opcion invalida");
            }
        } while (seguir);
    }
    
    public static void menuCarrito()
    {
        Carrito carrito=new Carrito();
        boolean seguir=true;
        int menu;
        do{
            //Escoger opcion
            System.out.println("""
                               Que accion desea realizar
                               1. Comprar nuevos productos
                               2. Ver carrito
                               3. Pagar carrito
                               4. Volver a menu principal""");
            menu=validarEnteros();
            sc.nextLine();
            
            //Entrar al menu
            switch(menu){
                case 1 -> carrito.agregarCarrito();
                case 2 -> mostrarInventario(carrito.getCarrito());
                case 3 -> {
                    if(carrito.getCarrito().isEmpty()){
                        System.out.println("Carrito vacio");
                        break;
                    }
                    Pago pagoCarlos = null;
                    System.out.println("""
                                       Elija metodo de pago
                                       1.Pago con tarjeta
                                       2.Pago PayPal
                                       3.Transferencia Bancaria""");
                    int opcion=validarEnteros();
                    int monto=carrito.getMonto();
                    switch(opcion){
                        case 1 -> pagoCarlos=new PagoTarjeta(monto);
                        case 2 -> pagoCarlos=new PagoPayPal(monto);
                        case 3 -> pagoCarlos=new PagoTransferencia(0,monto);
                    }
                    procesarPago(pagoCarlos);
                    carrito.getCarrito().clear();
                }
                case 4 -> seguir=false;
                default -> System.out.println("Opcion invalida");
            }
        } while (seguir);
    }
    
    public static void mostrarInventario(ArrayList<Producto> lista){
        //Checar si el inventario esta vacio
        if(lista.isEmpty()){
            System.out.println("Ningun producto encontrado");
            return;
        }
        
        //Recorre el ArrayList dando salida a cada objeto
        for(Producto Lista:lista){
            System.out.println(Lista);
        }
    }
    
    public static int validarEnteros(){
        int m;
        
        //
        do{
            //Intenta escanear un valor entero
            try {
            m=sc.nextInt();
            } catch (InputMismatchException e){
                //Excepcion por entrada de dato de tipo erroneo
                System.out.println(e);
                sc.nextLine();
                m=0;
            }
            if(m<=0){
                //Comprobar si el valor entero es valido
                System.out.println("Valor invalido");
            }
        }while (m<=0);
        return m;
    }
    
    public static long validarLong(){
        long m;
        //
        do{
            //Intenta escanear un valor entero
            try {
            m=sc.nextLong();
            } catch (InputMismatchException e){
                //Excepcion por entrada de dato de tipo erroneo
                System.out.println(e);
                sc.nextLine();
                m=0;
            }
            if(m<=0){
                //Comprobar si el valor entero es valido
                System.out.println("Valor invalido");
            }
        }while (m<=0);
        return m;
    }
    
    public static void ingresarProducto(){
        //Variables locales
        int m;
        String nombre;
        double precio;
        int cantidad;
        Producto aux;
        
        //Ingresar cantidad de elementos
        System.out.println("Cuantos productos desea ingresar?");
        m=validarEnteros();
        sc.nextLine();
        
        //Ingresar productos
        System.out.println("Coloque la info que se le pide de cada producto: ");
        for(int i=1;i<=m;i++)
        {
            //Variables auxiliares para almacenar los datos temporalmente
            System.out.println("Nombre del producto "+i+":");
            nombre=sc.nextLine();
            System.out.println("Precio: ");
            precio=validarEnteros();
            System.out.println("Cantidad: ");
            cantidad=validarEnteros();
            sc.nextLine();
            
            aux=new Producto();
            //Asignar atributos
             aux.setNombre(nombre);
             aux.setPrecio(precio);
             aux.setCantidad(cantidad);
            
             inventario.add(aux);
        }
    }
    
    public static int buscarProducto(String name, ArrayList<Producto> lista){
        for(int i=0;i<lista.size();i++){
            //Comprobar que el nombre ingresado se encuentre en el ArrayList
            if(lista.get(i).getNombre().equals(name)){
                //Retornar el indice del objeto en el ArrayList
                return i;
            }
        }
        if(lista.equals(carrito)){
            return -1;
        }
        System.out.println("Producto no encontrado");
        //Retornar indice invalido para cancelar la busqueda
        return -1;
    }
    
    public static void eliminarProducto(){
        //Checar si el inventario esta vacio
        if(inventario.isEmpty()){
            System.out.println("Inventario vacio");
            return;
        }
        
        //Variables locales
        String eliminar;
        
        System.out.println("Ingrese el nombre del producto a eliminar");
        eliminar=sc.nextLine();
        
        //Intentar eliminar el objeto
        try{
        inventario.remove(buscarProducto(eliminar,inventario));
        System.out.println("Producto eliminado");
        } catch (IndexOutOfBoundsException e){
        }
    }
    
    public static void mostrarProducto(){
        //Checar si el inventario esta vacio
        if(inventario.isEmpty()){
            System.out.println("Inventario vacio");
            return;
        }
        
        String mostrar;
        System.out.println("Ingrese el nombre del producto que desea ver");
        mostrar=sc.nextLine();
        
        //Intentar mostrar el objeto
        try{
        System.out.println(inventario.get(buscarProducto(mostrar,inventario)));
        } catch (IndexOutOfBoundsException e){
        }
    }
    
    public static void modificarProducto(){
        //Checar si el inventario esta vacio
        if(inventario.isEmpty()){
            System.out.println("Inventario vacio");
            return;
        }
        
        String modificar;
        int index;
        System.out.println("Ingrese el producto a modificar");
        modificar=sc.nextLine();
        
        //Obtener indice del producto
        index=buscarProducto(modificar,inventario);
        
        //Intenta modificar el producto
        try{
        //Mostrar los datos viejos del objeto
        System.out.println(inventario.get(index));
        
        //Ingresar los datos nuevos
        System.out.println("Ingrese el nuevo nombre");
        inventario.get(index).setNombre(sc.nextLine());
        System.out.println("Ingrese el nuevo precio");
        inventario.get(index).setPrecio(sc.nextDouble());
        sc.nextLine();
        System.out.println("Ingrese la nueva cantidad");
        inventario.get(index).setCantidad(sc.nextInt());
        sc.nextLine();
        } catch (IndexOutOfBoundsException e){
        }
    }
    
    public static void procesarPago(Pago pago){
        pago.realizarPago();
    }
    
    public static String validarEntrada(String dato,int tamano){
        String entrada;
        while(true){
        System.out.println("Ingrese "+dato);
        entrada=sc.nextLine();
        if(entrada.matches("\\d{"+tamano+"}")){
            break;
        } else {
            System.out.println("Ingrese numero de "+tamano+" digitos, por favor.");
        }
        }
        return entrada;
    }
    
    public static boolean validarFecha(int fecha,int min,int max){
        if(fecha>=min && fecha<=max){
            return false;
        } else {
            System.out.println("Fecha invalida. Vuelva a ingresar");
            return true;
        }
    }
}
