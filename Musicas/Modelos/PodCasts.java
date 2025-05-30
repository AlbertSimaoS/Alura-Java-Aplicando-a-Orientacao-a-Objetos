package Modelos;

//herda Audio
public class PodCasts extends Audio {
    //variaveis proprias
    private String apresentador;
    private String descricao;

    // Construtor
    public PodCasts(String titulo, int duracao, String apresentador, String descricao) {
        setTitulo(titulo);
        setDuracao(duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    // Construtor padrão
    public PodCasts() {}


    //Getters e Setters
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //subscrever um metodo da classe pai
    @Override
    public void exibirDados() {
        super.exibirDados(); // Chama o método da superclasse `Audio`
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
    }

    @Override
    public int getClassificacao() {
        int diferencaCurtidas = getTotalCurtidas() - getTotalDescurtidas();

        if (diferencaCurtidas > 2) {
            return 5; // Excelente
        } else if (diferencaCurtidas > 1) {
            return 4; // Muito bom
        } else if (diferencaCurtidas == 1) {
            return 3; // Neutro
        } else if (diferencaCurtidas == 0) {
            return 2; // Regular
        } else {
            return 1; // Ruim
        }
    }
}
