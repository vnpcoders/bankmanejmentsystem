package  bank.manegment.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField, pinTextField ;
     JDateChooser dateChooser;
     JRadioButton male,female,married ,unmarried ,other ;
     JButton next;
    SignupOne(){
        Random ran =new Random();
         setLayout(null);
         random = Math.abs((ran.nextLong()% 9000L)+ 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO."+random);
        formno.setForeground(Color.WHITE);
         formno.setFont(new Font ("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
         personDetails .setFont(new Font ("Raleway",Font.BOLD,22));
         personDetails.setForeground(Color.WHITE);
        personDetails .setBounds(290,80,400,30);
        add(personDetails );
        
        JLabel name = new JLabel("Name :");
         name .setFont(new Font ("Raleway",Font.BOLD,20));
         name.setForeground(Color.WHITE);
        name .setBounds(100,140,100,30);
        add(name );
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font ("Raleway",Font.BOLD,20));
      nameTextField.setBackground(Color.CYAN);
      nameTextField.setForeground(Color.DARK_GRAY);
        nameTextField.setBounds(300,140,400,30);
        add( nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
         fname .setFont(new Font ("Raleway",Font.BOLD,20));
         fname.setForeground(Color.WHITE);
        fname .setBounds(100,190,200,30);
        add(fname );
        
          fnameTextField = new JTextField();
        fnameTextField.setFont(new Font ("Raleway",Font.BOLD,20));
        fnameTextField.setBackground(Color.CYAN);
      fnameTextField.setForeground(Color.DARK_GRAY);
        fnameTextField.setBounds(300,190,400,30);
        add( fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
         dob .setFont(new Font ("Raleway",Font.BOLD,20));
         dob.setForeground(Color.WHITE);
       dob .setBounds(100,240,200,30);
        add(dob );
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setBackground(Color.CYAN);
       dateChooser.setForeground(Color.DARK_GRAY);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
         gender .setFont(new Font ("Raleway",Font.BOLD,20));
         gender.setForeground(Color.WHITE);
       gender.setBounds(100,290,200,30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        male.setForeground(Color.DARK_GRAY);
        male.setBackground(Color.CYAN);
        add(male);
        
         female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setForeground(Color.DARK_GRAY);
        female.setBackground(Color.CYAN);
       
        add(female);
        
        ButtonGroup gendergroup =new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
          email.setFont(new Font ("Raleway",Font.BOLD,20));
          email.setForeground(Color.WHITE);
      email.setBounds(100,340,200,30);
        add(email);
        
     emailTextField = new JTextField();
        emailTextField.setFont(new Font ("Raleway",Font.BOLD,20));
       emailTextField.setBackground(Color.CYAN);
       emailTextField.setForeground(Color.DARK_GRAY);
        emailTextField.setBounds(300,340,400,30);
        add( emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
          marital .setFont(new Font ("Raleway",Font.BOLD,20));
          marital.setForeground(Color.WHITE);
        marital.setBounds(100,390,200,30);
        add( marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
      married.setForeground(Color.DARK_GRAY);
        married.setBackground(Color.CYAN);
       
        add(married);
        
         unmarried = new JRadioButton("UnMarried");
        unmarried.setBounds(450,390,100,30);
        
        unmarried.setForeground(Color.DARK_GRAY);
        unmarried.setBackground(Color.CYAN);
       
        add(unmarried);
        
         other = new JRadioButton("Other");
        other.setBounds(600,390,100,30);
        
        other.setForeground(Color.DARK_GRAY);
        other.setBackground(Color.CYAN);
       
        add(other);
        
        ButtonGroup maritalgroup =new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address:");
          address  .setFont(new Font ("Raleway",Font.BOLD,20));
          address.setForeground(Color.WHITE);
        address .setBounds(100,440,200,30);
        add( address );
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font ("Raleway",Font.BOLD,20));
        addressTextField.setBackground(Color.CYAN);
       addressTextField.setForeground(Color.DARK_GRAY);
        addressTextField.setBounds(300,440,400,30);
        add( addressTextField);
        
         JLabel city = new JLabel("City:");
         city.setFont(new Font ("Raleway",Font.BOLD,20));
         city.setForeground(Color.WHITE);
       city.setBounds(100,490,200,30);
        add(city );
        
          cityTextField = new JTextField();
        cityTextField.setFont(new Font ("Raleway",Font.BOLD,20));
        cityTextField.setBackground(Color.CYAN);
       cityTextField.setForeground(Color.DARK_GRAY);
       cityTextField.setBounds(300,490,400,30);
        add( cityTextField);
        
         JLabel state = new JLabel("State:");
          state.setFont(new Font ("Raleway",Font.BOLD,20));
          state.setForeground(Color.WHITE);
        state.setBounds(100,540,200,30);
        add(state);
        
          stateTextField = new JTextField();
         stateTextField.setFont(new Font ("Raleway",Font.BOLD,20));
         stateTextField.setBackground(Color.CYAN);
       stateTextField.setForeground(Color.DARK_GRAY);
         stateTextField.setBounds(300,540,400,30);
        add( stateTextField);
        
         JLabel pincode = new JLabel("PinCode:");
         pincode.setFont(new Font ("Raleway",Font.BOLD,20));
         pincode.setForeground(Color.WHITE);
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
         pinTextField = new JTextField();
        pinTextField.setFont(new Font ("Raleway",Font.BOLD,20));
      pinTextField.setBackground(Color.CYAN);
       pinTextField.setForeground(Color.DARK_GRAY);
        pinTextField.setBounds(300,590,400,30);
        add( pinTextField);
        
         next = new JButton("Next");
        next.setBackground(Color.green);
        next.setForeground(Color.DARK_GRAY);
        next.setFont(new Font ("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        getContentPane().setBackground(Color.black);
    
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno =""+ random; //long
        String name = nameTextField.getText(); //setText
        String fname = fnameTextField.getText(); 
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText(); 
        String gender = null;
          if(male.isSelected()){
              gender ="Male";
          }else if (female.isSelected()){
            gender = "Female";  
          }
           String email = emailTextField.getText(); 
           
           String marital = null;
          if(married.isSelected()){
            marital  ="Married";
          }else if (unmarried.isSelected()){
            marital= "UnMarried";  
          }else if (other.isSelected()){
            marital= "Other";  
          }
          
           String address = addressTextField.getText(); //setText
         String city = cityTextField.getText(); 
          String state = stateTextField.getText(); //setText
         String pin = pinTextField.getText(); 
         
         try {
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null,"Name is Required");
                 
             }else{
                 Conn c =new Conn ();
                 String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"','"+gender+"', '"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
             }
         }catch(Exception e){
            System.out.println(e);
         }
    }
    public static void main(String args[]){
     new SignupOne();
    }
}

