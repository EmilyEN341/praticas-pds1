package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtMaior;
	private JTextField txtMenor;
	public ArrayList <Double>lista; 
	public int maior;
	public int menor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
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
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lista = new ArrayList();
		maior =99999999;
		menor =0;
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtNum.setBounds(161, 21, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtMaior = new JTextField();
		txtMaior.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtMaior.setEditable(false);
		txtMaior.setBounds(161, 52, 86, 20);
		contentPane.add(txtMaior);
		txtMaior.setColumns(10);
		
		txtMenor = new JTextField();
		txtMenor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtMenor.setEditable(false);
		txtMenor.setBounds(161, 83, 86, 20);
		contentPane.add(txtMenor);
		txtMenor.setColumns(10);
		
		JLabel lblNumero = new JLabel("Informe o número:");
		lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNumero.setBounds(22, 24, 112, 14);
		contentPane.add(lblNumero);
		
		JLabel lblMaior = new JLabel("Maior:");
		lblMaior.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMaior.setBounds(22, 55, 46, 14);
		contentPane.add(lblMaior);
		
		JLabel lblMenor = new JLabel("Menor");
		lblMenor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMenor.setBounds(22, 86, 46, 14);
		contentPane.add(lblMenor);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastrar.setBounds(35, 146, 89, 23);
		
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double num = Double.valueOf(txtNum.getText());
				lista.add(num);
				txtNum.setText(null);
			}
			
		});
		
		contentPane.add(btnCadastrar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExibir.setBounds(188, 146, 89, 23);
		btnExibir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double min = Collections.min(lista);
				Double max = Collections.max(lista);
				txtMaior.setText(max.toString());
				txtMenor.setText(min.toString());
			}
			
		});
		
		
		contentPane.add(btnExibir);
	}

}
