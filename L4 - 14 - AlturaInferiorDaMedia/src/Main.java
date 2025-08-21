import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 30;
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Informe a altura do aluno " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }

        double somaAltura = 0;
        for (int i = 0; i < n; i++) {
            somaAltura += alturas[i];
        }
        double mediaAltura = somaAltura / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                count++;
            }
        }

        System.out.println("\nQuantidade de alunos com mais de 13 anos e altura abaixo da média: " + count);
    }
}
