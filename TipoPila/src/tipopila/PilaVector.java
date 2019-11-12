package tipopila;

import java.util.Vector;

public class PilaVector {

    private static final int Inicial = 19;
    private int cima;
    private Vector listaPila;

    public PilaVector() {
        cima = -1;
        listaPila = new Vector(Inicial);
    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.addElement(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila Vacía, no se puede extraer.");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        System.out.println("La cima de la pila es:" +cima);
        return listaPila.elementAt(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;

    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }
}
