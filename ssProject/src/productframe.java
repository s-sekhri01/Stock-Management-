
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vasud
 */
public class productframe extends javax.swing.JInternalFrame implements myvars {

    /**
     * Creates new form productframe
     */
    public productframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Category");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Product");

        jLabel2.setText("Sub Category name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Product Id");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Product Name");

        jLabel6.setText("Rate");

        jLabel7.setText("Discount");

        jLabel8.setText("Stock");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Cat Id", "SubCat Id", "Product name", "Rate", "Discount", "Stock"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel1)
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Delete button
        int choice=JOptionPane.showConfirmDialog(rootPane, "Are you sure to delete this record","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE );

        if(choice==JOptionPane.YES_OPTION)
        {

            try
            {
                Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
                try
                {
                    String prodidref= jLabel9.getText();
                    String q="delete from producttable where productid=?";
                    PreparedStatement myst=mycon.prepareStatement(q);
                    myst.setString(1,prodidref);

                    int s=myst.executeUpdate();
                    if(s==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Product deleted Successfully");
                        clearfields();
                        getprod();

                        jButton2.setEnabled(false);
                        jButton3.setEnabled(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Product not deleted Successfully");
                        clearfields();
                        jButton2.setEnabled(false);
                        jButton3.setEnabled(false);
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
                }
                finally
                {
                    mycon.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //update button
        try
        {
            Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
            try
            {
                String prodidref= jLabel9.getText();
                String q="update producttable set productname=?,rate=?,discount=?,stock=? where productid=?";
                PreparedStatement myst=mycon.prepareStatement(q);
                myst.setString(1, jTextField1.getText());
                myst.setString(2, jTextField3.getText());
                myst.setString(3, jTextField4.getText());
                myst.setString(4, jTextField5.getText());
                myst.setString(5, prodidref);

                int count =myst.executeUpdate();
                if(count==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Product updated Successfully");

                    getprod();
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"Product not updated successfully");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error "+e.getMessage());
            }
            finally
            {
                mycon.close();
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error is "+e.getMessage());
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //to show subcategoeies according to category
       if(jComboBox1.getSelectedIndex()>0)
       {
        try
           {
             Connection myconn = DriverManager.getConnection(myurl, dbuser,dbpass);
             try
                {

                 String q="select * from subcategorytable where catid=?";

                 PreparedStatement myst = myconn.prepareStatement(q);
                 String bigname = jComboBox1.getSelectedItem().toString();
                 String catidref =bigname.substring(0,bigname.indexOf("-"));
                 myst.setString(1,catidref);
                 ResultSet myres = myst.executeQuery();
                 
                 if(myres.next()==true)
                  {
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("Choose Sub Cat");
                      
                    do
                     {
                       jComboBox2.addItem(myres.getString("subcatid") + " - " + myres.getString("subcatname"));
                      }
                     while(myres.next());
                    
                    }
                 else
                  {
                    jComboBox2.removeAllItems();
                    jComboBox2.addItem("No SubCategories");
                   }
                 }
             catch(Exception e)
                {
                 JOptionPane.showMessageDialog(rootPane, "Error is" + e.getMessage());
                 }
             finally
                {
                 myconn.close();
                 }
             }
         catch(Exception e)
           {
             JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
            }
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Add Product
        try
        {
            Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
            try
            {
                String q="insert into Producttable values(?,?,?,?,?,?,?)";
                PreparedStatement myst=mycon.prepareStatement(q);
                String bigname= jComboBox1.getSelectedItem().toString();//100,Grocery
                int cpos=bigname.indexOf("-");
                String catid=bigname.substring(0, cpos);
                
                String bigname2= jComboBox2.getSelectedItem().toString();//100,Grocery
                int cpos1=bigname2.indexOf("-");
                String subcatid=bigname2.substring(0, cpos1);

                myst.setString(1, jLabel9.getText());
                myst.setString(2, catid);
                myst.setString(3, subcatid);
                myst.setString(4, jTextField1.getText());
                myst.setString(5, jTextField3.getText());
                myst.setString(6, jTextField4.getText());
                myst.setString(7, jTextField5.getText());

                int count =myst.executeUpdate();

                if(count==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"Product added Successfully");
                    clearfields();
                    fetchprodid();
                    getprod();
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"Sub Category not added successfully");
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error "+e.getMessage());
            }
            finally
            {
                mycon.close();
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error "+e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //fetch ProdId
        fetchprodid();
        fetchcat();
        if(mainFrame.utype=="employee")
        {
            jButton2.setVisible(false);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       // show contents in table
        if(jComboBox1.getSelectedIndex()>0)
        {
       getprod();
        }
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //to select already entered products from table 
        String prodidref= jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        try
        {
            Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
            try
            {
             String q="select * from producttable where productid=?";
             PreparedStatement myst=mycon.prepareStatement(q);
             myst.setString(1,prodidref);
            
             ResultSet myres=myst.executeQuery();
             
             if(myres.next()==true)
             {
               jLabel9.setText(myres.getString("productid"));
               jTextField1.setText(myres.getString("productname"));
               jTextField3.setText(myres.getString("rate"));
               jTextField4.setText(myres.getString("discount"));
               jTextField5.setText(myres.getString("stock"));
               
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
 
            }
           else
              {
                JOptionPane.showMessageDialog(rootPane, "Cannot Fetch Data");
                 clearfields();
                 jButton2.setEnabled(false);
                 jButton3.setEnabled(false);
                }

           }
          catch(Exception e)
            {
             JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
              }
           finally
             {
              mycon.close();
              }
         }
        catch(Exception e)
          {
            JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
           }
    }//GEN-LAST:event_jTable1MouseClicked

    void fetchprodid()
    {
        try
        {
            Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
            try
            {
                String q="select * from producttable order by productid desc";
                PreparedStatement myst=mycon.prepareStatement(q);
                ResultSet myres = myst.executeQuery();

                if(myres.next())
                  { 
                    int prodid = myres.getInt("productid");
                    prodid++;
                    jLabel9.setText(String.valueOf(prodid));
                   }
                 else
                  {
                    jLabel9.setText("5000");
                    }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error "+e.getMessage());
            }
            finally
            {
                mycon.close();
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error is "+e.getMessage());
        }
    }
    void fetchcat()
    {
        try
           {
             Connection myconn = DriverManager.getConnection(myurl, dbuser,dbpass);
             try
                {

                 String q="select * from categorytable";

                 PreparedStatement myst = myconn.prepareStatement(q);

                 ResultSet myres = myst.executeQuery();
                 if(myres.next()==true)
                  {
                    do
                     {
                       jComboBox1.addItem(myres.getString("catid") + " - " + myres.getString("catname"));
                      }
                     while(myres.next());
 
                    }
                 else
                  {
                    jComboBox1.removeAllItems();
                    jComboBox1.addItem("No Categories");
                   }
                 }
             catch(Exception e)
                {
                 JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
                 }
             finally
                {
                 myconn.close();
                 }
             }
         catch(Exception e)
           {
             JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
            }
        
    }
     void clearfields()
    {
        jTextField1.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        
//        DefaultTableModel mymodel =(DefaultTableModel)jTable1.getModel();
//        mymodel.setRowCount(0);
    }
     void getprod()
     {
          try
        {
            Connection mycon=DriverManager.getConnection(myurl,dbuser,dbpass);
            try
            {
             DefaultTableModel mymodel =(DefaultTableModel)jTable1.getModel();
             String q="select * from producttable where subcatid=?";
             PreparedStatement myst=mycon.prepareStatement(q);
             String bigname= jComboBox2.getSelectedItem().toString();
             String subcatidref=bigname.substring(0,bigname.indexOf("-"));
             myst.setString(1,subcatidref);
             ResultSet myres=myst.executeQuery();
             
             if(myres.next()==true)
             {
                 mymodel.setRowCount(0);
               do
               {
                 
                 String prodid,catid,subcatid,prodname,rate,discount,stock;
                 prodid=myres.getString("ProductId");
                 catid=myres.getString("CatId");
                 subcatid=myres.getString("SubCatId");
                 prodname=myres.getString("ProductName");
                 rate=myres.getString("Rate");
                 discount=myres.getString("Discount");
                 stock=myres.getString("Stock");
                 
                Object myrow[] = {prodid,catid,subcatid,prodname,rate,discount,stock};

                mymodel.addRow(myrow);
               }
                while(myres.next());
            
            }
           else
              {
//                JOptionPane.showMessageDialog(rootPane, "No products entered yet");
                 
                 
                 mymodel.setRowCount(0);
                }

           }
          catch(Exception e)
            {
             JOptionPane.showMessageDialog(rootPane, "Error is " + e.getMessage());
              }
           finally
             {
              mycon.close();
              }
         }
        catch(Exception e)
          {
            JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
           }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
