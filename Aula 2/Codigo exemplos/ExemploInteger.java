	public class ExemploInteger {
	public static void main(String[] args) {
		int i1;
		Integer i2, i3;
		String s1 = "10";
		
		//converter de String para int
		i1 = Integer.parseInt(s1);
		System.out.println(i1);
		//converter de Integer para String
		i2 = 10;
		s1 = i2.toString();

		int valor = 5;
		//erro: int não tem métodos -> s1 = valor.toString();
		s1 = Integer.toString(valor);
		
		//converter para float
		float f1 = i2.floatValue();
		//integer comparação com == ou equals , int só com ==
		i3=10;
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));
	}
}





