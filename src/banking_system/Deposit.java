/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author aryam
 */
public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    
    Deposit(String pinnumber){
        
        this.pinnumber=pinnumber;
        
       setSize(950,900);
        setLocation(300,0); 
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Enter the amount you want to depoist");
        text.setForeground(Color.white);
         text.setFont(new Font("system",Font.BOLD,16));
         text.setBounds(170,300,400,20);
        image.add(text); 
        
         amount =new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
        deposit =new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
       image.add(deposit); 
       deposit.addActionListener(this);
       
      
       back =new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
       image.add(back); 
        
        
        
          setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
             String number = amount.getText();
            Date date = new Date();
            
             if(number.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
            }
             else{
                 try{
                  Con con = new Con();
                    con.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Deposited Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);}
                 catch(Exception e){
                 System.out.println(e);
                 }
                 }
             }
                
        
        if(ae.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
            
           
            
        }
        
    }
    public static void main(String args[]){
        new Deposit("");
    
    }
    
}
