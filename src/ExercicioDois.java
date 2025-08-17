import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura = 0;
        double peso = 0;
        double imc = peso/(altura * altura);

        System.out.println("Digite sua altura");
        altura = scanner.nextDouble();
        System.out.println("Digite seu peso");
        peso = scanner.nextDouble();
    }
}
