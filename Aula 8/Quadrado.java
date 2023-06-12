public class Quadrado implements FormaGeometrica {
    private float lado;

    public float getLado() {
        return this.lado;
    }

    public void setLado(float l) {
        this.lado = l;
    }

    @Override
    public float calcularArea() {
        return this.lado*this.lado;
    }
}
