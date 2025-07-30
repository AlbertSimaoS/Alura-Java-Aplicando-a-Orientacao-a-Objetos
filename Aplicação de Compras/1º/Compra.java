public class Compra implements Comparable<Compra> {
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public void fatura(){
        System.out.println(produto + " - " + valor + "\n");
    }

    @Override
    public int compareTo(Compra outra) {
        return Double.compare(this.valor, outra.valor);
    }
}
