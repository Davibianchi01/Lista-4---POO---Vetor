import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = en.nextInt();
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }

        System.out.print("Vetor original: ");
        for (int n : numeros) System.out.print(n + " ");
        System.out.println();

        System.out.print("Pares: ");
        for (int n : pares) System.out.print(n + " ");
        System.out.println();

        System.out.print("Ímpares: ");
        for (int n : impares) System.out.print(n + " ");
        System.out.println();
    }
}
