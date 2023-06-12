public class Pessoa {
    private String nome;
    private int cpf;
    private int idade;

    String getNome() {
        return this.nome;
    }

    void setNome(String n) {
        this.nome = n;
    }

    int getCPF() {
        return this.cpf;
    }

    void setCPF(int CPF) {
        this.cpf = CPF;
    }

    int getIdade() {
        return this.idade;
    }

    void setIdade(int i) {
        this.idade = i;
    }
}