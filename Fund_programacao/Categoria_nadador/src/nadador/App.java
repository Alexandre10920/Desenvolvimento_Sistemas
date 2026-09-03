package nadador;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade < 5) {
            System.out.println("Nenhuma categoria.");
        } else if (idade <= 7) {
            System.out.println("Categoria: infantil.");
        } else if (idade <= 10) {
            System.out.println("Categoria: juvenil.");
        } else if (idade <= 15) {
            System.out.println("Categoria: adolescente.");
        } else if (idade <= 30) {
            System.out.println("Categoria: adulto.");
        } else {
            System.out.println("Categoria: sênior.");
        }

        entrada.close();
    }
}