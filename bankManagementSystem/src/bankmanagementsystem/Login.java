package bankmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login, reset, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("ATM");
        setLayout(null); // making default layout which is center, making null
        
        //logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(60,10,100,100); //left, top, length, width
        add(label);
        
        //header
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,30,400,40);
        add(text);
        
        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Raleway",Font.BOLD,28));
        cardNo.setBounds(120,130,150,40);
        add(cardNo);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(250, 130, 250, 40);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,190,150,40);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(250, 190, 250, 40);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        login = new JButton("LOGIN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBounds(250, 250, 100, 30);
        login.addActionListener(this);
        add(login);
        
        reset = new JButton("RESET");
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        reset.setBounds(400, 250, 100, 30);
        reset.addActionListener(this);
        add(reset);
        
        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setBounds(300, 300, 100, 30);
        signup.addActionListener(this);
        add(signup);
        
        //customize layout
        getContentPane().setBackground(Color.white);
        setSize(650,450);
        setVisible(true);
        setLocation(250, 100);    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            
        }
        else if(e.getSource() == reset){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(e.getSource() == signup){
            setVisible(false);
            new SignupI().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
