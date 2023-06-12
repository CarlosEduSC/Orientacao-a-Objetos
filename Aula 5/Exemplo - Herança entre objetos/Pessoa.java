public class Pessoa {
	private String nome;
	private int idade;
	private String email;
	
	//metodo construtor
	public Pessoa(){
		System.out.println("Criando objeto da classe Pessoa");
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String n){
		this.nome = n;
	}

	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int i){
		this.idade = i;
	}

	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String e){
		this.email = e;
	}
}

