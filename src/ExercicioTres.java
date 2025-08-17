import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.println("Digite o primeiro número");
        primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número (maior que o primeiro):");
        segundoNumero = scanner.nextInt();

        while (segundoNumero <= primeiroNumero) {
            System.out.println("Erro: o segundo número tem que ser maior que o primeiro");
            System.out.println("Digite novamente o segundo número");
            segundoNumero = scanner.nextInt();

        }
        System.out.println("Digite 1 para números PARES ou 2 para números ÍMPARES");
        int escolha = scanner.nextInt();

        while (escolha != 1 && escolha !=2){
            System.out.println("Erro: digite 1 para PAR ou 2 para ÍMPAR");
            escolha = scanner.nextInt();
        }
        System.out.println("Números no intervalo de " + segundoNumero + " até " + primeiroNumero + ":");
        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (escolha == 1 && i % 2 == 0) {
                System.out.println(i + " é par");
            } else if (escolha == 2 && i % 2 != 0) {
                System.out.println(i + " é ímpar");
            }
        }
    }
}
