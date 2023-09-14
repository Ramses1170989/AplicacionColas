/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacliente;

/**
 *
 * @author Ramse
 */
import java.util.ArrayList;

public class Cola<T> {

    private int max;
    private T[] cola;
    private int inicio;
    private int fin;

    public Cola(int max) {
        this.max = max;
        inicio = -1;
        fin = -1;
        cola = (T[]) new Object[max];
    }

    public void insertarDato(T dato) {
        if (fin == max - 1) {
            System.out.println("Desbordamiento de la cola");
        }
        fin++;
        cola[fin] = dato;
        if (inicio == -1) {
            inicio = 0;
        }
    }

    public T eliminarDato() {
        if (inicio == -1) {
            return null;
        }
        T dato = cola[inicio];
        if (inicio == fin) {
            inicio = -1;
            fin = -1;
        } else {
            inicio++;
        }
        return dato;
    }

    public T peek() {
        return inicio != -1 ? cola[inicio] : null;
    }
}
