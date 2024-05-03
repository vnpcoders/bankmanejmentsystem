
package bank.manegment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin,reEnterPin ;
    JButton change,back;
     String pinnumber;
 PinChange (String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
 
        JLabel text =new JLabel("CHANGE YOUR PIN");
         text.setFont(new Font ("System",Font.BOLD,16));
         text.setForeground(Color.WHITE);  
        text.setBounds(250,280,500,20);
        image.add(text);
        
        JLabel pintext =new JLabel("NEW PIN:");
         pintext.setFont(new Font ("System",Font.BOLD,16));
         pintext.setForeground(Color.WHITE);  
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
         pin = new JPasswordField();
        pin.setBounds(330,320,180,25);
         pin.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(pin);
        
        
        JLabel repintext =new JLabel("RE-Enter New PIn:");
         repintext.setFont(new Font ("System",Font.BOLD,16));
         repintext.setForeground(Color.WHITE);  
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
        reEnterPin = new JPasswordField();
        reEnterPin.setBounds(330,360,180,25);
         reEnterPin.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(reEnterPin);
        
        
         change= new JButton("CHANGE");
     
        change.setFont(new Font ("Raleway",Font.BOLD,14));
        change.setBounds(170,415,150,30);
        change.addActionListener(this);
        image.add(change);
        
        
         back= new JButton("BACK");
     
        back.setFont(new Font ("Raleway",Font.BOLD,14));
        back.setBounds(355,415,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
 
 
 }
 
  public void actionPerformed(ActionEvent ae){
     
        if (ae.getSource() == back ){
            setVisible(false);
             new Transactions(pinnumber).setVisible(true);
                       
        }  
        else if (ae.getSource()==change){
            try{
          String npin=pin.getText();
          String rpin=reEnterPin.getText();
          
          if(!npin.equals(rpin)){
               JOptionPane.showMessageDialog(null,"Enter PIN does not match");
               return;
          }


               if(npin.equals("")){
               
                   JOptionPane.showMessageDialog(null,"Please Enter new PIN ");
                   return;
               }

               if(rpin.equals("")){
                   
                   JOptionPane.showMessageDialog(null," Please RE-Enter new PIN ");
                   return;
                   
               } 
               
               Conn conn = new Conn();
               String query1 = "update bank set pin = '"+rpin+"'where pin ='"+pinnumber+"'";
               String query2 = "update login set pin ='"+rpin+"'where pin ='"+pinnumber+"'";
               String query3 = "update signupthree set pinno ='"+rpin+"'where pinno ='"+pinnumber+"'";
          
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               conn.s.executeUpdate(query3);
               
                JOptionPane.showMessageDialog(null," PIN Change successfully");
                
                setVisible(false);
             new Transactions(pinnumber).setVisible(true);
               
           }catch(Exception e){
          System.out.println(e);
      }
               
               
           }
          
     }
     
    public static void main(String args[]) {
      new PinChange ("").setVisible(true); 
    }
}
