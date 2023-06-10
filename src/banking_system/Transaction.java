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

public class Transaction  extends JFrame implements ActionListener{
   JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceEnquiry,exit; 
    
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
        
         deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
         withdrawl=new JButton("Withdraw");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash=new JButton("FastCash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange=new JButton("Change PIN");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         balanceEnquiry=new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355,485,150,30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);
        
        exit=new JButton("Exit");
        exit.setBounds(260,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
    
        
        setUndecorated(true);
       
        setLayout(null);
         setVisible(true);
         
         
        
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
           if(ae.getSource()==exit)
               System.exit(0);
           
//           if(ae.getSource()==deposit)
//               System.exit(0);
//           
//           if(ae.getSource()==)
//               System.exit(0);
//           
//           if(ae.getSource()==exit)
//               System.exit(0);
//           
//           if(ae.getSource()==exit)
//               System.exit(0);
//           
//           if(ae.getSource()==exit)
//               System.exit(0);
//           
           
         }
    
    public static void main(String args[]){
        new Transaction();
    }
    
}
