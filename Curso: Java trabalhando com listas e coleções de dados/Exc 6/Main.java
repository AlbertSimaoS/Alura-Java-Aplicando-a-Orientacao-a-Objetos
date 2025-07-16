import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(new ContaBancaria(4551, 1000));
        lista.add(new ContaBancaria(5369, 5050));
        lista.add(new ContaBancaria(7895, 7500));
        lista.add(new ContaBancaria(4598, 8000));

        System.out.println("---Contas Bancárias--");
        for (ContaBancaria c : lista) {
            c.exibirInformacoes();
        }

        double i = 0, k = 0;

        for(ContaBancaria c : lista){
            i = c.getSaldo();
            if(k > i){
                k = k;
            } else {
                k = i;
            }
        }

        ContaBancaria maiorSaldo = lista.get(0);
        for (ContaBancaria c : lista) {
            if (c.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = c;
            }
        }

        System.out.println("\nConta com o maior saldo - Número: " + maiorSaldo.getNumeroConta() + ", Saldo: R$ " + maiorSaldo.getSaldo());
    }
}
