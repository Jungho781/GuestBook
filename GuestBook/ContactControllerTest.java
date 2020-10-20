package GuestBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ContactControllerTest implements ActionListener {
    public static void main(String[] args) {
        new ContactControllerTest();
    }

    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JTextArea textArea=new JTextArea(5,0);
    JScrollPane scrollPane=new JScrollPane(textArea);
    GridLayout layoutP=new GridLayout(5,2,5,20);
    GridLayout layoutF=new GridLayout(0,2);
    GridLayout layoutT=new GridLayout(3,2);
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
        frame.setSize(450,300);

        frame.add(panel);
        frame.setLayout(layoutF);
        panel.setLayout(layoutP);
        panel.add(label);
        panel.add(text);
        text.addActionListener(e -> {
            String inputFN=text.getText();
            text.setText(inputFN);
        });

        panel.add(label1);
        panel.add(text1);
        text1.addActionListener(e -> {
            String inputLN=text1.getText();
            text1.setText(inputLN);
        });

        panel.add(label2);
        panel.add(text2);
        text2.addActionListener(e -> {
            String inputAdd=text2.getText();
            text2.setText(inputAdd);
        });

        panel.add(label3);
        panel.add(text3);
        text3.addActionListener(e -> {
            String inputPho=text3.getText();
            text3.setText(inputPho);
        });

        frame.add(scrollPane);
        textArea.setEditable(false);
        textArea.setLayout(layoutT);

        panel.add(panel1);
        panel1.add(button);
        button.addActionListener(this);
        }


    @Override
   public void actionPerformed(ActionEvent e) {
        ArrayList<Contact> contacts=new ArrayList<>();

        String firstName = text.getText();
        String lastName = text1.getText();
        String address= text2.getText();
        String phoneNumber = text3.getText();

        contacts.add(new Contact(firstName,lastName,address,phoneNumber));
        String contact = "Contact:"+"\n" +
                "First name: "+firstName + "\n"+
                "Last name: "+ lastName + "\n"+
                "Address: "+address + "\n"+
                "Phone: "+phoneNumber +"\n\n";

        if (e.getSource() == button) {
            Collections.sort(contacts);
            
            for(int j=0;j<contacts.size();j++){
                textArea.setText(contacts.toString());
            }
            textArea.append(contact);
            text.setText("");
            text1.setText("");
            text2.setText("");
            text3.setText("");
        }
   }
}
