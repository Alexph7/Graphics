/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rostotest;

import javax.swing.JFrame;

/**
 *
 * @author ph757
 */
public class RostoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RostoGraphics objRostoGraphics = new RostoGraphics();
        JFrame objJFrame = new JFrame();

        objJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objJFrame.add(objRostoGraphics);
        objJFrame.setSize(300, 300);
        objJFrame.setVisible(true);

    }

}
