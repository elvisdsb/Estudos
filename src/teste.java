import java.util.Scanner;

public class teste {

	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("IDADE PARA CNH. ");
		// final Integer idadeMinimaParaTirarCarteira = 18;

		System.out.print("IDADE: ");
		Integer idade = scanner.nextInt();

		Boolean tirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

		if (tirarCarteira) {
			System.out.println("VOCÊ PODE TIRAR A CARTEIRA. ");
		} else {
			System.out.println("VOCÊ NÃO PODE TIRAR A CARTEIRA");
		}

		scanner.close();
	}
}
