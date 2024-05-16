package atividade11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Tarefa06 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        Map<Integer, Integer> frequenciaMap = new HashMap<>();
        for (int elemento : vetor) {
            if (frequenciaMap.containsKey(elemento)) {
                int frequenciaAtual = frequenciaMap.get(elemento);
                frequenciaMap.put(elemento, frequenciaAtual + 1);
            } else {
                frequenciaMap.put(elemento, 1);
            }
        }
        System.out.println("Frequência de cada elemento no vetor:");
        for (Map.Entry<Integer, Integer> entry : frequenciaMap.entrySet()) {
            System.out.println("Elemento " + entry.getKey() + ": " + entry.getValue() + " vezes");
            scanner.close();
        }
    }
	}


