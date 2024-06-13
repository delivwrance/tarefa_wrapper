package Modulo8; /**
 * Crie um programa que faça a leitura de 4 notas.
 * Divida por 4 e obtenha a media de cada uma.
 */

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as notas
        double[] notas = new double[4];

        // Loop para ler as quatro notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média das notas
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / 4;

        // Exibe a média
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}