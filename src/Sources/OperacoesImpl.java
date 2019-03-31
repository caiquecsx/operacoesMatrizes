package Sources;

public class OperacoesImpl implements Operacoes {
	
	public void Soma(int[][] matriz, int linhaOperar, int comLinha){
		System.out.printf("Realizando soma da linha: %d, com a linha: %d", 
				linhaOperar, comLinha);
		System.out.println("");
		
		int[] linhaOperando = matriz[linhaOperar - 1];
		int[] outraLinha = matriz[comLinha - 1];
		
		System.out.println("Linha Operando:");
		for(int i = 0; i < linhaOperando.length; i++) {
			System.out.printf(" %d ", linhaOperando[i]);
		}
		
		System.out.println("");
		System.out.println("Outra linha:");
		for(int i = 0; i < linhaOperando.length; i++) {
			System.out.printf(" %d ", outraLinha[i]);
		}
		
		System.out.println("");
		System.out.println("Resultado: ");
		for(int i = 0; i < linhaOperando.length; i++) {
			linhaOperando[i] = linhaOperando[i] + outraLinha[i];
			System.out.printf(" %d ", linhaOperando[i]);
		}
		System.out.println("");
	}
	
	public void Subtracao(int[][] matriz, int linhaOperar, int comLinha){
		System.out.printf("Realizando subtracao da linha: %d, com a linha: %d", 
				linhaOperar, comLinha);
		System.out.println("");
		
		int[] linhaOperando = matriz[linhaOperar - 1];
		int[] outraLinha = matriz[comLinha - 1];
		
		System.out.println("Linha Operando:");
		for(int i = 0; i < linhaOperando.length; i++) {
			System.out.printf(" %d ", linhaOperando[i]);
		}
		
		System.out.println("");
		System.out.println("Outra linha:");
		for(int i = 0; i < linhaOperando.length; i++) {
			System.out.printf(" %d ", outraLinha[i]);
		}
		
		System.out.println("");
		System.out.println("Resultado: ");
		for(int i = 0; i < linhaOperando.length; i++) {
			linhaOperando[i] = linhaOperando[i] - outraLinha[i];
			System.out.printf(" %d ", linhaOperando[i]);
		}
		System.out.println("");
	}

	@Override
	public void Multiplicacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Divisao() {
		// TODO Auto-generated method stub
		
	}
}
