
package bank.manegment.system;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,clear,singup;
    JTextField cardTextField ;
   JPasswordField pinTextField;
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
                                                                                       
        JLabel label =new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
         JLabel text =new JLabel("Welcome to ATM");
         text.setFont(new Font ("Osward",Font.BOLD,38));
         text.setForeground(Color.WHITE);
        text.setBounds(200,40,400,40);
        add(text);
        
         JLabel cardno =new JLabel("Card_No:");
         cardno.setFont(new Font ("Raleway",Font.BOLD,28));
         cardno.setForeground(Color.WHITE);
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
         cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
       cardTextField.setBackground(Color.cyan);
         cardTextField.setForeground(Color.LIGHT_GRAY);
         cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
         JLabel pin =new JLabel("PIN:");
         pin.setFont(new Font ("Raleway",Font.BOLD,28));
         pin.setForeground(Color.WHITE);
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setBackground(Color.cyan);
         pinTextField.setForeground(Color.LIGHT_GRAY);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        login =new JButton("SIGN IN");
         login.setBounds(300,300,100,30);
        login.setBackground(Color.cyan);
         login.setForeground(Color.LIGHT_GRAY);
         login.addActionListener(this);
         add(login);
         
         clear =new JButton("CLEAR");
         clear.setBounds(430,300,100,30);
        clear.setBackground(Color.red);
         clear.setForeground(Color.LIGHT_GRAY);
         clear.addActionListener(this);
         add(clear);
         
         singup =new JButton("SIGN UP");
         singup.setBounds(300,350,230,30);
        singup.setBackground(Color.CYAN);
         singup.setForeground(Color.LIGHT_GRAY);
         singup.addActionListener(this);
         add(singup);
        getContentPane() .setBackground(Color.black);
        
        setSize(800,480);
       setVisible(true);
       setLocation(350,200);
    }
    @Override
    public void  actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
             pinTextField.setText("");
        }
        else if(ae.getSource()==login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            
            try{
             ResultSet rs = conn.s.executeQuery(query);
             if (rs.next()){
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
             } else{
                 JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
             }
            }catch(Exception e){
                System.out.println(e);
            }    
        }
       else if(ae.getSource() == singup){
               setVisible(false);
               new SignupOne().setVisible(true);
                }
    }
    public static void main(String args[]) {
        new Login();
}
}
