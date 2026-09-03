package area;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        double base;
        double altura;

        do {
            System.out.print("Digite a base do triângulo: ");
            base = entrada.nextDouble();

            System.out.print("Digite a altura do triângulo: ");
            altura = entrada.nextDouble();

            if (base <= 0 || altura <= 0) {
                System.out.println("Erro! A base e a altura devem ser maiores que zero.");
            }

        } while (base <= 0 || altura <= 0);

        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);

        entrada.close();
    }
}

		

		        
