/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.*;
import controller.CrudUsuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conexao;
import model.Email;
import model.Identificacao;
import model.Telefone;
import model.Usuario;

/**
 *
 * @author Manuel Maloa Jr
 */
public class Formulario_Cadastro extends javax.swing.JFrame {
    
    private Identificacao identificacao;
    private Identificacao identificacao1;
    
    public Formulario_Cadastro() {
        initComponents();
        ListenerTelefone();
        verificar();
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
        txtUsuario = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        checkQuestoes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtResposta = new javax.swing.JTextField();
        lbOnlyNumbers = new javax.swing.JLabel();
        lblErroEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(526, 512));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 250, -1));

        txtContacto.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtContacto.setToolTipText("Digite apenas digitos");
        txtContacto.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtContactoComponentAdded(evt);
            }
        });
        txtContacto.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtContactoCaretUpdate(evt);
            }
        });
        txtContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtContactoMouseEntered(evt);
            }
        });
        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        jPanel1.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 250, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contacto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 250, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 300, 250, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 360, 250, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirmar senha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 420, 250, -1));

        btnRegistar.setBackground(new java.awt.Color(0, 51, 153));
        btnRegistar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/check-mark.png"))); // NOI18N
        btnRegistar.setText("Registar");
        btnRegistar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        btnRegistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistarMouseClicked(evt);
            }
        });
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 610, 150, 30));

        btnVoltar.setBackground(new java.awt.Color(0, 51, 204));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botao-voltar.png"))); // NOI18N
        btnVoltar.setFocusPainted(false);
        btnVoltar.setFocusable(false);
        btnVoltar.setOpaque(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 5, 33, 28));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setText("jPasswordField1");
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 250, -1));

        txtConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmarSenha.setText("jPasswordField2");
        jPanel1.add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 250, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome de Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 90, 250, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/avatar-de-perfil (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 74, 73));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 30, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_contacts_white_24dp.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 30, 30));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 40, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 30, 30));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 30, 30));

        lblErro.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 250, 10));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nome e Apelido");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 160, 250, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 250, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Questao de Seguranca");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 250, -1));

        checkQuestoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkQuestoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome do pai?", "Comida favorita?", "Cor predileta?", "Lingua Materna?", " " }));
        checkQuestoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                checkQuestoesKeyPressed(evt);
            }
        });
        jPanel1.add(checkQuestoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 250, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Resposta");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 250, -1));

        txtResposta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 250, -1));
        jPanel1.add(lbOnlyNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 250, 10));
        jPanel1.add(lblErroEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 250, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Login_Form login = new Login_Form();
        login.show();
        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        String username = txtUsuario.getText();
        if (verficarCampos()) {
            try {
                if (!checkUsername(username)) {
                    Usuario u = new Usuario();
                    
                    PreparedStatement ps;
                    ResultSet rs;
                    String registerUserQuery = "insert into usuarios (nome_usuario,nome_apelido,senha_usuario,contacto,Email,questao_seguranca,resposta) values(?,?,?,?,?,?,?)";
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Formulario_Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
//          identificacao.Verificar(txtNome.getText());

        CrudUsuario crud = new CrudUsuario();
        
        Usuario usuario = new Usuario();
        
        usuario.setNome_usuario(txtUsuario.getText());
        usuario.setNome_apelido(txtNome.getText());
        usuario.setSenha_usuario(txtSenha.getText());
        usuario.setContacto(txtContacto.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setQuestao_seguranca((String)checkQuestoes.getSelectedItem());
        usuario.setResposta(txtResposta.getText());
        crud.save(usuario);
        
        Login_Form login = new Login_Form();
        login.setVisible(true);
        this.pack();
        this.dispose();
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void txtContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyReleased

//        Telefone telefone = new Telefone();
//        String Contacto = txtContacto.getText();
//        telefone.isValid(Contacto);

    }//GEN-LAST:event_txtContactoKeyReleased

    private void txtContactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
        
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            txtContacto.setEditable(false);
            //o campo fica desabilitado ao ser digitado caracteres
            txtContacto.setBackground(Color.red);
            lbOnlyNumbers.setText("Digite apenas numeros");
            lbOnlyNumbers.setForeground(Color.red);
            
        } else {
            txtContacto.setEditable(true);
            lbOnlyNumbers.setVisible(false);
            txtContacto.setBackground(Color.white);
        }

        //Validacao do Contacto
        String Contacto = txtContacto.getText() + evt.getKeyChar();
        //Pega o comprimento da String
        int length = Contacto.length();
        
        char c = evt.getKeyChar();

        //Verificao do comprimento do numero de 0 a 9
        if (length <= 9) {
            
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                //Depois  permite que seja editado
                txtContacto.setEditable(true);
            } else {
                txtContacto.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtContactoKeyPressed

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void txtContactoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtContactoComponentAdded

    }//GEN-LAST:event_txtContactoComponentAdded

    private void txtContactoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtContactoCaretUpdate

    }//GEN-LAST:event_txtContactoCaretUpdate

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        
        telefone.validar(txtContacto.getText() + evt.getKeyChar());
        

    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoMouseEntered

    private void btnRegistarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistarMouseClicked
        identificacao.Verificar(txtNome.getText());
        

    }//GEN-LAST:event_btnRegistarMouseClicked

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNome.requestFocus();
        }

    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContacto.requestFocus();
        }

    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }

    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtConfirmarSenha.requestFocus();
        }

    }//GEN-LAST:event_txtSenhaKeyPressed

    private void checkQuestoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkQuestoesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtResposta.requestFocus();
        }

    }//GEN-LAST:event_checkQuestoesKeyPressed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        String email = txtEmail.getText() + evt.getKeyChar();
        //verificacao do email
        if (Email.isEmailValid(email)) {
            if (email.length() != 0) {
                lblErroEmail.setVisible(true);
                lblErroEmail.setForeground(Color.GREEN);
                lblErroEmail.setText("Email correcto!");
            } else {
                lblErroEmail.setVisible(false);
            }
            
        } else {
            lblErroEmail.setVisible(true);
            lblErroEmail.setForeground(Color.red);
            lblErroEmail.setText("O email esta em um formato invalido!");
        }

    }//GEN-LAST:event_txtEmailKeyTyped
    public void ListenerTelefone() {
        
        telefone = new Telefone();
        telefone.createRealTimeListener(new Telefone.RealTimeListener() {
            @Override
            public void onSuccess() {
                ChangeColor(true);
                lblErro.setText("Numero valido");
                
            }
            
            @Override
            public void onError(String error) {
                
                ChangeColor(false);
                lblErro.setText(error);
                
            }
        });
        
    }
    
    public void ChangeColor(boolean valido) {
        if (valido) {
            lblErro.setForeground(Color.GREEN);
            
        } else {
            lblErro.setForeground(Color.red);
            
        }
    }
    
    public void verificar() {
        
        identificacao = new Identificacao();
        identificacao.createListener(new Identificacao.IdentificationListener() {
            @Override
            public void Valido() {
                JOptionPane.showMessageDialog(null, "valido");
                
            }
            
            @Override
            public void invalido(String message) {
                JOptionPane.showMessageDialog(null, message, "atencao", JOptionPane.OK_OPTION);
                
            }
        });
        
    }

    //Verificacao dos campos
    public boolean verficarCampos() {
        if (txtNome.getText().equals("") || txtUsuario.getText().equals("") || txtContacto.getText().equals("") || txtEmail.getText().equals("")
                || txtSenha.getText().equals("") || txtConfirmarSenha.equals("") || checkQuestoes.equals("") || txtResposta.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campos vazios", 2);
            txtNome.setForeground(Color.red);
            txtUsuario.setForeground(Color.red);
            txtContacto.setForeground(Color.red);
            txtEmail.setForeground(Color.red);
            txtSenha.setForeground(Color.red);
            txtConfirmarSenha.setForeground(Color.red);
            checkQuestoes.setForeground(Color.red);
            txtResposta.setForeground(Color.red);
            return false;
            
        } else if (String.valueOf(txtSenha.getPassword()).length() < 6) {
            JOptionPane.showMessageDialog(null, "a senha nao pode conter menos de 6 caracteres", "Atencao", 2);
            return false;
        } else if (String.valueOf(txtSenha.getPassword()).length() > 12) {
            JOptionPane.showMessageDialog(null, "a senha nao pode conter mais de 12 caracteres", "Atencao", 2);
            return false;
        } else if (txtSenha.getPassword().equals(txtConfirmarSenha.getPassword())) {
            
            return true;
            
        } else {
            JOptionPane.showMessageDialog(null, "As senhas nao correspondem", "verifique as senhas", 2);
            return false;
        }
        
    }

    //Funcao que verifique se um determinado usuario existe ou nao na base de dados
    public boolean checkUsername(String username) throws SQLException {
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "select * from usuarios where nome_usuario = ?";
        st = con.conectaBD().prepareStatement(query);
        st.setString(1, username);
        rs = st.executeQuery();
        
        if (rs.next()) {
            
            username_exist = true;
            JOptionPane.showMessageDialog(null, "este usuario ja existe,escolha um outro nome", "Username nao encontrado", 2);
        }
        return username_exist;
    }

//    private boolean chechPassWord() {
//
//    }
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
            java.util.logging.Logger.getLogger(Formulario_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Cadastro().setVisible(true);
            }
        });
    }
    private Conexao con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> checkQuestoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbOnlyNumbers;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblErroEmail;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtResposta;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    private Telefone telefone;
    
}
