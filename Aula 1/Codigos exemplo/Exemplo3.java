class Exemplo3 {
    public static void main (String[] args) {
        int resultado;

        OperacoesMatematicas opMat = new OperacoesMatematicas();

        resultado = opMat.somar(2,3);
        System.out.println ("2 + 3 = " + resultado);

        resultado = opMat.multiplicar(3,7);
        System.out.println ("3 * 7 = " + resultado);
    }
}