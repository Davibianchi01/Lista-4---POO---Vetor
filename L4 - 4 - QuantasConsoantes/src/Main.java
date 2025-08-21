import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        char[] letras = new char[10];
        int qtdConsoantes = 0;
        String consoantes = "";

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Digite o caractere " + (i + 1) + ": ");
            letras[i] = en.next().toLowerCase().charAt(0);

            if (Character.isLetter(letras[i]) && "aeiou".indexOf(letras[i]) == -1) {
                qtdConsoantes++;
                consoantes += letras[i] + " ";
            }
        }

        System.out.println("Quantidade de consoantes: " + qtdConsoantes);
        System.out.println("Consoantes lidas: " + consoantes);
    }
}
