/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


/**
 *
 * @author RTM
 */
public class Contract extends javax.swing.JPanel {

    /**
     * Creates new form test
     */
    public Contract() {
        
        initComponents();
        insertDate();
        insertName();
        insertOutletName();
        JScrollPane scroll = new JScrollPane();
        scroll.add(jPanel1);
  
     

    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Print_jButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date_jLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CustomerName_jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelCustomer = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        outletNamejLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Date2_jLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();

        Print_jButton.setText("print");
        Print_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_jButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MKATABA WA UAZIMISHAJI WA MASHINE ZA KUPOOZA VINYWAJI BARIDI VYA COCA-COLA/JOKOFU");

        jLabel3.setText("Makubaliano ya mkataba huu yamefanyika leo tarehe");

        jLabel4.setText("Baina ya COCA-COLA KWANZA LTD, S.L.P 7813 Dar es salaam(ambayo katika mkataba huu atatajwa kama ");

        jLabel5.setText("Coca Cola) kwa upande mmoja na ");

        jLabel6.setText("Wa  S.L.P........................(ambaye katika mkataba atatajwa kama “MWAZIMAJI” kwa upande mwingine);");

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane1.setText("KWA KUWA kampuni ya Coca Cola inazalisha na kuuza soda aina ya Coca Cola na\nKWA KUWA Cocacola inamiliki na kuzalisha machine za kupooza soda zao kwa waazimaji kwa madhumuni ya biashara ya soda hizo.\nKWA KUWA mwazimaji ameomba na Coca cola imekubali kuazimisha machine za kupooza soda za Cocacola kwa madhumuni ya kuuza soda Coca Cola NA\nKWA KUWA pande zote mbili zimekubaliana kuingia kwenye mkataba huu:\n\n                                                                MKATABA HUU UNASHUHUDIA YAFUATAYO:\n\n1.\tKwamba; mwagizaji atawajibika kutumia jokofu/machine hizo kwa mujibu wa masharti yafuatayo;\nA.\tMwazimaji atatumia jokofu kwa uangalifu na usafi na atatoa taarifa mara moja uharibifu wowote utakaotokea kwa mwenye mali na mwazimaji atamlipa Coca-Cola uharibifu wowote uliofanywa au uchakavu wa mali uliofanywa kutokana na uzembe au kuharibiwa na mwazimaji au utumishi wake au kuibiwa ikiwa mikononi mwake. Mwazimaji haruhusiwi kufanya matengenezo yoyote kwenye jokofu hilo au kutoa kifaa chochote kile.\nB.\tCoca-Cola itaitunza mali hiyo katika njia nzuri na hali iliyo bora kwa kufanya matengenezo au kuhakikisha mali iliyochakaa au iliyoharibika mradi hiyo isiwe imesababishwa na uzembe wa mwazimaji au mtumishi wake na mwazimaji atawaruhusu watumishi wa Coca-Cola wakati wowote ili kukagua mali hiyo.\nC.\tMwazimaji hatoondoa jokofu bila kibali cha maandishi kutoka Coca-Cola au kusababisha kuondolewa jokofu ambapo lipo wala kuruhusu kifaa kuchukuliwa kwa nguvu na atawataarifu mara moja Coca-Cola matukio yoyote yafuatayo;\na.\tUtoaji wa kodi wa nguvu na usumbufu katika mali yoyote ya mwazimaji\nb.\tUwekaji rehani wa sehemu zozote ambazo mali zimo au;\na)\tAtafariki au atapata kichaa au kupata kilema cha kudumu au kupata amri inayomkataza kupewa mali hiyo;\nb)\tKama pia atatenguliwa kwa sababu yoyote au kupata amri iliyotolewa dhidi ya ubia huo au namna yoyote nyingine.\nc)\tMwazimaji atapaswa kutoa ripoti mara moja kwa Coca-Cola kunapotokea mabadiriko ya jina la biashara yake\nD.\tIwapo mwazimaji atashindwa kutekeleza masharti muhimu kama vile maonyo ya maandishi ya matumizi ya jokofu:\nE.\tKuweka bidhaa zisizo za Coca-Cola.\na.\tWakati wowote hakikisha jokofu limejaa bidhaa za Coca-Cola na kupangwa katika mpangilio uliolekezwa na Coca-Cola, tofauti na hivyo basi Coca-Cola inaweza ikaamua kuchukua jokofu bila taarifa yoyote.\nF.\tMwazimaji analazimika kuwa na masanduku ya kutosha ili aweze kuwa na akiba ya soda za kutosha kuhudumia wateja vizuri katika viwago vifuatavyo:\na.\tJokofu lenye uwezo wa wa kreti 2 = sanduku 8\nb.\tJokofu lenye uwezo wa wa kreti 6 = sanduku 18\nc.\tJokofu lenye uwezo wa wa kreti 8 = sanduku 20\nd.\tJokofu lenye uwezo wa wa kreti 12 = sanduku 24\ne.\tJokofu lenye uwezo wa wa kreti 16 = sanduku 30\nG.\tMwazimaji anatakiwa kuuza bidhaa za Coca-Cola kwa bei ambayo imepangwa/imekubalika na kampuni ya Coca-Cola\nH.\tMwazimaji pia anatakiwa kuzingatia yafuatayo kuhusu ununuzi kutegemeana na aina ya jokofu alilonalo:\na.\tKama anajokofu lenye uwezo wa kuchukua kreti 2 ni lazima mauzo yake yasiwe chini ya sanduku 14 kwa wiki.\nb.\tKama anajokofu lenye uwezo wa kuchukua kreti 8 ni lazima mauzo yake yasiwe chini ya sanduku 15 kwa wiki.\nc.\tKama anajokofu lenye uwezo wa kuchukua kreti 12 ni lazima mauzo yake yasiwe chini ya sanduku 20 kwa wiki.\nd.\tKama anajokofu lenye uwezo wa kuchukua kreti 16 ni lazima mauzo yake yasiwe chini ya sanduku 25 kwa wiki.\ne.\tKama anajokofu lenye uwezo wa kuchukua kreti 32 ni lazima mauzo yake yasiwe chini ya sanduku 50 kwa wiki.\nI.\tEndapo matengenezo yatahitajika mwazimaji atapaswa kutoa ripoti mara moja kwa wahusika\nJ.\tJokofu litatumika katika kuuza bidhaa za Coca-Cola tu.\nK.\tCoca-Cola haitawajibika kwa mwazimaji au mtu mwingine yeyote kwa kifo chochote, kuumia au madhara yaliyosababishwa kwa namna yoyote kutokana na kuhusiana na matumizi ya kifaa hicho au utunzaji wake kwa anaemiliki, vinginevyo kwa namna yoyote iwapo jambo limetokana na uzmbe kwa kiwango chochote.\n2.\tKwamba; iwapo kutatokea kutoelewana au mgogoro wowote kuhusiana na mkataba huu pande zote mbili zitajaribuwezekanavyo kutatua kabla ya hatua nyingoine za kisheria kuchukuliwa.\n\n                                                                    MKATABA HUU UMETIWA SAHIHI NA PANDE ZOTE MBILI KAMA IFUATAVYO:\nImetiwa sahihi na ................................................\nKwa niaba ya Coca-Cola Kwanza Ltd\nLeo tarehe……………. Mwezi…………. Mwaka………..........\n\nMbele ya\n\n1.\tJina………............................................\n\n                     Anuani……...........................................\n\n                     Sahihi…….............................................\n\n                     Cheo…................................................\n\n\n2.\tJina………............................................\n\n                     Anuani……...........................................\n\n                     Sahihi…….............................................\n\n                     Cheo…................................................\n\n\n\n\n\n");
        jTextPane1.setOpaque(false);
        jScrollPane1.setViewportView(jTextPane1);

        jLabel7.setText("Imetiwa sahihi na");

        jLabel8.setText("Kwa niaba ya ");

        jLabel9.setText("Leo tarehe ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(outletNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Date2_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(outletNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addComponent(Date2_jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTextPane3.setText("\nMbele ya\n\n1.\tJina………............................................\n\n                     Anuani……...........................................\n\n                     Sahihi…….............................................\n\n                     Cheo…................................................\n");
        jScrollPane3.setViewportView(jTextPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Print_jButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustomerName_jLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Print_jButton)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Date_jLabel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CustomerName_jLabel)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void Print_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_jButtonActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Cooler Contract");
        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf,int PageNum){
                if(PageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.5, 0.5);
                jPanel1.paint(g2);

                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok = job.printDialog();
        if(ok){
            try{
                job.print();
            }
            catch(PrinterException ex){}
        }
        Connection con = DBConn.myConn();
                PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE loan_coooler SET contract =1 where approved_by_asm =1 AND approved_by_rsm=1 AND approved_by_contlr=1 AND outlet_owner=?");
        } catch (SQLException ex) {
            Logger.getLogger(Contract.class.getName()).log(Level.SEVERE, null, ex);
        }
String str =  CustomerName_jLabel.getText();                
        try {
            stmt.setString(1, str);
        } catch (SQLException ex) {
            Logger.getLogger(Contract.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int rs = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Contract.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Print_jButtonActionPerformed
public void insertDate(){
Date d=new Date();
     
     SimpleDateFormat ft = new SimpleDateFormat(" dd.MM.yyyy 'saa' hh:mm:ss  ");
  String reportDate = ft.format(d);
  this.Date_jLabel.setText(reportDate.toString());
   this.Date2_jLabel.setText(reportDate.toString());
  
}

public void insertName(){

try {
    
            Connection con = DBConn.myConn();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT outlet_owner FROM loan_coooler where approved_by_asm =1 AND approved_by_rsm=1 AND approved_by_contlr=1 AND contract=0");
        if(rs.next()) { 
        String customer = rs.getString("outlet_owner");
        CustomerName_jLabel.setText(customer);
       jLabelCustomer.setText(customer);
       
    }
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        }
    
}
public void insertOutletName(){

try {
    
            Connection con = DBConn.myConn();
            PreparedStatement stmt = con.prepareStatement("SELECT outlet_name FROM loan_coooler where approved_by_asm =1 AND approved_by_rsm=1 AND approved_by_contlr=1  AND outlet_owner =? ");
           
        String str =  CustomerName_jLabel.getText();                
 stmt.setString(1, str);
                
                 ResultSet rs = stmt.executeQuery();
            if(rs.next()) { 
        String outletName = rs.getString("outlet_name");
        outletNamejLabel.setText(outletName);
       
    }
            rs.close();
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(this, ex, ex.getMessage(), WIDTH, null);
        }
    
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerName_jLabel;
    private javax.swing.JLabel Date2_jLabel;
    private javax.swing.JLabel Date_jLabel;
    private javax.swing.JButton Print_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel outletNamejLabel;
    // End of variables declaration//GEN-END:variables
}
