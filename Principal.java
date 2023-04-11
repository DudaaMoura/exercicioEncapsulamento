public class Principal {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setNumeroConta(10000);
        cb.setTitular("Duda");
        cb.setSaldo(125);

        System.out.println("Nome do titular: "+cb.getTitular());

        System.out.println("Número da conta: "+cb.getNumeroConta());

        System.out.println("Saldo atual: "+cb.getSaldo());

        cb.depositaValor(500);
        System.out.println("Saldo atual: "+cb.getSaldo());

        cb.sacarValor(100);
        System.out.println("Saldo atual: "+cb.getSaldo());

       
    }
    
}
