public class Vôo {
    private int numVoo;
    private String nomePiloto;
    private int numAssentos;
    private int numPassageiros;
    private Passageiro[] vetPassageiros;

    public int getNumVoo() {
        return this.numVoo;
    }

    public void setNumVoo(int n) {
        this.numVoo = n;
    }

    public String getPiloto() {
        return this.nomePiloto;
    }

    public void setPiloto(String nome) {
        this.nomePiloto = nome;
    }

    public int getNumAssentos() {
        return this.numAssentos;
    }

    public void setNumAssentos(int n) {
        this.numAssentos = n;
    }

    public int getNumPassageiros() {
        return this.numPassageiros;
    }

    public void setNumPassageiros(int n) {
        this.numPassageiros = n;
    }

    public Passageiro getPassageiro(int pos) {
        return this.vetPassageiros[pos];
    }

    public void setPassageiro(int pos, Passageiro p) {
        this.vetPassageiros[pos] = p;
    }
}
