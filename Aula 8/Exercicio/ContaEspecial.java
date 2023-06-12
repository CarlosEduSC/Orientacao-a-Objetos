package Exercicio;

public class ContaEspecial extends ContaCorrente {
    private double taxaEspecial;

    public void setTaxaEspecial(float t) {
        this.taxaEspecial = t;
    }

    public boolean sacar(double saque) {
        if ((saque+((0.3d/100)*saque)) > this.getSaldo()) {
            return false;
        
        } else {
            this.setSaldo(this.getSaldo() - ((0.3d/100)*saque));
            this.setSaldo(this.getSaldo() - saque);
            return true;
        }
    }

    public boolean sacar(double saque, double taxa) {
            if ((saque+((this.taxaEspecial/100)*saque)) > this.getSaldo()) {
                return false;
            
            } else {
                this.setSaldo(this.getSaldo() - ((this.taxaEspecial/100)*saque));
                this.setSaldo(this.getSaldo() - saque);
                return true;
            }
        
    }
}
