import javax.swing.JOptionPane;

public class Video extends Midia{
    private String diretor;
    private int duracao;


    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }



    public Video(String titulo, int ano, String diretor, int duracao) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setDiretor(diretor);
        this.setDuracao(duracao);
    }

    public  void reproduzir(){
        JOptionPane.showInputDialog(null, "Reproduzindo video de " + this.getTitulo() + " dirigido por " + this.getDiretor(), 
                    "Menu", 
                    JOptionPane.INFORMATION_MESSAGE);


    };
    public String exibirdetalhes(){
        return "video de " + this.getTitulo() + " dirigido por " + this.getDiretor() + "do ano de " + this.getAno() + " Com duracao de " + this.getDuracao() + " minutos";
    };
    
}
