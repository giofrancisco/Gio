import javax.swing.JOptionPane;


public class Exemplo {
	public static void main (String [] args){
		String nome;
		double peso;
		int idade;
		JOptionPane.showMessageDialog(null, "Saiiiiiiii pia");
		
		nome = JOptionPane.showInputDialog("Digite seu nome ou morra");
		
		//converter de String para inteiro
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade ou morra"));
		
		//Converter de String para Double
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso ou morra"));
		
		
	}
}
