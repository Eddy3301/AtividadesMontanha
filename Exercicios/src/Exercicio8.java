// Eduardo Luiz de Almeida Gonçalves
// 1261930762

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double temp;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a temperatura em Celsius: ");
        temp = scanner.nextDouble();

        System.out.printf("A temperatura em Fahrenheit é: %.2f °F", (temp * 9/5) + 32);
        System.out.printf("\n A temperatura em Kelvin é: %.2f K", (temp + 273.15));
        scanner.close();
        
    }
}
