
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class PROPERTY_IMAGES_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_IMAGES_WINDOW
     */
    P_TYPE type = new P_TYPE();
    HashMap<String, Integer> map = type.getTypesMap();
    String property_image_path = "";
    int propertyId = 0;

    public PROPERTY_IMAGES_WINDOW() {
        initComponents();

        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(255, 255, 255));
        jPanel_Title.setBorder(panel_title_border);

        Border JImage_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255));
        JImage.setBorder(JImage_border);

        bindCombo();
        fillJtableWithPropertiesData();

        properties.setRowHeight(40);
        properties.setSelectionBackground(new Color(27, 150, 77));
        properties.getColumnModel().getColumn(0).setPreferredWidth(25);
        properties.getColumnModel().getColumn(1).setPreferredWidth(250);
    }

    public void bindCombo() {
        for (String s : map.keySet()) {
            types.addItem(s);
        }
    }

    public void fillJtableWithPropertiesData() {
        P_PROPERTY property = new P_PROPERTY();

        ArrayList<P_PROPERTY> propertyList = property.propertiesList();

        String[] colNames = {"Id", "address"};
        Object[][] rows = new Object[propertyList.size()][2];

        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();

            rows[i][1] = propertyList.get(i).getAddress();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        properties.setModel(model);

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
        Show_Images = new javax.swing.JButton();
        Remove_Image = new javax.swing.JButton();
        Add_Image = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        types = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        properties = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnBrowseImage = new javax.swing.JButton();
        JImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel_Title.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property - Images");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(419, 419, 419))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Show_Images.setBackground(new java.awt.Color(0, 102, 153));
        Show_Images.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Show_Images.setForeground(new java.awt.Color(255, 255, 255));
        Show_Images.setText("Show This Property Images");
        Show_Images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show_Images.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_ImagesActionPerformed(evt);
            }
        });

        Remove_Image.setBackground(new java.awt.Color(255, 51, 0));
        Remove_Image.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Remove_Image.setForeground(new java.awt.Color(255, 255, 255));
        Remove_Image.setText("Remove");
        Remove_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Remove_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_ImageActionPerformed(evt);
            }
        });

        Add_Image.setBackground(new java.awt.Color(0, 153, 51));
        Add_Image.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Add_Image.setForeground(new java.awt.Color(255, 255, 255));
        Add_Image.setText("Add");
        Add_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ImageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a Type:");

        types.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typesActionPerformed(evt);
            }
        });

        properties.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propertiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(properties);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Image:");

        btnBrowseImage.setBackground(new java.awt.Color(255, 204, 51));
        btnBrowseImage.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBrowseImage.setText("Browse");
        btnBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseImageActionPerformed(evt);
            }
        });

        JImage.setBackground(new java.awt.Color(255, 204, 204));
        JImage.setOpaque(true);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>*this table contains the properties id and address<BR>"
            + "click on the button to show the images slider.</html>");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>*this list contains the images id<BR> of the selected property.<BR>(Select the property from the table) </html>");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>*select an item from list to display<BR> or browse an item from your computer. </html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Show_Images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(types, 0, 188, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Remove_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBrowseImage, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                        .addComponent(Add_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(types, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBrowseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remove_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ImageActionPerformed

        P_PROPERTY property = new P_PROPERTY();

        if (propertyId != 0) {
            if (property.addImage(propertyId, property_image_path)) {
                JOptionPane.showMessageDialog(null, "Image Added to this property.", "Add Image", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Image Not Added to this property.", "Add Image", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select the property First.", "Property Not Selected", 2);
        }

    }//GEN-LAST:event_Add_ImageActionPerformed

    private void Remove_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_ImageActionPerformed
        try {
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId = Integer.valueOf(selectedListItem);

            int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this image", "Delete image", JOptionPane.YES_NO_OPTION);

            if (yes_or_no == JOptionPane.YES_OPTION) {
                if (new P_PROPERTY().removePropertyImage(imageId)) {

                    JOptionPane.showMessageDialog(null, "Property Image Deleted", "Delete Image", 1);
                    JImage.setIcon(null);

                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed,Image Not Deleted", "Delete Image", 2);

                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No Image selected", "Delete property", 2);

        }

    }//GEN-LAST:event_Remove_ImageActionPerformed

    private void Show_ImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_ImagesActionPerformed

        try {
            int rowIndex = properties.getSelectedRow();
            int id = Integer.valueOf(properties.getValueAt(rowIndex, 0).toString());

            if (jList1.getModel().getSize() > 0) {
                PROPERTY_IMAGE_SLIDER imagesSliderform = new PROPERTY_IMAGE_SLIDER(id);
                imagesSliderform.setVisible(true);
                imagesSliderform.pack();
                imagesSliderform.setLocationRelativeTo(null);
                imagesSliderform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }else{
                JOptionPane.showMessageDialog(null, "This Property doesn't have any image to show.", "No image found", 2);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Select the property First.", "Property Not Selected", 2);

        }


    }//GEN-LAST:event_Show_ImagesActionPerformed

    private void typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typesActionPerformed

        int typeId = map.get(types.getSelectedItem().toString());
        P_PROPERTY property = new P_PROPERTY();

        ArrayList<P_PROPERTY> propertyList = property.propertiesListByType(typeId);

        String[] colNames = {"Id", "address"};
        Object[][] rows = new Object[propertyList.size()][2];

        for (int i = 0; i < propertyList.size(); i++) {
            rows[i][0] = propertyList.get(i).getId();

            rows[i][1] = propertyList.get(i).getAddress();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        properties.setModel(model);


    }//GEN-LAST:event_typesActionPerformed

    public ImageIcon resizeImage(String path, byte[] byteImage) {
        ImageIcon pic;
        if (byteImage != null) {
            pic = new ImageIcon(byteImage);
        } else {
            pic = new ImageIcon(path);
        }

        Image img = pic.getImage().getScaledInstance(JImage.getWidth(), JImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        return image;
    }

    private void btnBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseImageActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select the property Image");
        fileChooser.setCurrentDirectory(new File("C:\\images"));//where the images  are located

        FileNameExtensionFilter fillFilter = new FileNameExtensionFilter("Images", ".jpg", ".png", ".jpeg");
        fileChooser.addChoosableFileFilter(fillFilter);

        int fileState = fileChooser.showSaveDialog(null);

        if (fileState == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            JImage.setIcon(resizeImage(path, null));
            property_image_path = path;
        }
    }//GEN-LAST:event_btnBrowseImageActionPerformed

    private void propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesMouseClicked
        int rowIndex = properties.getSelectedRow();
        propertyId = Integer.valueOf(properties.getValueAt(rowIndex, 0).toString());


        fillTypeList();
    }//GEN-LAST:event_propertiesMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        try {
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId = Integer.valueOf(selectedListItem);
            byte[] images = new P_PROPERTY().getImageById(imageId);
            JImage.setIcon(resizeImage("", images));
            
        } catch (Exception ex) {
            
        }
        
    }//GEN-LAST:event_jList1MouseClicked

    public void fillTypeList() {
        P_TYPE type = new P_TYPE();

        HashMap<byte[], Integer> imagesListMap = new P_PROPERTY().propertyImagesList(propertyId);
        DefaultListModel listModel = new DefaultListModel();
        int i = 0;


        for (Integer Id : imagesListMap.values()) {
            listModel.add(i, Id);

            i++;

        }
        jList1.setModel(listModel);
    }

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
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_IMAGES_WINDOW().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Image;
    private javax.swing.JLabel JImage;
    private javax.swing.JButton Remove_Image;
    private javax.swing.JButton Show_Images;
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable properties;
    private javax.swing.JComboBox types;
    // End of variables declaration//GEN-END:variables
}
