package listaDowhile;

public class programaMultiplo {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=100; i++) {
			System.out.println(i);
			if(i % 10 ==0){
				System.out.println(i+ " M�ltiplo de 10");
			}
		}
	}
}
