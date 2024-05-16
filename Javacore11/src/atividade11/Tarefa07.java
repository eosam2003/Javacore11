package atividade11;

import java.util.Arrays;

public class Tarefa07 {
public static void main(String[] args) {
	int[] vetor = { 7, 4, 10, 8, 2, 5 };

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }	
	}

}
