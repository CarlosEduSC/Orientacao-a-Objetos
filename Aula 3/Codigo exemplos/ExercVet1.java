import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExercVet1 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//declara um vetor de inteiros ja atribuindo valores
		int[] vetVal = {4,7,1,34,9};
		System.out.println(vetVal[1]);

		//declara um vetor de String com 12 posicoes
		String[] valores = new String[12];
		valores[0] = "Janeiro";
		valores[1] = "Fevereiro";
		valores[2] = "Março";
		valores[3] = "Abril";
		valores[4] = "Maio";
		valores[5] = "Junho";
		valores[6] = "Julho";
		valores[7] = "Agosto";
		valores[8] = "Setembro";
		valores[9] = "Outubro";
		valores[10] = "Novembro";
		valores[11] = "Dezembro";

		System.out.println("Informe o numero de um mes");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.println(valores[num1-1]);
	}
}

