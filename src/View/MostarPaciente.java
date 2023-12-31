/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 * Tela Mostrar pacientes
 */
public class MostarPaciente extends javax.swing.JFrame {
    public String nome, endereco, data, cpf,  telefone, email, senha;
    public String senhaconf;
    public String dados;
    public String nomeConsulta = "";

  

    /**
     * Creates new form CadastroPaciente
     */
    public MostarPaciente() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        btMostrarPacientes = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        campoCpf = new javax.swing.JFormattedTextField();
        campoDatadeNascimento = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VivaBem");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nome completo: *");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, -1));

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 340, -1));

        jLabel4.setText("CPF: * ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel5.setText("Endereço: *");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 340, -1));

        jLabel6.setText("Dada de nascimento: *");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel7.setText("Telefone: *");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel8.setText("E-mail: *");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 340, -1));

        btMostrarPacientes.setText("Mostrar Pacientes");
        btMostrarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(btMostrarPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 130, 30));

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 120, 30));

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 340, -1));

        try {
            campoDatadeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campoDatadeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 110, -1));

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Digite o Nome do Paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        btLimpar.setText("Limpar Campos");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastro de pacientes.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -50, 1640, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed
    //Botão que chama dados do cadastro_paciente
    private void btMostrarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarPacientesActionPerformed
     int status;
				
				
	try
	{
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera","root","");
               Statement stm = con.createStatement();
               ResultSet res = stm.executeQuery("SELECT * from cadastro_paciente");
					
                nomeConsulta = campoNome.getText();
                
              
                status = 0;
		while(res.next())
		{
		   nome = res.getString("nome");
                   
		   
                   if(nome.compareTo(nomeConsulta)==0)
		   {
			  cpf = res.getString("cpf");
                          endereco = res.getString("endereco");
                          data = res.getString("data_de_nascimento");
			  telefone = res.getString("telefone");
			  email = res.getString("email");
			  status = 1;						  
		   }					   			   
		}
		if(status == 1)
		{
			campoCpf.setText(cpf);
			campoEndereco.setText(endereco);
			campoDatadeNascimento.setText(data);
                        campoTelefone.setText(telefone);
                        campoEmail.setText(email);
		}
		if(status == 0)
		{
			JOptionPane.showMessageDialog(null,"Nome: "+nomeConsulta+" não encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
		}
	}
	catch(ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
	}
       
    }//GEN-LAST:event_btMostrarPacientesActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
            dispose();  
        
        
        
    }//GEN-LAST:event_btVoltarActionPerformed
    //Botão que Limpa os Campos
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
                        campoNome.setText("");
                        campoCpf.setText("");
			campoEndereco.setText("");
			campoDatadeNascimento.setText("");
                        campoTelefone.setText("");
                        campoEmail.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMostrarPacientes;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoDatadeNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

  

    private void setIcon() {
        URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }
}
