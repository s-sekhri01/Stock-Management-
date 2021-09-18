
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vasud
 */
public class ssProject implements myvars{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // for look and feel
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
      // to check if the software is running for the first time       
        try
        {
            Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
            try
            {
             String q="select * from usertable";
             PreparedStatement myst=mycon.prepareStatement(q);
            
             ResultSet myres =myst.executeQuery();
             
             if(myres.next()==true)
             {
                 
                 loginframe obj= new loginframe();
//                 jDesktopPane1.add(obj);
                 obj.setVisible(true);
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Running Software for first time, create Admin Account first");
                 createadmin obj=new createadmin();
                 obj.setVisible(true);
             }
                          
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
            }
            finally
            {
                mycon.close();
            }
                    
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"Error is "+e.getMessage());
                }
        
       
    }
    
}
