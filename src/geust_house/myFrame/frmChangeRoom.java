/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geust_house.myFrame;

import  geust_house.guesthouse.DataConnection;
import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIENGHORN
 */
public class frmChangeRoom extends javax.swing.JFrame {

    DataConnection data = new DataConnection();
    Statement stm;
    DefaultComboBoxModel cmb = new DefaultComboBoxModel<>();
    ResultSet res;
    Calendar cal = Calendar.getInstance();
    PreparedStatement pst = null;
    SimpleDateFormat frm = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
    DecimalFormat df = new DecimalFormat("$0.00");
    int fRoom,tRoom,fCheck_in_id,fCus_id,child,adult;
    Date check_in_date=null;
    float pay;
    public frmChangeRoom() {
        try {
            try {
                initComponents();
                lblDate.setText(new SimpleDateFormat("dd / MMM /YYYY").format(cal.getTime()));
                pst=data.getConnectio().prepareStatement(SqlConfigString.SELECT_ROOM);
                pst.setString(1,"Check In");
                res=pst.executeQuery();
                while(res.next()){
                    cmbFromRoom.addItem(res.getInt(1)+"");
                }
                res.close();
            } catch (SQLException ex) {
                Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
            pst=data.getConnectio().prepareStatement(SqlConfigString.SELECT_ROOM);
            pst.setString(1,"Avaiable");
            res=pst.executeQuery();
            while(res.next()){
                cmbRoom.addItem(res.getInt(1)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DateOut = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        cmbFromRoom = new javax.swing.JComboBox<>();
        cmbRoom = new javax.swing.JComboBox<>();
        ChangeRoom = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Change Room");

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rate information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("To Room");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Date Out");

        DateOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateOutPropertyChange(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("From Room");

        jLabel3.setText("Date : ");

        lblDate.setText("   ");

        cmbFromRoom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbFromRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room" }));
        cmbFromRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFromRoomMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbFromRoomMouseReleased(evt);
            }
        });

        cmbRoom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room" }));
        cmbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbRoomMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbRoomMouseReleased(evt);
            }
        });
        cmbRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomActionPerformed(evt);
            }
        });

        ChangeRoom.setBackground(new java.awt.Color(0, 102, 102));
        ChangeRoom.setText("Change");
        ChangeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeRoomActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbFromRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DateOut, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ChangeRoom)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDate))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbFromRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(ChangeRoom))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ChangeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeRoomActionPerformed
        try {
            fRoom=Integer.parseInt(cmbFromRoom.getSelectedItem().toString());
            tRoom=Integer.parseInt(cmbRoom.getSelectedItem().toString());
            //update Prevoius Room Status to Available
            pst=data.getConnectio().prepareStatement(SqlConfigString.UPDATE_ROOM);
            pst.setInt(1, 1);
            pst.setInt(2,fRoom);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Update previous room status successfully");
            //update Current Room status to Check In
            pst=data.getConnectio().prepareStatement(SqlConfigString.UPDATE_ROOM);
            pst.setInt(1,3);
            pst.setInt(2,tRoom);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Update current room status successfully");
            //get the information from previous room
            pst=data.getConnectio().prepareStatement(SqlConfigString.GET_CHECKIN_ID_AND_ROOMID_FOR_CHANGE_ROOM);
            pst.setInt(1,fRoom);
            res=pst.executeQuery();
            while(res.next()){
                fCheck_in_id=res.getInt(1);
                fCus_id=res.getInt(2);
                check_in_date=res.getDate(3);
                adult=res.getInt(4);
                child=res.getInt(5);
                pay=res.getFloat(6);
            }
            res.close();
            //find the duration of staying in previous room
            int dur=(int) (cal.getTime().getTime()-check_in_date.getTime())/(1000*3600*24);
            JOptionPane.showMessageDialog(this, "Time"+dur);
            //select Room Price 
           pst=data.getConnectio().prepareStatement(SqlConfigString.SELECT_ROOMPRICE);
           pst.setInt(1,fRoom);
           pst.setInt(2,6);
           res=pst.executeQuery();
           float price=0,fPrice=0;  
           while(res.next()){
               price=res.getFloat(1);
           }
           res.close();
           fPrice=dur*price;
            //check out prevous room & insert into check out table
            pst=data.getConnectio().prepareStatement(SqlConfigString.INSERT_INTO_CHECK_OUT);
            pst.setString(1,frm.format(cal.getTime()));
            pst.setInt(2, fCheck_in_id);
            pst.setInt(3, 1);
            pst.setInt(4,fCus_id);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Check Out Previous Room Sucessfully");
             //getMax ID of Checkout_iD
             pst=data.getConnectio().prepareStatement(SqlConfigString.GET_MAX_CHECKOUT_ID);
             res=pst.executeQuery();
             int check_out_id=0;
             while(res.next()){
               check_out_id=res.getInt(1);
             }
             res.close();
            //insert into check out detail
            pst=data.getConnectio().prepareStatement(SqlConfigString.INSERT_INTO_CHECK_OUT_DETAL);
            pst.setInt(1,check_out_id);
            pst.setInt(2,fRoom);
            pst.setFloat(3,fPrice);
            pst.setFloat(4, 0);
            pst.execute();
            pst.close();
            int book_id=0;
             pst=data.getConnectio().prepareStatement(SqlConfigString.CHECK_BOOK_PRICE_OF_ROOM);
             pst.setInt(1, fRoom);
             res=pst.executeQuery();
             while(res.next()){
                 book_id=res.getInt(1);
             }
             res.close();
             JOptionPane.showMessageDialog(this, book_id);
            //insert into new check in of current room 
            pst=data.getConnectio().prepareStatement(SqlConfigString.INSERT_INTO_CHECKIN);
            pst.setInt(1, 1);
            pst.setInt(2, book_id);
            pst.setInt(3, fCus_id);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Check In New Room Sucessfully");
            //get last Record of Check In
            int check_in_id=0;
            pst=data.getConnectio().prepareStatement(SqlConfigString.SELECT_CHECKIN_ID);
            res=pst.executeQuery();
            while(res.next()){
                check_in_id=res.getInt(1);
            }
            res.close();
            //select room price
            int d=(int) (DateOut.getDate().getTime()-cal.getTimeInMillis())/(1000*3600*24);
            //select Room Price 
           pst=data.getConnectio().prepareStatement(SqlConfigString.SELECT_ROOMPRICE);
           pst.setInt(1,fRoom);
           pst.setInt(2,6);
           res=pst.executeQuery();
           float p=0,tPrice=0;
           while(res.next()){
               p=res.getFloat(1);
           }
           res.close();
           tPrice=d*p;
            //insert into check in detail
            pst=data.getConnectio().prepareStatement(SqlConfigString.INSERT_INTO_CHECKIN_DETAIL);
            pst.setInt(1, check_in_id);
            pst.setInt(2,tRoom);
            pst.setString(3,frm.format(cal.getTime()));
            pst.setString(4,frm.format(DateOut.getDate()));
            pst.setInt(5,child);
            pst.setInt(6,adult);
            pst.setFloat(7, pay);
            pst.setFloat(8, tPrice);
            pst.execute();
            pst.close();
            //insert into change room
            pst=data.getConnectio().prepareStatement(SqlConfigString.INSERT_INTO_CHANGE_ROOM);
            pst.setString(1,frm.format(cal.getTime()));
            pst.setInt(2,fCheck_in_id);
            pst.setInt(3,fRoom);
            pst.setInt(4,1);
            pst.setInt(5,fCus_id);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Change Room Sucessfully");
            //select last record of change room
            int changeroom_id=0;
             pst=data.getConnectio().prepareStatement(SqlConfigString.SELECT_LASTRECORD_CHNAGEROOM);
             res=pst.executeQuery();
             while(res.next()){
                 changeroom_id=res.getInt(1);
             }
             res.close();
            //insert into Change room detail
             pst=data.getConnectio().prepareStatement(SqlConfigString.INSERT_INTO_CHANGEROOM_DETAIL);
            pst.setInt(1,changeroom_id);
            pst.setInt(2,check_in_id);
            pst.setInt(3,tRoom);
            pst.setFloat(4,fPrice);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(this,"Change Room has been Sucessfully");
        } catch (SQLException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmChangeRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChangeRoomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DateOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateOutPropertyChange

  
    }//GEN-LAST:event_DateOutPropertyChange

    private void cmbFromRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFromRoomMouseClicked

    }//GEN-LAST:event_cmbFromRoomMouseClicked

    private void cmbFromRoomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFromRoomMouseReleased
        
    }//GEN-LAST:event_cmbFromRoomMouseReleased

    private void cmbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbRoomMouseClicked
      try {
            //create dialog box for choosing room
            JDialog j = new JDialog();
            DefaultTableModel mod = new DefaultTableModel();
            JTable tbl = new JTable();
            JButton b = new JButton("OK");
            mod.addColumn("Roomnumber");
            mod.addColumn("Floor");
            mod.addColumn("Description");
            mod.addColumn("Price");
            tbl.setModel(mod);
            //get the avaiable room
            pst = data.getConnectio().prepareStatement(SqlConfigString.SELECT_ROOM);
            pst.setString(1, "Avaiable");
            res = pst.executeQuery();
            while (res.next()) {
                mod.addRow(new Object[]{res.getInt(1), res.getInt(2), res.getString(3), res.getFloat(4)});
            }
            res.close();
            j.add(tbl, BorderLayout.CENTER);
            j.add(tbl);

            j.setSize(800, 700);
            j.setLocationRelativeTo(new JFrame());
            j.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            j.setVisible(true);
            j.pack();
            tbl.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent pce) {
                    if (tbl.isRowSelected(tbl.getSelectedRow())) {
                        j.setVisible(false);
                        cmbRoom.setSelectedIndex((tbl.getSelectedRow()+ 1));
                    }
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(frmDirectCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmDirectCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmDirectCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmDirectCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbRoomMouseClicked

    private void cmbRoomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbRoomMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomMouseReleased

    private void cmbRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmChangeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChangeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChangeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChangeRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChangeRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeRoom;
    private com.toedter.calendar.JDateChooser DateOut;
    private javax.swing.JComboBox<String> cmbFromRoom;
    private javax.swing.JComboBox<String> cmbRoom;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDate;
    // End of variables declaration//GEN-END:variables
}
