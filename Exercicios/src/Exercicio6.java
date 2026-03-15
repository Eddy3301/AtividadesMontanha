// Eduardo Luiz de Almeida Gonçalves
// 1261930762

import java.util.Scanner;

public class Exercicio6 {
        public static void main(String[] args) {
            double base;
            double altura;

            Scanner scanner = new Scanner(System.in);

            System.out.printf("Digite a base do retângulo (em cm): ");
            base = scanner.nextDouble();

            System.out.printf("Digite a altura do retângulo (em cm): ");
            altura = scanner.nextDouble();

            System.out.printf("A área do retângulo é: %.1f cm²", base * altura);

            scanner.close();
            
        }
}
