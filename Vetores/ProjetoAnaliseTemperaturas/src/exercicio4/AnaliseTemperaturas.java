package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[7];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (double temperatura : temperaturas) {
            if (temperatura > maior) {
                maior = temperatura;
            }

            if (temperatura < menor) {
                menor = temperatura;
            }
        }

        System.out.println("\nTemperaturas cadastradas:");

        for (double temperatura : temperaturas) {
            System.out.println(temperatura);
        }

        System.out.println("\nMaior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);

        scanner.close();
    }
}
