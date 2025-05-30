package Modelos;

//Classe pai
public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int totalDescurtidas;
    private int classificacao;

    //metodos para reproduzir
    public void reproduz() {
        totalDeReproducoes++;
    }
    //metodo para avaliar
    public void avalia(boolean b) {
        if (b) {
            totalCurtidas++;
        } else {
            totalDescurtidas++;
        }
    }
    //metodo para exibir os dados
    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Total de Reproduções: " + totalDeReproducoes);
        System.out.println("Total de Curtidas: " + totalCurtidas);
        System.out.println("Total de Descurtidas: " + totalDescurtidas);
        System.out.println("Classificação: " + getClassificacao());
    }

    //setters apenas de titulo e duração, unicos que o usuario podem mexer
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalDescurtidas() {
        return totalDescurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
