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
import  java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author aryam
 */
public class SignUp1 extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField;
    JTextField pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    
    SignUp1(){
        Random ran=new Random();
        random=Math.abs(((ran.nextLong())%9000L)+1000L);
       setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        repaint();
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
       //label for form no
        JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
        formno.setForeground(Color.orange);
        formno.setFont(new Font("Arial",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        repaint();
        
        //label for personalDetails
         JLabel personalDetails=new JLabel("PAGE 1: PERSONAL DETAILS");
        personalDetails.setForeground(Color.black);
        personalDetails.setFont(new Font("Arial",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        repaint();
        
        //lable for name
        JLabel name=new JLabel("Name :");
        name.setForeground(Color.black);
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        repaint();
        
        // textField for name
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        repaint();
        
        
        //lable for father name
         JLabel fname=new JLabel("Father's Name :");
        fname.setForeground(Color.black);
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        repaint();
        
        // textField for fname
         fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        repaint();
        
        
        //lable for dob
         JLabel dob=new JLabel("Date Of Birth :");
        dob.setForeground(Color.black);
        dob.setFont(new Font("Arial",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        repaint();
        
        dateChooser =new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        dateChooser.setVisible(true);
        //repaint();
         //lable for gender
         JLabel gender=new JLabel("Gender:");
        gender.setForeground(Color.black);
        gender.setFont(new Font("Arial",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        repaint();
        
         male=new JRadioButton("Male");
        male.setBounds(400,290,60,30);
        add(male);
        male.setBackground(Color.white);
        repaint();
        
        
         female=new JRadioButton("Female");
        female.setBounds(550,290,100,30);
        female.setBackground(Color.white);
        add(female);
        repaint();
        
        
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
//        // /textField for name
//        JTextField nameTextField=new JTextField();
//        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
//        nameTextField.setBounds(300,140,400,30);
//        add(nameTextField);
       
         //lable for email
         JLabel email=new JLabel("Email ID:");
        email.setForeground(Color.black);
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        repaint();
        
        // /textField for email 
         emailTextField=new JTextField();
        emailTextField.setFont(new Font("Arial",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        repaint();
        
        
         //lable for marital status
         JLabel marital=new JLabel("Marital Status:");
        marital.setForeground(Color.black);
        marital.setFont(new Font("Arial",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        repaint();
        
         married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        add(married);
        married.setBackground(Color.white);
        repaint();
         
        
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        add(unmarried);
        unmarried.setBackground(Color.white);
        repaint();
        
         other=new JRadioButton("Other");
        other.setBounds(600,390,60,30);
        add(other);
        other.setBackground(Color.white);
        repaint();
        
        ButtonGroup maritalGroup=new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
//        // /textField for name
//        JTextField nameTextField=new JTextField();
//        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
//        nameTextField.setBounds(300,140,400,30);
//        add(nameTextField);
        

//label for address
        JLabel address=new JLabel("Address:");
        address.setForeground(Color.black);
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        repaint();
        
        // /textField for address
         addressTextField=new JTextField();
        addressTextField.setFont(new Font("Arial",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        repaint();
        
        
        //label for city
        JLabel city=new JLabel("City:");
        city.setForeground(Color.black);
        city.setFont(new Font("Arial",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        repaint();
        
        // /textField for city
         cityTextField=new JTextField();
        cityTextField.setFont(new Font("Arial",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        repaint();
        
        //label for state
        JLabel state=new JLabel("State:");
        state.setForeground(Color.black);
        state.setFont(new Font("Arial",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        repaint();
        
        // /textField for state
         stateTextField=new JTextField();
        stateTextField.setFont(new Font("Arial",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        repaint();
        
        //label for pincode
        JLabel pincode=new JLabel("Pin Code:");
        pincode.setForeground(Color.black);
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        repaint();
        
        // /textField for pincode
         pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Arial",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        repaint();
        
        //next button
         next =new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);
        next.addActionListener(this);
        repaint();
        
       
    
    }
    public void actionPerformed(ActionEvent ae){
    String formno=""+random;//long to string
    String name= nameTextField.getText();
    String fname= fnameTextField.getText();
    String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
    String gender="";
    if(male.isSelected()){
    gender="Male";
    
    }
    if(female.isSelected()){
    gender="Female";
    
    }
    
    
    String email=emailTextField.getText();
    String maritalStatus="";
    if(married.isSelected())
        maritalStatus="Married";
   else if(unmarried.isSelected())
        maritalStatus="unmarried";
   else if(other.isSelected())
        maritalStatus="other";
    String address=addressTextField.getText();
    String city =cityTextField.getText();
    String state=stateTextField.getText();
    String pin=pincodeTextField.getText();
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is  required");}
       else if(fname.equals("")){
            JOptionPane.showMessageDialog(null, "Father's Name is  required");}
       else if(dob.equals("")){
            JOptionPane.showMessageDialog(null, "Date of Birth is  required");}
       else if(gender.equals("")){
            JOptionPane.showMessageDialog(null, "Select Gender");}
       else if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Fill your Email ID");}
       else if(maritalStatus.equals("")){
            JOptionPane.showMessageDialog(null, "Choose your marital status");}
       else if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address is requires");}
       else if(city.equals("")){
            JOptionPane.showMessageDialog(null, "City is  required");}
       else if(state.equals("")){
            JOptionPane.showMessageDialog(null, "State is  required");}
      
       else if(pin.equals("")){
            JOptionPane.showMessageDialog(null, "PINCODE is  required");}
            
            
        
        else{
        Con c=new Con();
        String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
        c.s.executeUpdate(query);
        setVisible(false);
        new SignUp2(formno).setVisible(true);
        }
    }
    catch(Exception e){
        System.out.println(e);
    
    }
    }
    public static void main(String args[]){
    new SignUp1();
    }
    
}
