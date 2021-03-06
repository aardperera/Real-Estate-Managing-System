
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class OWNER_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form OWNER_WINDOW
     */
    public OWNER_WINDOW() {
        initComponents();
        
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(60,70,200));
        jPanel_Title.setBorder(panel_title_border);
   
        Border button_border = BorderFactory.createMatteBorder(3,3,3,3,new Color(255,255,255));
        Add_Owner.setBorder(button_border);
        Edit_Owner.setBorder(button_border);
        Remove_Owner.setBorder(button_border);
        Refresh_Owner.setBorder(button_border);
        Owner_Properties.setBorder(button_border);
        
        fillJtableWithOwnersData();
    }

    
    public void fillJtableWithOwnersData(){
        P_OWNER owner = new P_OWNER();

        ArrayList<P_OWNER> ownersList= owner.ownerList();
        
        String[] colNames = {"ID","First Name","Last Name","Phone","Email","Address"};
        Object[][] rows = new Object[ownersList.size()][6];
        
        for(int i=0;i<ownersList.size();i++){
            rows[i][0] = ownersList.get(i).getId();
            rows[i][1]= ownersList.get(i).getFirstName();
            rows[i][2]= ownersList.get(i).getLastName();
            rows[i][3]=ownersList.get(i).getPhone();
            rows[i][4]=ownersList.get(i).getEmail();
            rows[i][5]=ownersList.get(i).getAddress();
            
        }
        
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable1.setModel(model);  
        
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new Color(235,47,6));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        
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
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        Refresh_Owner = new javax.swing.JButton();
        Edit_Owner = new javax.swing.JButton();
        Remove_Owner = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add_Owner = new javax.swing.JButton();
        Owner_Properties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 117, 242));

        jPanel_Title.setBackground(new java.awt.Color(96, 90, 223));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Owners");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Address:");

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        Refresh_Owner.setBackground(new java.awt.Color(255, 204, 0));
        Refresh_Owner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Refresh_Owner.setText("Refresh");
        Refresh_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_OwnerActionPerformed(evt);
            }
        });

        Edit_Owner.setBackground(new java.awt.Color(0, 102, 153));
        Edit_Owner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Edit_Owner.setForeground(new java.awt.Color(255, 255, 255));
        Edit_Owner.setText("Edit");
        Edit_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_OwnerActionPerformed(evt);
            }
        });

        Remove_Owner.setBackground(new java.awt.Color(255, 51, 0));
        Remove_Owner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Remove_Owner.setForeground(new java.awt.Color(255, 255, 255));
        Remove_Owner.setText("Remove");
        Remove_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remove_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_OwnerActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtLName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("First Name:");

        txtFName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        Add_Owner.setBackground(new java.awt.Color(0, 102, 0));
        Add_Owner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Add_Owner.setForeground(new java.awt.Color(255, 255, 255));
        Add_Owner.setText("Add");
        Add_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_OwnerActionPerformed(evt);
            }
        });

        Owner_Properties.setBackground(new java.awt.Color(255, 69, 0));
        Owner_Properties.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Owner_Properties.setForeground(new java.awt.Color(255, 255, 255));
        Owner_Properties.setText("Owner Properties");
        Owner_Properties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Owner_Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Owner_PropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Owner_Properties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Refresh_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Owner_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Edit_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_OwnerActionPerformed
       try{
        Integer ownerId = Integer.valueOf(txtId.getText());
        String fname = txtFName.getText();
        String lname = txtLName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        
        P_OWNER owner = new P_OWNER();
        
        if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the required information of the owner", "Add owner", 1);

        } else {
            if (owner.editOwnerData(new P_OWNER(ownerId, fname, lname, phone, email, address))) {
                JOptionPane.showMessageDialog(null, "Owner data Updated ", "Edit owner", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Owner data NOT Updated", "Edit owner", 2);

            }
        }   
       }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter valid owner Id", "Invalid Id", 2);

       }
        
        
        
    }//GEN-LAST:event_Edit_OwnerActionPerformed

    private void Remove_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_OwnerActionPerformed


        try {
            Integer ownerId = Integer.valueOf(txtId.getText());

            P_OWNER owner = new P_OWNER();

            if (!txtId.getText().trim().equals("")) {

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this Owner", "Delete Owner", JOptionPane.YES_NO_OPTION);

                if (yes_or_no == JOptionPane.YES_OPTION) {
                    if (owner.deleteOwnerData(ownerId)) {

                        JOptionPane.showMessageDialog(null, "Owner Deleted", "Delete owner", 1);
                        
                        txtId.setText("");
                        txtFName.setText("");
                        txtLName.setText("");
                        txtEmail.setText("");
                        txtPhone.setText("");
                        txtAddress.setText("");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delete owner", 2);

                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Enter The Owner Id", "Empty OwnerId", 2);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Enter a Valid Owner Id", "Invalid Id", 0);

        }
        
        
    }//GEN-LAST:event_Remove_OwnerActionPerformed

    private void Add_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_OwnerActionPerformed
        
        String fname = txtFName.getText();
        String lname = txtLName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        
        P_OWNER owner = new P_OWNER();
        
        if (fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("") || address.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter the required information of the owner", "Add owner", 1);

        } else {
            if (owner.addNewOwner(new P_OWNER(0, fname, lname, phone, email, address))) {
                JOptionPane.showMessageDialog(null, "New owner Added to the system", "Add owner", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Owner NOT Added to the system", "Add owner", 2);

            }
        }
        
    }//GEN-LAST:event_Add_OwnerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRowIndex = jTable1.getSelectedRow();
        txtId.setText(jTable1.getValueAt(selectedRowIndex, 0).toString());
        txtFName.setText(jTable1.getValueAt(selectedRowIndex, 1).toString());
        txtLName.setText(jTable1.getValueAt(selectedRowIndex, 2).toString());
        txtPhone.setText(jTable1.getValueAt(selectedRowIndex, 3).toString());
        txtEmail.setText(jTable1.getValueAt(selectedRowIndex, 4).toString());
        txtAddress.setText(jTable1.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void Refresh_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_OwnerActionPerformed
       
        fillJtableWithOwnersData();
        
        
    }//GEN-LAST:event_Refresh_OwnerActionPerformed

    private void Owner_PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Owner_PropertiesActionPerformed
        
        
        try{
           
            int selectedRowIndex = jTable1.getSelectedRow();
            int id = Integer.valueOf(jTable1.getValueAt(selectedRowIndex, 0).toString());
            
             Owner_Properties ownerPropertyform = new Owner_Properties(id);
            
            ownerPropertyform.ownerId =id;
            
            ownerPropertyform.setVisible(true);
            ownerPropertyform.pack();
            ownerPropertyform.setLocationRelativeTo(null);
            ownerPropertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select the owner from the table first.","No owner Selected",2);
        }
       
        
        
        
    }//GEN-LAST:event_Owner_PropertiesActionPerformed

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
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OWNER_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OWNER_WINDOW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Owner;
    private javax.swing.JButton Edit_Owner;
    private javax.swing.JButton Owner_Properties;
    private javax.swing.JButton Refresh_Owner;
    private javax.swing.JButton Remove_Owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
