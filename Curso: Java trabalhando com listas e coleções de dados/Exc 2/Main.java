public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();

        Animal animal = (Animal) meuCachorro;

        animal.fazerSom();
    }
}
