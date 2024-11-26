public class ContaPoupança extends ContaBancaria {
    private float taxarendimento;

    
    public ContaPoupança(String senha, int numero, float saldo, float taxarendimento) {
        super(senha, numero, saldo); // Chama o construtor da classe pai
        this.taxarendimento = taxarendimento; 

    }

    public float getTaxarendimento() {
        return taxarendimento;
    }

    public void setTaxarendimento(float taxarendimento) {
        this.taxarendimento = taxarendimento;
    }

    public void Saca(float diminui){};
}
