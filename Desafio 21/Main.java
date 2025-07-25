import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(new Titulo("Duna"));
        lista.add(new Titulo("Matrix"));
        lista.add(new Titulo("Avatar"));

        System.out.println("Antes de Ordenar:");
        for (Titulo titulo : lista) {
            System.out.println(titulo.nome);
        }
        System.out.println();

        Collections.sort(lista);

        System.out.println("Apos Ordenar:");
        for (Titulo titulo : lista) {
            System.out.println(titulo.nome);
        }
    }
}
