public abstract class Midia {
    private String titulo;
    private int ano;

    abstract public  void reproduzir();
    abstract public String exibirdetalhes();
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


    

}
