public class Circulo implements FormaGeometrica{
    private float raio;

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float r) {
        this.raio = r;
    }

    public float calcularArea() {
        return 3.14f*(this.raio*this.raio);
    }
}
