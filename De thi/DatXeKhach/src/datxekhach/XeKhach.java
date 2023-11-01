/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datxekhach;

import java.awt.event.ActionEvent;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class XeKhach extends javax.swing.JFrame {

    /**
     * Creates new form Ticket
     */
    public XeKhach() {
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

        btngr_gioiTinh = new javax.swing.ButtonGroup();
        lb_stt = new javax.swing.JLabel();
        tf_stt = new javax.swing.JTextField();
        lb_hoTen = new javax.swing.JLabel();
        tf_hoTen = new javax.swing.JTextField();
        lb_gioiTinh = new javax.swing.JLabel();
        cbx_nam = new javax.swing.JRadioButton();
        cbx_nu = new javax.swing.JRadioButton();
        lb_doTuoi = new javax.swing.JLabel();
        cbbx_doTuoi = new javax.swing.JComboBox<>();
        lb_diaChi = new javax.swing.JLabel();
        sp_diaChi = new javax.swing.JScrollPane();
        tp_diaChi = new javax.swing.JTextPane();
        tf_dienThoai = new javax.swing.JTextField();
        lb_dienThoai = new javax.swing.JLabel();
        cbbx_tuyenDuong = new javax.swing.JComboBox<>();
        lb_tuyenDuong = new javax.swing.JLabel();
        cbbx_gioKhoiHanh = new javax.swing.JComboBox<>();
        lb_gioKhoiHanh = new javax.swing.JLabel();
        btn_datVe = new javax.swing.JButton();
        btn_huyBo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_stt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_stt.setText("STT");

        tf_stt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_hoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_hoTen.setText("Họ và tên");

        tf_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_gioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_gioiTinh.setText("Giới tính");

        btngr_gioiTinh.add(cbx_nam);
        cbx_nam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbx_nam.setText("Nam");

        btngr_gioiTinh.add(cbx_nu);
        cbx_nu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbx_nu.setText("Nữ");

        lb_doTuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_doTuoi.setText("Độ tuổi");

        cbbx_doTuoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbx_doTuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dưới 20", "20-30", "30-40", "Trên 40" }));

        lb_diaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_diaChi.setText("Địa chỉ");

        tp_diaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sp_diaChi.setViewportView(tp_diaChi);

        tf_dienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_dienThoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_dienThoai.setText("Điện thoại");

        cbbx_tuyenDuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbx_tuyenDuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cần Thơ - Châu Đốc", "Cần Thơ -  Sài Gòn" }));

        lb_tuyenDuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_tuyenDuong.setText("Tuyến đường");

        cbbx_gioKhoiHanh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbx_gioKhoiHanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3g45", "6g30" }));

        lb_gioKhoiHanh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_gioKhoiHanh.setText("Giờ khởi hành");

        btn_datVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_datVe.setText("Đặt vé");
        btn_datVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datVeActionPerformed(evt);
            }
        });

        btn_huyBo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_huyBo.setText("Hủy bỏ");
        btn_huyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyBoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_stt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_gioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_doTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_diaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_dienThoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_tuyenDuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_gioKhoiHanh, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbx_gioKhoiHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_stt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbx_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbx_doTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_datVe)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_huyBo))
                        .addComponent(cbbx_tuyenDuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_stt)
                    .addComponent(tf_stt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hoTen)
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_gioiTinh)
                    .addComponent(cbx_nam)
                    .addComponent(cbx_nu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_doTuoi)
                    .addComponent(cbbx_doTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_diaChi)
                    .addComponent(sp_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_dienThoai)
                    .addComponent(tf_dienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbx_tuyenDuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tuyenDuong))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbx_gioKhoiHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_gioKhoiHanh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_datVe)
                    .addComponent(btn_huyBo))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_datVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datVeActionPerformed
        String stt = tf_stt.getText();
        String hoTen = tf_hoTen.getText();
        String gioiTinh = getSelectedValue(btngr_gioiTinh);
        String doTuoi = (String) cbbx_doTuoi.getSelectedItem();
        String diaChi = tp_diaChi.getText();
        String dienThoai = tf_dienThoai.getText();
        String tuyenDuong = (String) cbbx_tuyenDuong.getSelectedItem();
        String gioKhoiHanh = (String) cbbx_gioKhoiHanh.getSelectedItem();

        if (!stt.matches("\\d+")) {
            System.err.println("STT nhap vao phai la so.");
        } else if (hoTen.isBlank()) {
            System.err.println("Ho ten khach hang khong duoc de trong.");
        } else if (diaChi.isBlank()) {
            System.err.println("Dia chi khong duoc de trong.");
        } else if (dienThoai.isBlank()) {
            System.err.println("Dien thoai lien lac khong duoc de trong.");
        } else{
            System.out.println("Ho ten: " + hoTen);
            System.out.println("Gioi tinh: " + gioiTinh);
            System.out.println("Do tuoi: " + doTuoi);
            System.out.println("Dia chi: " + diaChi);
            System.out.println("Dien thoai: " + dienThoai);
            System.out.println("Tuyen duong: " + tuyenDuong);
            System.out.println("Gio khoi hanh: " + gioKhoiHanh);
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl = "jdbc:sqlserver://MSI:1433;trustServerCertificate=true;databaseName=DatVeXe;user=sa;password=123456";
                Connection connection = DriverManager.getConnection(dbUrl);
                String sql = "INSERT INTO ve_xe(stt, ho_ten, gioi_tinh, do_tuoi, dia_chi, dien_thoai, tuyen_duong, gio_khoi_hanh)"
                        + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pt = connection.prepareStatement(sql);
                pt.setInt(1, Integer.parseInt(stt));
                pt.setString(2, hoTen);
                pt.setString(3, gioiTinh);
                pt.setString(4, doTuoi);
                pt.setString(5, diaChi);
                pt.setString(6, dienThoai);
                pt.setString(7, tuyenDuong);
                pt.setString(8, gioKhoiHanh);
                pt.executeUpdate();
                System.out.println("Dat ve thanh cong!");
                connection.close();
            } catch (Exception ex) {
                System.err.println("STT da ton tai. Dat ve that bai.");
            }
        }

      
    }//GEN-LAST:event_btn_datVeActionPerformed

    private void btn_huyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyBoActionPerformed
        tf_stt.setText("");
        tf_hoTen.setText("");
        btngr_gioiTinh.clearSelection();
        cbbx_doTuoi.setSelectedIndex(0);
        tp_diaChi.setText("");
        tf_dienThoai.setText("");
        cbbx_tuyenDuong.setSelectedIndex(0);
        cbbx_gioKhoiHanh.setSelectedIndex(0);
    }//GEN-LAST:event_btn_huyBoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XeKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XeKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XeKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XeKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            XeKhach ticket = new XeKhach();
            ticket.setTitle("Dat ve xe khach");
            ticket.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datVe;
    private javax.swing.JButton btn_huyBo;
    private javax.swing.ButtonGroup btngr_gioiTinh;
    private javax.swing.JComboBox<String> cbbx_doTuoi;
    private javax.swing.JComboBox<String> cbbx_gioKhoiHanh;
    private javax.swing.JComboBox<String> cbbx_tuyenDuong;
    private javax.swing.JRadioButton cbx_nam;
    private javax.swing.JRadioButton cbx_nu;
    private javax.swing.JLabel lb_diaChi;
    private javax.swing.JLabel lb_dienThoai;
    private javax.swing.JLabel lb_doTuoi;
    private javax.swing.JLabel lb_gioKhoiHanh;
    private javax.swing.JLabel lb_gioiTinh;
    private javax.swing.JLabel lb_hoTen;
    private javax.swing.JLabel lb_stt;
    private javax.swing.JLabel lb_tuyenDuong;
    private javax.swing.JScrollPane sp_diaChi;
    private javax.swing.JTextField tf_dienThoai;
    private javax.swing.JTextField tf_hoTen;
    private javax.swing.JTextField tf_stt;
    private javax.swing.JTextPane tp_diaChi;
    // End of variables declaration//GEN-END:variables


    private String getSelectedValue(ButtonGroup buttonGroup) {
        Enumeration<AbstractButton> allRadioButtons = buttonGroup.getElements();
        while (allRadioButtons.hasMoreElements()) {
            AbstractButton button = allRadioButtons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

}
