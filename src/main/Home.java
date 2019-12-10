
package main;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import java.awt.Component;
import static javax.persistence.criteria.Predicate.BooleanOperator.AND;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gastone Alex
 */
public class Home extends javax.swing.JFrame {

    public Home() throws SQLException {
       
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        logo_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Search_jTextField = new javax.swing.JTextField();
        Search_jButton = new javax.swing.JButton();
        Logo_jLabel = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        Button_jPanel = new javax.swing.JPanel();
        All_orders_jButton = new javax.swing.JButton();
        Pending_orders_jButton = new javax.swing.JButton();
        Approved_orders_jButton = new javax.swing.JButton();
        Update_info_jButton = new javax.swing.JButton();
        Contracts_jButton = new javax.swing.JButton();
        Reports_jButton = new javax.swing.JButton();
        Declinedl_orders_jButton = new javax.swing.JButton();
        Rented_jButton1 = new javax.swing.JButton();
        Data_jPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cooler Delivery and Collection");
        setExtendedState(6);
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, logo_Label, org.jdesktop.beansbinding.ELProperty.create("${icon}"), logo_Label, org.jdesktop.beansbinding.BeanProperty.create("icon"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("COCA-COLA KWANZA LIMITED");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("COOLER DELIVERY AND COLLECTION");

        Search_jTextField.setToolTipText("SEARCH BY NAME");
        Search_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_jTextFieldActionPerformed(evt);
            }
        });

        Search_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/search.png"))); // NOI18N
        Search_jButton.setText("Search");
        Search_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_jButtonActionPerformed(evt);
            }
        });

        Logo_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo_Label)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Search_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search_jButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Search_jButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Search_jTextField)))))
                .addContainerGap())
        );

        Button_jPanel.setBackground(new java.awt.Color(0, 0, 0));

        All_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/order.png"))); // NOI18N
        All_orders_jButton.setText("ORDERS");
        All_orders_jButton.setBorderPainted(false);
        All_orders_jButton.setOpaque(false);
        All_orders_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                All_orders_jButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                All_orders_jButtonMouseReleased(evt);
            }
        });
        All_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                All_orders_jButtonActionPerformed(evt);
            }
        });

        Pending_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Pending1.png"))); // NOI18N
        Pending_orders_jButton.setText("PENDING");
        Pending_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pending_orders_jButtonActionPerformed(evt);
            }
        });

        Approved_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Approved.png"))); // NOI18N
        Approved_orders_jButton.setText("APPROVED");
        Approved_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Approved_orders_jButtonActionPerformed(evt);
            }
        });

        Update_info_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/update icon.png"))); // NOI18N
        Update_info_jButton.setText("UPDATE");
        Update_info_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_info_jButtonActionPerformed(evt);
            }
        });

        Contracts_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/contract.png"))); // NOI18N
        Contracts_jButton.setText("CONTRACTS");
        Contracts_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contracts_jButtonActionPerformed(evt);
            }
        });

        Reports_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/reports.png"))); // NOI18N
        Reports_jButton.setText("REPORTS");
        Reports_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reports_jButtonActionPerformed(evt);
            }
        });

        Declinedl_orders_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/declined.gif"))); // NOI18N
        Declinedl_orders_jButton.setText("DECLINED");
        Declinedl_orders_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Declinedl_orders_jButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Declinedl_orders_jButtonMouseReleased(evt);
            }
        });
        Declinedl_orders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Declinedl_orders_jButtonActionPerformed(evt);
            }
        });

        Rented_jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/delivered_truck-32.png"))); // NOI18N
        Rented_jButton1.setText("RENTED");
        Rented_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rented_jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_jPanelLayout = new javax.swing.GroupLayout(Button_jPanel);
        Button_jPanel.setLayout(Button_jPanelLayout);
        Button_jPanelLayout.setHorizontalGroup(
            Button_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Button_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(All_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pending_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Approved_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contracts_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reports_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update_info_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Declinedl_orders_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rented_jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Button_jPanelLayout.setVerticalGroup(
            Button_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(All_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Declinedl_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Pending_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Approved_orders_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Update_info_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Contracts_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Rented_jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Reports_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(Button_jPanel);

        Data_jPanel.setLayout(null);
        jSplitPane1.setRightComponent(Data_jPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_jTextFieldActionPerformed

    private void All_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_All_orders_jButtonActionPerformed
     Orders order = new Orders();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( order);   // TODO add your handling code here:
    }//GEN-LAST:event_All_orders_jButtonActionPerformed

    private void Approved_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Approved_orders_jButtonActionPerformed
Approved approved = new Approved();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( approved);        // TODO add your handling code here:
       
    }//GEN-LAST:event_Approved_orders_jButtonActionPerformed

    private void Update_info_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_info_jButtonActionPerformed

Update update = new Update();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( update);        // TODO add your handling code here:
    }//GEN-LAST:event_Update_info_jButtonActionPerformed

    private void Contracts_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contracts_jButtonActionPerformed

  Contract mycontract = new Contract();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( mycontract);
    }//GEN-LAST:event_Contracts_jButtonActionPerformed

    private void Reports_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reports_jButtonActionPerformed
Reports myreport = new Reports();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( myreport);
               // TODO add your handling code here:
    }//GEN-LAST:event_Reports_jButtonActionPerformed

    private void Search_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_jButtonActionPerformed

 try {
                 
 

    
    JTable jtbl = new JTable();
    
    jtbl.setShowGrid(true);

    
    String id = Search_jTextField.getText();

            Connection con = DBConn.myConn();
  
////
PreparedStatement stmt1 = con.prepareStatement(" ALTER view loanCoolerView as select   *  , case when approved_by_asm = 0 and approved_by_rsm = 0 THEN 'PENDING' when approved_by_asm = 0 and approved_by_rsm = 1 THEN 'PENDING' when approved_by_asm = 1 and approved_by_rsm = 0 THEN 'PENDING' when approved_by_asm = 1 and approved_by_rsm = 1 THEN 'APPROVED'else 'DECLINED' end cooler_status from loan_coooler WHERE outlet_owner LIKE ?");
stmt1.setString(1, "%" +id + "%"); 
int rs1 = stmt1.executeUpdate();
System.out.println(rs1+" records affected");
////

 PreparedStatement stmt = con.prepareStatement("SELECT doc_no,contract_no,outlet_name,outlet_owner,outlet_no,location,cooler_status FROM loanCoolerView WHERE outlet_owner LIKE ?");
 stmt.setString(1, "%" +id + "%"); 

            ResultSet rs = stmt.executeQuery();
            
            // get columns info
           
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            
            // for changing column and row model
            DefaultTableModel tm = (DefaultTableModel) jtbl.getModel();
            
            // clear existing columns 
            tm.setColumnCount(0);
            
            // add specified columns to table
            for (int i = 1; i <= columnCount; i++ ) {
                tm.addColumn(rsmd.getColumnName(i));
            }               
                
            // clear existing rows
            tm.setRowCount(0);
            
            // add rows to table
            while (rs.next()) {
                String[] a = new String[columnCount];
                for(int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i+1);
                }
                tm.addRow(a);
            }
            tm.fireTableDataChanged();
            
            
            rs.close();// Close ResultSet and Statement
                    jtbl.setPreferredScrollableViewportSize(jtbl.getPreferredSize());



        JScrollPane scrollPane = new JScrollPane( jtbl);
           jSplitPane1.setRightComponent(scrollPane);
            Search_jTextField.setText("");
               DefaultTableCellRenderer CellheaderRenderer = new DefaultTableCellRenderer();
