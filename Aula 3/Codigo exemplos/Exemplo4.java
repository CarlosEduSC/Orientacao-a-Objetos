
public class Exemplo4 {
    public static void main(String[] args) {
		Integer val1, val2, res;
		OperacoesMatematicas opMat = new OperacoesMatematicas();

		if (args.length < 2){ //tamanho do vetor
		    System.out.println ("O programa precisa de 2 argumentos!");
		    System.exit(0);
		}

		val1 = Integer.parseInt(args[0]); //conversão de tipos (casting)
		val2 = Integer.parseInt(args[1]);

		System.out.println("Primeiro IF:");
		if(val1 < 5){
		    res = opMat.multiplicar(val1, val2);
		    System.out.println(val1 + " * " + val2 + " = " + res);
		}else{
		    res = opMat.somar(val1, val2);
		    System.out.println(val1 + " + " + val2 + " = " + res);
		}
		
		//Operadores lógicos: && -> AND    ;  || -> OR    ;   != -> NOT
		System.out.println("Segundo IF:");
		if((val1 > val2) && (val2 != 0)){
		    res = opMat.subtrair(val1, val2);
		    System.out.println(val1 + " - " + val2 + " = " + res);
		}else if((val1 == val2) || (val1 > 10)){
		    res = opMat.multiplicar(val1, val2);
		    System.out.println(val1 + " * " + val2 + " = " + res);
		}else{
		    System.out.println("Nenhum critério atendido");
		}
		


        int val = 4;
        switch (val) {
		case 1:
		case 2:
			System.out.println("1 ou 2");
			break;
		case 3: 
			System.out.println("3");
			break;
		default:
			System.out.println("outro valor");
		}


        String opt = "y";
        switch (opt) {
		case "a":
			System.out.println("opt a");
			break;
		case "y":
			System.out.println("opt y");
			break;
		default:
			System.out.println("outro valor");
		}
	}
}



