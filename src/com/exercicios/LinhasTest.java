package com.exercicios;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ph757
 */
public class LinhasTest {

    public static void main(String[] args) {

        Linhas objLinhas = new Linhas();

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        objLinhas.setBackground(Color.white);
        app.add(objLinhas);
        app.setSize(500, 500);

    }

}
