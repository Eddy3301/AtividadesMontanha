
import java.util.Scanner;

// Eduardo Luiz de Almeida Gonçalves
// 1261930762


public class Exercicio10 {
    public static void main(String[] args) {
        double dist;
        double veloc;
        double TempoHora;

        


        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a distância a ser percorrida (em km): ");
        dist = scanner.nextDouble();

        System.out.printf("Digite a velocidade média (em km/h): ");
        veloc = scanner.nextDouble();

        TempoHora = dist / veloc;

          int horas = (int) TempoHora;
        int minutos = (int) ((TempoHora - horas) * 60);

        System.out.printf("O tempo necessário é de %d horas e %d minutos.", horas, minutos);




        scanner.close();
    
    }
}
