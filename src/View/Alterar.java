package View;


import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//Tela de Alterar Cadastro Paciente
public class Alterar extends javax.swing.JFrame {

    private String nomeAtual, enderecoAtual, telefoneAtual, emailAtual;
    private String novoNome;
    private String novoEndereco;
    private String novoTelefone;
    private String novoEmail;
    private String nomeConsulta = "";
	
    public Alterar() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setIcon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNovoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNovoEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNovoTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoNovoEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoNomeConsulta = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Endere�o");

        campoNovoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNovoEnderecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone");

        jLabel4.setText("Email");

        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpa");

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Informe o nome a alterar");

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNovoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNovoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNovoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNovoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(campoNomeConsulta)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(78, 78, 78)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(152, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(campoNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campoNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(campoNovoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(campoNovoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campoNovoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>                        

    private void campoNovoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int status;
				
				
	try
	{
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera","root","");
               Statement stm = con.createStatement();
               ResultSet res = stm.executeQuery("SELECT * from cadastro_paciente");
					
                nomeConsulta = campoNomeConsulta.getText();
                status = 0;
		while(res.next())
		{
		   nomeAtual = res.getString("nome");
		   
                   if(nomeAtual.compareTo(nomeConsulta)==0)
		   {
			  enderecoAtual = res.getString("endereco");
			  telefoneAtual = res.getString("telefone");
			  emailAtual = res.getString("email");
			  status = 1;						  
		   }					   			   
		}
		if(status == 1)
		{
			campoNovoEndereco.setText(enderecoAtual);
			campoNovoTelefone.setText(telefoneAtual);
			campoNovoEmail.setText(emailAtual);
		}
		if(status == 0)
		{
			JOptionPane.showMessageDialog(null,"Nome: "+nomeConsulta+" n?o encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
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
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String classeDriver = "com.mysql.cj.jdbc.Driver";
	String stringConexao = "jdbc:mysql://localhost/acelera";
	String login = "root";
	String senha = "";
	Connection con;
	String sql;
	            
	novoNome = campoNovoNome.getText();
	novoEndereco = campoNovoEndereco.getText();
	novoTelefone = campoNovoTelefone.getText();
	novoEmail = campoNovoEmail.getText();
	            
	con=null;
	sql = "SELECT * FROM cadastro_paciente";

	try
	{
	    Class.forName(classeDriver);
	    con = DriverManager.getConnection(stringConexao, login, senha);
	    PreparedStatement stmt = con.prepareStatement(sql);

	    int x=stmt.executeUpdate("UPDATE dados SET nome='"+novoNome+"'," +
	         "endereco='"+novoEndereco+"', telefone='"+novoTelefone+"'," +
	         "email='"+novoEmail+"' WHERE nome='"+nomeConsulta+"';");
            if (x == 1 )
                JOptionPane.showMessageDialog(null,"Cadastro atualizado com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
        }
	catch(SQLException ex)
	{
	   JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.INFORMATION_MESSAGE);
	}
	catch(ClassNotFoundException ex)
	{
	   JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.INFORMATION_MESSAGE);
	}
				
    }                                        

    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField campoNomeConsulta;
    private javax.swing.JTextField campoNovoEmail;
    private javax.swing.JTextField campoNovoEndereco;
    private javax.swing.JTextField campoNovoNome;
    private javax.swing.JTextField campoNovoTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   

    private void setIcon() {
    URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }
}
