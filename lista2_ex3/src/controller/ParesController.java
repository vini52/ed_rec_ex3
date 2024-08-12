package controller;

public class ParesController {
	public ParesController() {
		super();
	}
	
	public int calcular(int[] vetor, int tamanho) {
		if(tamanho == 0) {
			return 0;
		} else {
			int valor = vetor[tamanho - 1];
			if(valor % 2 == 0) {
				return 1 + calcular(vetor, tamanho - 1);
			} else {
				return calcular(vetor, tamanho - 1);
			}
		}
	}
}