CellheaderRenderer.setBackground(new Color(255, 0, 0));

for (int i = 0; i < jtbl.getModel().getColumnCount(); i++) {
        jtbl.getColumnModel().getColumn(i).setHeaderRenderer(CellheaderRenderer);
}
//setting toolTip
            JLabel headerRenderer = new DefaultTableCellRenderer();
             JLabel headerRenderer2 = new DefaultTableCellRenderer();
              JLabel headerRenderer3 = new DefaultTableCellRenderer();
               JLabel headerRenderer4 = new DefaultTableCellRenderer();
                JLabel headerRenderer5 = new DefaultTableCellRenderer();
                     JLabel headerRenderer6 = new DefaultTableCellRenderer();
                          JLabel headerRenderer7 = new DefaultTableCellRenderer();
    String columnName = jtbl.getModel().getColumnName(0);
    headerRenderer.setText(columnName);
    headerRenderer.setToolTipText("Document Number");
    TableColumnModel columnModel = jtbl.getColumnModel();
    TableColumn documentColumn = columnModel.getColumn(0);
    documentColumn.setHeaderRenderer((TableCellRenderer)headerRenderer);
    headerRenderer.setBackground(Color.red);
    
    String columnName2 = jtbl.getModel().getColumnName(1);
    headerRenderer2.setText(columnName2);
    headerRenderer2.setToolTipText("Contract Number");
    TableColumnModel columnModel2 = jtbl.getColumnModel();
    TableColumn contractColumn = columnModel2.getColumn(1);
    contractColumn.setHeaderRenderer((TableCellRenderer)headerRenderer2);
    headerRenderer2.setBackground(Color.red);
    
    String columnName3 = jtbl.getModel().getColumnName(2);
    headerRenderer3.setText(columnName3);
    headerRenderer3.setToolTipText("Outlet Name");
    TableColumnModel columnModel3 = jtbl.getColumnModel();
    TableColumn outletNameColumn = columnModel2.getColumn(2);
    outletNameColumn.setHeaderRenderer((TableCellRenderer)headerRenderer3);
    headerRenderer3.setBackground(Color.red);

