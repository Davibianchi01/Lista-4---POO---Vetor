import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = en.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.print("Números: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
