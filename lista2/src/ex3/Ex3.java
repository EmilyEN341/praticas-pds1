package ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JButton;

public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomea;
	private JTextField txtDataNaA;
	private JTextField txtMatriculaA;
	private JTextField txtSiape;
	private JTextField txtCpfA;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnCadastraAluno;
	private JButton btnAluno;
	private JButton btnProf;
	private Aluno aluninhos;
	private Professor profs; 
	private ArrayList <Aluno> alunos;
	private ArrayList <Professor> professores;
	private JButton btnCadastroProf;
	private JTextField textNomeP;
	private JTextField txtDataP;
	private JTextField txtCpfP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		alunos = new ArrayList <>();
		professores = new ArrayList <>();
		profs = new Professor();
		aluninhos = new Aluno();
		
		
		
		contentPane.setLayout(null);
		
		txtNomea = new JTextField();
		txtNomea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtNomea.setBounds(148, 8, 86, 20);
		contentPane.add(txtNomea);
		txtNomea.setColumns(10);
		
		txtDataNaA = new JTextField();
		txtDataNaA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtDataNaA.setBounds(148, 39, 86, 20);
		contentPane.add(txtDataNaA);
		txtDataNaA.setColumns(10);
		
		txtMatriculaA = new JTextField();
		txtMatriculaA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtMatriculaA.setBounds(148, 100, 86, 20);
		contentPane.add(txtMatriculaA);
		txtMatriculaA.setColumns(10);
		
		txtSiape = new JTextField();
		txtSiape.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtSiape.setBounds(348, 100, 86, 20);
		contentPane.add(txtSiape);
		txtSiape.setColumns(10);
		
		txtCpfA = new JTextField();
		txtCpfA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtCpfA.setBounds(148, 69, 86, 20);
		contentPane.add(txtCpfA);
		txtCpfA.setColumns(10);
		
		lblNewLabel = new JLabel("Nome aluno:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 104, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Data de nascimento do aluno:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_1.setBounds(10, 37, 150, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Matricula Aluno:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 103, 114, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Siape Professor:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(244, 103, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		btnCadastraAluno = new JButton("Cadastrar Aluno: ");
		btnCadastraAluno.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastraAluno.setBounds(37, 153, 153, 23);
		btnCadastraAluno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nomeA = txtNomea.getText();
				String dataA = txtDataNaA.getText();
				String cpfA = txtCpfA.getText();
				String matA = txtMatriculaA.getText();				
				
				if (!nomeA.isEmpty()) {
					aluninhos.setNome(nomeA);
				}else {
					JOptionPane.showMessageDialog(null, "Informe o nome do aluno: ");
				}
				if (!dataA.isEmpty()) {
					Date nasci = new Date(dataA);
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Informe a data de nascimento: ");
				}
				if (!cpfA.isEmpty()) {
					Long cpfAL = Long.valueOf(cpfA);
					aluninhos.setCpf(cpfAL);
				}else {
					JOptionPane.showMessageDialog(null,"Informe o cpf: ");
				}
				if (!matA.isEmpty()) {
					Long matAl = Long.valueOf(matA);
					aluninhos.setMatricula(matAl);	
				}
				alunos.add(aluninhos);
					
			}
			
		});
		
		contentPane.add(btnCadastraAluno);
		
		btnAluno = new JButton("Alunos");
		btnAluno.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnAluno.setBounds(240, 153, 89, 23);
		contentPane.add(btnAluno);
		
		btnProf = new JButton("Professor ");
		btnProf.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnProf.setBounds(240, 187, 89, 23);
		contentPane.add(btnProf);
		
		btnCadastroProf = new JButton("Cadastrar professor:");
		btnCadastroProf.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastroProf.setBounds(37, 187, 153, 23);
		
		btnCadastroProf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nomeP = textNomeP.getText();
				String dataP = txtDataP.getText();
				String cpfP = txtCpfP.getText();
				String siape = txtSiape.getText();
				
						
						
				
			}
			
			
		});
		contentPane.add(btnCadastroProf);
		
		textNomeP = new JTextField();
		textNomeP.setBounds(348, 8, 86, 20);
		contentPane.add(textNomeP);
		textNomeP.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Nome professor: ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(244, 11, 104, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DataNasc Prof:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(244, 42, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CPF prof:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(244, 72, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		txtDataP = new JTextField();
		txtDataP.setBounds(348, 39, 86, 20);
		contentPane.add(txtDataP);
		txtDataP.setColumns(10);
		
		txtCpfP = new JTextField();
		txtCpfP.setBounds(348, 69, 86, 20);
		contentPane.add(txtCpfP);
		txtCpfP.setColumns(10);
		
		
	}
}
