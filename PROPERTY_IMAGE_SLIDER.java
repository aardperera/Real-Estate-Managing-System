
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;


public class PROPERTY_IMAGE_SLIDER extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_IMAGE_SLIDER
     */
    
    static int propertyId;
    
    ArrayList<byte[]> imagesList;
    
    int index = 0;//image index
    
    public PROPERTY_IMAGE_SLIDER(int pId) {
        initComponents();
        
        this.propertyId = pId;
        
        Border jLable_image_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_Image.setBorder(jLable_image_border);
       
        Border jLable_nav_border = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255,69,0));
        jLabel_Next.setBorder(jLable_nav_border);
        jLabel_Previous.setBorder(jLable_nav_border);
        
        HashMap<byte[],Integer> map = new P_PROPERTY().propertyImagesList(propertyId);
        imagesList = new ArrayList<byte[]>(map.keySet());
        
        displayImage(index);
    }

    public void displayImage(int imageIndex){
        Image img = new ImageIcon(imagesList.get(imageIndex)).getImage().getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        jLabel_Image.setIcon(image);
        
        
        
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
        jLabel_Image = new javax.swing.JLabel();
        jLabel_Previous = new javax.swing.JLabel();
        jLabel_Next = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Image.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Image.setOpaque(true);

        jLabel_Previous.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Previous.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel_Previous.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Previous.setText("<");
        jLabel_Previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Previous.setOpaque(true);
        jLabel_Previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PreviousMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PreviousMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PreviousMouseExited(evt);
            }
        });

        jLabel_Next.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Next.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel_Next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Next.setText(">");
        jLabel_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Next.setOpaque(true);
        jLabel_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_NextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_NextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(465, 465, 465)
                        .addComponent(jLabel_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NextMouseClicked
       
        index++;
        
        if(index >= imagesList.size()) index = imagesList.size() - 1;
        
        displayImage(index);
        
    }//GEN-LAST:event_jLabel_NextMouseClicked

    private void jLabel_PreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PreviousMouseClicked
       
        index--;
        
        if(index < 0) index = 0;
        
        displayImage(index);
    }//GEN-LAST:event_jLabel_PreviousMouseClicked

    private void jLabel_NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NextMouseEntered

        jLabel_Next.setBackground(new Color(255,69,0));
        jLabel_Next.setForeground(Color.white);
        
        
    }//GEN-LAST:event_jLabel_NextMouseEntered

    private void jLabel_NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_NextMouseExited

        
        jLabel_Next.setBackground(Color.white);
        jLabel_Next.setForeground(Color.black);
        
        
    }//GEN-LAST:event_jLabel_NextMouseExited

    private void jLabel_PreviousMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PreviousMouseEntered

        jLabel_Previous.setBackground(new Color(255,69,0));
        jLabel_Previous.setForeground(Color.white);
        
        
        
    }//GEN-LAST:event_jLabel_PreviousMouseEntered

    private void jLabel_PreviousMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PreviousMouseExited

        jLabel_Previous.setBackground(Color.white);
        jLabel_Previous.setForeground(Color.black);
        
        
        
    }//GEN-LAST:event_jLabel_PreviousMouseExited

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
            java.util.logging.Logger.getLogger(PROPERTY_IMAGE_SLIDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGE_SLIDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGE_SLIDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGE_SLIDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_IMAGE_SLIDER(propertyId).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Next;
    private javax.swing.JLabel jLabel_Previous;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
