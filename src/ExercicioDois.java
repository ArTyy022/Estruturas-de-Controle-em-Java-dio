import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura;
        double peso;

        System.out.println("Digite sua altura");
        altura = scanner.nextDouble();
        System.out.println("Digite seu peso");
        peso = scanner.nextDouble();

        double imc = ( peso/(altura * altura));
        System.out.println("Seu imc é " + imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        if (imc >= 18.6 && imc <= 24.9  ) {
            System.out.println("Peso ideal");
        }
        if (imc >= 25.0 && imc <= 29.9  ) {
            System.out.println("Levemente acima do peso");
        }
        if (imc >= 30.0 && imc <= 34.9  ) {
            System.out.println("Obesidade Grau I");
        }
        if (imc >= 35.0 && imc <= 39.9  ) {
            System.out.println("Obesidade Grau II (Severa)");
        }
        if (imc >= 40.0 ) {
            System.out.println("Obesidade III (Mórbida)");
        }


    }
}
