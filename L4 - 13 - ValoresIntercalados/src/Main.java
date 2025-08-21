import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] vetor3 = new int[2 * n];

        System.out.println("Digite 10 elementos do primeiro vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 elementos do segundo vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetor3[2 * i] = vetor1[i];
            vetor3[2 * i + 1] = vetor2[i];
        }

        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
    }
}
