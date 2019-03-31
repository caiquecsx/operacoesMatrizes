package sources;

import sources.utils.Tipo;

public class Application {
	public static void main(String[] args) {
		/*
		 * S está escalonado se o número de coeficientes 
		 * nulos antes do 1º coeficiente não-nulo aumenta de equação para equação.
		 */
		
		Matriz m = new Matriz();
		Double[][] matriz = m.preencherMatriz(3, 3);
		
		m.plotarMatriz(matriz);
		m.plotDiagonalPrincipal(matriz);
		m.plotTermosDiagonalInferior(matriz);
		
		
		OperacoesImpl op = new OperacoesImpl();
		
		m.plotarMatriz(op.Operar(matriz, 1, 2, Tipo.SOMA));
	}
}