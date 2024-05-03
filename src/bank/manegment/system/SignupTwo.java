package  bank.manegment.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,aadhar;
     JComboBox religion,category ,income,education,occupation ;
     JRadioButton syes,sno,eyes ,eno  ;
     JButton next;
     String formno;
    SignupTwo(String formno){
        this.formno =formno;
       setLayout(null);
       setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
          additionalDetails.setFont(new Font ("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
       additionalDetails.setForeground(Color.WHITE);
        add( additionalDetails);
        
        JLabel religions = new JLabel("Religion:");
          religions.setFont(new Font ("Raleway",Font.BOLD,20));
         religions.setForeground(Color.WHITE);
        religions.setBounds(100,140,100,30);
        add( religions);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christion","Other"};
         religion = new JComboBox(valReligion);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.CYAN);
         religion.setForeground(Color.DARK_GRAY);
        add( religion);
        
       
        JLabel categorys = new JLabel("Category:");
          categorys.setFont(new Font ("Raleway",Font.BOLD,20));
          categorys.setForeground(Color.WHITE);
        categorys.setBounds(100,190,200,30);
        add(categorys);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
         category = new JComboBox(valcategory);
          category.setBounds(300,190,400,30);
         category.setBackground(Color.cyan);
         category.setForeground(Color.DARK_GRAY);
        add( category);
        
          
        
        JLabel incomes= new JLabel("Income:");
          incomes.setFont(new Font ("Raleway",Font.BOLD,20));
        incomes.setBounds(100,240,200,30);
        incomes.setForeground(Color.WHITE);
        add( incomes );
        
        String incomecategory[] = {"Null","0<1,50,000","1,50,000<2,50,000","2,50,000<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
          income.setBounds(300,240,400,30);
         income.setBackground(Color.cyan);
         income.setForeground(Color.DARK_GRAY);
        add( income);
        
        
        
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font ("Raleway",Font.BOLD,20));
       educational.setForeground(Color.WHITE);
       educational.setBounds(100,290,200,30);
        add(educational);
        
        
        
        JLabel qualification = new JLabel("Qualification:");
          qualification.setFont(new Font ("Raleway",Font.BOLD,20));
          qualification.setForeground(Color.WHITE);
      qualification.setBounds(100,315,200,30);
        add(qualification);
        
         String educationValues[] = {"Non-Graduation","Graduation","Post-Graduation","Doctrate","Others"};
        education = new JComboBox(educationValues);
          education.setBounds(300,315,400,30);
         education.setBackground(Color.cyan);
         education.setForeground(Color.DARK_GRAY);
        add( education);
        
         JLabel occupations = new JLabel("Occupation:");
          occupations .setFont(new Font ("Raleway",Font.BOLD,20));
         occupations.setForeground(Color.WHITE);
        occupations.setBounds(100,390,200,30);
        add( occupations);
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other's"};
        occupation = new JComboBox(occupationValues);
          occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.cyan);
        occupation.setForeground(Color.DARK_GRAY);
        add( occupation);
        
         
        JLabel  panno = new JLabel("PAN NO:");
           panno .setFont(new Font ("Raleway",Font.BOLD,20));
           panno .setBounds(100,440,200,30);
           panno.setForeground(Color.white);
           add( panno);
        
         pan = new JTextField();
       pan.setFont(new Font ("Raleway",Font.BOLD,20));
        pan.setBounds(300,440,400,30);
         pan.setBackground(Color.CYAN);
    pan.setForeground(Color.DARK_GRAY);
        add( pan);
        
         JLabel aadhar_Number= new JLabel("Aadhar Number:");
         aadhar_Number.setFont(new Font ("Raleway",Font.BOLD,20));
       aadhar_Number.setBounds(100,490,200,30);
       aadhar_Number.setForeground(Color.WHITE);
        add(aadhar_Number );
        
          aadhar = new JTextField();
        aadhar.setFont(new Font ("Raleway",Font.BOLD,20));
       aadhar.setBounds(300,490,400,30);
        aadhar.setBackground(Color.CYAN);
     aadhar.setForeground(Color.DARK_GRAY);
        add( aadhar);
        
         JLabel senior_Citizen = new JLabel("Senior Citizen:");
          senior_Citizen.setFont(new Font ("Raleway",Font.BOLD,20));
          senior_Citizen.setForeground(Color.WHITE);
        senior_Citizen.setBounds(100,540,200,30);
        add(senior_Citizen);
        
         syes = new JRadioButton("YES");
         syes.setBounds(300,540,100,30);
        syes.setBackground(Color.CYAN);
        add(syes);
        
        
       
       sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.CYAN);
        add(sno);
        
        ButtonGroup senior_Citizengroup =new ButtonGroup();
        senior_Citizengroup.add(syes);
        senior_Citizengroup.add(sno);
        
        
         JLabel exisiting_Account = new JLabel("Exisiting Account:");
         exisiting_Account.setFont(new Font ("Raleway",Font.BOLD,20));
        exisiting_Account.setBounds(100,590,200,30);
        exisiting_Account.setForeground(Color.WHITE);
        add(exisiting_Account);
        
         eyes = new JRadioButton("YES");
         eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.CYAN);
        add(eyes);
        
        
       
       eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.CYAN);
        add(eno);
        
        ButtonGroup exisiting_Accountgroup =new ButtonGroup();
        exisiting_Accountgroup.add(eyes);
        exisiting_Accountgroup.add(eno);
        
         next = new JButton("Next");
        next.setBackground(Color.GREEN);
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
        
        String sreligion = (String)religion.getSelectedItem(); //setText
        String scategory = (String)category.getSelectedItem(); 
         String sincome = (String)income.getSelectedItem(); //setText
        String seducation = (String)education.getSelectedItem(); 
        String soccupation = (String)occupation.getSelectedItem(); 
        String senior_Citizengroup = null;
          if(syes.isSelected()){
              senior_Citizengroup ="YES";
          }else if (sno.isSelected()){
            senior_Citizengroup = "NO";  
          }
           String aadhar_Number =aadhar.getText(); 
           String panno = pan.getText(); 
           String exisiting_Accountgroup = null;
          if(eyes.isSelected()){
            exisiting_Accountgroup ="YES";
          }else if (eno.isSelected()){
            exisiting_Accountgroup = "NO";  
          }
          
          
         try {
             if(pan.equals("")){
                 JOptionPane.showMessageDialog(null,"Name is Required");
                 
             }else{
                 Conn c =new Conn ();
                 String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"', '"+soccupation+"','"+panno+"','"+aadhar_Number+"','"+senior_Citizengroup +"','"+exisiting_Accountgroup+"')";
            c.s.executeUpdate(query);
            
             setVisible(false);
            new SignupThree(formno).setVisible(true);
             }
         }catch(Exception e){
            System.out.println(e);
         }
    }
    public static void main(String args[]){
     new SignupTwo(" ");
    }
}


