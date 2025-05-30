public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(15);
        pessoa1.setNome("João");

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();


        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setIdade(20);
        pessoa2.setNome("José");

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();



    }
}
