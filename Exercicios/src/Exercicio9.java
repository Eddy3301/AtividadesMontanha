// Eduardo Luiz de Almeida Gonçalves
// 1261930762

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double valorProd;
        double valorPago;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o valor total da compra: R$ ");
        valorProd = scanner.nextDouble();

        System.out.printf("Digite o valor pago pelo cliente: R$ ");
        valorPago = scanner.nextDouble();

        if (valorPago < valorProd) {
        System.out.printf(" O cliente ainda deve R$ %.2f \n", Math.abs(valorProd - valorPago));
        } 


        if (valorPago > valorProd) {
        System.out.printf(" O atendente deve devolver o troco de R$ %.2f \n", valorPago - valorProd);
        } 


        if (valorPago == valorProd) {
        System.out.printf(" O cliente pagou o valor exato, não é necessário devolver troco. \n");
        }
    }
}
