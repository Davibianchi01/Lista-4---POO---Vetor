import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[3];
        boolean dataValida = false;

        while (!dataValida) {
            System.out.print("Digite uma data no formato dd/mm/aaaa: ");
            String entrada = scanner.nextLine();
            String[] partes = entrada.split("/");

            if (partes.length != 3) {
                System.out.println("Formato inválido. Tente novamente.");
                continue;
            }

            try {
                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int ano = Integer.parseInt(partes[2]);

                if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
                    System.out.println("Data inválida. Tente novamente.");
                    continue;
                }

                int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                // Verificar ano bissexto
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    diasPorMes[1] = 29;
                }

                if (dia > diasPorMes[mes - 1]) {
                    System.out.println("Dia inválido para o mês informado. Tente novamente.");
                    continue;
                }

                data[0] = dia;
                data[1] = mes;
                data[2] = ano;
                dataValida = true;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Use apenas números.");
            }
        }

        System.out.println("Data válida armazenada no vetor:");
        System.out.println("Dia: " + data[0]);
        System.out.println("Mês: " + data[1]);
        System.out.println("Ano: " + data[2]);

        scanner.close();
    }
}
