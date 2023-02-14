package visao;

import javax.swing.JOptionPane;

public class Janela {

	public static void main(String[] args) {

		String digitado = JOptionPane.showInputDialog("Digite algo: ");

		if (!digitado.isEmpty()) {
			JOptionPane.showConfirmDialog(null, digitado);
		}

		JOptionPane.showInputDialog(null, "Qual é o seu nome?"); // Mostra um pop up que tem um campo para mensagem

		int opcao = JOptionPane.showConfirmDialog(null, "");
		if (opcao == 0) {
//			JOptionPane.show
		}
	}

}
