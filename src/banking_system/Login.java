/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

/**
 *
 * @author aryam
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    JButton login,clear,signup;
    JTextField cardField;
    JPasswordField pinField;
    Login(){
        setSize(800,480);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        setLayout(null);
        add(label);
        repaint();
        
        setLocation(350,200);
        setTitle("AUTOMATED TELLER MACHINE");
        getContentPane().setBackground(Color.white);
        
        
        //label 1 for text
        JLabel text=new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        setVisible(true);
        repaint();
        
        //label 2 for card no
        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        setVisible(true);
        repaint();
        
        //label 2 for pincode
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        repaint();
       // pin.setVisible(rootPaneCheckingEnabled);//setVisible(true);
         
        //textfield for card no
         cardField=new JTextField();
        cardField.setBounds(300,150,230,30);
        add(cardField);
        cardField.setVisible(true);
        cardField.setFont(new Font("Arial",Font.BOLD,14 ));
        repaint();
        
        
        //textfield for pin
         pinField=new JPasswordField();
        pinField.setBounds(300,220,230,30);
        add(pinField);
        pinField.setVisible(true);
        pinField.setFont(new Font("Arial",Font.BOLD,14 ));
        repaint();
        
        
        //log in button
         login= new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        repaint();
        
        
        
        
        //CLEAR BUTTON
         clear= new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        repaint();
        
        //SIGNUP BUTTON
         signup= new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
         add(signup);
         repaint();
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardField.setText("");
            pinField.setText("");
        
        }
        else if(ae.getSource()==login){
        }
        else if(ae.getSource()==signup){
            setVisible(false);
            new SignUp1().setVisible(true);
        }
    
    }
    public static void main(String args[]){
    new Login();
    
    }
    
}

