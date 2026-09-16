package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite uma tarefa: ");
            tarefas.add(sc.nextLine());

            System.out.print("Deseja cadastrar outra tarefa? (s/n): ");
            resposta = sc.nextLine();

            System.out.println();

        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("Tarefas cadastradas:");

        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

        System.out.println("\nQuantidade de tarefas: " + tarefas.size());

        sc.close();
    }
}