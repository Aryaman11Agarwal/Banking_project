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
import java.util.Random;

public class Transaction  extends JFrame{
    
    Transaction(){
       setSize(950,900);
        setLocation(300,0); 
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        setVisible(true);
        setLayout(null);
        
    
    }
    
    public static void main(String args[]){
        new Transaction();
    }
    
}
