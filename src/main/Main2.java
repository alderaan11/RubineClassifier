package main;

import algebre.Matrice;

public class Main2 {

    public static void printM(Matrice m) {
        System.out.println(m.toString());
    }

    public static void main(String s[]) {
        System.out.println("Hello World");
        Matrice m = new Matrice(new double[][] {{1, 1, 2}, {1, 2, 1}, {2, 1, 1}});
        printM(m);
        Matrice[] m_inverse = m.inverse();
        printM(m_inverse[0]);
        printM(m_inverse[1]);


    }
}
