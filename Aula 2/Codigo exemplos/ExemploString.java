public class ExemploString {
	public static void main(String[] args) {
		String s1, s2, s3;
		s1 = "Um texto qualquer...   ";
		System.out.println("[" + s1 + "]");
		s1 = s1.trim(); //remover espacos
		System.out.println("[" + s1 + "]");
		
		System.out.println("Tamanho do String: " + s1.length());
		System.out.println("[" + s1.toUpperCase() + "]");
		System.out.println("[" + s1.toLowerCase() + "]");
		
		//substituir um substring dentro de um String
		s1 = s1.replaceAll("texto", "pendrive");
		System.out.println("[" + s1 + "]");
		
		//extrair substring
		s2 = s1.substring(6, 9);
		System.out.println("[" + s2 + "]");
		
		//procurar substring
		s1 = "humberto.beneduzzi@ifpr.edu.br";
		int pos = s1.indexOf("@");
		System.out.println("O @ esta na posicao: " + pos);
		System.out.println("Usuario: " 
			+ s1.substring(0, s1.indexOf("@")));
		System.out.println("Servidor: " 
			+ s1.substring(s1.indexOf("@")+1, s1.length()));	
		
		//converter de outros tipos para String (char, int, float, ...)
		int i1 = 5;
		s2 = String.valueOf(i1);
	} 
}





