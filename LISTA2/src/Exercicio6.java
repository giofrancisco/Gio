import javax.swing.JOptionPane;


public class Exercicio6 {
	public static void main (String [] Args){
		/*6 - (Comando IF) Faça um algoritmo que leia um nº inteiro e mostre uma 
        mensagem indicando se este número é par ou ímpar. Ex: se (x%2=0) “x é par”, se 
        (x%2=1) “x é impar”.*/
	
	int numero;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	
	numero = numero % 2;
	
		if (numero == 0)
			JOptionPane.showMessageDialog(null, "Par");
		else
			JOptionPane.showMessageDialog(null, "impar");
	
	
	}
}
