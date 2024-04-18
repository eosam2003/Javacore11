package atividade11;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

    System.out.println("Digite o tamanho do vetor : ");
    int tamanho = input.nextInt();

    int[] vetor = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
        System.out.print("Digite o valor para a posição : " + i + ": ");
        vetor[i] = input.nextInt();
    }

    int maior = vetor[0];
    int menor = vetor[0];

    for (int i = 1; i < tamanho; i++) {
        if (vetor[i] > maior) {
            maior = vetor[i];
        }
        if (vetor[i] < menor) {
            menor = vetor[i];
        }
    }

    System.out.println("Maior valor : " + maior);
    System.out.println("Menor valor : " + menor);

input.close();
}
	
}
