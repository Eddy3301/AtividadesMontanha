import java.util.Scanner;

public class Exercicio3 {
   public static void main(String[] args) throws Exception {

    double dinheiro;
    final double cotacao = 4.95;

    Scanner scanner = new Scanner(System.in);

    System.out.printf("Digite o valor do dinheiro que você tem em R$: ");
    dinheiro = scanner.nextDouble();

    System.out.printf("Esse é o valor do seu dinheiro em Dólares: $%.2f \n", dinheiro *cotacao);

    scanner.close();

   } 
}
