package sources;

import sources.utils.Tipo;

public class OperacoesImpl{

	public Double[][] Operar(Double[][] matriz, int linhaOperar, int comLinha, Tipo tipo) {

		System.out.println("");
		for(int i = 0; i < matriz[1].length; i++) {
			switch (tipo) {
			case DIVISAO:
				matriz[linhaOperar - 1][i] = matriz[linhaOperar - 1][i] / matriz[comLinha - 1][i];
				break;
			case MULTIPLICACAO:
				matriz[linhaOperar - 1][i] = matriz[linhaOperar - 1][i] * matriz[comLinha - 1][i];
				break;
			case SOMA:
				matriz[linhaOperar - 1][i] = matriz[linhaOperar - 1][i] + matriz[comLinha - 1][i];
				break;
			case SUBTRACAO:
				matriz[linhaOperar - 1][i] = matriz[linhaOperar - 1][i] - matriz[comLinha - 1][i];
				break;
			default:
				break;
			}
		}
		
		return matriz;
	}
}
