package GuestBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactControllerTest implements ActionListener {
    public static void main(String[] args) {
        new ContactControllerTest();
    }

    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    GridLayout layoutF=new GridLayout(1,4);
    JPanel panel1=new JPanel();

    JLabel label=new JLabel("First Name");
    JLabel label1=new JLabel("Last Name");
    JLabel label2=new JLabel("Address");
    JLabel label3=new JLabel("Phone Number");

    JTextField text=new JTextField(30);
    JTextField text1=new JTextField(30);
    JTextField text2=new JTextField(30);
    JTextField text3=new JTextField(30);

    JButton button=new JButton("Submit");



    ContactControllerTest(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425,200);

        frame.add(panel);
        frame.setLayout(layoutF);
        layoutF.setHgap(40);
        panel.add(label);
        panel.add(text);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputFN=text.getText();
                text.setText(inputFN);
            }
        });

        panel.add(label1);
        panel.add(text1);
        text1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLN=text1.getText();
                text1.setText(inputLN);
            }
        });

        panel.add(label2);
        panel.add(text2);
        text2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputAdd=text2.getText();
                text2.setText(inputAdd);
            }
        });

        panel.add(label3);
        panel.add(text3);
        text3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputPho=text3.getText();
                text3.setText(inputPho);
            }
        });

        panel.add(button);
           button.addActionListener(this);
        }


        @Override
    public void actionPerformed(ActionEvent e) {
//            String firstName=text.getText();
//            String lastName=text1.getText();
//        String address=text2.getText();
//        String phoneNumber=text3.getText();
//
//        if(e.getSource()==button){
//
//        }


    }
}
