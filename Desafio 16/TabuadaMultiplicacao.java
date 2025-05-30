public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            int valor = i * numero;
            System.out.println(numero + "x" + i + " = " + valor);
        }
    }
}
