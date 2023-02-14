package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.FuncionarioDAO;
import modelo.Funcionario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

public class JanelaEstilo extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaEstilo frame = new JanelaEstilo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaEstilo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(13, 6, 134));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblCPF.setForeground(new Color(18, 9, 196));
		lblCPF.setBounds(143, 128, 33, 14);
		contentPane.add(lblCPF);
		
		txtUser = new JTextField();
		txtUser.setDropMode(DropMode.ON);
		txtUser.setBounds(189, 95, 86, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(189, 126, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblNome = new JLabel("User");
		lblNome.setForeground(new Color(18, 9, 196));
		lblNome.setFont(new Font("Segoe UI", Font.BOLD, 11));
//		btnNewButton.setIcon(new imageIcon ("/home/user/image.gif")); //Tentativa de inserção de ícone
		lblNome.setBounds(143, 98, 33, 14);
		contentPane.add(lblNome);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(new Color(18, 9, 196));
		btnEnviar.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Pega o texto do campo de texto e armazena
				//nas variáveis para manipula-las
				String user = txtUser.getText();
				String cpf = txtCpf.getText();
				
				//Exemplo de validação
				if(user.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum usuário foi informado");
				}
				
				if(cpf.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nenhum CPF foi informado");
				}
				
				Funcionario func = new Funcionario();
				func.setUser(user);
				func.setCpf(Long.valueOf(cpf));
				
				FuncionarioDAO bdPessoa = FuncionarioDAO.getInstance();
				bdPessoa.inserir(func);
				
				FuncionarioDAO littlBanc = FuncionarioDAO.get();
				littlBanc.inserir(func);
		
			}
		});
		btnEnviar.setBounds(173, 166, 89, 23);
		contentPane.add(btnEnviar);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(88, 57, 279, 154);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
}
