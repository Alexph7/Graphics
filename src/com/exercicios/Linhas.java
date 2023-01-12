package com.exercicios;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ph757
 */
public class Linhas extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int contador = 0;
        int passos = 105; //Numeros de Retas/Linhas
        int aumentaPasso = 0;
        int diminuiPasso = getHeight();

        while (contador <= passos) {
            g.drawLine(0, 0, aumentaPasso, diminuiPasso);
            g.drawLine(getWidth(), 0, aumentaPasso, aumentaPasso);
            g.drawLine(0, getHeight(), aumentaPasso, aumentaPasso);
            g.drawLine(getWidth(), getHeight(), aumentaPasso, diminuiPasso);
            // divide a largura pelo numero de passos, entao ex:largura de 400px dividido por 15 passos vai dar mais ou menos 26,7 de deslocamento, ou seja espaço entre uma reta a outra.
            aumentaPasso += ((getHeight() + getWidth()) / passos);
            // divide a altura pelo numero de passos, entao ex:altura de 400px dividido por 15 passos vai dar mais ou menos 26,7 de deslocamento, ou seja o espaço entre uma reta a outra.
            diminuiPasso -= ((getHeight() + getWidth()) / passos);
            contador += 1;

        }

    }

}
