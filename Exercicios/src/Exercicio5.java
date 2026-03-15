// Eduardo Luiz de Almeida Gonçalves
// 1261930762

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
       double nota1;
       double nota2;
       double nota3;
       
         Scanner scanner = new Scanner(System.in);

         System.out.printf("Digite a primeira nota: ");
         nota1 = scanner.nextDouble();
            System.out.printf("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            System.out.printf("Digite a terceira nota: ");
            nota3 = scanner.nextDouble();

            System.out.printf("A média das notas enviadas é: %.2f", (nota1 + nota2+ nota3) / 3);
         
            scanner.close();
    }
}
