package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.*;
//Tela de Deletar Funcinários
public class DeleteFuncionarios extends JFrame {
    private Connection con;
    private DefaultTableModel tableModel;
    private JTable table;

    public DeleteFuncionarios() {
        initComponents();
        setIcon();
    }

    private void initComponents() {
        setTitle("VivaBem - Exclusão de Funcionários");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        // Painel de formulário
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        formPanel.setBackground(Color.WHITE);

        // Campos de entrada
        JLabel labelTabela = new JLabel("Tabela:");
        JComboBox<String> comboBoxTabela = new JComboBox<>(new String[]{"cadastro_funcionarios"});
        JLabel labelId = new JLabel("ID:");
        JTextField textFieldId = new JTextField();

        // Botões
        JButton buttonExcluir = new JButton("Excluir");
        JButton buttonExibirTodos = new JButton("Exibir Todos");

        // Definir cor dos botões
        Color buttonColor = new Color(175, 217, 159);
        buttonExcluir.setBackground(buttonColor);
        buttonExibirTodos.setBackground(buttonColor);

        // Tabela
        tableModel = new DefaultTableModel(new Object[]{"id", "nome", "cargo"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBackground(Color.WHITE);

        // Definir cor da tabela
        table.setBackground(Color.WHITE);

        formPanel.add(labelTabela);
        formPanel.add(comboBoxTabela);
        formPanel.add(labelId);
        formPanel.add(textFieldId);
        formPanel.add(buttonExcluir);
        formPanel.add(buttonExibirTodos);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Definir cor do painel principal
        panel.setBackground(Color.WHITE);

        add(panel);

        buttonExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x=0;
                UIManager.put("OptionPane.cancelButtonText", "Cancelar"); 
                UIManager.put("OptionPane.noButtonText", "Não"); 
                UIManager.put("OptionPane.yesButtonText", "Sim");
                x = JOptionPane.showConfirmDialog(null, "Tem Certeza que Deseja EXCLUIR Usuário?", null, JOptionPane.YES_NO_CANCEL_OPTION);
                int Sim = 0;
                int no = 1;
                int cancel = 2;
                if(x==0){
                String tabela = (String) comboBoxTabela.getSelectedItem();
                String id = textFieldId.getText();
                excluirUsuario(tabela, id);
            }}
        });

        buttonExibirTodos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tabela = (String) comboBoxTabela.getSelectedItem();
                exibirTodos(tabela);
            }
        });

        setVisible(true);
    }

    private void excluirUsuario(String tabela, String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
            Statement stm = con.createStatement();

            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite um ID válido.");
                return;
            }

            String query = "SELECT * FROM " + tabela + " WHERE id = " + id;
            ResultSet rs = stm.executeQuery(query);

            if (rs.next()) {
                query = "DELETE FROM " + tabela + " WHERE id = " + id;
                int rowsDeleted = stm.executeUpdate(query);

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!");
                    exibirTodos(tabela); // Atualiza a tabela após exclusão
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir usuário.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID não encontrado na tabela " + tabela + ".");
            }

            stm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir usuário: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir usuário: " + ex.getMessage());
        }
    }

    private void exibirTodos(String tabela) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/acelera", "root", "");
            Statement stm = con.createStatement();

            String query = "SELECT id, nome, cpf FROM " + tabela;
            ResultSet rs = stm.executeQuery(query);

            tableModel.setRowCount(0);

            while (rs.next()) {
                Object[] rowData = new Object[]{rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")};
                tableModel.addRow(rowData);
            }

            stm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao exibir usuários: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao exibir usuários: " + ex.getMessage());
        }
    }

    private void setIcon() {
        URL url = this.getClass().getResource("/Imagens/heart.png");
         Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
         this.setIconImage(imgTitulo);
    }

    
}
