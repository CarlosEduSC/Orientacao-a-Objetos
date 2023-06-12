public class Aluno extends Pessoa implements UsuarioBiblioteca{
    private int numMatricula;
    private int numTurma;

    int getNumMatricula() {
        return this.numMatricula;
    }

    void setNumMatricula(int nm) {
        this.numMatricula = nm;
    }

    int getNumTurma() {
        return this.numTurma;
    }

    void setNumTurma(int nt) {
        this.numTurma = nt;
    }

    public void retirarLivro() {
        System.out.println("Livro removido!");
    }
}
