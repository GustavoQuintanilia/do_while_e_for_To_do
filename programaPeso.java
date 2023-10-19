package listaDowhile;
import java.util.Scanner;
public class programaPeso {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso, altura, alturaC, pesoI;
		String sexo, r;
		
		do {
		System.out.println("qual o seu sexo?");
		sexo = ler.next();
		
		System.out.println("Qual é o seu peso?");
		peso = ler.nextDouble();
		
		System.out.println("Qual a sua altura? Em metros.");
		altura = ler.nextDouble();
		
			alturaC = altura * 100;
			
			if(sexo.equals("m")) {
				pesoI = 52+(0.75*(alturaC-152.4));
			
			}
			else{
				pesoI = 52+(0.67*(alturaC-152.4));
				
			} 
			if (peso<pesoI) {
		    	System.out.println("Você está abaixo do peso.");
		    	
		    } else if (peso==pesoI){
		    	System.out.println("Você está no peso ideal.");    	
		    }else {
		    	System.out.println("Você está acima do peso.");
		    }
			System.out.println("quer continuar a execução do programa?");
			r = ler.next();
		}while (r.equalsIgnoreCase("S"));
		ler.close();
	}

}
