// criando a classe "Produto"
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // construtor com parametros
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters: obter(ler) o valor de um atributo
    // Setters: Definir(modificar) o valor de um atributo
    // como so irei modificar valores usa apenas os "Setters"


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Produto{" +
                "nome=' " + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
