package com.exercicios;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ph757
 */
public class ExerciciosTest {

    public static void main(String[] args) {

        Exercicios objExercicios = new Exercicios();

        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        objExercicios.setBackground(Color.white);
        app.add(objExercicios);
        app.setSize(400, 400);
        app.setVisible(true);

    }

}
