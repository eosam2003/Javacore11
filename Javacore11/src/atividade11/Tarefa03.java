package atividade11;
import java.util.Scanner;
public class Tarefa03 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        double media = soma / tamanho;

        System.out.println("A média dos elementos é: " + media);

        scanner.close();
    }
}
