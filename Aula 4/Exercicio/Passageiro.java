public class Passageiro {
    private int cpf;
    private String nome;
    private int rg;
    private int numAssento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public int getRG() {
        return this.rg;
    }

    public void setRG(int RG) {
        this.rg = RG;
    }

    public int getCPF() {
        return this.cpf;
    }

    public void setCPF(int CPF) {
        this.cpf = CPF;
    }

    public int getAssento() {
        return this.numAssento;
    }

    public void setAssento(int n) {
        this.numAssento = n;
    }
}
