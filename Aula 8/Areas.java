public class Areas {
    public static void main(String[] args) throws Exception{
        Quadrado q1 = new Quadrado();
        Retangulo r1 = new Retangulo();
        Circulo c1 = new Circulo();

        q1.setLado(2.0f);

        System.out.println("Area do Qaudrado: "+ q1.calcularArea());

        r1.setBase(5f);
        r1.setAltura(10f);

        System.out.println("Area do Retangulo: "+ r1.calcularArea());

        c1.setRaio(3.5f);

        System.out.println("Area do Circulo: "+ c1.calcularArea());
    }
}
