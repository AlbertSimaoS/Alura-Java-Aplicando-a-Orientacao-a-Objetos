// importantando a classe 'Produto'
public class ProdutoPerecivel extends Produto{
    private  String dataValidade;

    // construtor
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade); // chama o construtor da classe mãe
        this.dataValidade = dataValidade;
    }
    // Setter para data de validade
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Sobrescrevendo o método toString para incluir a data de validade
    @Override
    public String toString() {
        return super.toString() + ", dataValidade='" + dataValidade + '\'' + '}';
    }
}
