package main;

import javax.swing.JFrame;

import algebre.Matrice;
import ui.MainWindow;

import static algebre.Matrice.identity;

public class Main2 {

    public static void main(String s[]) {
        System.out.println("Hello World");
        Matrice m = new Matrice(new double[][] {{1, 1, 4}, {3, 2, 1}, {2, 1, 2}});
        System.out.println(m.toString());
        System.out.println(identity(3).toString());
        Matrice m2 = m.inverse();
        System.out.println(m2.toString());
    }
}
