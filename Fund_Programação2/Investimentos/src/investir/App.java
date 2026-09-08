package investir;

public class App {

	public static void main(String[] args) {
		double carlos = 3000;
        double joao = 1000;
        int meses = 0;

        while (joao < carlos) {
            carlos = carlos + (carlos * 0.02);
            joao = joao + (joao * 0.05);
            meses++;
        }

        System.out.println("Quantidade de meses: " + meses);
        System.out.printf("Valor acumulado por Carlos: R$ %.2f%n", carlos);
        System.out.printf("Valor acumulado por João: R$ %.2f%n", joao);

	}

}
