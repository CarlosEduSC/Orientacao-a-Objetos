public class CompanhiaAéria {
    private String nomeCom;
    private String telefone;
    private int numVôos;
    private Vôo vetVôos[];

    public String getNomeCom() {
        return this.nomeCom;
    }

    public void  setNomeCom(String nome) {
        this.nomeCom = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String fone) {
        this.telefone = fone;
    }

    public int getNumVôos() {
        return this.numVôos;
    }

    public void setNumVôos(int n) {
        this.numVôos = n;
    }

    public Vôo getVôo(int pos) {
        return this.vetVôos[pos];
    }

    public void setVôo(int pos, Vôo v) {
        this.vetVôos[pos] = v;
    }
}
