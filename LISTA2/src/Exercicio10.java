/*10 - (Comando For) Faça uma Programa que receba a idade e a altura de várias 

pessoas. Calcule e imprima a média das alturas das pessoas com mais de 50 

anos. Para encerrar a entrada de dados, digite idade <= zero.*/


import javax.swing.JOptionPane;

public class Exercicio10 {
	
	public static void main (String[]args){
		int idade;
		double altura,mediaAltura,totalAltura=0,mais50=0;
		
		for (int i=0;i<1;){
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade / informe 0 para finalizar"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
			if(idade> 50){
				totalAltura += altura;
				mais50++;
			}			
			if (idade==0){
				i++;			
			}
		}
		
		mediaAltura = totalAltura/mais50;		
		JOptionPane.showMessageDialog(null, "Media de altura das pessoas com mais de 50 anos: "+mediaAltura);
		
	}
}

	
	
	
	
	