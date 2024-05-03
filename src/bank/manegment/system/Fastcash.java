
package bank.manegment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{
     JButton rs100,rs200,rs500,rs1000,rs5000,rs10000,back;
     String pinnumber;
    Fastcash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
                                                                                     
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text =new JLabel("select withdrawl amount");
         text.setFont(new Font ("System",Font.BOLD,16));
         text.setForeground(Color.WHITE);  
        text.setBounds(210,300,700,35);
        image.add(text);
        
         rs100= new JButton("Rs 100");
     
        rs100.setFont(new Font ("Raleway",Font.BOLD,14));
        rs100.setBounds(170,415,150,30);
        rs100.addActionListener(this);
        image.add(rs100);
        
        
         rs200= new JButton("Rs 200");
     
        rs200.setFont(new Font ("Raleway",Font.BOLD,14));
        rs200.setBounds(355,415,150,30);
        rs200.addActionListener(this);
        image.add(rs200);
        
        
         rs500= new JButton("Rs 500");
      
         rs500.setFont(new Font ("Raleway",Font.BOLD,14));
         rs500.setBounds(170,450,150,30);
         rs500.addActionListener(this);
        image.add( rs500);
        
        
          rs1000= new JButton("Rs 1000");
     
         rs1000.setFont(new Font ("Raleway",Font.BOLD,14));
         rs1000.setBounds(355,450,150,30);
         rs1000.addActionListener(this);
       image.add( rs1000);
        
        
          rs5000= new JButton("Rs 5000");
     
         rs5000.setFont(new Font ("Raleway",Font.BOLD,14));
         rs5000.setBounds(170,485,150,30);
         rs5000.addActionListener(this);
        image.add( rs5000);
        
        
          rs10000= new JButton("RS 10000");
          rs10000.setFont(new Font ("Raleway",Font.BOLD,14));
         rs10000.setBounds(355,485,150,30);
         rs10000.addActionListener(this);
        image.add( rs10000);
        
        
         back= new JButton("Back");
         back.setFont(new Font ("Raleway",Font.BOLD,14));
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    @Override
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == back ){
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        }  
        else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);//rs 500
            Conn c = new Conn();
            
          try{
              ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
              int balance = 0;
              while(rs.next()){
                  if(rs.getString("type").equals("Deposit")){
                      balance += Integer.parseInt(rs.getString("amount"));
                  }else{
                      balance -= Integer.parseInt(rs.getString("amount"));
                  }
               
              }
              if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                  JOptionPane.showMessageDialog(null,"Insufficient Balance");
                  return;
              }
              
              Date date = new Date();
              String query = "Insert into bank values('"+pinnumber+"','"+date+"',' Withdrawl','"+amount+"')";
              c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Rs "+amount+"Debited Sucessfully");
               setVisible(false);
           new Transactions(pinnumber).setVisible(true);
          }catch(Exception e){
              System.out.println(e);
          }
               
           }
         
     }
     
    public static void main(String args[]) {
      new Fastcash("");
    }
}
