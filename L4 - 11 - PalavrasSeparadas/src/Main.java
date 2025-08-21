import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite várias palavras separadas por ';': ");
        String entrada = scanner.nextLine();

        String[] palavras = entrada.split(";");

        System.out.println("Palavras no vetor:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Posição " + i + ": " + palavras[i]);
        }
    }
}
