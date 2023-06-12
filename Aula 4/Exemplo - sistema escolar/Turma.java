public class Turma{
	private int numeroTurma;
	private String nomeCurso;
	private int ano;
	private Aluno[] vetAlunos;

	public Turma(){
		this.vetAlunos = new Aluno[40];
	}

	public int getNumeroTurma(){
		return this.numeroTurma;
	}
	
	public void setNumeroTurma(int nt){
		this.numeroTurma = nt;
	}

	public String getNomeCurso(){
		return this.nomeCurso;
	}
	
	public void setNomeCurso(String n){
		this.nomeCurso = n;
	}

	public int getAno(){
		return this.ano;
	}
	
	public void setAno(int a){
		this.ano = a;
	}

	public Aluno getAluno(int pos){
		return this.vetAlunos[pos];
	}
	
	public void setAluno(int pos, Aluno a){
		this.vetAlunos[pos] = a;
	}
}
