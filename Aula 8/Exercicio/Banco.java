package Exercicio;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();

        System.out.println("Saldo da conta corrente: "+ c1.getSaldo());

        c1.depositar(150.50d);

        System.out.println("Saldo da conta corrente: "+ c1.getSaldo());

        if (c1.sacar(100) == false) {
            System.out.println("Saldo da conta insuficiente!");
        
        } else {
            c1.sacar(100);
        }

        System.out.println("Saldo da conta corrente: "+ c1.getSaldo());

        ContaEspecial ce1 = new ContaEspecial();

        System.out.println("Saldo da conta especial: "+ ce1.getSaldo());

        ce1.depositar(300);

        System.out.println("Saldo da conta especial: "+ ce1.getSaldo());

        if (ce1.sacar(100) == false) {
            System.out.println("Saldo da conta insuficiente!");
        
        } else {
            ce1.sacar(100);
            System.out.println("Saldo da conta especial: "+ ce1.getSaldo());
        }

        if (ce1.sacar(50,3.5d) == false) {
            System.out.println("Saldo da conta insuficiente!");
        
        } else {
            ce1.sacar(50,3.5d);
            System.out.println("Saldo da conta especial: "+ ce1.getSaldo());
        }
    }
}
