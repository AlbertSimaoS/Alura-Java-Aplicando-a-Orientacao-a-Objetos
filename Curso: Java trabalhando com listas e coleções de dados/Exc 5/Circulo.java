public class Circulo implements Forma {
    private double raio;
    private final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
    }
}
