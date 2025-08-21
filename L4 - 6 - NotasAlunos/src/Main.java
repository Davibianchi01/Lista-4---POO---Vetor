import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                soma += en.nextDouble();
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + aprovados);
    }
}
