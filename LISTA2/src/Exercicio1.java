import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] Args) {
		/*
		 * 1 – Escreva um programa em Java para ler uma temperatura em graus
		 * Fahrenheit, calcular e escrever o valor correspondente em graus
		 * Celsius.
		 */

		double grausC, grausF;

		grausF = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit"));

		grausC = (grausF - 32) / 1.8;

		JOptionPane.showMessageDialog(null, "A temperatura em Celsius é"+ grausC);

	}
}
