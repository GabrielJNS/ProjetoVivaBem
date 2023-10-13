package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.*;
import java.awt.Color;

//Classe que chama a Tabela Relatório Pessoas
public class RelatorioPessoas extends JFrame
{
   private DefaultTableModel modelo;
   private JTable tabela;
   private String nome,endereco,telefone,email,cpf,data;
   
   public RelatorioPessoas()
   {
	   modelo = new DefaultTableModel();
	   tabela = new JTable(modelo);
	   
	   modelo.addColumn("Nome");
	   modelo.addColumn("cpf");
           modelo.addColumn("Endereço");
	   modelo.addColumn("Data");
           modelo.addColumn("Telefone");
	   modelo.addColumn("Email");
	   
	   setTitle("VivaBem - Relatório de Pessoas");
	   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           setIcon();
	   
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera","root","");
		   Statement stm = con.createStatement();
		   ResultSet res = stm.executeQuery("Select * from cadastro_paciente");
		   while(res.next())
		   {
			   nome = res.getString("nome");
                           cpf = res.getString("cpf");                           
			   endereco = res.getString("endereco");
                           data = res.getString("data_de_nascimento");
			   telefone = res.getString("telefone");
			   email = res.getString("email");
			   modelo.addRow(new Object[] {nome,cpf,endereco,data,telefone,email});
		   }
	   }
	   catch(ClassNotFoundException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
	   catch(SQLException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
	   tabela.setPreferredScrollableViewportSize(new Dimension(700,600));
	   Container c = getContentPane();
	   c.setLayout(new FlowLayout());
	   JScrollPane scarollPane = new JScrollPane(tabela);
	   c.add(scarollPane);
	   setSize(800,800);
	   setVisible(true);
	   
	  
	   JButton btnConsultar = new JButton("Voltar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            
                            dispose();				
			}
			
		});
		btnConsultar.setBounds(36, 401, 124, 23);
                btnConsultar.setBackground(new Color(175, 217, 159)); 

		c.add(btnConsultar);
	   
	   
   }

    private void setIcon() {
        URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }
    
}
