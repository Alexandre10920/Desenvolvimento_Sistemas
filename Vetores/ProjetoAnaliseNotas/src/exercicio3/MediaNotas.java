package exercicio3;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nNotas cadastradas:");

        for (double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("\nMédia: " + media);

        scanner.close();
    }
}