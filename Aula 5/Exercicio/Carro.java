public class Carro extends Veiculo {
    private int numPortas;
    private int numOcupantes;

    public int getPortas() {
        return this.numPortas;
    }
    
    public void setPortas(int n) {
        this.numPortas = n;
    }

    public int getOcupantes() {
        return this.numOcupantes;
    }

    public void setOcupantes(int n) {
        this.numOcupantes = n;
    }
}
