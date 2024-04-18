package atividade11;

public class Exercicio5 {

public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        contarNumerosPares(vetor);
		}

public static void contarNumerosPares(int[] vetor) {
	    int quantidadePares = 0;
	        
	        for (int numero : vetor) {
	            if (numero % 2 == 0) {
	                quantidadePares++;
	            }
	        }
	        
System.out.println("Quantidade de números pares no vetor: " + quantidadePares);
  }
}

