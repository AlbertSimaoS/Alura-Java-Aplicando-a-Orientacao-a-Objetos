import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista;

        lista = new ArrayList<>();
        lista.add(1);
        lista.add(30);
        System.out.println("ArrayList:");
        System.out.println(lista);

        lista = new LinkedList<>();
        lista.add(5);
        lista.add(100);
        System.out.println("LinkedList:");
        System.out.println(lista);
    }
}
