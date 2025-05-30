package Modelos;

//herda Audio
public class Musicas extends Audio {
    //variaveis proprias
    private String album;
    private String artista;
    private String genero;

    // Construtor opcional para inicialização rápida
    public Musicas(String titulo, int duracao, String artista, String album, String genero) {
        setTitulo(titulo);
        setDuracao(duracao);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public Musicas() {
        // Construtor padrão vazio
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void exibirDados() {
        super.exibirDados(); // Chama o método da superclasse `Audio`
        System.out.println("Álbum: " + album);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
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
