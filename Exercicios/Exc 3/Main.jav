public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen Match!");
        System.out.println("Filme: Top Gun: Marverick");

        int anoDeLancamento = 2022;
        System.out.println("ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
            Filme Top Gun
            Filme de aventura
            """;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
