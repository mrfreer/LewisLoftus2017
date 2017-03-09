/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lewisloftus.chapter9;


import javax.swing.*;
import java.awt.*;



/**
 *
 * @author dfreer
 */
public class DisplayColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.white);
        colorPanel.setPreferredSize(new Dimension(300,100));
        frame.getContentPane().add(colorPanel);
        frame.pack();
        frame.setVisible(true);
        Color shade = Color.white;
        int again;
        do{
            shade = JColorChooser.showDialog(frame, "Pick a color!", shade);
            colorPanel.setBackground(shade);
            again = JOptionPane.showConfirmDialog(null, "Display another color?");
        }while(again == JOptionPane.YES_OPTION);
    }
    
}
