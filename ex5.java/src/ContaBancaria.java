public abstract class ContaBancaria {
    private String senha;
    private int numero;
    private float saldo;



    
    public  ContaBancaria(String senha, int numero, float saldo){
        this.senha = senha;
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public abstract void Saca(float diminui);

}


