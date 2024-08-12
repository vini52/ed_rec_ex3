package view;

import controller.ParesController;

public class Pares {

	public static void main(String[] args) {
		ParesController obj = new ParesController();
		
		int[] vetor = {2, 5, 1, 4, 6 , 8, 11};
		int tamanho = vetor.length;
		System.out.println(obj.calcular(vetor, tamanho));
	}
}
