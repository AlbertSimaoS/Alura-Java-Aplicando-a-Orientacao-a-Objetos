import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Esse é o Jogo do Número Secreto------");

        int numeroSecreto = new Random().nextInt(100); // Gera um número entre 0 e 99
        int numeroDigitado = 0;
        int tentativas = 0;
        Scanner leitura = new Scanner(System.in);

        while (numeroDigitado != numeroSecreto) {
            System.out.println("Digite um número:");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado > numeroSecreto) {
                System.out.println("O número secreto é menor");
            } else if (numeroDigitado < numeroSecreto) {
                System.out.println("O número secreto é maior");
            }
            tentativas++;
        }

        System.out.println("Parabéns! Você descobriu o número secreto em " + tentativas + " tentativas");
    }
}
