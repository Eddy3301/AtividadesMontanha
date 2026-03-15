
import java.util.Scanner;

// Eduardo Luiz de Almeida Gonçalves
// 1261930762

public class Exercicio2 {
public static void main(String[] args) throws Exception {
    int dividendo;
    int divisor;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.printf("Digite o valor do dividendo (O numero que será dividido): ");
    dividendo = scanner.nextInt();

    System.out.printf("Digite o valor do divisor! (O numero que divide): ");
    divisor = scanner.nextInt();

    System.out.printf("Esse é o RESTO da divisão: %d \n", dividendo % divisor);

    // Fiz esse extra!

    System.out.printf("Esse é o QUOCIENTE da divisão: %d", dividendo / divisor);

    scanner.close();

    

}
}
