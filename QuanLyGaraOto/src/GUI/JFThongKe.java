/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.Connect;
import DAL.LoadData;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import net.sf.jasperreports.engine.xml.JRXmlDigesterFactory;
//import net.sf.jasperreports.engine.JRDataSource;
//import net.sf.jasperreports.engine.JREmptyDataSource;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.design.JasperDesign;
//import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import net.sf.jasperreports.view.JasperViewer;
import org.eclipse.persistence.internal.sessions.factories.model.property.PropertyConfig;
import org.jfree.base.config.PropertyFileConfiguration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author ThienNhut
 */
public class JFThongKe extends javax.swing.JFrame {
    public static String sqlCBNam = "SELECT DISTINCT NAM FROM BAOCAODOANHSO ";
    public static Connection con = Connect.getConnect();
    public static String getNamCB;
    
    public JFThongKe() {
        initComponents();
        ProcessCtr(false);
    }
    public void ProcessCtr(boolean b) {
       this.btnBCKH.setVisible(b);
       this.btnBCDT.setVisible(b);        
       this.btnBaoCao.setVisible(b);
       cbNam.setBackground(new Color(76, 173, 79));   
        LoadData.LoadDataCB(sqlCBNam, this.cbNam, "Nam");
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBCKH = new javax.swing.JButton();
        btnTKDT = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnTKKH = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBCDT = new javax.swing.JButton();
        btnBaoCao = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbNam = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnBCKH.setBackground(new java.awt.Color(76, 173, 79));
        btnBCKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBCKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BC3.png"))); // NOI18N
        btnBCKH.setText("BÁO CÁO TỒN KHO");
        btnBCKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBCKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBCKHMouseExited(evt);
            }
        });
        btnBCKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCKHActionPerformed(evt);
            }
        });

        btnTKDT.setBackground(new java.awt.Color(76, 173, 79));
        btnTKDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTKDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TK1.png"))); // NOI18N
        btnTKDT.setText("THỐNG KÊ DOANH THU");
        btnTKDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKDTMouseExited(evt);
            }
        });
        btnTKDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKDTActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(76, 173, 79));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TK2.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ HIỆU XE");
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnTKKH.setBackground(new java.awt.Color(76, 173, 79));
        btnTKKH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTKKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TK3.png"))); // NOI18N
        btnTKKH.setText("THỐNG KÊ TỒN KHO");
        btnTKKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTKKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTKKHMouseExited(evt);
            }
        });
        btnTKKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKKHActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(232, 64, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baocao.png"))); // NOI18N
        jLabel1.setText("THỐNG KÊ BÁO CÁO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBCDT.setBackground(new java.awt.Color(76, 173, 79));
        btnBCDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBCDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BC1.png"))); // NOI18N
        btnBCDT.setText("BÁO CÁO DOANH THU");
        btnBCDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBCDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBCDTMouseExited(evt);
            }
        });
        btnBCDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCDTActionPerformed(evt);
            }
        });

        btnBaoCao.setBackground(new java.awt.Color(76, 173, 79));
        btnBaoCao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BC2.png"))); // NOI18N
        btnBaoCao.setText("BÁO CÁO HIỆU XE");
        btnBaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBaoCaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBaoCaoMouseExited(evt);
            }
        });
        btnBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoActionPerformed(evt);
            }
        });

        btnTroLai.setBackground(new java.awt.Color(76, 173, 79));
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(76, 173, 79));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Trở lại");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Thoát");

        cbNam.setToolTipText("Chọn năm muốn thống kê");
        cbNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNamItemStateChanged(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chọn năm muốn thống kê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBCKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTKKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTKDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBCDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(11, 11, 11))
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTKKH, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBCKH, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTKDT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBCDT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))))
        );

        jpnThongKe.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKKHActionPerformed
        JFreeChart barChart = createBarChart(createDatasetBar());
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnThongKe.getWidth(), 321));
        jpnThongKe.removeAll();
        jpnThongKe.setLayout(new CardLayout());
        jpnThongKe.add(chartPanel);
        jpnThongKe.validate();
        jpnThongKe.repaint();
        this.btnBCKH.setVisible(true);
    }//GEN-LAST:event_btnTKKHActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed

        JFreeChart pieChart = createPieChart(createDatasetPie());
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(jpnThongKe.getWidth(), 321));
        jpnThongKe.removeAll();
        jpnThongKe.setLayout(new CardLayout());
        jpnThongKe.add(chartPanel);
        jpnThongKe.validate();
        jpnThongKe.repaint();
        this.btnBaoCao.setVisible(true);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnTKDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKDTActionPerformed
        JFreeChart pieChart = createXYSeriesChart();
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(jpnThongKe.getWidth(), 321));
        jpnThongKe.removeAll();
        jpnThongKe.setLayout(new CardLayout());
        jpnThongKe.add(chartPanel);
        jpnThongKe.validate();
        jpnThongKe.repaint();
        this.btnBCDT.setVisible(true);
    }//GEN-LAST:event_btnTKDTActionPerformed

    private void btnBCKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCKHActionPerformed
        try {

//            JasperDesign jd = JRXmlLoader.load("E:\\ProgramFiles\\NetBeansProjects\\QuanLyGaraOTo\\src\\MyReport\\Myreport.jrxml");
//            JasperReport jr = JasperCompileManager.compileReport("E:\\ProgramFiles\\NetBeansProjects\\QuanLyGaraOTo\\src\\MyReport\\Myreport.jrxml");
//            JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap(), con);
//            JasperViewer.viewReport(jp);
//            JasperExportManager.exportReportToPdfFile("E:\\ProgramFiles\\NetBeansProjects\\QuanLyGaraOTo\\src\\MyReport\\Myreport.pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể hiển thị report","Thông báo",2);
        }
    }//GEN-LAST:event_btnBCKHActionPerformed

    private void btnBCDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBCDTActionPerformed

    private void btnBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBaoCaoActionPerformed

    private void btnTKKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKKHMouseEntered
            this.btnTKKH.setBackground(new Color(96, 100, 191));
    }//GEN-LAST:event_btnTKKHMouseEntered

    private void btnTKKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKKHMouseExited
            this.btnTKKH.setBackground(new Color(76, 175, 80));
    }//GEN-LAST:event_btnTKKHMouseExited

    private void btnBCKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBCKHMouseEntered
            this.btnBCKH.setBackground(new Color(96, 100, 191));
    }//GEN-LAST:event_btnBCKHMouseEntered

    private void btnBCKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBCKHMouseExited
            this.btnBCKH.setBackground(new Color(76, 175, 80));
    }//GEN-LAST:event_btnBCKHMouseExited

    private void btnTKDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDTMouseEntered
            this.btnTKDT.setBackground(new Color(96, 100, 191));
    }//GEN-LAST:event_btnTKDTMouseEntered

    private void btnTKDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKDTMouseExited
            this.btnTKDT.setBackground(new Color(76, 175, 80));
    }//GEN-LAST:event_btnTKDTMouseExited

    private void btnBCDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBCDTMouseEntered
            this.btnBCDT.setBackground(new Color(96, 100, 191));
    }//GEN-LAST:event_btnBCDTMouseEntered

    private void btnBCDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBCDTMouseExited
        this.btnBCDT.setBackground(new Color(76, 175, 80));
    }//GEN-LAST:event_btnBCDTMouseExited

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
         this.btnThongKe.setBackground(new Color(96, 100, 191));
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        this.btnThongKe.setBackground(new Color(76, 175, 80));
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnBaoCaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoMouseEntered
        this.btnBaoCao.setBackground(new Color(96, 100, 191));
    }//GEN-LAST:event_btnBaoCaoMouseEntered

    private void btnBaoCaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoMouseExited
        this.btnBaoCao.setBackground(new Color(76, 175, 80));
    }//GEN-LAST:event_btnBaoCaoMouseExited

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        Main frmMain = new Main();
        this.setVisible(false);
        frmMain.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Thoát khỏi chương trình ?","Thông báo", 2)==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNamItemStateChanged
        getNamCB = cbNam.getSelectedItem().toString();    
    }//GEN-LAST:event_cbNamItemStateChanged
    //------------------------------------Bar chart Khách hàng---------------------------

    private static JFreeChart createBarChart(DefaultCategoryDataset dataset) {
            JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê doanh số cửa hàng".toUpperCase(),
                "Tháng", "Doanh thu (VND)",
                dataset, PlotOrientation.VERTICAL, false, true, false);
          return barChart;
    }    
    private static DefaultCategoryDataset createDatasetBar() { 
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            String sql = "SELECT * FROM BAOCAODOANHSO WHERE NAM='"+getNamCB+"'";
            ResultSet rs = LoadData.ShowTextField(sql);        
                while(rs.next()){//nếu có dữ liệu               
                    dataset.addValue(rs.getDouble("TongDoanhThu"),"Xe",rs.getString("Thang"));                                      
                }       
            return dataset;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể load thống kê","Thống kê", 2);
        }          
        return null;        
    }
    
    //------------------------------------Pie chart Tổng chi---------------------------
    
    private static JFreeChart createPieChart(PieDataset dataset) {
          JFreeChart chart = ChartFactory.createPieChart(
                "Biểu đồ về sự thay đổi cơ cấu diện tích gieo trồng".toUpperCase(),
                 dataset, true, true, true);
          return chart;
    }    
    private static PieDataset createDatasetPie() {
          DefaultPieDataset dataset = new DefaultPieDataset();
          dataset.setValue("Cây lương thực", new Double(8320.3));
          dataset.setValue("Cây công nghiệp", new Double(2337.3));
          dataset.setValue("Cây thực phẩm, cây ăn quả, cây khác", new Double(2173.8));
          return dataset;
    }
    
    //------------------------------------XY chart Doanh thu---------------------------
    
    private static JFreeChart createXYSeriesChart() {
         JFreeChart xychart = ChartFactory.createXYLineChart(
               "Biểu đồ thống kê doanh thu cửa hàng".toUpperCase(),
              "Tháng", "Doanh thu trung bình (VND)",
              createDatasetXY(), PlotOrientation.VERTICAL, true, true, false);
     return xychart;
    }
    private static XYSeriesCollection createDatasetXY() {
        try {
            String sql = "SELECT * FROM BAOCAODOANHSO WHERE NAM='"+getNamCB+"'"; 
            ResultSet rs = LoadData.ShowTextField(sql);
            final XYSeries series = new XYSeries("Doanh thu trung bình các tháng");
                while(rs.next()){//nếu có dữ liệu               
                    series.add(rs.getInt("Thang"),rs.getDouble("TongDoanhThu"));                                      
                }
            XYSeriesCollection data = new XYSeriesCollection(series);
            return data;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể load thống kê","Thống kê", 2);
        }          
        return null;
          
    }   
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFThongKe().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBCDT;
    private javax.swing.JButton btnBCKH;
    private javax.swing.JButton btnBaoCao;
    private javax.swing.JButton btnTKDT;
    private javax.swing.JButton btnTKKH;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JComboBox<String> cbNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpnThongKe;
    // End of variables declaration//GEN-END:variables
}
