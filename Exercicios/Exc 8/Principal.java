public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 1500.00);

        System.out.println("Nome do Produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());

        produto1.aplicarDesconto(10);
        System.out.println("Produto a vista: " + produto1.getPreco());

        System.out.println("\n");

        Produto produto2 = new Produto("TV", 2000.00);

        System.out.println("Nome do Produto: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());

        produto2.aplicarDesconto(15);
        System.out.println("Preço a vista: " + produto2.getPreco());
    }
}
