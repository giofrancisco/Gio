import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] Args) {
		/*
		 * 3 – Faça um algoritmo em Java para calcular e exibir um salário
		 * reajustado em 23,75%. O salário atual deve ser fornecido pelo
		 * usuário.
		 */

		double salario;
		double reajustado = 0;

		salario = Double.parseDouble(JOptionPane.showInputDialog("informe o salario do peao"));
		reajustado = salario + (salario * 0.2375);

		JOptionPane.showMessageDialog(null, "O salario reajustado é "+ reajustado);

	}
}
