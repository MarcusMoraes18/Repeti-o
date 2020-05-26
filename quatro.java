import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
		// Construa um programa que leia 15 números inteiros e,
		//ao final, mostre qual foi o maior valor fornecido.  
	
	
	
		Scanner pls =new Scanner(System.in);
		
		int n = 0, n1;
		int maior=0;
		
		do {
			System.out.println("Digite");
			n1=pls.nextInt();
			n++;
			
		
			if(n1 > maior){
				 maior = n1;
		}
		}
		while(n <15);
		
		System.out.println("o maior é: " +maior);
		
		
	
	
	
	
	}

}
