public class  Funcionario extends Cargo{
    private String nome;
    private String cpf;

    public Funcionario(){
        this.nome = "";
        this.cpf = "";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
