import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        char[] consoantes = new char[21];

        int index = 0;
        for (char c : alfabeto) {
            boolean isVogal = false;
            for (char v : vogais) {
                if (c == v) {
                    isVogal = true;
                    break;
                }
            }
            if (!isVogal) {
                consoantes[index++] = c;
            }
        }

        int tamanho;
        do {
            System.out.print("Informe o tamanho da senha (menor que 26): ");
            tamanho = scanner.nextInt();
        } while (tamanho >= 26 || tamanho <= 0);

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            if (tamanho % 2 == 0) {
                if (i % 2 == 0) {
                    senha.append(consoantes[random.nextInt(consoantes.length)]);
                } else {
                    senha.append(vogais[random.nextInt(vogais.length)]);
                }
            } else {
                if (i == tamanho - 1) {
                    senha.append(consoantes[random.nextInt(consoantes.length)]);
                } else if (i % 2 == 0) {
                    senha.append(consoantes[random.nextInt(consoantes.length)]);
                } else {
                    senha.append(vogais[random.nextInt(vogais.length)]);
                }
            }
        }

        System.out.println("Senha gerada: " + senha.toString());
        scanner.close();
    }
}
