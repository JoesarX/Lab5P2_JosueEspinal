/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_josueespinal;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    public String user;
    public int userLoc;
    public ArrayList<persona> usuarios = new ArrayList<persona>();

    public Principal() {

        initComponents();
        aplicarPrueba.setVisible(false);
        menu1.setEnabled(true);
        menu2.setEnabled(true);
        menu3.setEnabled(false);
        menu4.setEnabled(false);
        menu5.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_window = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        user_tb = new javax.swing.JTextField();
        password_tb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sign_CEO = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ceo_usuario = new javax.swing.JTextField();
        ceo_password = new javax.swing.JTextField();
        ceo_appelido = new javax.swing.JTextField();
        ceo_nombre = new javax.swing.JTextField();
        ceo_titulo = new javax.swing.JTextField();
        ceo_id = new javax.swing.JTextField();
        ceo_anios = new javax.swing.JSpinner();
        ceo_edad = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        sign_decano = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ceo_usuario1 = new javax.swing.JTextField();
        ceo_password1 = new javax.swing.JTextField();
        ceo_appelido1 = new javax.swing.JTextField();
        ceo_nombre1 = new javax.swing.JTextField();
        ceo_titulo1 = new javax.swing.JTextField();
        ceo_id1 = new javax.swing.JTextField();
        ceo_edad1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        titulo2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        sing_docente = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ceo_usuario2 = new javax.swing.JTextField();
        ceo_password2 = new javax.swing.JTextField();
        ceo_appelido2 = new javax.swing.JTextField();
        ceo_nombre2 = new javax.swing.JTextField();
        ceo_titulo2 = new javax.swing.JTextField();
        alumnos_max = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        titulo_2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        clase_doc = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_doc = new javax.swing.JTextArea();
        sign_alumno = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        ceo_usuario3 = new javax.swing.JTextField();
        ceo_password3 = new javax.swing.JTextField();
        ceo_appelido3 = new javax.swing.JTextField();
        ceo_nombre3 = new javax.swing.JTextField();
        cuenta_tb = new javax.swing.JTextField();
        anios_tb = new javax.swing.JSpinner();
        clases_tb = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        alumno = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPruebas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        decano = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        aplicarPrueba = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AlumnosLista = new javax.swing.JList<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        equipo = new javax.swing.JTextField();
        evalua = new javax.swing.JTextField();
        participacion = new javax.swing.JTextField();
        coop = new javax.swing.JTextField();
        nota = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu1 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenuItem();
        menu5 = new javax.swing.JMenuItem();
        signOut = new javax.swing.JMenuItem();

        user_tb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        user_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_tbActionPerformed(evt);
            }
        });

        password_tb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("LOG IN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("USUARIO:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("PASSWORD:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("LOG IN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(182, 182, 182))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout login_windowLayout = new javax.swing.GroupLayout(login_window.getContentPane());
        login_window.getContentPane().setLayout(login_windowLayout);
        login_windowLayout.setHorizontalGroup(
            login_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_windowLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        login_windowLayout.setVerticalGroup(
            login_windowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_windowLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("SIGN UP CEO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("USUARIO: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("PASSWORD:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("NOMBRE:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("APELLIDO:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("TITULO DE PREGRADO:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("ID:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("AÑOS DE EXPERIENCIA:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("EDAD: ");

        ceo_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_usuarioActionPerformed(evt);
            }
        });

        ceo_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_appelido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_appelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_appelidoActionPerformed(evt);
            }
        });

        ceo_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_tituloActionPerformed(evt);
            }
        });

        ceo_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_idActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("SIGN UP");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sign_CEOLayout = new javax.swing.GroupLayout(sign_CEO.getContentPane());
        sign_CEO.getContentPane().setLayout(sign_CEOLayout);
        sign_CEOLayout.setHorizontalGroup(
            sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_CEOLayout.createSequentialGroup()
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sign_CEOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ceo_appelido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sign_CEOLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ceo_password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_usuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sign_CEOLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ceo_edad))
                    .addGroup(sign_CEOLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ceo_anios, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(sign_CEOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sign_CEOLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ceo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_CEOLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_CEOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        sign_CEOLayout.setVerticalGroup(
            sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_CEOLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_anios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_appelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_CEOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("SIGN UP DECANO");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("USUARIO: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("PASSWORD:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("NOMBRE:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("APELLIDO:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("TITULO DE PREGRADO:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel19.setText("ID:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("EDAD: ");

        ceo_usuario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_usuario1ActionPerformed(evt);
            }
        });

        ceo_password1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_appelido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_appelido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_appelido1ActionPerformed(evt);
            }
        });

        ceo_nombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_titulo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_titulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_titulo1ActionPerformed(evt);
            }
        });

        ceo_id1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_id1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("SIGN UP");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        titulo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel20.setText("TITULO UNIVERSITARIO:");

        titulo3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel22.setText("TITULO DE MAESTRIA:");

        javax.swing.GroupLayout sign_decanoLayout = new javax.swing.GroupLayout(sign_decano.getContentPane());
        sign_decano.getContentPane().setLayout(sign_decanoLayout);
        sign_decanoLayout.setHorizontalGroup(
            sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_decanoLayout.createSequentialGroup()
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sign_decanoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ceo_appelido1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sign_decanoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ceo_password1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_usuario1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ceo_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(sign_decanoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sign_decanoLayout.createSequentialGroup()
                        .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sign_decanoLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ceo_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(sign_decanoLayout.createSequentialGroup()
                        .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sign_decanoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(1, 1, 1)
                                .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sign_decanoLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_decanoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(sign_decanoLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sign_decanoLayout.setVerticalGroup(
            sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_decanoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_appelido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setText("SIGN UP DOCENTE");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel24.setText("USUARIO: ");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("PASSWORD:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("NOMBRE:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("APELLIDO:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel28.setText("TITULO DE PREGRADO:");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("MAXIMOS ALUMNOS:");

        ceo_usuario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_usuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_usuario2ActionPerformed(evt);
            }
        });

        ceo_password2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_appelido2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_appelido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_appelido2ActionPerformed(evt);
            }
        });

        ceo_nombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_titulo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_titulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_titulo2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("SIGN UP");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        titulo_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo_2ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("TITULO DE MAESTRIA:");

        clase_doc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clase_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clase_docActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel33.setText("NOMBRE DE LA CLASE:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel34.setText("DESCRIPCION:");

        desc_doc.setColumns(20);
        desc_doc.setRows(5);
        jScrollPane1.setViewportView(desc_doc);

        javax.swing.GroupLayout sing_docenteLayout = new javax.swing.GroupLayout(sing_docente.getContentPane());
        sing_docente.getContentPane().setLayout(sing_docenteLayout);
        sing_docenteLayout.setHorizontalGroup(
            sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sing_docenteLayout.createSequentialGroup()
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sing_docenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ceo_appelido2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sing_docenteLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ceo_password2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_usuario2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alumnos_max, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(sing_docenteLayout.createSequentialGroup()
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sing_docenteLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sing_docenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sing_docenteLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(ceo_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sing_docenteLayout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titulo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(sing_docenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clase_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(sing_docenteLayout.createSequentialGroup()
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sing_docenteLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sing_docenteLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sing_docenteLayout.setVerticalGroup(
            sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sing_docenteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_appelido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sing_docenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clase_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(28, 28, 28))
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("SIGN UP ALUMNO");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("USUARIO: ");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel35.setText("PASSWORD:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel36.setText("NOMBRE:");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel37.setText("APELLIDO:");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel39.setText("CUENTA: ");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel40.setText("AÑOS DE CARRERA:");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel41.setText("CLASES POR CUSAR:");

        ceo_usuario3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_usuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_usuario3ActionPerformed(evt);
            }
        });

        ceo_password3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ceo_appelido3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ceo_appelido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceo_appelido3ActionPerformed(evt);
            }
        });

        ceo_nombre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cuenta_tb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cuenta_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuenta_tbActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("SIGN UP");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sign_alumnoLayout = new javax.swing.GroupLayout(sign_alumno.getContentPane());
        sign_alumno.getContentPane().setLayout(sign_alumnoLayout);
        sign_alumnoLayout.setHorizontalGroup(
            sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_alumnoLayout.createSequentialGroup()
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sign_alumnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ceo_appelido3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sign_alumnoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ceo_password3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_usuario3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ceo_nombre3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(anios_tb, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(clases_tb))
                .addGap(20, 20, 20))
            .addGroup(sign_alumnoLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuenta_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_alumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sign_alumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        sign_alumnoLayout.setVerticalGroup(
            sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sign_alumnoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_usuario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anios_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_password3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clases_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceo_appelido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sign_alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuenta_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(21, 21, 21))
        );

        tablaPruebas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trabajo Equipo", "Cooperacion", "Participacion", "Evaluacion Nota", "Nota General", "Docente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaPruebas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ver Pruebas", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Editar", jPanel3);

        javax.swing.GroupLayout alumnoLayout = new javax.swing.GroupLayout(alumno.getContentPane());
        alumno.getContentPane().setLayout(alumnoLayout);
        alumnoLayout.setHorizontalGroup(
            alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        alumnoLayout.setVerticalGroup(
            alumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Docentes");
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane5.setViewportView(tree);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout decanoLayout = new javax.swing.GroupLayout(decano.getContentPane());
        decano.getContentPane().setLayout(decanoLayout);
        decanoLayout.setHorizontalGroup(
            decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        decanoLayout.setVerticalGroup(
            decanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AlumnosLista.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AlumnosLista.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(AlumnosLista);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 102, 102));
        jLabel38.setText("Aplicar Prueba");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel42.setText("Trabajo en Equipo:");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel43.setText("Cooperacion: ");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel44.setText("Participacion:");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel45.setText("Evaluacion de nota:");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel46.setText("Evaluacion General:");

        jButton6.setText("APLICAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        equipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });

        evalua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        evalua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluaActionPerformed(evt);
            }
        });

        participacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        participacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participacionActionPerformed(evt);
            }
        });

        coop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coopActionPerformed(evt);
            }
        });

        nota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout aplicarPruebaLayout = new javax.swing.GroupLayout(aplicarPrueba);
        aplicarPrueba.setLayout(aplicarPruebaLayout);
        aplicarPruebaLayout.setHorizontalGroup(
            aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aplicarPruebaLayout.createSequentialGroup()
                .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aplicarPruebaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aplicarPruebaLayout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coop, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aplicarPruebaLayout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(evalua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aplicarPruebaLayout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aplicarPruebaLayout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(participacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(aplicarPruebaLayout.createSequentialGroup()
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(aplicarPruebaLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        aplicarPruebaLayout.setVerticalGroup(
            aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aplicarPruebaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(aplicarPruebaLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(31, 31, 31)
                        .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(coop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(participacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(evalua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(aplicarPruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aplicarPruebaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        jMenu1.setText("Opciones");

        menu1.setText("LOG IN");
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
        });
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        jMenu1.add(menu1);

        menu2.setText("SIGN UP");

        jMenuItem3.setText("CEO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem3);

        jMenuItem4.setText("Decano");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem4);

        jMenuItem5.setText("Docente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem5);

        jMenuItem6.setText("Estudiante");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu2.add(jMenuItem6);

        jMenu1.add(menu2);

        menu3.setText("Docentes");
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });
        jMenu1.add(menu3);

        menu4.setText("Estudiante");
        menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4ActionPerformed(evt);
            }
        });
        jMenu1.add(menu4);

        menu5.setText("Decano");
        menu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu5ActionPerformed(evt);
            }
        });
        jMenu1.add(menu5);

        signOut.setText("SIGN OUT");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jMenu1.add(signOut);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aplicarPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(aplicarPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean flag = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (user_tb.getText().equals(usuarios.get(i).getUsuario())
                    && password_tb.getText().equals(usuarios.get(i).getPassword())) {
                user = user_tb.getText();
                user_tb.setText("");
                password_tb.setText("");
                if (usuarios.get(i) instanceof CEO) {

                } else if (usuarios.get(i) instanceof Decano) {
                    menu1.setEnabled(false);
                    menu2.setEnabled(false);
                    menu5.setEnabled(true);
                } else if (usuarios.get(i) instanceof Docente) {
                    menu1.setEnabled(false);
                    menu2.setEnabled(false);
                    menu3.setEnabled(true);
                } else {
                    menu1.setEnabled(false);
                    menu2.setEnabled(false);
                    menu4.setEnabled(true);
                }
                flag = true;
                login_window.setVisible(false);
            }
        }
        if (!flag) {
            JOptionPane.showMessageDialog(login_window, "Usuario no encontrado");
            user_tb.setText("");
            password_tb.setText("");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void user_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_tbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_tbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        DefaultListModel modelo
                = (DefaultListModel) AlumnosLista.getModel();
        modelo.clear();
        for (int i = 0; i < usuarios.size(); i++) {
            if ((usuarios.get(i)) instanceof Alumno) {
                modelo.addElement(usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido());
                AlumnosLista.setModel(modelo);
            }
        }
        aplicarPrueba.setVisible(true);
    }//GEN-LAST:event_menu3ActionPerformed

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked

    }//GEN-LAST:event_menu1MouseClicked

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        mostrarVentanaLogin();
    }//GEN-LAST:event_menu1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        mostrarVentanaDocente();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void ceo_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_idActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        CEO c = new CEO();
        c.setNombre(ceo_nombre.getText());
        c.setApellido(ceo_appelido.getText());
        c.setUsuario(ceo_usuario.getText());
        c.setPassword(ceo_password.getText());
        c.setTitulo(ceo_titulo.getText());
        c.setID(ceo_id.getText());
        c.setEdad((int) ceo_edad.getValue());
        c.setAnios((int) ceo_anios.getValue());
        ceo_nombre.setText("");
        ceo_appelido.setText("");
        ceo_usuario.setText("");
        ceo_password.setText("");
        ceo_titulo.setText("");
        ceo_id.setText("");
        ceo_edad.setValue(0);
        ceo_anios.setValue(0);
        usuarios.add(c);
        sign_CEO.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        mostrarVentanaCEO();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ceo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_usuarioActionPerformed

    private void ceo_appelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_appelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_appelidoActionPerformed

    private void ceo_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_tituloActionPerformed

    private void ceo_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_usuario1ActionPerformed

    private void ceo_appelido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_appelido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_appelido1ActionPerformed

    private void ceo_titulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_titulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_titulo1ActionPerformed

    private void ceo_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_id1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Decano c = new Decano();
        c.setNombre(ceo_nombre1.getText());
        c.setApellido(ceo_appelido1.getText());
        c.setUsuario(ceo_usuario1.getText());
        c.setPassword(ceo_password1.getText());
        c.setTituloPre(ceo_titulo1.getText());
        c.setTituloUni(titulo2.getText());
        c.setTituloMa(titulo3.getText());
        c.setID(ceo_id1.getText());
        c.setEdad((int) ceo_edad1.getValue());
        ceo_nombre1.setText("");
        ceo_appelido1.setText("");
        ceo_usuario1.setText("");
        ceo_password1.setText("");
        ceo_titulo1.setText("");
        ceo_id1.setText("");
        ceo_edad1.setValue(0);
        titulo2.setText("");
        titulo3.setText("");
        usuarios.add(c);
        sign_decano.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void titulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo2ActionPerformed

    private void titulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        mostrarVentanaDecano();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ceo_usuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_usuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_usuario2ActionPerformed

    private void ceo_appelido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_appelido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_appelido2ActionPerformed

    private void ceo_titulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_titulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_titulo2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Docente c = new Docente();
        c.setNombre(ceo_nombre2.getText());
        c.setApellido(ceo_appelido2.getText());
        c.setUsuario(ceo_usuario2.getText());
        c.setPassword(ceo_password2.getText());
        c.setTituloPre(ceo_titulo2.getText());
        c.setTituloMa(titulo_2.getText());
        c.setAlumnos((int) alumnos_max.getValue());
        c.setClase(clase_doc.getText());
        c.setDescripcion(desc_doc.getText());
        ceo_nombre2.setText("");
        ceo_appelido2.setText("");
        ceo_usuario2.setText("");
        ceo_password2.setText("");
        ceo_titulo2.setText("");
        titulo_2.setText("");
        alumnos_max.setValue(0);
        clase_doc.setText("");
        desc_doc.setText("");
        usuarios.add(c);
        sing_docente.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void titulo_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo_2ActionPerformed

    private void clase_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clase_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clase_docActionPerformed

    private void ceo_usuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_usuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_usuario3ActionPerformed

    private void ceo_appelido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceo_appelido3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceo_appelido3ActionPerformed

    private void cuenta_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuenta_tbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuenta_tbActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Alumno c = new Alumno();
        c.setNombre(ceo_nombre3.getText());
        c.setApellido(ceo_appelido3.getText());
        c.setUsuario(ceo_usuario3.getText());
        c.setPassword(ceo_password3.getText());
        c.setCuenta(Integer.parseInt(cuenta_tb.getText()));
        c.setAnio((int) anios_tb.getValue());
        c.setClases((int) clases_tb.getValue());
        ceo_nombre3.setText("");
        ceo_appelido3.setText("");
        ceo_usuario3.setText("");
        ceo_password3.setText("");
        cuenta_tb.setText("");
        anios_tb.setValue(0);
        clases_tb.setValue(0);
        usuarios.add(c);
        sign_alumno.setVisible(false);


    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        mostrarVentanaAlumno();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoActionPerformed

    private void evaluaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evaluaActionPerformed

    private void participacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participacionActionPerformed

    private void coopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coopActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (AlumnosLista.getSelectedIndex() >= 0) {
            Prueba p = new Prueba();
            p.setQuipo(equipo.getText());
            p.setCooperacion(coop.getText());
            p.setParticipacion(participacion.getText());
            p.setAprobado(evalua.getText());
            p.setEvaluacion((int) nota.getValue());
            for (int i = 0; i < usuarios.size(); i++) {
                if (user.equals(usuarios.get(i).getUsuario())) {
                    p.setNombre(usuarios.get(i).getNombre());
                    p.setApellido(usuarios.get(i).getApellido());
                }
            }
            ArrayList<Integer> donde = new ArrayList<Integer>();
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i) instanceof Alumno) {
                    donde.add(i);
                }
            }
            int posicion = donde.get(AlumnosLista.getSelectedIndex());
            ((Alumno) usuarios.get(posicion)).setPruebas(p);
            equipo.setText("");
            coop.setText("");
            participacion.setText("");
            evalua.setText("");
            nota.setValue(0);
        } else {
            JOptionPane.showMessageDialog(aplicarPrueba, "Elija a un estudiante.");
        }

    }//GEN-LAST:event_jButton6MouseClicked

    private void menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4ActionPerformed
        int persona = 0;
        for (int i = 0; i < usuarios.size(); i++) {
            if (user.equals(usuarios.get(i).getUsuario())) {
                persona = i;
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tablaPruebas.getModel();
        modelo.setRowCount(0);
        for (int i = 0; i < ((Alumno) usuarios.get(persona)).getPruebas().size(); i++) {
            Object[] newrow = {
                ((Alumno) usuarios.get(persona)).getPruebas().get(i).getQuipo(),
                ((Alumno) usuarios.get(persona)).getPruebas().get(i).getQuipo(),
                ((Alumno) usuarios.get(persona)).getPruebas().get(i).getCooperacion(),
                ((Alumno) usuarios.get(persona)).getPruebas().get(i).getParticipacion(),
                ((Alumno) usuarios.get(persona)).getPruebas().get(i).getAprobado(),
                ((Alumno) usuarios.get(persona)).getPruebas().get(i).getNombre() + " " + ((Alumno) usuarios.get(persona)).getPruebas().get(i).getApellido(),};
            modelo.addRow(newrow);
        }
        tablaPruebas.setModel(modelo);
        alumnos();
    }//GEN-LAST:event_menu4ActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        menu1.setEnabled(true);
        menu2.setEnabled(true);
        menu3.setEnabled(false);
        menu4.setEnabled(false);
        menu5.setEnabled(false);
        aplicarPrueba.setVisible(false);
    }//GEN-LAST:event_signOutActionPerformed

    private void menu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu5ActionPerformed
        decano();
        DefaultTreeModel m = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode raiz
                = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_docente;
        DefaultMutableTreeNode nodo_estudiante;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Docente) {
                nodo_docente = new DefaultMutableTreeNode(usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido());
                for(int j = 0; j < usuarios.size(); j++){
                    raiz.add(nodo_docente);
                    if (usuarios.get(i) instanceof Alumno){
                        nodo_estudiante = new DefaultMutableTreeNode(usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido());
                        nodo_docente.add(nodo_estudiante);
                    }
                }
            }
        }
        m.reload();
        tree.setModel(m);
    }//GEN-LAST:event_menu5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void mostrarVentanaLogin() {
        //opciones previas
        login_window.setModal(true);
        login_window.pack();
        login_window.setLocationRelativeTo(this);
        login_window.setVisible(true);
    }

    public void mostrarVentanaCEO() {
        //opciones previas
        sign_CEO.setModal(true);
        sign_CEO.pack();
        sign_CEO.setLocationRelativeTo(this);
        sign_CEO.setVisible(true);
    }

    public void mostrarVentanaDecano() {
        //opciones previas
        sign_decano.setModal(true);
        sign_decano.pack();
        sign_decano.setLocationRelativeTo(this);
        sign_decano.setVisible(true);
    }

    public void mostrarVentanaDocente() {
        //opciones previas
        sing_docente.setModal(true);
        sing_docente.pack();
        sing_docente.setLocationRelativeTo(this);
        sing_docente.setVisible(true);
    }

    public void mostrarVentanaAlumno() {
        //opciones previas
        sign_alumno.setModal(true);
        sign_alumno.pack();
        sign_alumno.setLocationRelativeTo(this);
        sign_alumno.setVisible(true);
    }

    public void alumnos() {
        alumno.setModal(true);
        alumno.pack();
        alumno.setLocationRelativeTo(this);
        alumno.setVisible(true);
    }
    public void decano() {
        //opciones previas
        decano.setModal(true);
        decano.pack();
        decano.setLocationRelativeTo(this);
        decano.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> AlumnosLista;
    private javax.swing.JDialog alumno;
    private javax.swing.JSpinner alumnos_max;
    private javax.swing.JSpinner anios_tb;
    private javax.swing.JPanel aplicarPrueba;
    private javax.swing.JSpinner ceo_anios;
    private javax.swing.JTextField ceo_appelido;
    private javax.swing.JTextField ceo_appelido1;
    private javax.swing.JTextField ceo_appelido2;
    private javax.swing.JTextField ceo_appelido3;
    private javax.swing.JSpinner ceo_edad;
    private javax.swing.JSpinner ceo_edad1;
    private javax.swing.JTextField ceo_id;
    private javax.swing.JTextField ceo_id1;
    private javax.swing.JTextField ceo_nombre;
    private javax.swing.JTextField ceo_nombre1;
    private javax.swing.JTextField ceo_nombre2;
    private javax.swing.JTextField ceo_nombre3;
    private javax.swing.JTextField ceo_password;
    private javax.swing.JTextField ceo_password1;
    private javax.swing.JTextField ceo_password2;
    private javax.swing.JTextField ceo_password3;
    private javax.swing.JTextField ceo_titulo;
    private javax.swing.JTextField ceo_titulo1;
    private javax.swing.JTextField ceo_titulo2;
    private javax.swing.JTextField ceo_usuario;
    private javax.swing.JTextField ceo_usuario1;
    private javax.swing.JTextField ceo_usuario2;
    private javax.swing.JTextField ceo_usuario3;
    private javax.swing.JTextField clase_doc;
    private javax.swing.JSpinner clases_tb;
    private javax.swing.JTextField coop;
    private javax.swing.JTextField cuenta_tb;
    private javax.swing.JDialog decano;
    private javax.swing.JTextArea desc_doc;
    private javax.swing.JTextField equipo;
    private javax.swing.JTextField evalua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog login_window;
    private javax.swing.JMenuItem menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuItem menu3;
    private javax.swing.JMenuItem menu4;
    private javax.swing.JMenuItem menu5;
    private javax.swing.JSpinner nota;
    private javax.swing.JTextField participacion;
    private javax.swing.JTextField password_tb;
    private javax.swing.JMenuItem signOut;
    private javax.swing.JDialog sign_CEO;
    private javax.swing.JDialog sign_alumno;
    private javax.swing.JDialog sign_decano;
    private javax.swing.JDialog sing_docente;
    private javax.swing.JTable tablaPruebas;
    private javax.swing.JTextField titulo2;
    private javax.swing.JTextField titulo3;
    private javax.swing.JTextField titulo_2;
    private javax.swing.JTree tree;
    private javax.swing.JTextField user_tb;
    // End of variables declaration//GEN-END:variables
}
