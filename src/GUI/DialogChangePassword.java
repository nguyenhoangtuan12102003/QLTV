/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI;

import BUS.AccountBUS;
import DAL.AccountDAL;
import DTO.AccountDTO;
import static GUI.LoginGUI.taikhoan;
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DialogChangePassword extends javax.swing.JDialog {

    /**
     * Creates new form DialogChangePassword
     */
    public static ArrayList<AccountDTO> taikhoan = null;

    public DialogChangePassword() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldPasswordOld = new javax.swing.JTextField();
        textFieldPasswordNew = new javax.swing.JTextField();
        textFieldConfirmPassword = new javax.swing.JPasswordField();
        btnUpdatePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("THAY ĐỔI MẬT KHẨU");

        jLabel2.setText("Password Old");

        jLabel3.setText("Password New");

        jLabel4.setText("Confirm Password ");

        textFieldPasswordOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordOldActionPerformed(evt);
            }
        });

        btnUpdatePassword.setBackground(new java.awt.Color(102, 255, 0));
        btnUpdatePassword.setText("Update");
        btnUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(textFieldPasswordNew)
                            .addComponent(textFieldPasswordOld)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPasswordOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldPasswordOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordOldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswordOldActionPerformed


    private void btnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordActionPerformed
        String currentPassword = textFieldPasswordOld.getText();
        String newPassword = textFieldPasswordNew.getText();
        String confirmPassword = textFieldConfirmPassword.getText();
        if (currentPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập mật khẩu cũ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập mật khẩu mới.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "vui lòng nhập mật lại mật khẩu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        taikhoan = null;
        AccountBUS bus = new AccountBUS();

        taikhoan = bus.getDanhSachTL();

        boolean passwordMatch = false;

        for (AccountDTO taiKhoan : taikhoan) {
            if (currentPassword.equals(taiKhoan.getPassword().trim())) {
                passwordMatch = true;
                if (newPassword.equals(confirmPassword)) {
                    AccountDTO accountNew = new AccountDTO(taiKhoan.getUsername(), newPassword);
                    int updateResult = AccountDAL.updatePassword(accountNew);
                    if (updateResult > 0) {
                        JOptionPane.showMessageDialog(this, "Mật khẩu đã được thay đổi thành công.");
                        this.dispose();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Không thể thay đổi mật khẩu. Vui lòng thử lại sau.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Mật khẩu mới và xác nhận mật khẩu không khớp.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (!passwordMatch) {
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ không chính xác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdatePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(DialogChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogChangePassword dialog = new DialogChangePassword();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdatePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textFieldConfirmPassword;
    private javax.swing.JTextField textFieldPasswordNew;
    private javax.swing.JTextField textFieldPasswordOld;
    // End of variables declaration//GEN-END:variables
}
