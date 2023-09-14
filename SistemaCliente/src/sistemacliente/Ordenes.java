/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacliente;

/**
 *
 * @author Ramse
 */
public class Ordenes {
    private Cola<OrdenDeCompra> colaDeOrdenes = new Cola<>(10); 
    private int cantidadDeOrdenes = 0;

    public void recibirOrden(OrdenDeCompra orden) {
        colaDeOrdenes.insertarDato(orden);
        cantidadDeOrdenes++; 
            System.out.println("Orden recibida: " + orden.getCliente() + ", Total de órdenes: " + cantidadDeOrdenes);
    }

    public int cantidadDeOrdenes() {
        return cantidadDeOrdenes;
    }

    public void procesarOrdenes() {
        System.out.println("Procesando órdenes...");
        OrdenDeCompra orden = colaDeOrdenes.eliminarDato();
        while (orden != null) {
            System.out.println("Procesando orden para " + orden.getCliente() + " de " + orden.getCantidad() + " productos.");
            cantidadDeOrdenes--; 
            orden = colaDeOrdenes.eliminarDato();
        }
          System.out.println("Órdenes procesadas, Total de órdenes restantes: " + cantidadDeOrdenes);
    }
}
