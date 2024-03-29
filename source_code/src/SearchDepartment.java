/*
 * SearchDepartment.java
 *
 * Created on August 18, 2012, 11:01 PM
 */
 //package javax.swing.table;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author  Administrator
 */
public class SearchDepartment extends javax.swing.JFrame {
    
    /** Creates new form SearchBook */
    public SearchDepartment() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBookID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtKeyword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CmdClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IMPRO - Search Department");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("IMPRO - Search Department");

        jLabel2.setText("Searh by Book ID:");

        TxtBookID.setText("jTextField1");

        jLabel3.setText("Title:");

        TxtTitle.setText("jTextField1");

        jLabel4.setText("Keyword :");

        TxtKeyword.setText("jTextField1");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TxtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(CmdClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            MainClass mc=new MainClass();
            
            Connection connection;          
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            ResultSet rs;

            String StrQr="";
            if (TxtBookID.getText().trim().length()>0 )
            {
                StrQr=StrQr + " and book_id = " + TxtBookID.getText().trim() + " ";
            }
            if (TxtTitle.getText().trim().length()>0 )
            {
                StrQr=StrQr + " and book_title like '%" + TxtTitle.getText().trim() + "%' ";
            }            
            if (TxtKeyword.getText().trim().length()>0 )
            {
                StrQr=StrQr + " and book_keyword like '%" + TxtKeyword.getText().trim() + "%' ";
            } 
            
            if (StrQr.length()==0)
            {
               JOptionPane.showMessageDialog(null,"Enter search critaria.");
                return;
            }
            
            
            PreparedStatement stmt=connection.prepareStatement("select book_id, book_title, book_category, book_keyword from lib_book_master where 1=1 " + StrQr + " order by book_id");
            rs = stmt.executeQuery();
            
            
            
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Book ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Title");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Category");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Keyword");
            jTable1.getTableHeader().resizeAndRepaint();

            // Removing Previous Data
            while (jTable1.getRowCount() > 0) {
                ((DefaultTableModel) jTable1.getModel()).removeRow(0);
            }


            //Creating Object []rowData for jTable's Table Model  
            
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next())
            {  
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {  
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow() - 1,row);
            }

        }
                catch (Exception e)
        {
            System.err.println(e);
            //System.exit(1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        
        this.setVisible(false);
}//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       TxtBookID.setText("");
       TxtTitle.setText("");
       TxtKeyword.setText("");
       
       this.setLocationRelativeTo(null);
       
       
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Book ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Title");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Category");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Keyword");
        jTable1.getTableHeader().resizeAndRepaint();

        // Removing Previous Data
        while (jTable1.getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDepartment().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdClose;
    private javax.swing.JTextField TxtBookID;
    private javax.swing.JTextField TxtKeyword;
    private javax.swing.JTextField TxtTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}
