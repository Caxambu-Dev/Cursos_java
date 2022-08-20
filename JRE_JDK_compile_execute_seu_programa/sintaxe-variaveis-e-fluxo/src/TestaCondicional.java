
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 15;
		int qtdPessoas = 3;

		if (idade > 18) {
			System.out.println("Você tem mais que 18 anos");
			System.out.println("Bem vindo!!");
		} else {
			if (qtdPessoas > 1) {
				System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
			} else {

				System.out.println("Infelizmente você não pode entrar");
			}
		}

	}

}
