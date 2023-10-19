package listaDowhile;
import java.util.Scanner;
public class programaCalculoIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoN, anoA, i, idade, v, n;
		System.out.println("Escreva o seu ano de nascimento:");
		anoN= ler.nextInt();
		
		System.out.println("Escreva o no atual:");
		anoA= ler.nextInt();
		idade = anoA - anoN;
		
		n = idade;
		v = idade;
		
		for(i=2;i<=10;i++) {
			System.out.println("Escreva o seu ano de nascimento:");
			anoN= ler.nextInt();
			
			System.out.println("Escreva o ano atual:");
			anoA= ler.nextInt();
			idade = anoA - anoN;
			
			if (idade >= n) {
				v=idade;
			} else {
				if (idade <= v) {
					n = idade;
				}
				
			}
			System.out.println("mais velho "+ v);
			System.out.println("mais novo "+ n);
			
		}
		ler.close();
	}
}
