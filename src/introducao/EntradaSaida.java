package introducao;

import java.util.Scanner; //importando o scanner para dentro a classe

public class EntradaSaida {

	public static void main(String[] args) {
		//Inserir o nome, temperatura
		
		String nome;
		float temperatura;
		float fahrenheit;
		
		//Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados - nome, temperatura
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em celcius: ");
		temperatura = leia.nextFloat();
		
		//Processamento
		
		fahrenheit = temperatura * 1.8f + 32;
		
		//Saida dos dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
	}

}
