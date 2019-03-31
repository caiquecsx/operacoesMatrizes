package Sources;

public class Application {
	public static void main(String[] args) {
		/*
		 * S está escalonado se o número de coeficientes 
		 * nulos antes do 1º coeficiente não-nulo aumenta de equação para equação.
		 */
		
		Matriz m = new Matriz();
		int[][] matriz = m.preencherMatriz(5, 8);
		
		m.plotarMatriz(matriz);
		m.plotDiagonalPrincipal(matriz);
		m.plotTermosDiagonalInferior(matriz);
		
		
		Operacoes op = new Operacoes();
		
		op.Subtracao(matriz, 2, 3);
	}
}