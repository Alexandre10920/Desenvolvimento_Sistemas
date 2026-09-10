package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("Número " + numero + ": par");
                pares++;
            } else {
                System.out.println("Número " + numero + ": ímpar");
                impares++;
            }
        }

        System.out.println("\nQuantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

        scanner.close();
    }
}
