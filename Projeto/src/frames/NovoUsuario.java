/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import usuarios.CadastraUsuario;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Júnior
 */
public class NovoUsuario extends javax.swing.JFrame {
    /**
     * Creates new form NovoUsuario
     */
    public NovoUsuario() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/assets/icons/favicon-32x32.png");
        setIconImage(icon.getImage());
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cadUserField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CadButton = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        cadPassField = new javax.swing.JPasswordField();
        cadConfirmaPassField = new javax.swing.JPasswordField();
        CancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar novo usuário");
        setFocusCycleRoot(false);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setName("asdsad"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Insira os dados do novo usuário:");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário: ");

        cadUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUserFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha: ");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar senha: ");

        CadButton.setBackground(new java.awt.Color(51, 51, 51));
        CadButton.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        CadButton.setForeground(new java.awt.Color(204, 0, 51));
        CadButton.setText("Cadastrar");
        CadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadButtonActionPerformed(evt);
            }
        });

        jProgressBar2.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setForeground(new java.awt.Color(0, 255, 0));
        jProgressBar2.setToolTipText("");
        jProgressBar2.setOpaque(true);

        cadPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cadPassFieldFocusLost(evt);
            }
        });
        cadPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPassFieldActionPerformed(evt);
            }
        });

        cadConfirmaPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadConfirmaPassFieldActionPerformed(evt);
            }
        });

        CancelarButton.setBackground(new java.awt.Color(51, 51, 51));
        CancelarButton.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        CancelarButton.setForeground(new java.awt.Color(204, 0, 51));
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadConfirmaPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cadUserField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cadPassField))))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cadUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cadConfirmaPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadButton)
                    .addComponent(CancelarButton))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadUserFieldActionPerformed

    private void CadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadButtonActionPerformed
        String user = cadUserField.getText();
        String pass = cadPassField.getText();
        String confirmpass = cadConfirmaPassField.getText();
        CadastraUsuario u = new CadastraUsuario(user, pass);
        File cad = new File("src/usuarios/Users/"+user+".txt");
        
        if (cad.exists()) {
            Object[] options = {"OK"};
            int confirmar = JOptionPane.showOptionDialog(null, "Usuário já existe!", "ERRO",JOptionPane.DEFAULT_OPTION, JOptionPane.YES_OPTION,null,options, options[0]);
            if(confirmar==0){
                          
                }
             if(confirmar==1) {

             }
        } else {
            if (pass.equals(confirmpass)) {
                u.CadastrarUsuario();
                cadUserField.setText("");
                cadPassField.setText("");
                cadConfirmaPassField.setText("");
                jProgressBar2.setValue(0);
                Object[] options = {"OK"};
                int confirmar = JOptionPane.showOptionDialog(null, "Usuário cadastrado!", "Sucesso",JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);
                if(confirmar==0){
                this.setVisible(false);   
                }
            }
        }
    }//GEN-LAST:event_CadButtonActionPerformed

    
    private void cadConfirmaPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadConfirmaPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadConfirmaPassFieldActionPerformed

    private void cadPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadPassFieldActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void cadPassFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cadPassFieldFocusLost
        String senha = cadPassField.getText();
        
        if (senha.isEmpty())
            valorforcasenha = 0;
        else
            valorforcasenha = 30;
        
        if (senha.contains("@")) {
            valorforcasenha += 25;
        }
        
        if (senha.contains("#")) {
            valorforcasenha += 15;
        }
        
        if (senha.contains("%")) {
            valorforcasenha += 15;
        }
        
        if (senha.contains("$")) {
            valorforcasenha += 10;
        }
        
        
        jProgressBar2.setValue(valorforcasenha); 
    }//GEN-LAST:event_cadPassFieldFocusLost

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed

        this.dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private int valorforcasenha = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadButton;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JPasswordField cadConfirmaPassField;
    private javax.swing.JPasswordField cadPassField;
    private javax.swing.JTextField cadUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
