import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(4));
        lista.add(new Quadrado(5));
        lista.add(new Circulo(6));

        for (Forma f : lista) {
            f.calcularArea();
        }
    }
}
