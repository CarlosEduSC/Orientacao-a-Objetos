/* Sempre que for necessario utilizar uma classe que esta em outro pacote, deve-se referencia-la atraves do comando import.
Tambem eh possivel importar um pacote inteiro de uma vez so.
Exemplo: import java.io.*;
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerDados {  
    public static void main(String[] args) throws Exception {  
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// System.in: entrada padrao (teclado)
		// InputStreamReader: captura um fluxo de entrada de dados
		// BufferedReader : buffer de leitura
	
		String linha = "";
		System.out.println("Digite alguma coisa ou S para sair: ");
		while(!linha.equals("S")){
			linha = reader.readLine();
			System.out.println("Voce digitou: " + linha);
		}
    }  
}  




