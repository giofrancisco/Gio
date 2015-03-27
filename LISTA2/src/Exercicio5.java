import javax.swing.JOptionPane;


public class Exercicio5 {
	public static void main (String [] args){
		// 5 – (Comando IF) Ler 3 valores e escrevê-los em ordem crescente.
		
		double valor1, valor2, valor3;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		valor3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro valor"));
			
			if (valor1 > valor2 && valor2 > valor3)
				JOptionPane.showMessageDialog(null, valor3 + " " + valor2 + " "  + valor1);
				else if (valor1 > valor3 && valor3 > valor2)
						JOptionPane.showMessageDialog(null, valor2 + " " + valor3 + " "  + valor1);
				        else if (valor2 > valor1 && valor1 > valor3)
				        		JOptionPane.showMessageDialog(null, valor3 + " " + valor1 + " " + valor2);
				        		else if (valor2 > valor3 && valor3 > valor1)
				        				JOptionPane.showInternalMessageDialog(null, valor1 + " " + valor3 + " " + valor2);
				        				else if (valor3 > valor1 && valor1 > valor2)
				        						JOptionPane.showMessageDialog(null, valor2 + " " + valor1 + " " + valor3);
				        				        else if (valor3 > valor2 && valor2 > valor1)
				        				        		JOptionPane.showMessageDialog(null, valor1 + " " + valor2 + " " + valor3);
}
}
