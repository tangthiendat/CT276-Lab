/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ttdat.swing;

import java.awt.event.ActionEvent;

/**
 *
 * @author Admin
 */
public class StudentInformation extends javax.swing.JFrame {

    /**
     * Creates new form FrameExample
     */
    public StudentInformation() {
        initComponents();
        setUpAction();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_MSSV = new javax.swing.JLabel();
        tf_MSSV = new javax.swing.JTextField();
        tf_hoTen = new javax.swing.JTextField();
        lb_hoTen = new javax.swing.JLabel();
        tf_namSinh = new javax.swing.JTextField();
        lb_namSinh = new javax.swing.JLabel();
        tf_queQuan = new javax.swing.JTextField();
        lb_queQuan = new javax.swing.JLabel();
        lb_diaChi = new javax.swing.JLabel();
        tf_diaChi = new javax.swing.JTextField();
        lb_diemTB = new javax.swing.JLabel();
        tf_diemTB = new javax.swing.JTextField();
        tf_xepLoai = new javax.swing.JTextField();
        lb_xepLoai = new javax.swing.JLabel();
        ketQua = new javax.swing.JPanel();
        lb_kq_MSSV = new javax.swing.JLabel();
        kq_MSSV = new javax.swing.JLabel();
        kq_hoTen = new javax.swing.JLabel();
        lb_kq_hoTen = new javax.swing.JLabel();
        lb_kq_namSinh = new javax.swing.JLabel();
        kq_namSinh = new javax.swing.JLabel();
        kq_queQuan = new javax.swing.JLabel();
        lb_kq_queQuan = new javax.swing.JLabel();
        kq_diaChi = new javax.swing.JLabel();
        lb_kq_diaChi = new javax.swing.JLabel();
        lb_kq_diemTB = new javax.swing.JLabel();
        kq_diemTB = new javax.swing.JLabel();
        kq_xepLoai = new javax.swing.JLabel();
        lb_kq_xepLoai = new javax.swing.JLabel();
        btn_xepLoai = new javax.swing.JButton();
        btn_xemKetQua = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_MSSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_MSSV.setText("Mã số sinh viên");

        tf_MSSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_MSSV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tf_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_hoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_hoTen.setText("Họ và tên");

        tf_namSinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_namSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_namSinh.setText("Năm sinh");

        tf_queQuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_queQuan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_queQuan.setText("Quê quán");

        lb_diaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_diaChi.setText("Địa chỉ");

        tf_diaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_diemTB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_diemTB.setText("Điểm trung bình");

        tf_diemTB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tf_xepLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_xepLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_xepLoai.setText("Xếp loại");

        lb_kq_MSSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_MSSV.setText("Mã số sinh viên");

        kq_MSSV.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_MSSV.setText("None");

        kq_hoTen.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_hoTen.setText("None");

        lb_kq_hoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_hoTen.setText("Họ và tên");

        lb_kq_namSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_namSinh.setText("Năm sinh");

        kq_namSinh.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_namSinh.setText("None");

        kq_queQuan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_queQuan.setText("None");

        lb_kq_queQuan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_queQuan.setText("Quê quán");

        kq_diaChi.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_diaChi.setText("None");

        lb_kq_diaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_diaChi.setText("Địa chỉ");

        lb_kq_diemTB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_diemTB.setText("Điểm trung bình");

        kq_diemTB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_diemTB.setText("None");

        kq_xepLoai.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        kq_xepLoai.setText("None");

        lb_kq_xepLoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_kq_xepLoai.setText("Xếp loại");

        javax.swing.GroupLayout ketQuaLayout = new javax.swing.GroupLayout(ketQua);
        ketQua.setLayout(ketQuaLayout);
        ketQuaLayout.setHorizontalGroup(
            ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ketQuaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ketQuaLayout.createSequentialGroup()
                            .addComponent(lb_kq_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(kq_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ketQuaLayout.createSequentialGroup()
                            .addComponent(lb_kq_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(kq_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addComponent(lb_kq_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(kq_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addComponent(lb_kq_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(kq_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addComponent(lb_kq_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(kq_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addComponent(lb_kq_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(kq_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addComponent(lb_kq_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(kq_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        ketQuaLayout.setVerticalGroup(
            ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ketQuaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_kq_MSSV)
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(kq_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kq_hoTen)
                    .addComponent(kq_hoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kq_namSinh)
                    .addComponent(kq_namSinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kq_queQuan)
                    .addComponent(kq_queQuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_kq_diaChi)
                    .addGroup(ketQuaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(kq_diaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kq_diemTB)
                    .addComponent(kq_diemTB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ketQuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_kq_xepLoai)
                    .addComponent(kq_xepLoai))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_xepLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_xepLoai.setText("Xếp loại");

        btn_xemKetQua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_xemKetQua.setText("Xem kết quả");
        btn_xemKetQua.setPreferredSize(new java.awt.Dimension(96, 31));

        btn_thoat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_thoat.setText("Thoát");
        btn_thoat.setPreferredSize(new java.awt.Dimension(72, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(tf_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xemKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ketQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_MSSV)
                    .addComponent(tf_MSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_namSinh)
                    .addComponent(tf_namSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_queQuan)
                    .addComponent(tf_queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_diaChi)
                    .addComponent(tf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_diemTB)
                    .addComponent(tf_diemTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_xepLoai)
                    .addComponent(tf_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_xemKetQua, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_xepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(ketQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            StudentInformation studentInformation = new StudentInformation();
            studentInformation.setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xemKetQua;
    private javax.swing.JButton btn_xepLoai;
    private javax.swing.JPanel ketQua;
    private javax.swing.JLabel kq_MSSV;
    private javax.swing.JLabel kq_diaChi;
    private javax.swing.JLabel kq_diemTB;
    private javax.swing.JLabel kq_hoTen;
    private javax.swing.JLabel kq_namSinh;
    private javax.swing.JLabel kq_queQuan;
    private javax.swing.JLabel kq_xepLoai;
    private javax.swing.JLabel lb_MSSV;
    private javax.swing.JLabel lb_diaChi;
    private javax.swing.JLabel lb_diemTB;
    private javax.swing.JLabel lb_hoTen;
    private javax.swing.JLabel lb_kq_MSSV;
    private javax.swing.JLabel lb_kq_diaChi;
    private javax.swing.JLabel lb_kq_diemTB;
    private javax.swing.JLabel lb_kq_hoTen;
    private javax.swing.JLabel lb_kq_namSinh;
    private javax.swing.JLabel lb_kq_queQuan;
    private javax.swing.JLabel lb_kq_xepLoai;
    private javax.swing.JLabel lb_namSinh;
    private javax.swing.JLabel lb_queQuan;
    private javax.swing.JLabel lb_xepLoai;
    private javax.swing.JTextField tf_MSSV;
    private javax.swing.JTextField tf_diaChi;
    private javax.swing.JTextField tf_diemTB;
    private javax.swing.JTextField tf_hoTen;
    private javax.swing.JTextField tf_namSinh;
    private javax.swing.JTextField tf_queQuan;
    private javax.swing.JTextField tf_xepLoai;
    // End of variables declaration//GEN-END:variables

    private void setUpAction(){
        btn_xepLoai.addActionListener((ActionEvent e) -> {
            classification();
        });
        
        btn_xemKetQua.addActionListener((ActionEvent e) -> {
            showResults();
        });
        
        btn_thoat.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        

    }
    
    private void showResults(){
        kq_MSSV.setText(tf_MSSV.getText());
        kq_hoTen.setText(tf_hoTen.getText());
        kq_namSinh.setText(tf_namSinh.getText());
        kq_queQuan.setText(tf_queQuan.getText());
        kq_diaChi.setText(tf_diaChi.getText());
        kq_diemTB.setText(tf_diemTB.getText());
        kq_xepLoai.setText(tf_xepLoai.getText());
    }
    
    private void classification(){
        float diemTB = Float.parseFloat(tf_diemTB.getText());
        String xepLoai;
        if(diemTB >= 9 && diemTB <= 10){
            xepLoai = "A";
        } else if(diemTB >= 8){
            xepLoai = "B+";
        } else if(diemTB >= 7){
            xepLoai = "B";
        } else if(diemTB >= 6.5){
            xepLoai = "C+";
        } else if(diemTB >= 5.5){
            xepLoai = "C";
        } else if(diemTB >= 4){
            xepLoai = "D";
        } else{
            xepLoai = "F";
        }
        tf_xepLoai.setText(xepLoai);
    }
    
}
