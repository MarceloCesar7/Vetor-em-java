
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		int [] vetor = new int[n];
		for ( int j = 0; j < n; j++) {
			System.out.print("Digite um numero: ");
		vetor[j] = sc.nextInt();
		}
		System.out.println("Numeros negativos");
		for ( int k = 0; k < n; k++)
			if(vetor[k] < 0)
				System.out.printf("%d\n", vetor[k]);
		

	}

}
