// Eduardo Luiz de Almeida Gonçalves
// 1261930762


import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double salario;
        double novoSalario;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("|| EMPRESA DO MONTANHA || \n");
        System.out.printf("PARABÉNS PELA PROMOÇÃO! \n");
        System.out.printf("Digite o seu salário atual: ");
        salario = scanner.nextDouble();
        novoSalario = salario + (salario * 7 / 100);
        System.out.printf("O seu novo salário é: R$ %.2f", novoSalario);
    }
}
