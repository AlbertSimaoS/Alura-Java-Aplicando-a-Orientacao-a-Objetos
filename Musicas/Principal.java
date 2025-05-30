import Modelos.Musicas;
import Modelos.PodCasts;

public class Principal {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas();
        //dados a serem exibidos
        musica1.setTitulo("Deus cuida de min");
        musica1.setArtista("Eli Soares");
        musica1.setDuracao(4);
        musica1.setGenero("Gospel");
        musica1.setAlbum("Adoração a Deus");
        //metodo avalia
        musica1.avalia(true);
        musica1.avalia(true);
        musica1.avalia(true);
        musica1.avalia(false);
        //metodo para reproduzir
        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }
        //exibir
        musica1.exibirDados();
        //pular linhas
        System.out.println();
        System.out.println();
        //novo objeto
        PodCasts podCast1 = new PodCasts();
        //dados
        podCast1.setTitulo("Educação Financeira");
        podCast1.setApresentador("Albert");
        podCast1.setDuracao(120);
        podCast1.setDescricao("Podcast sobre educação financeira");
        //metodo avalia
        podCast1.avalia(true);
        podCast1.avalia(false);
        podCast1.avalia(true);
        podCast1.avalia(false);
        //metodo reproduzir
        for (int i = 0; i < 200; i++) {
            podCast1.reproduz();
        }
        //exibir
        podCast1.exibirDados();
    }
}
