import javax.swing.JOptionPane;


public class Exercicio6 {
	public static void main (String [] Args){
		/*6 - (Comando IF) Fa�a um algoritmo que leia um n� inteiro e mostre uma 
        mensagem indicando se este n�mero � par ou �mpar. Ex: se (x%2=0) �x � par�, se 
        (x%2=1) �x � impar�.*/
	
	int numero;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	
	numero = numero % 2;
	
		if (numero == 0)
			JOptionPane.showMessageDialog(null, "Par");
		else
			JOptionPane.showMessageDialog(null, "impar");
	
	
	}
}
