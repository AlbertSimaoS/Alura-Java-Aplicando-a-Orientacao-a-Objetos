public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 6, 5, 8, 9);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Media Final: " + aluno1.calcularMedia());
    }
}
