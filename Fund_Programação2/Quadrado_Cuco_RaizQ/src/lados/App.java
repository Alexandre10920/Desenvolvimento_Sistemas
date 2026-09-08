package lados;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número positivo: ");
        numero = sc.nextDouble();

        while (numero > 0) {
            System.out.println("Valor: " + numero);
            System.out.println("Quadrado: " + (numero * numero));
            System.out.println("Cubo: " + (numero * numero * numero));
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));

            System.out.print("\nDigite outro número: ");
            numero = sc.nextDouble();
        }

        System.out.println("Programa encerrado.");
        sc.close();

	}

}
