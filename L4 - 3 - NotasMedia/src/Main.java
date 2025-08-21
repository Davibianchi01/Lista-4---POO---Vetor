import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = en.nextDouble();
            soma += notas[i];
        }

        System.out.println("\nNotas digitadas:");
        for (double nota : notas) {
            System.out.println(nota);
        }

        double media = soma / notas.length;
        System.out.println("Média: " + media);
    }
}
