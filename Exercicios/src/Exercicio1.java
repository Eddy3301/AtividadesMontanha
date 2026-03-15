
// Eduardo Luiz de Almeida Gonçalves
// 1261930762

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        float numero1;
        float numero2;

        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Olá, digite o primeiro valor \n: ");
        numero1 = scanner.nextFloat();

        System.out.printf("Olá, digite o segundo valor \n: ");
        numero2 = scanner.nextFloat();

        System.out.printf("A adição é: %.2f \n", numero1 + numero2);
        System.out.printf("A subtração é: %.2f \n", numero1 - numero2);
        System.out.printf("O produto é: %.2f \n", numero1 * numero2);
        System.out.printf("A divisão é: %.2f \n", numero1 / numero2);

        scanner.close();



    }
}

