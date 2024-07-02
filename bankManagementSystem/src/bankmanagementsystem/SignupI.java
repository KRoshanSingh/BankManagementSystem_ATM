package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupI extends JFrame implements ActionListener{
    long ranFormNo;
    JTextField nameText, fNameText, emailText, addressText, cityText, stateText, pincodeText;
    JRadioButton male, female, others, married, unmarried;
    JButton next;
    JDateChooser dateChooser;
    
    SignupI(){
        setLayout(null);
        Random ran = new Random();
        ranFormNo = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formNo = new JLabel("Application Form No. " + ranFormNo);
        formNo.setFont(new Font("Raleway",Font.BOLD,38));
        formNo.setBounds(100, 10, 600, 40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(210, 60, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 100, 150, 30);
        add(name);
        
        nameText = new JTextField();
        nameText.setFont(new Font("Arial",Font.BOLD,14));
        nameText.setBounds(270, 100, 300, 30);
        add(nameText);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 140, 150, 30);
        add(fname);
        
        fNameText = new JTextField();
        fNameText.setFont(new Font("Arial",Font.BOLD,14));
        fNameText.setBounds(270, 140, 300, 30);
        add(fNameText);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 180, 150, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(200, 200, 200));
        dateChooser.setBounds(270, 180, 300, 30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 220, 150, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(270, 220, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(360, 220, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        others = new JRadioButton("Others");
        others.setBounds(450, 220, 80, 30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);
        
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 260, 150, 30);
        add(email);
        
        emailText = new JTextField();
        emailText.setFont(new Font("Arial",Font.BOLD,14));
        emailText.setBounds(270, 260, 300, 30);
        add(emailText);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 300, 150, 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(270, 300, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(380, 300, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup marriedGroup = new ButtonGroup();
        marriedGroup.add(married);
        marriedGroup.add(unmarried);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 340, 150, 30);
        add(address);
        
        addressText = new JTextField();
        addressText.setFont(new Font("Arial",Font.BOLD,14));
        addressText.setBounds(270, 340, 300, 30);
        add(addressText);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 380, 150, 30);
        add(city);
        
        cityText = new JTextField();
        cityText.setFont(new Font("Arial",Font.BOLD,14));
        cityText.setBounds(270, 380, 300, 30);
        add(cityText);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 420, 150, 30);
        add(state);
        
        stateText = new JTextField();
        stateText.setFont(new Font("Arial",Font.BOLD,14));
        stateText.setBounds(270, 420, 300, 30);
        add(stateText);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 460, 150, 30);
        add(pincode);
        
        pincodeText = new JTextField();
        pincodeText.setFont(new Font("Arial",Font.BOLD,14));
        pincodeText.setBounds(270, 460, 300, 30);
        add(pincodeText);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(350, 500, 100, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        setSize(750,600);
        setVisible(true);
        setLocation(250, 10);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String formNo = "" + ranFormNo; // long to String
        String name = nameText.getText(); 
        String fname = fNameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        else if(others.isSelected()){
            gender = "Others";
        }
        String email = emailText.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        String address = addressText.getText();
        String city = cityText.getText();
        String pin = pincodeText.getText();
        String state = stateText.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                Conn c = new Conn();  
                String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                c.s.executeUpdate(query);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SignupI();
    }
}
