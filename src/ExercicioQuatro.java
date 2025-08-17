import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.println("Informe um número: ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o inicial)."); continue;
            }
            if (numero % numeroInicial != 0) {
                System.out.println("Número não divisível por " + numeroInicial + ". Encerrando...");
                break;
            }
            System.out.println("Número válido: " + numero + " (divisível por " + numeroInicial + ")");
        }
    }
}
