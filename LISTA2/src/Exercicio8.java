import javax.swing.JOptionPane;


public class Exercicio8 {
	public static void main (String [] Args){
	/*8 - (Comando Do-While) Fazer um programa que calcule a tabuada de qualquer 
    n�mero, e o limite de c�lculo deve ser definido pelo usu�rio:*/
		
		int tabuada, calculo, contador = 0;
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe a tabuada que deseja calcular"));
		calculo = Integer.parseInt(JOptionPane.showInputDialog("informe ate qual valor deseja calcular"));
		
		do{
			contador ++;
			System.out.println("" + tabuada + "*" + contador + "=" + tabuada*contador);
			
		} while (contador != calculo);
			
			
			
		}
		
	}

