import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExercVet2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Informe o numero de um mes");
		int num1 = Integer.parseInt(reader.readLine());
		
		Meses meses = new Meses();
		String mes = meses.lerNomeMes(num1);
		if(mes.equals("")) {
			System.out.println("Valor inválido.");
		}else{
			System.out.println("O mês é: " + mes);
		}
	}
}



