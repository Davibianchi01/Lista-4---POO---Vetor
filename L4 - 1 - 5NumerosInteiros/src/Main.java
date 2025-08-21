import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = en.nextInt();
        }

        System.out.println("\nOs números digitados foram:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
