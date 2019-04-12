package sources;

import java.util.Scanner;

//import sources.utils.Tipo;

public class Application {
	public static void main(String[] args) {
		/*
		 * S está escalonado se o número de coeficientes 
		 * nulos antes do 1º coeficiente não-nulo aumenta de equação para equação.
		 */
		
		Double[][] matriz = Matriz.preencherMatriz(3, 3, new Scanner(System.in));
		Matriz.clearConsole();
		Matriz.plotarMatriz(matriz);
		Matriz.plotDiagonalPrincipal(matriz);
		Matriz.calcularMatriz(matriz, new Scanner(System.in));
	}
}