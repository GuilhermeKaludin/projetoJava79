package estrutura_decisao;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {

		// variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();

		if (media >= 6) {

			System.out.println("Parabens, voce foi aprovado");
		}

	}

}
