/*11 - (Comando For) Foi feita uma pesquisa de audi�ncia de canal de TV em 
v�rias casas de uma certa cidade, em um determinado dia. Para cada casa 
visitada foi fornecido o n�mero do canal (4, 5, 7, 12) e o n�mero de pessoas que 
estavam assistindo a ele naquela casa. Se a televis�o estivesse desligada, nada 
seria anotado, ou seja, esta casa n�o entraria na pesquisa. Fa�a um Programa 
que: 
Leia um n�mero indeterminado de dados, isto �, o n�mero do canal e o n�mero de 
pessoas que estavam assistindo; 
Calcule e imprima a porcentagem de audi�ncia em cada canal. Para encerrar a 
entrada de dados, digite o n�mero do canal zero.*/

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		int canal = 0, pessoas, total = 0;
		int total4 = 0, total5 = 0, total7 = 0, total12 = 0;
		double porcentagem4, porcentagem5, porcentagem7, porcentagem12;
		String ligada;

		for (int i = 0; i < 1;) {
			ligada = JOptionPane.showInputDialog("Sua Tv est� ligada? s/n");

			if (ligada.equalsIgnoreCase("s")) {
				canal = Integer.parseInt(JOptionPane.showInputDialog("informe o canal"));
				pessoas = Integer.parseInt(JOptionPane.showInputDialog("informe o numero de pessoas assistindo"));
				if (canal == 4) {
					total4 += pessoas;
					total += pessoas;
				} else if (canal == 5) {
					total5 += pessoas;
					total += pessoas;
				} else if (canal == 7) {
					total7 += pessoas;
					total += pessoas;
				} else if (canal == 12) {
					total12 += pessoas;
					total += pessoas;
				}
				if (canal == 0) {
					i++;
				}
			}
		}

		
		porcentagem4 = (100 * total4) / total;
		porcentagem5 = (100 * total5) / total;
		porcentagem7 = (100 * total7) / total;
		porcentagem12 = (100 * total12) / total;

		JOptionPane.showMessageDialog(null, "porcentagem do canal 4: "+ porcentagem4 + "%");
		JOptionPane.showMessageDialog(null, "porcentagem do canal 5: "+ porcentagem5 + "%");
		JOptionPane.showMessageDialog(null, "porcentagem do canal 7: "+ porcentagem7 + "%");
		JOptionPane.showMessageDialog(null, "porcentagem do canal 12: "+ porcentagem12 + "%");

	}
}
