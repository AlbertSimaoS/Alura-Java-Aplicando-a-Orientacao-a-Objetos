import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criando uma lista de produtos
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        // adicionando produtos
        listaProdutos.add(new Produto("Notebook", 3500.00, 5));
        listaProdutos.add(new Produto("Mouse", 50.00, 20));
        listaProdutos.add(new Produto("Teclado", 100.00, 15));

        // imprimir o tamanho
        System.out.println("Tamanho da lista: " + listaProdutos.size());

        // recuperar um produto pelo índice
        Produto p = listaProdutos.get(1); // indice 1 = segundo produto
        System.out.println("Produto na posição 1: " + p);

        // imprimir toda a lista
        System.out.println("\nLista completa de produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        // criando um ProdutoPerecivel
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 4.50, 10, "10/06/2025");

        System.out.println(leite);
    }
}
