/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfijaPostfija;

/**
 *
 * @author Lenovo
 */
public class infijapostfijaa {
    
    public static String depurar(String s) {
        s = s.replaceAll("\\s+", "");
        s = "(" + s + ")";
        String simbols = "+-*/()";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (simbols.contains("" + s.charAt(i))) {
                str += " " + s.charAt(i) + " ";
            } else {
                str += s.charAt(i);
            }
        }
        return str.replaceAll("\\s+", " ").trim();
    }

    public static int postfija(String op) {
        int post = 99;
        if (op.equals("^")) {
            post = 5;
        }
        if (op.equals("*") || op.equals("/")) {
            post = 4;
        }
        if (op.equals("+") || op.equals("-")) {
            post = 3;
        }
        if (op.equals(")")) {
            post = 2;
        }
        if (op.equals("(")) {
            post = 1;
        }
        return post;
    }
}
