package com.java.beans;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Interrupteur interrupteur;
    private static JTextField textField = new JTextField();

    public UI(Interrupteur interrupteur) {
        this.interrupteur = interrupteur;
    }

    public void init() {
        JFrame frame = new JFrame("Test player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        JButton jour = new JButton("jour");
        jour.addActionListener(e -> textField.setText(interrupteur.getState().allumer()));

        JButton nuit = new JButton("nuit");
        nuit.addActionListener(e -> textField.setText(interrupteur.getState().eteidre()));

        frame.setVisible(true);
        frame.setSize(300,100);

        buttons.add(jour);
        buttons.add(nuit);

    }
}
