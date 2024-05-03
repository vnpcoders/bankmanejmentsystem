
package bank.manegment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{
     JButton deposit,cash_Withdrawl,fast_Cash,mini_Statement,pin_Change,balance_Enquiry,exit;
     String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
                                                                                     
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text =new JLabel("Please select your Transaction");
         text.setFont(new Font ("System",Font.BOLD,16));
         text.setForeground(Color.WHITE);  
        text.setBounds(210,300,700,35);
        image.add(text);
        
         deposit= new JButton("Deposit");
     
        deposit.setFont(new Font ("Raleway",Font.BOLD,14));
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
         cash_Withdrawl= new JButton("Cash_Withdrawl");
     
        cash_Withdrawl.setFont(new Font ("Raleway",Font.BOLD,14));
        cash_Withdrawl.setBounds(355,415,150,30);
        cash_Withdrawl.addActionListener(this);
        image.add(cash_Withdrawl);
        
        
         fast_Cash= new JButton("Fast_Cash");
      
        fast_Cash.setFont(new Font ("Raleway",Font.BOLD,14));
        fast_Cash.setBounds(170,450,150,30);
        fast_Cash.addActionListener(this);
        image.add(fast_Cash);
        
        
         mini_Statement= new JButton("Mini_Statement");
     
        mini_Statement.setFont(new Font ("Raleway",Font.BOLD,14));
        mini_Statement.setBounds(355,450,150,30);
        mini_Statement.addActionListener(this);
       image.add(mini_Statement);
        
        
         pin_Change= new JButton("Pin_Change");
     
        pin_Change.setFont(new Font ("Raleway",Font.BOLD,14));
        pin_Change.setBounds(170,485,150,30);
        pin_Change.addActionListener(this);
        image.add(pin_Change);
        
        
         balance_Enquiry= new JButton("Balance_Enquiry");
         balance_Enquiry.setFont(new Font ("Raleway",Font.BOLD,14));
        balance_Enquiry.setBounds(355,485,150,30);
        balance_Enquiry.addActionListener(this);
        image.add(balance_Enquiry);
        
        
         exit= new JButton("Exit");
         exit.setFont(new Font ("Raleway",Font.BOLD,14));
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit ){
            System.exit(0);
        }  
        else if (ae.getSource()==deposit){
               setVisible(false);
               new Deposit (pinnumber). setVisible(true);
           }else if (ae.getSource()==cash_Withdrawl){
               setVisible(false);
               new Withdrawl(pinnumber). setVisible(true);
           }else if (ae.getSource()==fast_Cash){
               setVisible(false);
               new Fastcash(pinnumber). setVisible(true);
           }else if (ae.getSource()==pin_Change){
               setVisible(false);
               new PinChange(pinnumber). setVisible(true);
           }else if (ae.getSource()== balance_Enquiry){
               setVisible(false);
               new BalenceEnquairy(pinnumber). setVisible(true);
           }else if (ae.getSource()== mini_Statement){
              
               new Ministatement(pinnumber). setVisible(true);
           }
         
     }
     
    public static void main(String args[]) {
      new Transactions("");
    }
}
