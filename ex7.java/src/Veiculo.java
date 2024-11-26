public abstract class Veiculo {
    private String modelo;
    private String marca;
    private double preço;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }


    public abstract void vender();
    public abstract void exibirdetalhes();

}
