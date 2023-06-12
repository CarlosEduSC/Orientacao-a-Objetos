import java.io.*;

public class Biblioteca {
    public BufferedInputStream reader;
    public Aluno a;

    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        b1.a = new Aluno();

        System.out.println("Novo Aluno criado!");

        System.out.println("Removendo livro...");

        b1.a.retirarLivro();
    }
}
