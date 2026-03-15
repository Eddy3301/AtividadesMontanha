// Eduardo Luiz de Almeida Gonçalves
// 1261930762

import java.util.Scanner;

public class Exercicio7 {
        public static void main(String[] args) {
            double distancia;
            double gasolina;

            Scanner scanner = new Scanner(System.in);

            System.out.printf("Digite a distância percorrida (em km): ");
            distancia = scanner.nextDouble();

            System.out.printf("Digite a quantidade de gasolina usada (em litros): ");
            gasolina = scanner.nextDouble();

            System.out.printf("O consumo médio do seu veículo é de %.1f km/l", distancia / gasolina);
            scanner.close();
        }
}
