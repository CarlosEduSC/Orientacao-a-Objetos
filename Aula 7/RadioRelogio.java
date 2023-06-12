public class RadioRelogio implements Radio, Relogio{
	private String horarioAtual;
	
	public String getHoras(){
		this.horarioAtual = "cedo pra caramba";
		return horarioAtual;
	}
	
	public void ligar(){
		System.out.println("Ligado");
	}
	
	public void desligar(){
		System.out.println("Desligado");
	}

	public void trocarEstacao(float frequencia){
		System.out.println("Trocando a frequencia para: " 
			+ String.valueOf(frequencia));
	}	
}
