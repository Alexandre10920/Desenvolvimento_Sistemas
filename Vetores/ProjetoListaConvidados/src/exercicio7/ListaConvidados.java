package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar convidado");
            System.out.println("2 - Alterar convidado");
            System.out.println("3 - Remover convidado");
            System.out.println("4 - Procurar convidado");
            System.out.println("5 - Exibir convidados");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    convidados.add(nome);
                    System.out.println("Convidado adicionado!");
                    break;

                case 2:
                    System.out.print("Digite a posição do convidado: ");
                    int posicao = sc.nextInt();
                    sc.nextLine();

                    if (posicao >= 0 && posicao < convidados.size()) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = sc.nextLine();
                        convidados.set(posicao, novoNome);
                        System.out.println("Convidado alterado!");
                    } else {
                        System.out.println("Posição inválida!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do convidado: ");
                    String remover = sc.nextLine();

                    if (convidados.contains(remover)) {
                        convidados.remove(remover);
                        System.out.println("Convidado removido!");
                    } else {
                        System.out.println("Convidado não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do convidado: ");
                    String procurar = sc.nextLine();

                    int indice = convidados.indexOf(procurar);

                    if (indice != -1) {
                        System.out.println("Convidado encontrado na posição: " + indice);
                    } else {
                        System.out.println("Convidado não encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("\nConvidados:");

                    for (String convidado : convidados) {
                        System.out.println(convidado);
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
