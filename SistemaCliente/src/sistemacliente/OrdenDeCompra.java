package sistemacliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ramse
 */
class OrdenDeCompra {
    private String cliente;
    private int cantidad;

    public OrdenDeCompra(String cliente, int cantidad) {
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public int getCantidad() {
        return cantidad;
    }
}