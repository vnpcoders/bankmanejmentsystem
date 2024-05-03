
package bank.manegment.system;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton  saving_Account,fixed_Deposit_Dccount, current_Account, recurring_Deposit_Account ;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
 SignupThree(String formno){
      this.formno =formno;
     setLayout(null);
     JLabel l1 = new JLabel("Page 3: Account Details");
          l1 .setFont(new Font ("Raleway",Font.BOLD,22));
          l1.setForeground(Color.WHITE);
       l1 .setBounds(280,40,400,30);
        add( l1);
        
         JLabel type = new JLabel(" Account Type");
          type .setFont(new Font ("Raleway",Font.BOLD,22));
          type.setForeground(Color.WHITE);
       type.setBounds(100,110,200,30);
        add(type );
        
         saving_Account= new JRadioButton("Saving_Account");
        saving_Account .setBounds(100,150,250,30);
        saving_Account.setFont(new Font ("Raleway",Font.BOLD,14));
        saving_Account.setBackground(Color.CYAN);
        saving_Account.setForeground(Color.DARK_GRAY);
        add(saving_Account);
        
        
       
      fixed_Deposit_Dccount = new JRadioButton(" Fixed_Deposit_Dccount");
        fixed_Deposit_Dccount.setBounds(450,150,250,30);
         fixed_Deposit_Dccount.setFont(new Font ("Raleway",Font.BOLD,14));
        fixed_Deposit_Dccount.setBackground(Color.cyan);
        fixed_Deposit_Dccount.setForeground(Color.DARK_GRAY);
        add(fixed_Deposit_Dccount);
        
        current_Account = new JRadioButton("Current_Account");
         current_Account.setBounds(100,190,250,30);
         current_Account.setFont(new Font ("Raleway",Font.BOLD,14));
        current_Account.setBackground(Color.cyan);
        current_Account.setForeground(Color.DARK_GRAY);
        add(current_Account);
        
        
       
        recurring_Deposit_Account = new JRadioButton("Recurring_Deposit_Account ");
         recurring_Deposit_Account.setBounds(450,190,250,30);
         recurring_Deposit_Account.setFont(new Font ("Raleway",Font.BOLD,14));
         recurring_Deposit_Account.setBackground(Color.cyan);
        recurring_Deposit_Account.setForeground(Color.DARK_GRAY);
        add( recurring_Deposit_Account);
        
         ButtonGroup senior_Citizengroup =new ButtonGroup();
        senior_Citizengroup.add( saving_Account);
        senior_Citizengroup.add(fixed_Deposit_Dccount);
        senior_Citizengroup.add( current_Account );
        senior_Citizengroup.add(recurring_Deposit_Account);
        
        JLabel card= new JLabel("Card_No: ");
          card .setFont(new Font ("Raleway",Font.BOLD,22));
          card.setForeground(Color.WHITE);
       card.setBounds(100,240,200,30);
        add(card );
        
         JLabel cardno= new JLabel("XXXX-XXXX-XXXX-1432");
          cardno .setFont(new Font ("Raleway",Font.BOLD,22));
          cardno.setForeground(Color.white);
       cardno.setBounds(330,240,300,30);
        add(cardno );
        
         JLabel cnumber= new JLabel("16 Digits Cardnumber ");
          cnumber .setFont(new Font ("Raleway",Font.BOLD,12));
           cnumber.setForeground(Color.white);
     cnumber.setBounds(100,270,300,20);
        add(cnumber );
        
         JLabel pin= new JLabel("PIN_No: ");
        pin .setFont(new Font ("Raleway",Font.BOLD,22));
         pin.setForeground(Color.white);
       pin.setBounds(100,320,200,30);
        add(pin );
         JLabel pinno= new JLabel("XXXX ");
          pinno .setFont(new Font ("Raleway",Font.BOLD,22));
           pinno.setForeground(Color.white);
       pinno.setBounds(330,320,300,30);
       add(pinno );
       
        JLabel pnumber= new JLabel(" 4 Digits Pinumber  ");
           pnumber.setFont(new Font ("Raleway",Font.BOLD,12));
            pnumber.setForeground(Color.white);
       pnumber.setBounds(100,350,300,20);
        add( pnumber);
        
         JLabel services= new JLabel(" Services Required:");
           services.setFont(new Font ("Raleway",Font.BOLD,(22)));
       services.setBounds(100,400,400,20);
        services.setForeground(Color.white);
        add( services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.CYAN);
         c1.setForeground(Color.DARK_GRAY);
        c1.setFont(new Font ("Raleway",Font.BOLD,(18)));
       c1.setBounds(100,450,200,20);
        add(c1 );
        
         c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.CYAN);
        c2.setForeground(Color.DARK_GRAY);
        c2.setFont(new Font ("Raleway",Font.BOLD,(18)));
       c2.setBounds(350,450,200,20);
        add(c2 );
        
         c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.cyan);
        c3.setForeground(Color.DARK_GRAY);
        c3.setFont(new Font ("Raleway",Font.BOLD,(18)));
       c3.setBounds(100,500,200,20);
        add(c3 );
        
         c4 = new JCheckBox("Email & SMS Alerta");
        c4.setBackground(Color.cyan);
        c4.setForeground(Color.DARK_GRAY);
        c4.setFont(new Font ("Raleway",Font.BOLD,(18)));
       c4.setBounds(350,500,200,20);
        add(c4 );
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.cyan);
        c5.setForeground(Color.DARK_GRAY);
        c5.setFont(new Font ("Raleway",Font.BOLD,(18)));
       c5.setBounds(100,550,200,20);
        add(c5 );
        
        c6 = new JCheckBox("E-StaTement");
        c6.setBackground(Color.cyan);
       c6.setForeground(Color.DARK_GRAY);
        c6.setFont(new Font ("Raleway",Font.BOLD,(18)));
       c6.setBounds(350,550,200,20);
        add(c6 ); 
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge ");
        c7.setBackground(Color.cyan);
        c7.setForeground(Color.DARK_GRAY);
        c7.setFont(new Font ("Raleway",Font.BOLD,(12)));
       c7.setBounds(100,600,600,20);
        add(c7 );
        
       submit = new JButton("Submit");
        submit.setBackground(Color.green);
        submit.setForeground(Color.DARK_GRAY);
        submit.setFont(new Font ("Raleway",Font.BOLD,14));
        submit.setBounds(250,640,100,30);
        submit.addActionListener(this);
        add(submit);
        
         cancel = new JButton("Cancel");
        cancel.setBackground(Color.red);
        cancel.setForeground(Color.DARK_GRAY);
        cancel.setFont(new Font ("Raleway",Font.BOLD,14));
        cancel.setBounds(420,640,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.black);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
        
        
 }
    @Override
     public void actionPerformed(ActionEvent ae){
        
      if(ae.getSource() == submit){  
        String accounttypes = null;
          if(saving_Account.isSelected()){
              accounttypes = "Saving Account";
          }else if (fixed_Deposit_Dccount.isSelected()){
            accounttypes = "Fixed_Deposit Dccount";  
          }else if(current_Account.isSelected()){
            accounttypes = "Current Account";
          }else if (recurring_Deposit_Account.isSelected()){
            accounttypes = "recurring Deposit Account";  
}
            Random random =new Random();
           String cardno = "" + Math.abs((random.nextLong() %90000000L)+5040936000000000L);
            
           String pinno = "" + Math.abs((random.nextLong() %9000L)+1000L);
           
           String facility =" ";
           if(c1.isSelected()){
             facility = facility + " ATM Card";  
           }
           else if(c2.isSelected()){
             facility = facility + " Internet Banking";  
           }
           else  if(c3.isSelected()){
             facility = facility + " Mobile Banking";  
           }
           else  if(c4.isSelected()){
             facility = facility + " Email & SMS Alerta";  
           }
           else  if(c5.isSelected()){
             facility = facility + " Cheque Book";  
           }
           else  if(c6.isSelected()){
             facility = facility + " E-StaTement";  
           }
            try {
             if(accounttypes.equals("")){
                 JOptionPane.showMessageDialog(null,"Name is Required");
                 
             }else{
                 Conn conn =new Conn ();
                 String query1 = "insert into signupthree values('"+formno+"','"+accounttypes+"','"+cardno+"','"+pinno+"','"+facility+"')";
                 String query2 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
                      JOptionPane.showMessageDialog(null,"Card Number: "+cardno+"\n Pin: "+pinno );
           setVisible(false);
             new Deposit(pinno).setVisible(true);
             }
         }catch(Exception e){
            System.out.println(e);
         }
          
      }else if(ae.getSource() == cancel){
          
           setVisible(false);
           new Login().setVisible(true);
      }
          
         
    }
    public static void main(String args[]) {
       new SignupThree(" ");
    }
}
