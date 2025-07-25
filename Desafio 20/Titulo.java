public class Titulo implements Comparable<Titulo> {
    private String nome;

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
