/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication127;

/**
 *
 * @author Mikael
 */
import javax.swing.*;

class derivadas {

    public static void main(String[] arg) {
        int mono;
        JOptionPane.showMessageDialog(null, "DERIVADAS");
        String cantidadM = JOptionPane.showInputDialog(null, "De Cuantos Monomios Es Tu Funcion");
        int cantidad = Integer.parseInt(cantidadM);
        int mon[][] = new int[cantidad][2];
        int org[][] = new int[cantidad][2];
        for (int i = 0; i < cantidad; i++) {
            mono = i + 1;
            String c1 = JOptionPane.showInputDialog(null, "Monomio " + mono + " de " + cantidad + "\nQue valor acompania a la\"X\"", "DERIVADAS", 3);
            org[i][0] = Integer.parseInt(c1);
            String c2 = JOptionPane.showInputDialog(null, "Monomio " + mono + " de " + cantidad + "\nA que potencia esta elevada la\"X\" ", "DERIVADAS", 3);
            org[i][1] = Integer.parseInt(c2);
            mon[i][0] = org[i][0] * org[i][1];
            mon[i][1] = org[i][1] - 1;
        }
        System.out.println("Tu funcion es:");
        for (int y = 0; y < (cantidad - 1); y++) {
            System.out.print(org[y][0] + "X^" + org[y][1] + "+");
        }
        System.out.println(org[(cantidad - 1)][0] + "X^" + org[0][1]);
        System.out.println("La Derivada es:");
        for (int x = 0; x < (cantidad - 1); x++) {
            System.out.print(mon[x][0] + "X" + mon[x][1] + "+");
        }
        System.out.println(mon[(cantidad - 1)][0]);

    }
}
