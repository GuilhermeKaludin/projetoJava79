package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {

		int resultado = somar(2, 5);

		System.out.println("O primeiro resultado é: " + resultado);
		System.out.println("O segundo resultado é: " + somar(5, 5));
		
		falar("Pode ser, bom dia");
		
		ExemploMetodoExterno.mensagem();
		
	}

	//definição do metodo somar - metodo com retorno e com parametro
	public static int somar(int x, int y) {
		return x + y;
	}
	// definição do metodo falar - metodo sem retorno e com parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
