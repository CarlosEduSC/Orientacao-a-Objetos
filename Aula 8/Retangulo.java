public class Retangulo implements FormaGeometrica {
    private float base;
    private float altura;

    public float getBase() {
        return this.base;
    }

    public void setBase(float b) {
        this.base = b;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float calcularArea() {
        return this.base*this.altura;
    }
}
