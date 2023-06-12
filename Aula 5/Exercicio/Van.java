public class Van extends Veiculo {
    private int numAssentos;
    private float pesoMaximo;

    public int getAssentos() {
        return this.numAssentos;
    }

    public void setAssentos(int n) {
        this.numAssentos = n;
    }

    public float getPesoMaximo() {
        return this.pesoMaximo;
    }

    public void setPesoMaximo(float p) {
        this.pesoMaximo = p;
    }
}
