import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Wolf =new Scanner(System.in);
						
	double Asalario=1000, Bsalario = 0, Altura, Media, Soma=0, Maior=0, Menor =3;
	int cont=1, cont1000=0;
	String sexo;
	
	do {
		System.out.println("Digite o sexo F ou M: ");
		sexo=Wolf.next();
		System.out.println("Digite seu salario: ");
		Bsalario=Wolf.nextDouble();
		System.out.println("Digite sua altura ex(1,8): ");
		Altura=Wolf.nextDouble();
		cont++;
		Soma =Soma + Bsalario;
		Media=Soma/20;
		if(Altura>Maior) {
			
			Maior=Altura;
			}
		else if (Bsalario < Asalario && sexo.contentEquals("f")) {
			cont1000++;
			
			
		}
		}
	
		while(cont<=20);
	System.out.printf("Media de salario do grupo: %.2f: \n ",Media);
	System.out.println("Maior altura do grupo: " +Maior+ " metros e menor altura do gupo: "+ Menor+" metros");
	System.out.println("Mulheres com salario ate R$1000: R$"+cont1000);
	
	
	
	
	
	
	
	}

}
