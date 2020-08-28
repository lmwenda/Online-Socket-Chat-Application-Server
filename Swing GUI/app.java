package com.company;

import javax.swing.*;

public class app {

    private static JTextField message_box;
    private static JButton  send_text;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // Frame Settings
        frame.setSize(717, 620);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        System.out.println("Running Chat Application");

        // Chat Box
        message_box = new JTextField();
        message_box.setBounds(0,520, 600, 70);
        panel.add(message_box);

        // Send Button
        send_text = new JButton("Send Text");
        send_text.setBounds(600, 520, 100, 70);
        panel.add(send_text);

        // Set Visibility
        frame.setVisible(true);
    }
}
