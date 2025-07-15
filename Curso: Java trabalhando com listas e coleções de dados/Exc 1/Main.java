import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
      
        listaNomes.add("Ana");
        listaNomes.add("Carlos");
        listaNomes.add("Bianca");
        listaNomes.add("João");
      
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
