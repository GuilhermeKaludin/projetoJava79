package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		// tipo nome_vetor[] = new tipo[quantidade_valores];
		int numeros[] = new int[3]; // 0 - 1 - 2 
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt(); //ler e add ao vetor
		}

		System.out.println("\nOs números digitados foram: \n");

		for (int indice = 0; indice < 3; indice++) {
			System.out.println((indice + 1) + "º número: " + numeros[indice]);
		}

	}

}
