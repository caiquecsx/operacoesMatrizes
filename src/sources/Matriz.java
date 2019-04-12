package sources;

//import java.util.Random;
import java.util.Scanner;

import sources.utils.Tipo;

public class Matriz {

	public static Double[][] preencherMatriz(int linhas, int colunas, Scanner input) {
		// Random r = new Random();
		Double[][] matriz = new Double[linhas][colunas];
		System.out.println("OBS: separar decimais com virgula!");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Digite o valor para a posição %d%d:\n", i + 1, j + 1);
				matriz[i][j] = input.nextDouble();
			}
		}

		return matriz;
	}

	public static void calcularMatriz(Double[][] matriz, Scanner s) {
		int p, o;

		while (hasTermosDiagonalInferior(matriz) || !hasDiagonalPrincipal(matriz)) {
			System.out.println("Escolha um tipo de operação");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("Digite qualquer outro numero para sair.");

			switch (s .nextInt()) {
			case 1:
				System.out.println("SOMANDO !");
				System.out.println("Digite a linha a ser operada: ");
				p = s.nextInt();
				System.out.println("Digite a outra linha: ");
				o = s.nextInt();

				matriz = new OperacoesImpl().Operar(matriz, p, o, Tipo.SOMA);
				Matriz.plotarMatriz(matriz);
				break;
			case 2:
				System.out.println("SUBTRAINDO !");
				System.out.println("Digite a linha a ser operada: ");
				p = s.nextInt();
				System.out.println("Digite a outra linha: ");
				o = s.nextInt();

				matriz = new OperacoesImpl().Operar(matriz, p, o, Tipo.SUBTRACAO);
				Matriz.plotarMatriz(matriz);
				break;
			case 3:
				System.out.println("MULTIPLICANDO !");
				System.out.println("Digite a linha a ser operada: ");
				p = s.nextInt();
				System.out.println("Digite a outra linha: ");
				o = s.nextInt();

				matriz = new OperacoesImpl().Operar(matriz, p, o, Tipo.MULTIPLICACAO);
				Matriz.plotarMatriz(matriz);
				break;
			case 4:
				System.out.println("DIVIDINDO !");
				System.out.println("Digite a linha a ser operada: ");
				p = s.nextInt();
				System.out.println("Digite a outra linha: ");
				o = s.nextInt();

				matriz = new OperacoesImpl().Operar(matriz, p, o, Tipo.DIVISAO);
				Matriz.plotarMatriz(matriz);
				break;
			default:
				System.out.println("WASTED. You have failed.");
				System.exit(0);
				break;
			}

			if (!hasTermosDiagonalInferior(matriz)) {
				System.out.println("You WIN!");
			}
		}
	}

	private static boolean hasDiagonalPrincipal(Double[][] matriz) {
		boolean hasDiagonal = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == j)
					if(matriz[i][j] != 1)
						return hasDiagonal = false;
			}
		}
		return hasDiagonal;
	}

	private static boolean hasTermosDiagonalInferior(Double[][] matriz) {
		boolean hasTermos = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j < i)
					if (matriz[i][j] != 0)
						hasTermos = true;
			}
		}
		System.out.println("");
		return hasTermos;
	}

	public static void plotarMatriz(Double[][] matriz) {
		System.out.printf("Linhas: %d Colunas: %d ", matriz.length, matriz[0].length);
		System.out.println("");
		System.out.println("");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf(" %.2f ", matriz[i][j]);
				if (j + 1 == matriz[0].length)
					System.out.println("");
			}
		}
		System.out.println("");
	}

	public static void plotDiagonalPrincipal(Double[][] matriz) {
		System.out.println("Elementos da diagona principal");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (i == j)
					System.out.printf(" %.2f ", matriz[i][j]);
			}
		}
		System.out.println("");
		System.out.println("");
	}

	public static void plotTermosDiagonalInferior(Double[][] matriz) {
		System.out.println("Elementos da diagona inferior");
		System.out.println("");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j < i)
					System.out.printf(" %.2f ", matriz[i][j]);
				if (j == i)
					System.out.println("");
			}
		}
		System.out.println("");
	}

	public final static void clearConsole() {
		try {
			Runtime.getRuntime().exec("cls");

		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

}
