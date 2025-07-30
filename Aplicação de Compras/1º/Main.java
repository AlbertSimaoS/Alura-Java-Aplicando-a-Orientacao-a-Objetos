import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();
        int esc = 0;

        System.out.println("Digite o limite do cartão:");
        double limite = sc.nextDouble();
        sc.nextLine();

        do {
            System.out.println("Digite a descrição da compra:");
            String produto = sc.nextLine();

            System.out.println("Digite o valor da compra:");
            double valor = sc.nextDouble();
            sc.nextLine();

            if (valor > limite) {
                System.out.println("Saldo insuficiente!");
                break;
            } else {
                limite -= valor;
                Compra c = new Compra(produto, valor);
                compras.add(c);
                System.out.println("Compra Realizada!");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            esc = sc.nextInt();
            sc.nextLine();

        } while (esc == 1);

        sc.close();

        Collections.sort(compras);
        System.out.println("**************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        for (Compra c : compras) {
            c.fatura();
        }
        System.out.println("**************************\n");
        System.out.println("Saldo do Cartão: " + limite);
    }
}
