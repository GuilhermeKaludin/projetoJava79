package vetor;

public class ExemploVetor {

	public static void main(String[] args) {

		String cachorros[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		// tipo nome_vetor[] = {valores}
		for (int indice = 0; indice < 5; indice++) { // indice = indice + 1
			System.out.println((indice + 1) + "º elemento: " + cachorros[indice]);
		}
		// nome_vetor[indice]
		// rua[1] == "joao"
	}

}
