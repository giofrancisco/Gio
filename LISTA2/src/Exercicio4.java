import javax.swing.JOptionPane;


public class Exercicio4 {
	public static void main (String [] args){
		/*4 � Fa�a um algoritmo em Java para calcular e exibir do sal�rio l�quido de um 
		professor, onde o n�mero de horas, o valor da hora e o percentual do INSS devem 
		ser fornecidos pelo usu�rio:
		salario_bruto <- num_hora_aula * valor_hora_aula 
		salario_liquido <- salario_bruto � (salario_bruto * percentual_INSS).*/	
		
		double salariobruto, salarioliquido, numerohoras, valorhora, inss;
		
		numerohoras = Double.parseDouble(JOptionPane.showInputDialog("Infomre o numero de horas trabalhadas"));
		valorhora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora aula"));
		inss = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do INSS"));
		
		double percentual = inss /100;
		
		salariobruto = numerohoras * valorhora;
		salarioliquido = salariobruto - (salariobruto * percentual);
		
		JOptionPane.showMessageDialog(null, "O salario liquido do peao � " + salarioliquido);
		
	}
}
