package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;


//Tela de Agendar Consultas
public class Agenda extends javax.swing.JFrame 
{
    public String  nome, nome_medico, data, horario, descricao, dia, mes, ano;
    public static String nomeMedico;

   
    public Agenda() 
    {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       
        preencherComboBoxPacientes();
        preencherComboBoxMedico();
        
        preencherComboBoxHorarios();
        preencherComboBoxDia();
        preencherComboBoxMes();
        preencherComboBoxAno();
        setIcon();
    }


    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoHora = new javax.swing.JFormattedTextField();
        campoData = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        campoMedico = new javax.swing.JTextField();
        boxPaciente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        boxMedico = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoPaciente = new javax.swing.JTextField();
        boxHorario = new javax.swing.JComboBox<>();
        boxDia = new javax.swing.JComboBox<>();
        boxAno = new javax.swing.JComboBox<>();
        boxMes = new javax.swing.JComboBox<>();

        try {
            campoHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VivaBem");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome Médico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Descrição:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        campoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(campoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 380, 117));

        campoMedico.setBorder(null);
        campoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(campoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 0, -1));

        boxPaciente.setEditable(true);
        boxPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(boxPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 360, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Horários:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 28));

        boxMedico.setEditable(true);
        boxMedico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(boxMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 360, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Marcar Consultas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jButton2.setBackground(new java.awt.Color(175, 217, 159));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jButton4.setBackground(new java.awt.Color(175, 217, 159));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        jButton3.setBackground(new java.awt.Color(175, 217, 159));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/VivaBem.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nome:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 22));

        campoPaciente.setBorder(null);
        campoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(campoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 0, 20));

        boxHorario.setEditable(true);
        boxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(boxHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 70, -1));

        boxDia.setEditable(true);
        jPanel1.add(boxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, -1));

        boxAno.setEditable(true);
        boxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAnoActionPerformed(evt);
            }
        });
        jPanel1.add(boxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 60, -1));

        boxMes.setEditable(true);
        boxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMesActionPerformed(evt);
            }
        });
        jPanel1.add(boxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
   
 
    //ComboBox que pega dados Pacientes 
    private void preencherComboBoxPacientes() 
    {
        
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        String query = "SELECT nome FROM cadastro_paciente";
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        List<String> pacientes = new ArrayList<>();
        while (rs.next()) 
        {
            String paciente = rs.getString("nome");
            pacientes.add(paciente);
        }

        boxPaciente.setModel(new DefaultComboBoxModel<>(pacientes.toArray(new String[0])));

        con.close();
    } catch (ClassNotFoundException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    //ComboBox que pega dados Médicos
    private void preencherComboBoxMedico() 
    {
        
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        String query = "SELECT nome FROM cadastro_medico";
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        List<String> medicos = new ArrayList<>();
        while (rs.next()) 
        {
            String medico = rs.getString("nome");
            medicos.add(medico);
        }

        boxMedico.setModel(new DefaultComboBoxModel<>(medicos.toArray(new String[0])));

        con.close();
    } catch (ClassNotFoundException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    private void preencherComboBoxHorarios() 
    {
        
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        String query = "SELECT horario FROM tabela_horarios";
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        List<String> horarios = new ArrayList<>();
        while (rs.next()) 
        {
            String horario = rs.getString("horario");
            horarios.add(horario);
        }

        boxHorario.setModel(new DefaultComboBoxModel<>(horarios.toArray(new String[0])));

        con.close();
    } catch (ClassNotFoundException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
     private void preencherComboBoxDia() 
     {
         
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        String query = "SELECT dia FROM tabela_dia";
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        List<String> dias = new ArrayList<>();
        while (rs.next()) 
        {
            String dia = rs.getString("dia");
            dias.add(dia);
        }

        boxDia.setModel(new DefaultComboBoxModel<>(dias.toArray(new String[0])));

        con.close();
    } catch (ClassNotFoundException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
     private void preencherComboBoxMes() 
     {
         
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        String query = "SELECT mes FROM tabela_mes";
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        List<String> meses = new ArrayList<>();
        while (rs.next()) 
        {
            String mes = rs.getString("mes");
            meses.add(mes);
        }

        boxMes.setModel(new DefaultComboBoxModel<>(meses.toArray(new String[0])));

        con.close();
    } catch (ClassNotFoundException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    private void preencherComboBoxAno() 
    {
        
    try 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        String query = "SELECT ano FROM tabela_ano";
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        List<String> anos = new ArrayList<>();
        while (rs.next()) 
        {
            String ano = rs.getString("ano");
            anos.add(ano);
        }

        boxAno.setModel(new DefaultComboBoxModel<>(anos.toArray(new String[0])));

        con.close();
    } catch (ClassNotFoundException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    private void campoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        boxPaciente.setSelectedItem(null);
        boxMedico.setSelectedItem(null);
        boxDia.setSelectedItem(null);
        boxMes.setSelectedItem(null);
        boxAno.setSelectedItem(null);
        boxHorario.setSelectedItem(null);
        campoDescricao.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        nome = (String) boxPaciente.getSelectedItem();
        nomeMedico = (String) boxMedico.getSelectedItem();
        String nome_medico = (String) boxMedico.getSelectedItem();
        String horario = (String) boxHorario.getSelectedItem();
        descricao = campoDescricao.getText();
        dia = (String) boxDia.getSelectedItem();
        mes = (String) boxMes.getSelectedItem();
        ano = (String) boxAno.getSelectedItem();                
                    
                     
       //Salva dados na Tabela Consultas              
        try
        {
	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
        Statement stm = con.createStatement();
        String query = "INSERT INTO tabela_consultas (nome, nome_medico, data, horario, descricao, dia, mes, ano) VALUES ('" + nome + "', '" + nome_medico + "', '" + data + "', '" + horario + "', '" + descricao + "', '" + dia + "', '" + mes + "', '" + ano + "')";

        if (stm.executeUpdate(query) != 0) {
                JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                boxPaciente.setSelectedItem(null);
                boxMedico.setSelectedItem(null);
                boxDia.setSelectedItem(null);
                boxMes.setSelectedItem(null);
                boxAno.setSelectedItem(null);
                boxHorario.setSelectedItem(null);
                campoDescricao.setText("");
}
		 else {
                JOptionPane.showMessageDialog(null, "Erro para realizar o cadastro!!!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void boxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPacienteActionPerformed

    private void boxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMedicoActionPerformed

    private void boxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxHorarioActionPerformed

    private void boxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxAnoActionPerformed

    private void boxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMesActionPerformed

    private void campoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPacienteActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void campoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMedicoActionPerformed

    }//GEN-LAST:event_campoMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAno;
    private javax.swing.JComboBox<String> boxDia;
    private javax.swing.JComboBox<String> boxHorario;
    private javax.swing.JComboBox<String> boxMedico;
    private javax.swing.JComboBox<String> boxMes;
    private javax.swing.JComboBox<String> boxPaciente;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JFormattedTextField campoHora;
    private javax.swing.JTextField campoMedico;
    private javax.swing.JTextField campoPaciente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    //Icone
    private void setIcon() {
        URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }
}

