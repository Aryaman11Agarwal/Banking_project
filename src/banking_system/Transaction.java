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
        
        
        JLabel text =new JLabel("Please select your Transaction");
        text.setBounds(240,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("system",Font.BOLD,16));
        image.add(text); 
        
        JButton deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        image.add(deposit);
        
        JButton withdrawl=new JButton("Withdraw");
        withdrawl.setBounds(355,415,150,30);
        image.add(withdrawl);
        
        JButton fastcash=new JButton("FastCash");
        fastcash.setBounds(170,450,150,30);
        image.add(fastcash);
        
//        JButton deposit=new JButton("Deposit");
//        deposit.setBounds(170,415,150,30);
//        image.add(deposit);
//        
    
        
        //setUndecorated(true);
       
        setLayout(null);
         setVisible(true);
        
        
    }
    
    public static void main(String args[]){
        new Transaction();
    }
    
}
