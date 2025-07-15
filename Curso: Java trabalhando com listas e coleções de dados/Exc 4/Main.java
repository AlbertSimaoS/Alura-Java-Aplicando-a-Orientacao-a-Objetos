import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Calça", 100));
        lista.add(new Produto("Camisa", 30));
        lista.add(new Produto("Bermuda", 75));
        lista.add(new Produto("Moletom", 200));

        double somaTotal = 0.0;
        int total = 0;

        for (Produto p : lista) {
            p.exibirInformacoes();
            somaTotal += p.getPreco();
            total++;
        }

        double media = somaTotal/total;

        System.out.println("Preço médio: " + media);
    }
}
