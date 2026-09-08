package menu;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int opcao = 0;
        double salario, imposto, novoSalario;

        while (opcao != 4) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Calcular o imposto sobre o salário");
            System.out.println("2. Calcular o novo salário após um aumento");
            System.out.println("3. Mostrar a classificação do salário");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o salário bruto: R$ ");
                    salario = sc.nextDouble();

                    if (salario < 500) {
                        imposto = salario * 0.05;
                    } else if (salario <= 850) {
                        imposto = salario * 0.10;
                    } else {
                        imposto = salario * 0.15;
                    }

                    System.out.printf("Imposto: R$ %.2f%n", imposto);
                    break;

                case 2:
                    System.out.print("Digite o salário bruto: R$ ");
                    salario = sc.nextDouble();

                    if (salario > 1500) {
                        novoSalario = salario + 250;
                    } else if (salario >= 750) {
                        novoSalario = salario + 50;
                    } else if (salario >= 450) {
                        novoSalario = salario + 75;
                    } else {
                        novoSalario = salario + 100;
                    }

                    System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
                    break;

                case 3:
                    System.out.print("Digite o salário bruto: R$ ");
                    salario = sc.nextDouble();

                    if (salario < 700) {
                        System.out.println("Classificação: Mal remunerado");
                    } else {
                        System.out.println("Classificação: Bem remunerado");
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
	}

}
