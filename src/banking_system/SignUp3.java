/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking_system;

/**
 *
 * @author aryam
 */
//package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 *
 * @author aryam
 */
public class SignUp3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignUp3(String formno){
        this.formno=formno;
        setBackground(Color.WHITE); 
         setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    
       setLayout(null);
        
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        repaint();
        
         JLabel type=new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        repaint();
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(200,180,250,20);
        add(r1); 
        
        r2=new  JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(450,180,250,20);
        add(r2); 
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
       r3.setBackground(Color.white);
        r3.setBounds(200,220,250,20);
        add(r3); 
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
       r4.setBackground(Color.white);
        r4.setBounds(450,220,250,20);
        add(r4); 
        
        ButtonGroup acctType=new ButtonGroup();
        acctType.add(r1);
        acctType.add(r2);
        acctType.add(r3);
        acctType.add(r4);
        
        JLabel card=new JLabel("Card Number:");
       card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        repaint();
        
        JLabel cardDetail=new JLabel("(Your 16 digit card number)");
       cardDetail.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetail.setBounds(100,330,300,20);
        add(cardDetail);
        repaint();
        
        JLabel number=new JLabel("5040-XXXX-XXXX-XXXX");
       number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        repaint();
        
        JLabel pin=new JLabel("PIN:");
       pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        repaint();
        
        JLabel pinDetail=new JLabel("(Your 4 digit pin)");
       pinDetail.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetail.setBounds(100,400,300,20);
        add(pinDetail);
        repaint();
        
        JLabel pnumber=new JLabel("XXXX");
       pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        repaint();
        
        JLabel services=new JLabel("Services Required:");
       services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,300,30);
        add(services);
        repaint();
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(200,500,200,30);
        add(c1);
        repaint();
        
         c2=new JCheckBox("Internet Banking");
       c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(450,500,200,30);
        add(c2);
        repaint();
        
         c3=new JCheckBox("Email & SMS Alerts");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(200,550,200,30);
        add(c3);
        repaint();
        
         c4=new JCheckBox("Mobile Banking");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(450,550,200,30);
        add(c4);
        repaint();
        
         c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(200,600,200,30);
        add(c5);
        repaint();
        
         c6=new JCheckBox("E-Statement");
       c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(450,600,200,30);
        add(c6);
        repaint();
        
         c7=new JCheckBox("I hereby declare that all the above details are correct to the best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(170,680,600,30);
        add(c7);
        repaint();
        
        submit=new JButton("Submit");
        submit.setBackground(Color.black);
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.black);
        
        submit.setForeground(Color.white);
        cancel.setForeground(Color.white);
        
        submit.setFont(new Font("Raleway",Font.TYPE1_FONT,14));
        cancel.setFont(new Font("Raleway",Font.TYPE1_FONT,14));
        
        submit.setBounds(250,720,100,30);
        cancel.setBounds(420,720,100,30);
        
        add(submit);
        add(cancel);
        
        submit.addActionListener(this);
        cancel.addActionListener(this);
        
       getContentPane().setBackground(Color.white);
      }
    
    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==submit){
    String accountType="";
    if(r1.isSelected()){
      accountType= "Saving Account" ;
    }
    else if(r2.isSelected())
        accountType= "Fixed Deposit Account" ;
    
    else if(r3.isSelected())
        accountType= "Current Account" ;
    
    else if(r4.isSelected())
        accountType= "Recurring Deposit Account" ;
    
    
    String facility="";
    if(c1.isSelected())
        facility=facility+" ATM card";
    if(c2.isSelected())
        facility=facility+" Internet Banking";
    if(c3.isSelected())
        facility=facility+" SMS alerts";
    if(c4.isSelected())
        facility=facility+" Mobile Banking";
    if(c5.isSelected())
        facility=facility+" Cheque Book";
   if(c6.isSelected())
       facility=facility+" E-statement"; 
Random random =new Random();
String cardNumber=""+(Math.abs((random.nextLong()%90000000L))+5040936000000000L);
System.out.print(cardNumber);
String pinNumber=""+(Math.abs((random.nextLong()%9000L))+1000L);
    
    try{
         if(accountType.equals(""))
            JOptionPane.showMessageDialog(null, "Choose account Type");
         else if(c7.isSelected()==false)
             JOptionPane.showMessageDialog(null, "Click on the validation statement to continue");
         else{
             Con con =new Con();
             String query1="insert into signup3 values('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
             con.s.executeUpdate(query1);
             String query2="insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
             con.s.executeUpdate(query2);
              JOptionPane.showMessageDialog(null, "Card Number:\n"+cardNumber+"\nPin: \n"+pinNumber);
         }
    
    }catch(Exception e){
        System.out.println(e);
    }
    }
    
                
     if(ae.getSource()==cancel){
    setVisible(false);
    new Login().setVisible(true);
    }
    
    
    }

    public static void main(String args[]){
    new SignUp3("");
    }
    
}
