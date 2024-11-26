public class Serviço extends Produto{
    private double valorhora;

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public void cadastrarmercadoria(int codigo, String nome, double valorhora){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setValorhora(valorhora);
    }

    
}
