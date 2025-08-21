import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = 5;
        int[] valores = new int[N];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            int valor;
            do {
                System.out.print("Informe o valor para a posição " + i + " (0 a 20): ");
                valor = scanner.nextInt();
                if (valor < 0 || valor > 20) {
                    System.out.println("Valor inválido! Tente novamente.");
                }
            } while (valor < 0 || valor > 20);
            valores[i] = valor;
        }

        System.out.println("\nGráfico:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
