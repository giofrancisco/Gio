import javax.swing.JOptionPane;


public class Exercicio9 {
	public static void main (String [] args){
		/*9 – (Comando For) Escreva um Programa que receba a idade de 15 pessoas, calcule e imprima: 
        - a quantidade de pessoas em cada faixa etária; a porcentagem de cada faixa etária em 
        relação ao total de pessoas. 

 		As faixas etárias são:
		1 a 15 anos 
		16 a 30 anos 
		31 a 45 anos 
		46 a 60 anos 
		> = 61 anos*/
		
		int idade, faixa1 = 0, faixa2 = 0, faixa3 =0, faixa4 =0, faixa5 =0;
		float percentual1, percentual2, percentual3, percentual4,percentual5;
		
		for (int i= 0; i <= 14; i++){
			idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade"));
			if (idade >= 1 && idade <=15)
				faixa1 ++;
				if (idade >=16 && idade <=30)
					faixa2 ++ ;
						if (idade >=31 && idade <=45)
						faixa3 ++;
						if (idade >= 46 && idade <=60)
							faixa4 ++;
							if (idade >=61)
								faixa5 ++;
		}
		percentual1 = (faixa1*100)/15;
		percentual2 = (faixa2*100)/15;
		percentual3 = (faixa3*100)/15;
		percentual4 = (faixa4*100)/15;
		percentual5 = (faixa5*100)/15;
		
		System.out.println("A quantidade de pessoas com idade entre 1 e 15 anos é " + faixa1 + " e em relação ao total " + percentual1 + "%");
		System.out.println("A quantidade de pessoas com idade entre 16 e 30 anos é " + faixa2 + " e em relação ao total " + percentual2 + "%");
		System.out.println("A quantidade de pessoas com idade entre 31 e 45 anos é " + faixa3 + " e em relação ao total " + percentual3 + "%");
		System.out.println("A quantidade de pessoas com idade entre 46 e 60 anos é " + faixa4 + " e em relação ao total " + percentual4 + "%");
		System.out.println("A quantidade de pessoas com idade acima de 61 é " + faixa5 + " e em relação ao total " + percentual5 + "%");
		
}
}