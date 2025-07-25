import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(8);
        listaInteiros.add(3);
        listaInteiros.add(-6);
        listaInteiros.add(-2);
        System.out.println("Lista antes de Ordenar:");
        System.out.println(listaInteiros);
        System.out.println("Lista apos Ordenar:");
        Collections.sort(listaInteiros);
        System.out.println(listaInteiros);
    }
}
