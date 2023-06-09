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
// com.toedter.calendar.JDateChooser;
import java.awt.event.*;

/**
 *
 * @author aryam
 */
public class SignUp2 extends JFrame implements ActionListener{
   
    JTextField panTextField,aadharTextField;
    
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    
    SignUp2(String formno){
        this.formno=formno;
        
       setLayout(null);
       setTitle("NEW ACCOUNT APPLICATION FORM -2");
        getContentPane().setBackground(Color.WHITE);
        repaint();
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
//       
        
        //label for personalDetails
         JLabel additionalDetails=new JLabel("PAGE 2: ADDITIONAL DETAILS");
        additionalDetails.setForeground(Color.black);
        additionalDetails.setFont(new Font("Arial",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        repaint();
        
        //lable for name
        JLabel religionLabel=new JLabel("Religion :");
        religionLabel.setForeground(Color.black);
        religionLabel.setFont(new Font("Arial",Font.BOLD,20));
        religionLabel.setBounds(100,140,100,30);
        add(religionLabel);
        repaint();
        
        // textField for name
        String varReligion[]={"","Hindu","Muslim","Sikh","Christian","Other"};
         religion =new JComboBox(varReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        repaint();
        //label for catgory
        JLabel categoryLabel=new JLabel("Category :");
        categoryLabel.setForeground(Color.black);
        categoryLabel.setFont(new Font("Arial",Font.BOLD,20));
        categoryLabel.setBounds(100,190,200,30);
        add(categoryLabel);
        repaint();
        
        
        
        // textField for fname
        String varCategory[]={"","General","General-EWS","Other Backward Classes","Scheduled Caste","Scheduled Tribe","Other"};
          category=new JComboBox(varCategory);
        category.setFont(new Font("Arial",Font.BOLD,14));
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);
        repaint();
        
        //lable for father name
         JLabel incomeLable=new JLabel("Income :");
        incomeLable.setForeground(Color.black);
        incomeLable.setFont(new Font("Arial",Font.BOLD,20));
        incomeLable.setBounds(100,240,200,30);
        add(incomeLable);
        repaint();
        
        
        
        // textField for fname
        String varIncome[]={"","<1,50,000","<5,00,000",">5,00,000"};
          income=new JComboBox(varIncome);
        income.setFont(new Font("Arial",Font.BOLD,14));
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        repaint();
     
         //lable for gender
         JLabel educationLable=new JLabel("Education ");
        educationLable.setForeground(Color.black);
        educationLable.setFont(new Font("Arial",Font.BOLD,20));
        educationLable.setBounds(100,290,200,30);
        add(educationLable);
        repaint();
        
        
        //lable for email
         JLabel qual=new JLabel("Qualification :");
        qual.setForeground(Color.black);
        qual.setFont(new Font("Arial",Font.BOLD,20));
        qual.setBounds(100,315,200,30);
        add(qual);
        repaint();
        
        
        // textField for fname
        String educationValues[]={"","Non-Graduate","Graduate","Post-Graduate","Doctrorate","Other"};
         education=new JComboBox(educationValues);
        education.setFont(new Font("Arial",Font.BOLD,14));
        education.setBackground(Color.WHITE);
        education.setBounds(300,315,400,30);
        add(education);
        repaint();
        
        

       
         
        
        
        
     
        
        
         //lable for marital status
         JLabel occLablel=new JLabel("Occupation:");
        occLablel.setForeground(Color.black);
        occLablel.setFont(new Font("Arial",Font.BOLD,20));
        occLablel.setBounds(100,390,200,30);
        add(occLablel);
        repaint();
        
        String varOccu[]={"","Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
          occupation=new JComboBox(varOccu);
        occupation.setFont(new Font("Arial",Font.BOLD,14));
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        repaint();
//        // /textField for name
//        JTextField nameTextField=new JTextField();
//        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
//        nameTextField.setBounds(300,140,400,30);
//        add(nameTextField);
        

//label for address
        JLabel panLabel=new JLabel("PAN Number:");
        panLabel.setForeground(Color.black);
        panLabel.setFont(new Font("Arial",Font.BOLD,20));
        panLabel.setBounds(100,440,200,30);
        add(panLabel);
        repaint();
        
        // /textField for address
         panTextField=new JTextField();
        panTextField.setFont(new Font("Arial",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        repaint();
        
        
        //label for city
        JLabel aadharLabel=new JLabel("Adhaar Number:");
        aadharLabel.setForeground(Color.black);
        aadharLabel.setFont(new Font("Arial",Font.BOLD,20));
        aadharLabel.setBounds(100,490,200,30);
        add(aadharLabel);
        repaint();
        
        // /textField for city
         aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("Arial",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        repaint();
        
        //label for state
        JLabel senLabel=new JLabel("Senior Citizen:");
        senLabel.setForeground(Color.black);
        senLabel.setFont(new Font("Arial",Font.BOLD,20));
        senLabel.setBounds(100,540,200,30);
        add(senLabel);
        repaint();
        
        
        syes=new JRadioButton("Yes");
        syes.setBounds(400,540,60,30);
        add(syes);
        syes.setBackground(Color.white);
        repaint();
        
        
         sno=new JRadioButton("No");
        sno.setBounds(550,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        repaint();
        // /textField for state
         
        
        
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(syes);
        genderGroup.add(sno);
        
        
        
        //label for pincode
        JLabel pincode=new JLabel("Existing Account:");
        pincode.setForeground(Color.black);
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        repaint();
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(400,590,60,30);
        add(eyes);
        eyes.setBackground(Color.white);
        repaint();
        
        
         eno=new JRadioButton("No");
        eno.setBounds(550,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        repaint();
        
        
        ButtonGroup existGroup=new ButtonGroup();
        existGroup.add(eyes);
        existGroup.add(eno);
        
        
    
        
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
    @Override
    public void actionPerformed(ActionEvent ae){
    //String formno=""+random;//long to string
    String sreligion= (String)religion.getSelectedItem();
    String scategory= (String)category.getSelectedItem();
    String sincome=(String)income.getSelectedItem();
    String seducation=(String)education.getSelectedItem();
    String soccupation=(String) occupation.getSelectedItem();
    String senCit="";
    if(syes.isSelected()){
    senCit="YES";
    
    }
    if(sno.isSelected()){
    senCit="NO";
    
    }
    
    
    //String email=emailTextField.getText();
    String existingAccount="";
    if(eyes.isSelected())
        existingAccount="YES";
   else if(eno.isSelected())
        existingAccount="NO";
   
    String span=panTextField.getText();
    String saadhar =aadharTextField.getText();
    
    try{
        if(sreligion.equals("")){
            JOptionPane.showMessageDialog(null, "Choose your religion");}
       else if(scategory.equals("")){
            JOptionPane.showMessageDialog(null, "Choose your category");}
       else if(sincome.equals("")){
            JOptionPane.showMessageDialog(null, "Select your income");}
       else if(seducation.equals("")){
            JOptionPane.showMessageDialog(null, "Choose your education");}
       else if(soccupation.equals("")){
            JOptionPane.showMessageDialog(null, "Choose your Occupation");}
       else if(senCit.equals("")){
            JOptionPane.showMessageDialog(null, "Are you a senior citizen");}
       else if(existingAccount.equals("")){
            JOptionPane.showMessageDialog(null, "Do you have an existing account?");}
       else if(span.equals("")){
            JOptionPane.showMessageDialog(null, "Fill your PAN number");}
       else if(saadhar.equals("")){
            JOptionPane.showMessageDialog(null, "Fill your Aadhar Number");}
      
      
            
        
        else{
        Con c=new Con();
        String query ="insert into signup2 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+senCit+"','"+existingAccount+"')";
        c.s.executeUpdate(query);
        setVisible(false);
        new SignUp3(formno).setVisible(true);
       
        }
    }
    catch(Exception e){
        System.out.println(e);
    
    }
    }
    public static void main(String args[]){
    new SignUp2("");
    }
    
}
