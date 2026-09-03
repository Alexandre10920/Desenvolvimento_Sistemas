package etapas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número maior que zero: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Erro! Digite um número maior que zero.");
            }

        } while (numero <= 0);

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entrada.close();
    }
}