/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacliente;

/**
 *
 * @author Ramse
 */
public class Main {
    public static void main(String[] args) {
        Ordenes recepcion = new Ordenes();

     
        recepcion.recibirOrden(new OrdenDeCompra("Cliente Maria", 5));
        recepcion.recibirOrden(new OrdenDeCompra("Cliente Rogelio", 3));
        recepcion.recibirOrden(new OrdenDeCompra("Cliente Fabiola", 2));


     
        System.out.println("Cantidad de órdenes a procesar: " + recepcion.cantidadDeOrdenes());


        recepcion.procesarOrdenes();
    }
}