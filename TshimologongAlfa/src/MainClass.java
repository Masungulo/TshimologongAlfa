/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUNGU
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class MainClass {
    
         
    public Connection getConnection() {
    
        Connection conn = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
      
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/tshimogolo", "root", "masungulo");
        
        } catch(Exception e) {
        
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot reach the database\n", "Database Error", 0);
        }
        
        return conn;
    }
    public void insertData(String S, String F, String C,String D, String A,String pza,String ps,String ppv,String ch,
                                String Bf,String othrr,String E, String M,String R,String T) {
    
        
        
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            
            
            
            String sql = "INSERT INTO surveyeddata(surname,firstname,contact,dte,age,pizza,pasta,pap_worse,chiken,beef,other_food,eat,movies,tv,radio)"
                    + " VALUES('"+S+"','"+F+"','"+C+"','"+D+"','"+A+"','"+pza+"','"+ps+"','"+ppv+"','"+ch+"','"+Bf+"','"+othrr+"','"+E+"','"+M+"','"+R+"','"+T+"')";
            int value = stmt.executeUpdate(sql);
           
             
        } catch(Exception e ) {
        
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cannot reach the database\n", "Database Error", 0);
        }
        
        
    }
    
      
    public void Res(){
      Statement stm = null;
                 Statement stmt = null;
                        try {
                            
                            Connection conn = getConnection();
            stmt = conn.createStatement();
                        stm = conn.createStatement();

            
String sql = "SELECT count(*),max(age),min(age),min(age),sum(pizza)/count(*)*100,sum(pasta)/count(*)*100,sum(pap_worse)/count(*)*100,avg(eat),avg(eat),avg(movies),avg(tv),avg(radio) FROM surveyeddata";
String p="select avg(age),round(sum(age),2) from surveyeddata";
ResultSet rs = stmt.executeQuery(sql);
ResultSet s =stm.executeQuery(p);

while(rs.next() && s.next()){

       

int f = rs.getInt("count(*)");

Double av = s.getDouble("avg(age)");
int mx = rs.getInt("max(age)");
int mn = rs.getInt("min(age)");
  


Double pzx = rs.getDouble("sum(pizza)/count(*)*100");
Double psx = rs.getDouble("sum(pasta)/count(*)*100");
Double pw = rs.getDouble("sum(pap_worse)/count(*)*100"); 

Double sme = rs.getDouble("avg(eat)");
Double smm = rs.getDouble("avg(movies)");
Double smt = rs.getDouble("avg(tv)");
Double smr = rs.getDouble("avg(radio)");

   String [] results = new String [11];
    
    	         results[ 0]=  "Total number surveyed                                                     "+f ;
                 results[ 1] = "Average age                                                                 " +Math.round(av*10)/10.0;
                 results[ 2] = "Oldest person participated in survey                                                 " +mx;
                 results[ 3] = "youngest person participated in survey                                       "+mn ;
		 results[ 4] = "Percentage of people who liked Pizza                                  "+Math.round(pzx*10)/10.0+"%";
		 results[ 5] = "Percentage of people who liked Pasta                                  "+Math.round(psx*10)/10.0+"%" ;
		 results[ 6] = "Percentage of people who liked Pap and Worse                        "+Math.round(pw*10)/10.0+"%" ;
		 results[ 7] = "People who like to eat                                                                    "+Math.round(sme*10)/10.0 ;
                 results[ 8] = "People who like watch movies                                                     "+Math.round(smm*10)/10.0 ;
                 results[ 9] = "People who like watch TV                                                            "+Math.round(smt*10)/10.0 ;
                 results[ 10] = "People who like to listen to the radio                                          "+Math.round(smr*10)/10.0 ;
                              JOptionPane . showMessageDialog( null ,results,"RESULTS",JOptionPane.INFORMATION_MESSAGE);    
                              
                      MainClass d = new MainClass();
             d.firstForm();
    
   

}
rs.close();
stmt.close();
conn.close();
}
catch(Exception ex) {
JOptionPane.showMessageDialog(null,"ya ala"); 
}

          
           
            }
   public void firstForm(){
       
       
        JFrame alfa = new JFrame();
           JPanel sung = new JPanel();
           
           sung.setLayout(null);
           
            JButton FillForm = new JButton("fill form to survey");
            JButton suveydResults = new JButton("view surveyed results");
            
             FillForm.setBounds(210,70, 170, 35);
         suveydResults.setBounds(210,130, 170, 35);
            
             alfa.add(sung);
             
          
             sung.add(FillForm);
             sung.add(suveydResults);
             
          FillForm.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                           alfa.dispose();
                        
                             Pform d = new Pform();
             d.Form();
                         }
                       });
           
           suveydResults.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                           alfa.dispose();
                        
                             MainClass d = new MainClass();
             d.Res();
                         }
                       });
           
          
           alfa.setTitle("CHOOSE FORM");
           alfa.setVisible(true);
           alfa.setSize(600,400);
           alfa.setResizable(false);
       
}
    
    public static void main(String arg[]){
    
        
        
                             MainClass d = new MainClass();
             d.firstForm();
          
           
    }
  
    }
    
