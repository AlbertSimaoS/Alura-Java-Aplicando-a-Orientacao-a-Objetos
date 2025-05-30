public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(123);
        conta1.setSaldo(1000);
        conta1.titular = "João";

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Titular: " + conta1.titular);

        ContaBancaria conta2 = new ContaBancaria();

        conta2.setNumeroConta(456);
        conta2.setSaldo(2000);
        conta2.titular = "Maria";

        System.out.println("Número da conta: " + conta2.getNumeroConta());
        System.out.println("Saldo: " + conta2.getSaldo());
        System.out.println("Titular: " + conta2.titular);
    }
}
