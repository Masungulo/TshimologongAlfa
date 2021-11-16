/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUNGU
 */
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime; 

public class Pform {
    
    int N=10;
     public void Form(){
    
          JFrame formF = new JFrame();
          JPanel formP = new JPanel();
       
          formF.add(formP);
    JLabel Surname,Firstname,ContactNo,Date,Age,eat,radio,movie,tv,h1,h2,h3,h4,h5,h6,hh1,hh2,hh3,hh4;
    JTextField sname,fname,contact,dte,ag,pza,psta,papp,chkn,bff,thr,rr1,ee1,mm1,ttv1;
    
    
    Surname = new JLabel("surname");
    Firstname = new JLabel("first name");
    ContactNo = new JLabel("cell number");
    Date = new JLabel("date");
    Age = new JLabel("age");
    
    
     eat = new JLabel("Eating");
     movie = new JLabel("watching Movies");
     tv = new JLabel("watching Tv");
     radio = new JLabel("listerning Radio");
    
     
     
    h1 = new JLabel("on the scale indicate that you agree or strongly agree    ");
    hh2 = new JLabel("take your survey");
    hh3 = new JLabel("personal detail");
    hh4 = new JLabel("what is your favourate food?(you can choose onre than one)");
    
    
     h1.setFont(new Font("", Font.BOLD, 14));
     hh2.setFont(new Font("", Font.BOLD, 14));
     hh3.setFont(new Font("", Font.BOLD, 14));
     hh4.setFont(new Font("", Font.BOLD, 14));
     
      hh2.setBounds(300,5, 200, 25);
      hh3.setBounds(40,30,200,25);
      hh4.setBounds(40,280,550,25);
    
    h2 = new JLabel("strong agree (5)");
    h3 = new JLabel("agree(4)");
    h4 = new JLabel("neutral(3)");
    h5 = new JLabel("disagree(2)");
    h6 = new JLabel("strong disagree(1)");
    
     sname = new JTextField(20);
     fname = new JTextField(20);
     contact = new JTextField(10);
     dte = new JTextField(20);
     ag = new JTextField(2);
         
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
   LocalDateTime now = LocalDateTime.now(); 
   
     
     dte.setText(""+now);
         
        Checkbox Pizza = new Checkbox("pizza"); 
        Checkbox Pasta = new Checkbox("Pasta");
        Checkbox Pap = new Checkbox("Pap and Wors");
        Checkbox Chiken = new Checkbox("Chike Stirr Fry");
        Checkbox Beff = new Checkbox("Beef Stir Fry");
        Checkbox Other = new Checkbox("Other");
        JButton Submit = new JButton("submit");
        
        Checkbox e1 = new Checkbox(""); 
        Checkbox e2 = new Checkbox("");
        Checkbox e3 = new Checkbox("");
        Checkbox e4 = new Checkbox("");
        Checkbox e5 = new Checkbox("");
         
         Checkbox m1 = new Checkbox(""); 
        Checkbox m2 = new Checkbox("");
        Checkbox m3 = new Checkbox("");
        Checkbox m4 = new Checkbox("");
        Checkbox m5 = new Checkbox(""); 
        
        Checkbox t1 = new Checkbox(""); 
        Checkbox t2 = new Checkbox("");
        Checkbox t3 = new Checkbox("");
        Checkbox t4 = new Checkbox("");
        Checkbox t5 = new Checkbox("");
        
        Checkbox r1 = new Checkbox(""); 
        Checkbox r2 = new Checkbox("");
        Checkbox r3 = new Checkbox("");
        Checkbox r4 = new Checkbox("");
        Checkbox r5 = new Checkbox("");
        
       pza = new JTextField(20);
       psta = new JTextField(20);
       papp = new JTextField(10);
       chkn = new JTextField(2);
       bff = new JTextField(2);
       thr= new JTextField(2);
        
        ee1 = new JTextField(20);
      
       mm1 = new JTextField(2);
      
       ttv1 = new JTextField(2);
      
       rr1 = new JTextField(10);
      
      
        
        
        
         
         
         formP.setLayout(null);
         
         Surname.setBounds(40,70, 100, 25);
         Firstname.setBounds(40,110, 100, 25); 
         ContactNo.setBounds(40,150, 100, 25); 
         Date.setBounds(40,190,100, 25);
         Age.setBounds(40,230, 100, 25); 
         
        sname.setBounds(150, 70, 160, 25);
        fname.setBounds(150, 110, 160, 25);
        contact.setBounds(150, 150, 160, 25);
        dte.setBounds(150, 190, 160, 25);
        ag.setBounds(150, 230, 160, 25);
       
         formP.add(hh2);
         formP.add(hh3);
          formP.add(hh4);
         formP.add(Surname);
         formP.add(sname);
         formP.add(Firstname);
         formP.add(fname);
         formP.add(ContactNo);
         formP.add(contact);
         formP.add(Date);
         formP.add(dte);
         formP.add(Age);
         formP.add(ag);
         
         
         
          
         formP.add(Pizza);
         formP.add(Pasta);
         formP.add(Pap);
         formP.add(Chiken);
         formP.add(Beff);
         formP.add(Other);
         
        Pizza.setBounds(50, 300, 160, 25);
        Pasta.setBounds(50, 325, 160, 25);
        Pap.setBounds(50, 350, 160, 25);
        Chiken.setBounds(50, 375, 160, 25);
        Beff.setBounds(50, 400, 160, 25);
        Other.setBounds(50, 425, 160, 25);
        
         formP.add(h1);
         formP.add(h2);
         formP.add(h3);
         formP.add(h4);
         formP.add(h5);
         formP.add(h6);
         
        h1.setBounds(40, 450, 400, 25);
        h2.setBounds(200, 470, 200, 25);
        h3.setBounds(300, 470, 160, 25);
        h4.setBounds(370, 470, 200, 25);
        h5.setBounds(450, 470, 160, 25);
        h6.setBounds(530, 470, 200, 25);
        
         formP.add(eat);
         formP.add(e1);
         formP.add(e2);
         formP.add(e3);
         formP.add(e4);
         formP.add(e5);
        
        eat.setBounds(40, 500, 100, 25);
        e1.setBounds(230, 500, 20, 25);
        e2.setBounds(310, 500, 20, 25);
        e3.setBounds(380, 500, 20, 25);
        e4.setBounds(460, 500, 20, 25);
        e5.setBounds(560, 500, 20, 25);
         
         formP.add(tv);
         formP.add(t1);
         formP.add(t2);
         formP.add(t3);
         formP.add(t4);
         formP.add(t5);
         
        tv.setBounds(40, 530, 100, 25);
        t1.setBounds(230, 530, 20, 25);
        t2.setBounds(310, 530, 20, 25);
        t3.setBounds(380, 530, 20, 25);
        t4.setBounds(460, 530, 20, 25);
        t5.setBounds(560, 530, 20, 25);
         
         formP.add(movie);
         formP.add(m1);
         formP.add(m2);
         formP.add(m3);
         formP.add(m4);
         formP.add(m5);
          
         movie.setBounds(40, 560, 100, 25);
        m1.setBounds(230, 560, 20, 25);
        m2.setBounds(310, 560, 20, 25);
        m3.setBounds(380, 560, 20, 25);
        m4.setBounds(460, 560, 20, 25);
        m5.setBounds(560, 560, 20, 25);
         
         formP.add(radio);
         formP.add(r1);
         formP.add(r2);
         formP.add(r3);
         formP.add(r4);
         formP.add(r5);
         
         radio.setBounds(40, 590, 100, 25);
        r1.setBounds(230, 590, 20, 25);
        r2.setBounds(310, 590, 20, 25);
        r3.setBounds(380, 590, 20, 25);
        r4.setBounds(460, 590, 20, 25);
        r5.setBounds(560, 590, 20, 25);
         
      
          
          formP.add(Submit);
          Submit.setBounds(250, 650, 100, 25);
        
           
       e1.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(e1.getState()==true){
                ee1.setText("1");
                  e2.setVisible(false);  
            e3.setVisible(false); 
            e4.setVisible(false); 
            e5.setVisible(false); 
            
             }
            
                   if(e1.getState()==false){
                       ee1.setText("0");
                  e2.setVisible(true);  
                   e3.setVisible(true); 
            e4.setVisible(true); 
            e5.setVisible(true);}         
   
         }
      });
          
            e2.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(e2.getState()==true){
                ee1.setText("2");
                  e1.setVisible(false);  
            e3.setVisible(false); 
            e4.setVisible(false); 
            e5.setVisible(false); 
            
             }
            
                   if(e2.getState()==false){
                       ee1.setText("0");
                  e1.setVisible(true);  
                   e3.setVisible(true); 
            e4.setVisible(true); 
            e5.setVisible(true);}         
   
         }
      });
            
            e3.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(e3.getState()==true){
                ee1.setText("3");
                  e2.setVisible(false);  
            e1.setVisible(false); 
            e4.setVisible(false); 
            e5.setVisible(false); 
            
             }
            
                   if(e3.getState()==false){
                       ee1.setText("0");
                  e2.setVisible(true);  
                   e1.setVisible(true); 
            e4.setVisible(true); 
            e5.setVisible(true);}         
   
         }
      });
           
             e4.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(e4.getState()==true){
                ee1.setText("4");
                  e2.setVisible(false);  
            e1.setVisible(false); 
            e3.setVisible(false); 
            e5.setVisible(false); 
            
             }
            
                   if(e4.getState()==false){
                       ee1.setText("0");
                  e2.setVisible(true);  
                   e1.setVisible(true); 
            e3.setVisible(true); 
            e5.setVisible(true);}         
   
         }
      });
             
             
              e5.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(e5.getState()==true){
                ee1.setText("5");
                  e2.setVisible(false);  
            e1.setVisible(false); 
            e4.setVisible(false); 
            e3.setVisible(false); 
            
             }
            
                   if(e5.getState()==false){
                       ee1.setText("0");
                  e2.setVisible(true);  
                   e1.setVisible(true); 
            e4.setVisible(true); 
            e3.setVisible(true);}         
   
         }
      });
              
              
            
           Other.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(Other.getState()){
                                   thr.setText("1");
                                  
                                   }else{thr.setText("0");}
         }
      });
           
           t1.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(t1.getState()==true){
                ttv1.setText("1");
                  t2.setVisible(false);  
            t3.setVisible(false); 
            t4.setVisible(false); 
            t5.setVisible(false); 
            
             }
            
                   if(t1.getState()==false){
                       ttv1.setText("0");
                  t2.setVisible(true);  
                  t3.setVisible(true); 
            t4.setVisible(true); 
            t5.setVisible(true);}         
   
         }
      });
          
            t2.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(t2.getState()==true){
                ttv1.setText("2");
                  t1.setVisible(false);  
            t3.setVisible(false); 
            t4.setVisible(false); 
            t5.setVisible(false); 
            
             }
            
                   if(t2.getState()==false){
                       ttv1.setText("0");
                  t1.setVisible(true);  
                   t3.setVisible(true); 
            t4.setVisible(true); 
            t5.setVisible(true);}         
   
         }
      });
            
            t3.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(t3.getState()==true){
                ttv1.setText("3");
                  t2.setVisible(false);  
            t1.setVisible(false); 
            t4.setVisible(false); 
            t5.setVisible(false); 
            
             }
            
                   if(t3.getState()==false){
                       ttv1.setText("0");
                  t2.setVisible(true);  
                   t1.setVisible(true); 
            t4.setVisible(true); 
            t5.setVisible(true);}         
   
         }
      });
           
             t4.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(t4.getState()==true){
                ttv1.setText("4");
                  t2.setVisible(false);  
            t1.setVisible(false); 
            t3.setVisible(false); 
            t5.setVisible(false); 
            
             }
            
                   if(t4.getState()==false){
                       ttv1.setText("0");
                  t2.setVisible(true);  
                   t1.setVisible(true); 
            t3.setVisible(true); 
            t5.setVisible(true);}         
   
         }
      });
             
             
              t5.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(t5.getState()==true){
                ttv1.setText("5");
                  t2.setVisible(false);  
            t1.setVisible(false); 
            t4.setVisible(false); 
            t3.setVisible(false); 
            
             }
            
                   if(t5.getState()==false){
                       ttv1.setText("0");
                  t2.setVisible(true);  
                   t1.setVisible(true); 
            t4.setVisible(true); 
            t3.setVisible(true);}         
   
         }
      });
            
           
       m1.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(m1.getState()==true){
                mm1.setText("1");
                  m2.setVisible(false);  
            m3.setVisible(false); 
            m4.setVisible(false); 
            m5.setVisible(false); 
            
             }
            
                   if(m1.getState()==false){
                       mm1.setText("0");
                  m2.setVisible(true);  
                   m3.setVisible(true); 
            m4.setVisible(true); 
            m5.setVisible(true);}         
   
         }
      });
          
            m2.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(m2.getState()==true){
                mm1.setText("2");
                  m1.setVisible(false);  
            m3.setVisible(false); 
            m4.setVisible(false); 
            m5.setVisible(false); 
            
             }
            
                   if(m2.getState()==false){
                       mm1.setText("0");
                  m1.setVisible(true);  
                   m3.setVisible(true); 
            m4.setVisible(true); 
            m5.setVisible(true);}         
   
         }
      });
            
            m3.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(m3.getState()==true){
                mm1.setText("3");
                  m2.setVisible(false);  
            m1.setVisible(false); 
            m4.setVisible(false); 
            m5.setVisible(false); 
            
             }
            
                   if(m3.getState()==false){
                       mm1.setText("0");
                  m2.setVisible(true);  
                   m1.setVisible(true); 
            m4.setVisible(true); 
            m5.setVisible(true);}         
   
         }
      });
           
             m4.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(m4.getState()==true){
                mm1.setText("4");
                  m2.setVisible(false);  
            m1.setVisible(false); 
            m3.setVisible(false); 
            m5.setVisible(false); 
            
             }
            
                   if(m4.getState()==false){
                       mm1.setText("0");
                  m2.setVisible(true);  
                   m1.setVisible(true); 
            m3.setVisible(true); 
            m5.setVisible(true);}         
   
         }
      });
             
             
              m5.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(m5.getState()==true){
                mm1.setText("5");
                  m2.setVisible(false);  
            m1.setVisible(false); 
            m4.setVisible(false); 
            m3.setVisible(false); 
            
             }
            
                   if(m5.getState()==false){
                       mm1.setText("0");
                  m2.setVisible(true);  
                   m1.setVisible(true); 
            m4.setVisible(true); 
            m3.setVisible(true);}         
   
         }
      });
         
              r1.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(r1.getState()==true){
                rr1.setText("1");
                  r2.setVisible(false);  
            r3.setVisible(false); 
            r4.setVisible(false); 
            r5.setVisible(false); 
            
             }
            
                   if(r1.getState()==false){
                       rr1.setText("0");
                  r2.setVisible(true);  
                   r3.setVisible(true); 
            r4.setVisible(true); 
            r5.setVisible(true);}         
   
         }
      });
          
            r2.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(r2.getState()==true){
                rr1.setText("2");
                  r1.setVisible(false);  
            r3.setVisible(false); 
            r4.setVisible(false); 
            r5.setVisible(false); 
            
             }
            
                   if(r2.getState()==false){
                       rr1.setText("0");
                  r1.setVisible(true);  
                   r3.setVisible(true); 
            r4.setVisible(true); 
            r5.setVisible(true);}         
   
         }
      });
            
            r3.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(r3.getState()==true){
                rr1.setText("3");
                  r2.setVisible(false);  
            r1.setVisible(false); 
            r4.setVisible(false); 
            r5.setVisible(false); 
            
             }
            
                   if(r3.getState()==false){
                       rr1.setText("0");
                  r2.setVisible(true);  
                   r1.setVisible(true); 
            r4.setVisible(true); 
            r5.setVisible(true);}         
   
         }
      });
           
             r4.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(r4.getState()==true){
                rr1.setText("4");
                  r2.setVisible(false);  
            r1.setVisible(false); 
            r3.setVisible(false); 
            r5.setVisible(false); 
            
             }
            
                   if(r4.getState()==false){
                       rr1.setText("0");
                  r2.setVisible(true);  
                   r1.setVisible(true); 
            r3.setVisible(true); 
            r5.setVisible(true);}         
   
         }
      });
             
             
              r5.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(r5.getState()==true){
                rr1.setText("5");
                  r2.setVisible(false);  
            r1.setVisible(false); 
            r4.setVisible(false); 
            r3.setVisible(false); 
            
             }
            
                   if(r5.getState()==false){
                       rr1.setText("0");
                      
                  r2.setVisible(true);  
                   r1.setVisible(true); 
            r4.setVisible(true); 
            r3.setVisible(true);}         
   
         }
      });
            
      
         Pizza.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(Pizza.getState()){
                                   pza.setText("1");
                                  }else{pza.setText("0");
                                }
         }
      });
         
          Pasta.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(Pasta.getState()){
                                   psta.setText("1");
                                  }else{psta.setText("0");
                                   }
         }
      });
        
          Pap.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(Pap.getState()){
                                   papp.setText("1");
                                   }else{papp.setText("0");
                                   }
         }
      });
         
         
           Chiken.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(Chiken.getState()){
                                   chkn.setText("1");
                                    }else{chkn.setText("0");
                                                           }
         }
      });
           
             Beff.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {            
      
            
            if(Beff.getState()){
                                   bff.setText("1");}else{bff.setText("0");
                                   }
         }
      });
          
        
         
        
            
          Submit.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                          
                   if (e.getSource() == Submit){
                       
                          
                       int c;
                       for( c=5;c<120;c++){
         
                  
        } if(ag.equals(c)){
          
           JOptionPane.showMessageDialog(null,"entered");}
        else{JOptionPane.showMessageDialog(null,"enter full numbers only"); 
                  }
        
        
 
                  if ((fname.getText()).equals("")) {JOptionPane.showMessageDialog(null,"fill missing name ");}
                  else if ((sname.getText()).equals("")) {JOptionPane.showMessageDialog(null,"fill missing surname");}
                  
                  else if (Integer.parseInt(contact.getText())<N) {JOptionPane.showMessageDialog(null,"enter 10 digits");}
                   else if (Integer.parseInt(ag.getText())<(5) || Integer.parseInt(ag.getText())>(120)) {JOptionPane.showMessageDialog(null,"age range betwee 5 and 120");}
                   else if((r1.getState()==false) && (r2.getState()==false) && (r3.getState()==false) && (r4.getState()==false) && (r5.getState()==false) ){
                       JOptionPane.showMessageDialog(null,"rate radio");}
                    else if((t1.getState()==false) && (t2.getState()==false) && (t3.getState()==false) && (t4.getState()==false) && (t5.getState()==false) ){
                       JOptionPane.showMessageDialog(null,"rate tv");}
                   else if((m1.getState()==false) && (m2.getState()==false) && (m3.getState()==false) && (m4.getState()==false) && (m5.getState()==false) ){
                       JOptionPane.showMessageDialog(null,"rate movie");}
                   else if((e1.getState()==false) && (e2.getState()==false) && (e3.getState()==false) && (e4.getState()==false) && (e5.getState()==false) ){
                       JOptionPane.showMessageDialog(null,"rate tv");}
                  
                   else if((Pizza.getState()==false) && (Pap.getState()==false) &&  (Pasta.getState()==false)&& (Beff.getState()==false) && (Chiken.getState()==false) && (Other.getState()==false) ){
                       JOptionPane.showMessageDialog(null,"choose atleast one food you like");}else{
                   
                   
                        
   
   
                       
                             String ffname = fname.getText();
                             String Snme = sname.getText();
                             String cntact = contact.getText();
                             String siku = dtf.format(now);
                             String agge = ag.getText();
                             
                              
                           
                             String ppza = pza.getText();
                             String ppsta = psta.getText();
                             String ppapp = papp.getText();
                             String cchkn = chkn.getText();
                             String bbff = bff.getText();
                             String tthr = thr.getText();
                             
                             
                             String eee1 = ee1.getText();
                             String mmm1 = mm1.getText();
                             String rrr1 = rr1.getText();
                             String ttt1 = ttv1.getText();
                            
                        
        		MainClass ll = new MainClass();
                        ll.getConnection();  
                       
 ll.insertData(ffname,Snme,cntact,siku,agge,ppza,ppsta,ppapp,cchkn,bbff,tthr,eee1,mmm1,rrr1,ttt1);
                         fname.setText("");
                         sname.setText("");
                         contact.setText("");
                         dte.setText("");
                         ag.setText("");
                           e1.setState(false);
                           e2.setState(false);
                           e3.setState(false);
                           e4.setState(false);
                           e5.setState(false);
                           m2.setState(false);
                           m3.setState(false);
                           m4.setState(false);
                           m5.setState(false);
                           m1.setState(false);
                           r1.setState(false);
                           r2.setState(false);
                           r3.setState(false);
                           r4.setState(false);
                           r5.setState(false);
                           t1.setState(false);
                           t2.setState(false);
                           t3.setState(false);
                           t4.setState(false);
                           t5.setState(false);
                           
                         formF.dispose();
                            MainClass d = new MainClass();
             d.firstForm();
                   }
                   
                   
                             
                      
                   
               }
                     }
                       });
          
          
          
          
          
       
       
           formF.setTitle("SURVEY FORM");
           formF.setVisible(true);
           formF.setSize(700,720);
           formF.setResizable(true);
    }
    

}




