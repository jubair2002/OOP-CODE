package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class application {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Calculator App");
        JPanel panel= new JPanel();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl= new JLabel("Enter 1st Number :");
        JTextField tf= new JTextField(30);

        JLabel lbl2= new JLabel("Enter 2nd Number :");
        JTextField tf2= new JTextField(30);
        JButton addBtn = new JButton("ADDITION");
        JButton subBtn = new JButton("SUBTRACTION");
        JLabel lbl3= new JLabel("result :");
        JTextField tf3= new JTextField(30);

        panel.add(lbl);
        panel.add(tf);

        panel.add(lbl2);
        panel.add(tf2);
        panel.add(lbl3);
        panel.add(tf3);
        panel.add(addBtn);
        panel.add(subBtn);
        tf.setText("0");tf2.setText("0");

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(tf.getText());
                int num2=Integer.parseInt(tf2.getText());
                int result=num1+num2;
                tf3.setText(String.valueOf(result));
            }
        });
        subBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(tf.getText());
                int num2=Integer.parseInt(tf2.getText());
                int result=num1-num2;
                tf3.setText(String.valueOf(result));
            }
        });

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
