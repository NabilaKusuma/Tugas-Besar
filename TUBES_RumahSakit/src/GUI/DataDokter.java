/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class DataDokter extends javax.swing.JFrame {

    /**
     * Creates new form DataDokter
     */
    public DataDokter() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        lMenuDokter = new java.awt.Label();
        jTPInDokter = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLdaftarPasien3 = new javax.swing.JLabel();
        jLdftrIDPasien1 = new javax.swing.JLabel();
        jLdftrNama1 = new javax.swing.JLabel();
        jLdftrtglLhr1 = new javax.swing.JLabel();
        jLdftrUmur1 = new javax.swing.JLabel();
        jTFinIdDokter = new javax.swing.JTextField();
        jTFInNamaDokter = new javax.swing.JTextField();
        jTFIntglLahirDokter = new javax.swing.JTextField();
        jTFInSpesialisDokter = new javax.swing.JTextField();
        JBAddDokter = new javax.swing.JButton();
        jTFInUmurDokter = new javax.swing.JTextField();
        jLdftrUmur6 = new javax.swing.JLabel();
        JBInMenuUtama = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLSID = new javax.swing.JLabel();
        jLSNm = new javax.swing.JLabel();
        jLSTglLhr = new javax.swing.JLabel();
        jLSUmur = new javax.swing.JLabel();
        jTFSid = new javax.swing.JTextField();
        jTFSNama = new javax.swing.JTextField();
        jTFStglLahir = new javax.swing.JTextField();
        jTFSUmur = new javax.swing.JTextField();
        JBSMenuUtama = new javax.swing.JButton();
        jTFSspesialis = new javax.swing.JTextField();
        jLSspesialis = new javax.swing.JLabel();
        jLSid = new javax.swing.JLabel();
        JBSearchID = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLdaftarPasien5 = new javax.swing.JLabel();
        jLSIindeks = new javax.swing.JLabel();
        jLSINama = new javax.swing.JLabel();
        jLSItglLhr = new javax.swing.JLabel();
        jLSIUmur = new javax.swing.JLabel();
        jTFsiID = new javax.swing.JTextField();
        jTFSInama = new javax.swing.JTextField();
        jTFsiTglLahir = new javax.swing.JTextField();
        jTFSIspesialis = new javax.swing.JTextField();
        JBSIMenuUtama = new javax.swing.JButton();
        jTFSIUmur = new javax.swing.JTextField();
        jLSIspesialis = new javax.swing.JLabel();
        JBSearchIndeksDokter = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLdaftarPasien6 = new javax.swing.JLabel();
        jLdftrIDPasien4 = new javax.swing.JLabel();
        jTFidPasien7 = new javax.swing.JTextField();
        JBDeleteDokter = new javax.swing.JButton();
        JBMenuUtama1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLdaftarDokter = new javax.swing.JLabel();
        JBMenuUtama = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lMenuDokter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lMenuDokter.setText("Menu Dokter");

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLdaftarPasien3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLdaftarPasien3.setText("Input Dokter");

        jLdftrIDPasien1.setText("ID");

        jLdftrNama1.setText("Nama");

        jLdftrtglLhr1.setText("Tanggal Lahir");

        jLdftrUmur1.setText("Umur");

        JBAddDokter.setBackground(new java.awt.Color(0, 0, 255));
        JBAddDokter.setText("Add");

        jLdftrUmur6.setText("Spesialis");

        JBInMenuUtama.setBackground(new java.awt.Color(0, 0, 255));
        JBInMenuUtama.setText("Menu Utama");
        JBInMenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInMenuUtamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBAddDokter))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLdftrIDPasien1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFinIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLdftrtglLhr1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFIntglLahirDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLdftrNama1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFInNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLdftrUmur1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFInUmurDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLdftrUmur6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFInSpesialisDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBInMenuUtama))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLdaftarPasien3)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLdaftarPasien3)
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdftrIDPasien1)
                    .addComponent(jTFinIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdftrNama1)
                    .addComponent(jTFInNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLdftrtglLhr1)
                    .addComponent(jTFIntglLahirDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFInUmurDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdftrUmur1))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFInSpesialisDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLdftrUmur6))
                .addGap(26, 26, 26)
                .addComponent(JBAddDokter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(JBInMenuUtama)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        jTPInDokter.addTab("Input Dokter", jPanel1);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLSID.setText("ID");

        jLSNm.setText("Nama");

        jLSTglLhr.setText("Tanggal Lahir");

        jLSUmur.setText("Umur");

        JBSMenuUtama.setBackground(new java.awt.Color(0, 0, 255));
        JBSMenuUtama.setText("Menu Utama");
        JBSMenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSMenuUtamaActionPerformed(evt);
            }
        });

        jLSspesialis.setText("Spesialis");

        jLSid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLSid.setText("Search By ID");

        JBSearchID.setBackground(new java.awt.Color(0, 0, 255));
        JBSearchID.setText("Search");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(JBSMenuUtama)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLSID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFSid, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLSspesialis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFSspesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLSUmur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFSUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLSTglLhr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFStglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JBSearchID))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLSNm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFSNama, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jLSid)
                .addGap(170, 170, 170))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLSid)
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSID)
                    .addComponent(jTFSid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBSearchID)
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFSNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSNm))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFStglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSTglLhr))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTFSUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFSspesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSspesialis))
                        .addGap(57, 57, 57)
                        .addComponent(JBSMenuUtama))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLSUmur)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTPInDokter.addTab("Search by ID", jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLdaftarPasien5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLdaftarPasien5.setText("Search By Indeks");

        jLSIindeks.setText("Indeks");

        jLSINama.setText("Nama");

        jLSItglLhr.setText("Tanggal Lahir");

        jLSIUmur.setText("Umur");

        JBSIMenuUtama.setBackground(new java.awt.Color(0, 0, 255));
        JBSIMenuUtama.setText("Menu Utama");
        JBSIMenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSIMenuUtamaActionPerformed(evt);
            }
        });

        jLSIspesialis.setText("Spesialis");

        JBSearchIndeksDokter.setBackground(new java.awt.Color(0, 0, 255));
        JBSearchIndeksDokter.setText("Search");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBSIMenuUtama))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLdaftarPasien5)))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLSIUmur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFSIUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLSIindeks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFsiID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLSINama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFSInama, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLSItglLhr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFsiTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBSearchIndeksDokter))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLSIspesialis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFSIspesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLdaftarPasien5)
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSIindeks)
                    .addComponent(jTFsiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(JBSearchIndeksDokter)
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFSInama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLSINama))
                                .addGap(18, 18, 18)
                                .addComponent(jTFsiTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLSItglLhr))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSIUmur)
                            .addComponent(jTFSIUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFSIspesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLSIspesialis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(JBSIMenuUtama)
                .addContainerGap())
        );

        jTPInDokter.addTab("Search By Indeks", jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLdaftarPasien6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLdaftarPasien6.setText("Delete Dokter");

        jLdftrIDPasien4.setText("ID Dokter");

        JBDeleteDokter.setBackground(new java.awt.Color(0, 0, 255));
        JBDeleteDokter.setText("Delete");

        JBMenuUtama1.setBackground(new java.awt.Color(0, 0, 255));
        JBMenuUtama1.setText("Menu Utama");
        JBMenuUtama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuUtama1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBMenuUtama1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLdaftarPasien6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBDeleteDokter))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLdftrIDPasien4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jTFidPasien7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLdaftarPasien6)
                .addGap(117, 117, 117)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdftrIDPasien4)
                    .addComponent(jTFidPasien7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(JBDeleteDokter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(JBMenuUtama1)
                .addContainerGap())
        );

        jTPInDokter.addTab("Delete Dokter", jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jLdaftarDokter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLdaftarDokter.setText("Data Dokter");

        JBMenuUtama.setBackground(new java.awt.Color(0, 0, 255));
        JBMenuUtama.setText("Menu Utama");
        JBMenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuUtamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jLdaftarDokter)
                .addGap(173, 173, 173))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBMenuUtama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLdaftarDokter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(JBMenuUtama)
                .addContainerGap())
        );

        jTPInDokter.addTab("Data Dokter", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(lMenuDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTPInDokter)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMenuDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPInDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBInMenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInMenuUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBInMenuUtamaActionPerformed

    private void JBSMenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSMenuUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBSMenuUtamaActionPerformed

    private void JBSIMenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSIMenuUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBSIMenuUtamaActionPerformed

    private void JBMenuUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuUtama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBMenuUtama1ActionPerformed

    private void JBMenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBMenuUtamaActionPerformed

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
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAddDokter;
    private javax.swing.JButton JBDeleteDokter;
    private javax.swing.JButton JBInMenuUtama;
    private javax.swing.JButton JBMenuUtama;
    private javax.swing.JButton JBMenuUtama1;
    private javax.swing.JButton JBSIMenuUtama;
    private javax.swing.JButton JBSMenuUtama;
    private javax.swing.JButton JBSearchID;
    private javax.swing.JButton JBSearchIndeksDokter;
    private javax.swing.JLabel jLSID;
    private javax.swing.JLabel jLSINama;
    private javax.swing.JLabel jLSIUmur;
    private javax.swing.JLabel jLSIindeks;
    private javax.swing.JLabel jLSIspesialis;
    private javax.swing.JLabel jLSItglLhr;
    private javax.swing.JLabel jLSNm;
    private javax.swing.JLabel jLSTglLhr;
    private javax.swing.JLabel jLSUmur;
    private javax.swing.JLabel jLSid;
    private javax.swing.JLabel jLSspesialis;
    private javax.swing.JLabel jLdaftarDokter;
    private javax.swing.JLabel jLdaftarPasien3;
    private javax.swing.JLabel jLdaftarPasien5;
    private javax.swing.JLabel jLdaftarPasien6;
    private javax.swing.JLabel jLdftrIDPasien1;
    private javax.swing.JLabel jLdftrIDPasien4;
    private javax.swing.JLabel jLdftrNama1;
    private javax.swing.JLabel jLdftrUmur1;
    private javax.swing.JLabel jLdftrUmur6;
    private javax.swing.JLabel jLdftrtglLhr1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTFInNamaDokter;
    private javax.swing.JTextField jTFInSpesialisDokter;
    private javax.swing.JTextField jTFInUmurDokter;
    private javax.swing.JTextField jTFIntglLahirDokter;
    private javax.swing.JTextField jTFSIUmur;
    private javax.swing.JTextField jTFSInama;
    private javax.swing.JTextField jTFSIspesialis;
    private javax.swing.JTextField jTFSNama;
    private javax.swing.JTextField jTFSUmur;
    private javax.swing.JTextField jTFSid;
    private javax.swing.JTextField jTFSspesialis;
    private javax.swing.JTextField jTFStglLahir;
    private javax.swing.JTextField jTFidPasien7;
    private javax.swing.JTextField jTFinIdDokter;
    private javax.swing.JTextField jTFsiID;
    private javax.swing.JTextField jTFsiTglLahir;
    private javax.swing.JTabbedPane jTPInDokter;
    private java.awt.Label lMenuDokter;
    // End of variables declaration//GEN-END:variables
    public void addActionListener (ActionListener e){
      JBSearchIndeksDokter.addActionListener(e);  
      JBMenuUtama1.addActionListener(e);
      JBMenuUtama.addActionListener(e);
      JBInMenuUtama.addActionListener(e);
      JBSMenuUtama.addActionListener(e);
      JBSIMenuUtama.addActionListener(e);
      JBDeleteDokter.addActionListener(e);
      JBSearchID.addActionListener(e);
      JBAddDokter.addActionListener(e);
    }
    
}
