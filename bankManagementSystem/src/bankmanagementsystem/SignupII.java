package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupII extends JFrame implements ActionListener{
    JTextField panText, aadhaarText;
    JComboBox religions, categories, incomes, educations, occupations;
    JRadioButton yes1, no1, yes2, no2;
    JButton next;
    String formNo;
    
    SignupII(String formNo){
        this.formNo = formNo;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2"); 
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(210, 60, 400, 30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100, 100, 150, 30);
        add(religion);
        
        String valReligion[] = {"Hinduism", "Muslim","Christianity", "Sanamahism","Sikh", "Others"};
        religions = new JComboBox(valReligion);
        religions.setBounds(270, 100, 300, 30);
        religions.setBackground(Color.WHITE);
        add(religions); 
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100, 140, 150, 30);
        add(category);
        
        String valCategories[] = {"General", "OBC-NCL", "SC", "ST", "Minorities"};
        categories = new JComboBox(valCategories);
        categories.setBounds(270, 140, 300, 30);
        categories.setBackground(Color.WHITE);
        add(categories);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100, 180, 150, 30);
        add(income);
        
        String valIncome[] = {"0 - 1,50,000", "1,50,001 - 3,00,000", "3,00,001 - 5,00,000", "> 5,00,001"};
        incomes = new JComboBox(valIncome);
        incomes.setBounds(270, 180, 300, 30);
        incomes.setBackground(Color.WHITE);
        add(incomes);
        
        JLabel education = new JLabel("Educational:");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100, 220, 150, 30);
        add(education);
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100, 240, 150, 30);
        add(qualification);
        
        String valEducations[] = {"10th Pass", "12th Pass", "Graduate", "Post-Graduation and Above"};
        educations = new JComboBox(valEducations);
        educations.setBounds(270, 240, 300, 30);
        educations.setBackground(Color.WHITE);
        add(educations); 
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100, 300, 150, 30);
        add(occupation);
        
        String valOccupations[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupations = new JComboBox(valOccupations);
        occupations.setBounds(270, 300, 300, 30);
        occupations.setBackground(Color.WHITE);
        add(occupations);
        
        JLabel pan = new JLabel("PAN:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100, 340, 150, 30);
        add(pan);
        
        panText = new JTextField();
        panText.setFont(new Font("Arial",Font.BOLD,14));
        panText.setBounds(270, 340, 300, 30);
        add(panText);
        
        JLabel aadhaar = new JLabel("AADHAAR:");
        aadhaar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhaar.setBounds(100, 380, 150, 30);
        add(aadhaar);
         
        aadhaarText = new JTextField();
        aadhaarText.setFont(new Font("Arial",Font.BOLD,14));
        aadhaarText.setBounds(270, 380, 300, 30);
        add(aadhaarText);
        
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway",Font.BOLD,20));
        senior.setBounds(100, 420, 150, 30);
        add(senior);
        
        yes1 = new JRadioButton("Yes");
        yes1.setBounds(270, 420, 100, 30);
        yes1.setBackground(Color.WHITE);
        add(yes1);
        
        no1 = new JRadioButton("No");
        no1.setBounds(380, 420, 100, 30);
        no1.setBackground(Color.WHITE);
        add(no1);
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(yes1);
        seniorGroup.add(no1);
        
        JLabel exist = new JLabel("Exist Account:");
        exist.setFont(new Font("Raleway",Font.BOLD,20));
        exist.setBounds(100, 460, 150, 30);
        add(exist);
        
        yes2 = new JRadioButton("Yes");
        yes2.setBounds(270, 460, 100, 30);
        yes2.setBackground(Color.WHITE);
        add(yes2);
        
        no2 = new JRadioButton("No");
        no2.setBounds(380, 460, 100, 30);
        no2.setBackground(Color.WHITE);
        add(no2);
        
        ButtonGroup existGroup = new ButtonGroup();
        existGroup.add(yes2);
        existGroup.add(no2);
        
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
        String sreligion = (String) religions.getSelectedItem();
        String scategory = (String) categories.getSelectedItem();
        String sincome = (String) incomes.getSelectedItem();
        String seducation = (String) educations.getSelectedItem();
        String soccupation = (String)occupations.getSelectedItem();
        String senior = null;
        if(yes1.isSelected()){
            senior = "Yes";
        }
        else if(no1.isSelected()){
            senior = "No";
        }
        String pan = panText.getText();
        String aadhaar = aadhaarText.getText();
        String existAccount = null;
        if(yes2.isSelected()){
            existAccount = "Yes";
        }
        else if(no2.isSelected()){
            existAccount = "No";
        }
        
        try{
            Conn c = new Conn();  
            String query = "insert into signupII values('"+formNo+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+senior+"', '"+pan+"', '"+aadhaar+"', '"+existAccount+"')";
            c.s.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SignupII("");
    }
}
