public class Caminao extends Veiculo {
    private String tipoCaçamba;
    private int numCaçambas;
    private String tipoCabine;

    public String getCaçamba(){
        return this.tipoCaçamba;
    }

    public void setCaçamba(String caç) {
        this.tipoCaçamba = caç;
    }

    public int getNCaçambas(){
        return this.numCaçambas;
    }

    public void setNCaçambas(int n) {
        this.numCaçambas = n;
    }

    public String getCabine(){
        return this.tipoCabine;
    }

    public void setCabine(String cab) {
        this.tipoCabine = cab;
    }
}
