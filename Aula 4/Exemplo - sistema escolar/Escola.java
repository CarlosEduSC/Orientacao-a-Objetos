public class Escola{
	private String nome;
	private String fone;
	private Turma[] vetTurmas;
	private int qtdeTurmas;


	public Escola(){
		this.vetTurmas = new Turma[20];
	}

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}

	public String getFone(){
		return this.fone;
	}
	
	public void setFone(String f){
		this.fone = f;
	}

	public int getQtdeTurmas(){
		return this.qtdeTurmas;
	}
	
	public void setQtdeTurmas(int qt){
		this.qtdeTurmas = qt;
	}

	public Turma getTurma(int pos){
		return this.vetTurmas[pos];
	}
	
	public void setTurma(Turma t){
		this.setQtdeTurmas(this.getQtdeTurmas() + 1);
		int pos = this.getQtdeTurmas() - 1;
		this.vetTurmas[pos] = t;
	}
}

