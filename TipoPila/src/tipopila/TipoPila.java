package tipopila;

import java.util.Vector;
import javax.swing.JOptionPane;

public class TipoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int res, a;
        PilaVector objPilaEnteros = new PilaVector();

        do {
            res = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una opción\n"
                    + "1)Insertar\n"
                    + "2)Quitar\n"
                    + "3)Cima Pila\n"
                    + "4)Pila Vacia\n"
                    + "5)Limpiar Pila\n"
                    + "6)Mostrar Pila\n"
                    + "7)Salir", "Alerta!!"));
            switch (res) {
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor"));
                    objPilaEnteros.insertar(a);
                    break;
                case 2:
                    objPilaEnteros.quitar();
                    break;
                case 3:
                    objPilaEnteros.cimaPila();
                    break;
                case 4:
                    objPilaEnteros.pilaVacia();
                    break;
                case 5:
                    objPilaEnteros.limpiarPila();
                    break;
                case 6:
                    objPilaEnteros.mostrarPila();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (true);
    }

}
