public class Exercicio {
    
    public static void main(String[] args) {
        String s1,cep,telefone;
        int divisao,ultimosDigitos;

        s1 = "IFPR - Campus Foz do Iguaçu - Avenida Araucária, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Paraná - (45)3422-5348";
        s1 = s1.trim();

        System.out.println (s1);

        cep = s1.substring(s1.indexOf("85"),s1.indexOf("000")+3);

        System.out.println ("CEP: " + cep);

        telefone = s1.substring(s1.indexOf("(45)"), s1.indexOf("48")+2);

        System.out.println ("Telefone: " + telefone);

        ultimosDigitos = Integer.parseInt(s1.substring(s1.indexOf("53"), s1.indexOf("48")+2));
        divisao = ultimosDigitos/2;

        System.out.println ("Telefone: " + ultimosDigitos);

        System.out.println ("Divisao dos ultimos quatro numeros do telefone por dois: " + divisao);
    }
}
