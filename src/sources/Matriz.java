package sources;

import java.util.Random;

public class Matriz {
	
	public Double[][] preencherMatriz(int linhas, int colunas) {
		Random r = new Random();
		Double [][] matriz = new Double[linhas][colunas];

		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				matriz[i][j] = Double.valueOf(r.nextInt(10) + 1);
			}
		}
		
		return matriz;
	}
	
	public void plotarMatriz(Double[][] matriz) {
		System.out.printf("Linhas: %d Colunas: %d ", matriz.length, matriz[0].length);
		System.out.println("");
		System.out.println("");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.printf(" %.2f ", matriz[i][j]);
				if(j+1 == matriz[0].length) 
					System.out.println("");
			}
		}
		System.out.println("");
	}
	
	public void plotDiagonalPrincipal(Double[][] matriz){
		System.out.println("Elementos da diagona principal");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(i == j)
					System.out.printf(" %.2f ", matriz[i][j]);
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	public void plotTermosDiagonalInferior(Double[][] matriz) {
		System.out.println("Elementos da diagona inferior");
		System.out.println("");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(j <= i)
					System.out.printf(" %.2f ", matriz[i][j]);
				if(j == i) 
					System.out.println("");
			}
		}
		System.out.println("");
	}

}
