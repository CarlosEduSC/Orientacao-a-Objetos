public class Utilizador{
	public static void main(String[] args){
		System.out.println("Relogio de pulso:");
		RelogioDePulso rp = new RelogioDePulso();
		rp.iniciarCronometro();
		System.out.println(rp.getHoras());
		
		/* nao eh possivel instanciar interface
		Relogio r = new Relogio();
		r.getHoras();
		*/

		System.out.println("Rádio Relogio:");
		RadioRelogio rr = new RadioRelogio();
		rr.ligar();
		rr.trocarEstacao(123.4f);
		rr.desligar();
	}
}
