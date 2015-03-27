import java.util.Random;

import javax.swing.JOptionPane;

//atividade de contrução de fila (banco)

public class Fila {
	static int[] fila = new int [10]; // vetor de 10 posições declaração
	public static void main(String[] args) {
		int operacao;
		do {	
		operacao = Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar "
															  + "\n2-Atender"
															  + "\n3-Imprimir "
															  + "\n4-Verificar"
															  + "\n5-Limpar"
															  + "\n6-Aleatorio"
															  + "\n7-Sair"));
														  
		if (operacao == 1){
			adicionar();
		}
		if (operacao == 2){
			atender();
		}
		if (operacao == 3){
			imprimir();
		}
		if (operacao == 4){
			verificar();
		}
		if (operacao == 5){
			limpar();
		}
		if (operacao == 6){
			aleatorio();
		}
		}while (operacao != 7);
	}
	public static void adicionar() { // adicionar elementos da fila
		int valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		for (int i = 0; i < 10; i++ ){
			if (fila[i] == 0){ // espaço esta vazio
				fila[i] = valor;
				break;
			} 
		
		}	
	}
	public static void atender() { // retira elementos da fila
		for (int i = 0; i < 10; i++){
			if (i != 9){
				if (fila[i] !=0){
					fila[i]=fila[i+1];
				}
			}else
				fila[i] = 0;
		}
			
	}	
	
	public static void imprimir() { // imprimir todos elementos da fila
		String imprimir = "";
		for (int i = 0; i < 10; i++){
			if (fila[i]!=0)
				imprimir = imprimir + Integer.toString(fila[i]) +" ";
		}
		JOptionPane.showMessageDialog(null, imprimir);
	}
	public static void verificar() { // verifica se a fila esta vazia
		for (int i = 0; i < 10; i++){
			if (fila[i] == 0)
				JOptionPane.showMessageDialog(null, "Espaço vazio");
			else
				JOptionPane.showMessageDialog(null, "Espaço ocupado");
		}
			
	}
	public static void limpar() { // deleta todos os elementos da fila
		for (int i = 0; i < 10; i++){
			fila[i] = 0;
		}
	}
	public static void aleatorio() { // preencer a fila com valores aleatorios
		Random gerador = new Random();
		for (int i=0; i < 10; i++){
			if (fila[i] == 0){
				fila[i] = gerador.nextInt(100);
			}
		}
	}
}
