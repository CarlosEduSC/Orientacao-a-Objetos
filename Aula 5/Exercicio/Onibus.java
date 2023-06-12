public class Onibus extends Veiculo {
    private int numEntradas;
    private int numPassageiros;
    private String finalidade;

    public int getEntradas() {
        return this.numEntradas;
    }

    public void setEntradas(int n) {
        this.numEntradas = n;
    }

    public int getPassageiros() {
        return this.numPassageiros;
    }

    public void setPassageiros(int n) {
        this.numPassageiros = n;
    }

    public String getFinalidade() {
        return this.finalidade;
    }

    public void setFinalidade(String f) {
        this.finalidade = f;
    }
}
