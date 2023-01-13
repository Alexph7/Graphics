package com.exercicios;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ph757
 */
public class LinhasTest {

    public static void main(String[] args) {

        Linhas objExercicios = new Linhas();

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        objExercicios.setBackground(Color.white);
        app.add(objExercicios);
        app.setSize(500, 500);
        app.setVisible(true);

    }

}