String columnName4 = jtbl.getModel().getColumnName(3);
    headerRenderer4.setText(columnName4);
    headerRenderer4.setToolTipText("Outlet Owner");
    TableColumnModel columnModel4 = jtbl.getColumnModel();
    TableColumn outletOwnerColumn = columnModel3.getColumn(3);
    outletOwnerColumn.setHeaderRenderer((TableCellRenderer)headerRenderer4);
    headerRenderer4.setBackground(Color.red);

String columnName5 = jtbl.getModel().getColumnName(4);
    headerRenderer5.setText(columnName5);
    headerRenderer5.setToolTipText("Outlet Number");
    TableColumnModel columnModel5 = jtbl.getColumnModel();
    TableColumn outletNumberColumn = columnModel5.getColumn(4);
    outletNumberColumn.setHeaderRenderer((TableCellRenderer)headerRenderer5);
    headerRenderer5.setBackground(Color.red);
    
    String columnName6 = jtbl.getModel().getColumnName(5);
    headerRenderer6.setText(columnName6);
    headerRenderer6.setToolTipText("Location");
    TableColumnModel columnModel6 = jtbl.getColumnModel();
    TableColumn locationColumn = columnModel6.getColumn(5);
    locationColumn.setHeaderRenderer((TableCellRenderer)headerRenderer6);
    headerRenderer6.setBackground(Color.red);



String columnName7 = jtbl.getModel().getColumnName(6);
    headerRenderer7.setText(columnName7);
    headerRenderer7.setToolTipText("Cooler Status");
    TableColumnModel columnModel7 = jtbl.getColumnModel();
    TableColumn salesManColumn = columnModel7.getColumn(6);
    salesManColumn.setHeaderRenderer((TableCellRenderer)headerRenderer7);
    headerRenderer7.setBackground(Color.red);
    
 //end setting toolTip
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        }
    }//GEN-LAST:event_Search_jButtonActionPerformed

    private void Pending_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pending_orders_jButtonActionPerformed
        Pending pending = new Pending();
        Data_jPanel.setBackground(Color.red);
        jSplitPane1.setRightComponent( pending);

        // Code of sub-components - not shown here

        // Layout setup code - not shown here
        // TODO add your handling code here:
    }//GEN-LAST:event_Pending_orders_jButtonActionPerformed

    private void Declinedl_orders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Declinedl_orders_jButtonActionPerformed
         Declined declined = new Declined();
        jSplitPane1.setRightComponent( declined);// TODO add your handling code here:
    }//GEN-LAST:event_Declinedl_orders_jButtonActionPerformed

    private void All_orders_jButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_orders_jButtonMouseReleased
        All_orders_jButton.setBackground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_All_orders_jButtonMouseReleased

    private void Declinedl_orders_jButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Declinedl_orders_jButtonMouseReleased
      Declinedl_orders_jButton.setBackground(Color.white);  // TODO add your handling code here:
    }//GEN-LAST:event_Declinedl_orders_jButtonMouseReleased

    private void All_orders_jButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_orders_jButtonMousePressed
      All_orders_jButton.setBackground(Color.blue);  // TODO add your handling code here:
    }//GEN-LAST:event_All_orders_jButtonMousePressed

    private void Declinedl_orders_jButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Declinedl_orders_jButtonMousePressed
       Declinedl_orders_jButton.setBackground(Color.blue);  // TODO add your handling code here:
    }//GEN-LAST:event_Declinedl_orders_jButtonMousePressed

    private void Rented_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rented_jButton1ActionPerformed
Rented rented = new Rented();
        Data_jPanel.setBackground(Color.red);
       jSplitPane1.setRightComponent( rented);        // TODO add your handling code here:
    }//GEN-LAST:event_Rented_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new Home();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            
            
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton All_orders_jButton;
    private javax.swing.JButton Approved_orders_jButton;
    private javax.swing.JPanel Button_jPanel;
    private javax.swing.JButton Contracts_jButton;
    private javax.swing.JPanel Data_jPanel;
    private javax.swing.JButton Declinedl_orders_jButton;
    private javax.swing.JLabel Logo_jLabel;
    private javax.swing.JButton Pending_orders_jButton;
    private javax.swing.JButton Rented_jButton1;
    private javax.swing.JButton Reports_jButton;
    private javax.swing.JButton Search_jButton;
    public javax.swing.JTextField Search_jTextField;
    private javax.swing.JButton Update_info_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel logo_Label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}