import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		// Construa um programa que leia 20 n�meros 
		//inteiros e calcule ao final da leitura a soma e a m�dia desses n�meros.  

	Scanner pls =new Scanner(System.in);
	
	int n = 0, n1;
	int media,soma=0;
	do {
		System.out.println("Digite");
		n1=pls.nextInt();
		soma = soma +n1;
		media =soma/20;
	n++;

	
	}
	while(n <20);
	
	System.out.println("a soma �: "+ soma);
	System.out.println("a media �: "+media);
	
	
	}
}
	
	
	
	
	
	
	
	


