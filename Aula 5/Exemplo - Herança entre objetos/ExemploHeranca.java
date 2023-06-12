public class ExemploHeranca {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Jeremias");
		p1.setIdade(25);
		p1.setEmail("jeremias@hotmail.com");
		
		Aluno a1 = new Aluno();
		a1.setNome("Juca bala");
		a1.setIdade(33);
		a1.setEmail("juca@hotmail.com");
		a1.setNota1(8.7f);
		a1.setNota2(8f);
		a1.setNota3(7f);
		a1.setNota4(9.2f);
		Float media = a1.calcularMedia();
		System.out.println("O aluno " + a1.getNome() + 
			" teve media " + media);
	}
}






