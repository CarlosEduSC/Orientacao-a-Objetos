public class RelogioDePulso implements Relogio{
	private String horarioAtual;
	
	public String getHoras(){
		this.horarioAtual = "cedo pra caramba";
		return horarioAtual;
	}
	
	public void iniciarCronometro(){
		System.out.println("Cronometro iniciado...");
	}
}
