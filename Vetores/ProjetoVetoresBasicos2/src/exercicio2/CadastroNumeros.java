package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros cadastrados:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}