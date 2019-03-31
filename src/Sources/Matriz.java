package Sources;

import java.util.Random;

public class Matriz {
	
	public int[][] preencherMatriz(int linhas, int colunas) {
		Random r = new Random();
		int [][] matriz = new int[linhas][colunas];

		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		
		return matriz;
	}
	
	public void plotarMatriz(int[][] matriz) {
		System.out.printf("Linhas: %d Colunas: %d ", matriz.length, matriz[0].length);
		System.out.println("");
		System.out.println("");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				System.out.printf(" %d ", matriz[i][j]);
				if(j+1 == matriz[0].length) 
					System.out.println("");
			}
		}
		System.out.println("");
	}
	
	public void plotDiagonalPrincipal(int[][] matriz){
		System.out.println("Elementos da diagona principal");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(i == j)
					System.out.printf(" %d ", matriz[i][j]);
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	public void plotTermosDiagonalInferior(int[][] matriz) {
		System.out.println("Elementos da diagona inferior");
		System.out.println("");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(j <= i)
					System.out.printf(" %d ", matriz[i][j]);
				if(j == i) 
					System.out.println("");
			}
		}
		System.out.println("");
	}

}
