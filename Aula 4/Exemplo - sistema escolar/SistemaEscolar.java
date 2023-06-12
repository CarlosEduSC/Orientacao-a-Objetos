import java.io.*;

public class SistemaEscolar{
	private Escola e1;
	private BufferedReader reader;
	
	public static void main(String[] args) throws Exception{
		SistemaEscolar se = new SistemaEscolar();
		se.e1 = new Escola();
		se.reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Informe o nome da escola:");
		se.e1.setNome(se.reader.readLine());
		System.out.println("Telefone:");
		se.e1.setFone(se.reader.readLine());
		se.menu();
	}
	
	public void menu() throws Exception{
		String opcao = "";
		while(!opcao.equals("4")){
			System.out.println("\n-------------------------");
			System.out.println("[1] Cadastrar nova turma");
			System.out.println("[2] Listar turmas existentes");
			System.out.println("[3] Consultar turma");
			System.out.println("[4] Sair");
			opcao = this.reader.readLine();
			
			if(opcao.equals("1")){
				this.cadastrarTurma();
			}else if(opcao.equals("2")){
				this.listarTurmas();
			}else if(opcao.equals("3")){
				this.consultarTurma();
			}else if(opcao.equals("4")){
				System.out.println("Encerrando...");
			}else {
				System.out.println("Opcao invalida...");
			}
		}
	}
	
	public void cadastrarTurma(){
		try{
			Turma turma = new Turma();
			System.out.println("Numero da turma:");
			String numTurma = this.reader.readLine();
			turma.setNumeroTurma(Integer.parseInt(numTurma));
			
			System.out.println("Nome do curso:");
			turma.setNomeCurso(this.reader.readLine());
			
			System.out.println("Ano:");
			String ano = this.reader.readLine();
			turma.setAno(Integer.parseInt(ano));
			
			System.out.println("\n---------Alunos--------");
			for(int i=0; i<40; i++){
				System.out.println("\n-----------------");
				System.out.println("Informe o nome do aluno:");
				String nomeAluno = this.reader.readLine();
				if(nomeAluno.equals("")){
					break;
				}
				Aluno aluno = new Aluno();
				aluno.setNome(nomeAluno);
				
				System.out.println("Matricula:");
				aluno.setMatricula(this.reader.readLine());
				
				System.out.println("Nota 1:");
				String n1 = this.reader.readLine();
				aluno.setNota1(Float.parseFloat(n1));
				System.out.println("Nota 2:");
				String n2 = this.reader.readLine();
				aluno.setNota2(Float.parseFloat(n2));
				System.out.println("Nota 3:");
				String n3 = this.reader.readLine();
				aluno.setNota3(Float.parseFloat(n3));
				System.out.println("Nota 4:");
				String n4 = this.reader.readLine();
				aluno.setNota4(Float.parseFloat(n4));
				
				turma.setAluno(i, aluno);
			}
			this.e1.setTurma(turma);
		}catch(Exception e1){
			System.out.println("formato invalido...");
		}
	}
	
	public void listarTurmas() throws Exception{
		System.out.println("------------------------");
		System.out.println("Relatorio de Turmas");
		for(int i = 0; i < this.e1.getQtdeTurmas(); i++){
			String linha = "Numero: " + this.e1.getTurma(i).getNumeroTurma();
			
			System.out.print(linha);
			
			linha = " - Curso: " + this.e1.getTurma(i).getNomeCurso();
			System.out.print(linha);
			
			linha = " - Ano: " + this.e1.getTurma(i).getAno();
			System.out.print(linha + "\n");
		}
	}
	
	public void consultarTurma(){
		try{
			System.out.println("------------------------");
			System.out.println("Consulta de Turma");
			System.out.println("Informe o numero da Turma: ");
			int numTurma = Integer.parseInt(this.reader.readLine());
			boolean achou = false;
			
			for(int i = 0; i < this.e1.getQtdeTurmas(); i++){
				Turma t = this.e1.getTurma(i);
				if(t.getNumeroTurma() == numTurma){
					System.out.println("Alunos da Turma:");
					int pos = 0;
					while(t.getAluno(pos) != null){
						String linha = "Nome: " + t.getAluno(pos).getNome();
						System.out.print(linha);
						
						linha = " - Media: " + t.getAluno(pos).calcularMedia();
						System.out.println(linha);
						pos++;
					}
					achou = true;
					break;
				}
			}
			if(!achou){
				System.out.println("Turma nao encontrada");
			}
		}catch(Exception e1){
			System.out.println("formato invalido...");
		}
	}
	
	
}




