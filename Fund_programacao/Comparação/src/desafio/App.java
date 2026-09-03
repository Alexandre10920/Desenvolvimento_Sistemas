package desafio;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 20) {
            System.out.println("O número é maior que 20.");
        } else {
            System.out.println("O número não é maior que 20.");
        }

        entrada.close();
    }
}      