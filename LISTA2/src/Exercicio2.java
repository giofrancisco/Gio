import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] Args) {
		/*
		 * 2 – Escreva um programa em Java para ler uma temperatura em graus
		 * Celsius, calcular e escrever o valor correspondente em graus
		 * Fahrenheit.
		 */

		double grausC, grausF;

		grausC = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));

		grausF = grausC * 1.8 + 32;

		JOptionPane.showMessageDialog(null, "A temperatura em Celsius é"+ grausF);
	}
}
