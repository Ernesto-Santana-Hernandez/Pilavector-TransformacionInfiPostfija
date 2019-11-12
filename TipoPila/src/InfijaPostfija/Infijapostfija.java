package InfijaPostfija;

import java.util.Scanner;
import java.util.Stack;

public class Infijapostfija {

    public static void main(String[] args) {
        infijapostfijaa objinpo = new infijapostfijaa();
        System.out.println("Ingresa una expresión algebraica: ");
        Scanner leer = new Scanner(System.in);

        String expresion = objinpo.depurar(leer.nextLine());
        String[] arrayInfija = expresion.split(" ");

        Stack< String> E = new Stack< String>();
        Stack< String> P = new Stack< String>();
        Stack< String> S = new Stack< String>();

        for (int i = arrayInfija.length - 1; i >= 0; i--) {
            E.push(arrayInfija[i]);
        }

        try {
            while (!E.isEmpty()) {
                switch (objinpo.postfija(E.peek())) {
                    case 1:
                        P.push(E.pop());
                        break;
                    case 3:
                    case 4:
                        while (objinpo.postfija(P.peek()) >= objinpo.postfija(E.peek())) {
                            S.push(P.pop());
                        }
                        P.push(E.pop());
                        break;
                    case 2:
                        while (!P.peek().equals("(")) {
                            S.push(P.pop());
                        }
                        P.pop();
                        E.pop();
                        break;
                    default:
                        S.push(E.pop());
                }
            }

            String infija = expresion.replace(" ", "");
            String postfija = S.toString().replaceAll("[\\]\\[,]", "");

            System.out.println("Expresion Infija: " + infija);
            System.out.println("Expresion Postfija: " + postfija);

        } catch (Exception ex) {
            System.out.println("Error en la expresión algebraica");
            System.err.println(ex);
        }
    }

}
