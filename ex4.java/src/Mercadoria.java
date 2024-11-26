public class Mercadoria extends Produto{
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void cadastrarmercadoria(int codigo, String nome, double peso){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setPeso(peso);
    }

    
}
