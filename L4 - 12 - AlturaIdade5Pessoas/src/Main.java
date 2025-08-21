import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Informe a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }

        System.out.println("\nIdade e altura na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
        }

        int maisVelho = idades[0], maisNovo = idades[0];
        double maisAlto = alturas[0], maisBaixo = alturas[0];
        int indexMaisVelho = 0, indexMaisNovo = 0, indexMaisAlto = 0, indexMaisBaixo = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                indexMaisVelho = i;
            }
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
                indexMaisNovo = i;
            }
            if (alturas[i] > maisAlto) {
                maisAlto = alturas[i];
                indexMaisAlto = i;
            }
            if (alturas[i] < maisBaixo) {
                maisBaixo = alturas[i];
                indexMaisBaixo = i;
            }
        }

        System.out.println("\nMais velho: Idade = " + idades[indexMaisVelho] + ", Altura = " + alturas[indexMaisVelho]);
        System.out.println("Mais novo: Idade = " + idades[indexMaisNovo] + ", Altura = " + alturas[indexMaisNovo]);
        System.out.println("Mais alto: Idade = " + idades[indexMaisAlto] + ", Altura = " + alturas[indexMaisAlto]);
        System.out.println("Mais baixo: Idade = " + idades[indexMaisBaixo] + ", Altura = " + alturas[indexMaisBaixo]);

        double mediaIdade = 0, mediaAltura = 0;
        for (int i = 0; i < n; i++) {
            mediaIdade += idades[i];
            mediaAltura += alturas[i];
        }
        mediaIdade /= n;
        mediaAltura /= n;

        System.out.println("\nPessoas com idade acima da média (" + mediaIdade + "):");
        for (int i = 0; i < n; i++) {
            if (idades[i] > mediaIdade) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("\nPessoas com idade abaixo da média (" + mediaIdade + "):");
        for (int i = 0; i < n; i++) {
            if (idades[i] < mediaIdade) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("\nPessoas com altura acima da média (" + mediaAltura + "):");
        for (int i = 0; i < n; i++) {
            if (alturas[i] > mediaAltura) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("\nPessoas com altura abaixo da média (" + mediaAltura + "):");
        for (int i = 0; i < n; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }
    }
}
