
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PROPERTY_TYPE_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_TYPE_WINDOW
     */
    public PROPERTY_TYPE_WINDOW() {
        initComponents();
        
        
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(125,125,125));
        jPanel_Title.setBorder(panel_title_border);
   
        Border button_border = BorderFactory.createMatteBorder(3,3,3,3,new Color(255,255,255));
        Add_Type.setBorder(button_border);
        Edit_Type.setBorder(button_border);
        Remove_Type.setBorder(button_border);
        Refresh_Type.setBorder(button_border);
        
        fillTypeList();
    
    }

    
    public void fillTypeList(){
        P_TYPE type = new P_TYPE();
        
        HashMap<String,Integer> map = type.getTypesMap();
        DefaultListModel listModel =  new DefaultListModel();
        int i =0;
        
        
        for(String typeName: map.keySet()){
            listModel.add(i, typeName);
        
            i++;
        
        }
        jList1.setModel(listModel);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        Refresh_Type = new javax.swing.JButton();
        Edit_Type = new javax.swing.JButton();
        Remove_Type = new javax.swing.JButton();
        Add_Type = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Type");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Description:");

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        Refresh_Type.setBackground(new java.awt.Color(255, 204, 0));
        Refresh_Type.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Refresh_Type.setText("Refresh");
        Refresh_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_TypeActionPerformed(evt);
            }
        });

        Edit_Type.setBackground(new java.awt.Color(0, 102, 153));
        Edit_Type.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Edit_Type.setForeground(new java.awt.Color(255, 255, 255));
        Edit_Type.setText("Edit");
        Edit_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_TypeActionPerformed(evt);
            }
        });

        Remove_Type.setBackground(new java.awt.Color(255, 51, 0));
        Remove_Type.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Remove_Type.setForeground(new java.awt.Color(255, 255, 255));
        Remove_Type.setText("Remove");
        Remove_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remove_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_TypeActionPerformed(evt);
            }
        });

        Add_Type.setBackground(new java.awt.Color(0, 153, 51));
        Add_Type.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Add_Type.setForeground(new java.awt.Color(255, 255, 255));
        Add_Type.setText("Add");
        Add_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_TypeActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName))
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Refresh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
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

    private void Add_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_TypeActionPerformed
        String name = txtName.getText();
        String description = txtDescription.getText();
        
        P_TYPE type = new P_TYPE(0,name,description);
        
        if (!name.trim().equals("")) {
            if (type.execTypeQuery("add", type)) {

                JOptionPane.showMessageDialog(null, "New Type Added", "Add Type", 1);

            } else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Add Type", 2);

            }
        }else{
                JOptionPane.showMessageDialog(null, "Enter The Type Name", "Empty", 2);
  
        }
        
    }//GEN-LAST:event_Add_TypeActionPerformed

    private void Edit_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_TypeActionPerformed
        try {

            Integer id = Integer.valueOf(txtId.getText());
            String name = txtName.getText();
            String description = txtDescription.getText();

            P_TYPE type = new P_TYPE(id, name, description);

            if (!name.trim().equals("")) {
                if (type.execTypeQuery("edit", type)) {

                    JOptionPane.showMessageDialog(null, "Type Updated", "Edit Type", 1);

                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Edit Type", 2);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter The Type Name", "Empty", 2);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"Enter a Valid Type Id", "Invalid Id", 0);

        }

    }//GEN-LAST:event_Edit_TypeActionPerformed

    private void Remove_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_TypeActionPerformed
      

        try {
            Integer id = Integer.valueOf(txtId.getText());

            P_TYPE type = new P_TYPE(id, "", "");

            if (!txtId.getText().trim().equals("")) {

                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this type", "Delete Type", JOptionPane.YES_NO_OPTION);

                if (yes_or_no == JOptionPane.YES_OPTION) {
                    if (type.execTypeQuery("remove", type)) {

                        JOptionPane.showMessageDialog(null, "Type Deleted", "Delete Type", 1);
                        
                        txtId.setText("");
                        txtName.setText("");
                        txtDescription.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Delete Type", 2);

                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Enter The Type Id", "Empty Id", 2);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Enter a Valid Type Id", "Invalid Id", 0);

        }

    }//GEN-LAST:event_Remove_TypeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
     
        P_TYPE type = new P_TYPE();
        
        HashMap<String,Integer> map = type.getTypesMap();
        
        Integer typeId = map.get(jList1.getSelectedValue().toString());
        type = type.getTypeById(typeId);
        txtId.setText(Integer.toString(type.getId()));
        txtName.setText(type.getName());
        txtDescription.setText(type.getDescription());
               
    }//GEN-LAST:event_jList1MouseClicked

    private void Refresh_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_TypeActionPerformed
        
        fillTypeList();
        
    }//GEN-LAST:event_Refresh_TypeActionPerformed

    
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
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_TYPE_WINDOW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Type;
    private javax.swing.JButton Edit_Type;
    private javax.swing.JButton Refresh_Type;
    private javax.swing.JButton Remove_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
