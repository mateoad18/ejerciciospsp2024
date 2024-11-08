package Swing;

import javax.swing.*;
import java.awt.*;

public class Main implements Runnable{

    @Override
    public void run() {
        JFrame frame = new JFrame("Prueba de Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel content = (JPanel) frame.getContentPane();
        content.setPreferredSize(new Dimension(500,300));
        JButton button = new JButton("Pulsame guaje ");
        content.add(button,BorderLayout.CENTER);
        JLabel label = new JLabel("Hola collacios", JLabel.CENTER);
        label.setFont(label.getFont().deriveFont(30f));
        label.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(50,50,50,50),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.red),
                        BorderFactory.createEmptyBorder(10,10,10,10)
                )
        ));
        content.add(label,BorderLayout.NORTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String []args){
        SwingUtilities.invokeLater(new Main());
    }

}
