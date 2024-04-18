package atividade11;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		int[] vetor = { 7, 4, 10, 8, 2, 5 };

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o elemento a ser buscado : ");
	        int elementoBuscado = sc.nextInt();

	        boolean encontrado = false;
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == elementoBuscado) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("O elemento " + elementoBuscado + " está presente no vetor.");
	        } else {
	            System.out.println("O elemento " + elementoBuscado + " não foi encontrado no vetor.");
  }	      
}
	
public static double calcularArea(double largura, double comprimento) {
	        return largura * comprimento;
  }
}


