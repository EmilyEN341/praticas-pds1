package ex1;

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
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JButton;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtResult;
	int cont;
	public ArrayList<Double> listinha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		listinha = new ArrayList();
		cont = 0;
		txtNum = new JTextField();
		txtNum.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtNum.setBounds(256, 27, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);

		txtResult = new JTextField();
		txtResult.setEnabled(false);
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtResult.setBounds(256, 69, 86, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);

		JLabel lblNum = new JLabel("Informe um Número:");
		lblNum.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNum.setBounds(35, 27, 132, 14);
		contentPane.add(lblNum);

		JLabel lblResult = new JLabel("Resultado ");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblResult.setBounds(35, 69, 103, 14);
		contentPane.add(lblResult);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCadastrar.setBounds(71, 114, 89, 23);
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.valueOf(txtNum.getText());

				listinha.add(n1);
				txtNum.setText(null);

			}

		});
		contentPane.add(btnCadastrar);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExibir.setBounds(240, 114, 89, 23);

		btnExibir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(cont);
				
				
				for (Double double1 : listinha) {

					if (double1 % 2 == 0) {
						System.out.println(cont);

						cont++;
					}
				}

				txtResult.setText(String.valueOf(cont));
			}

		});

		contentPane.add(btnExibir);

	}
}
