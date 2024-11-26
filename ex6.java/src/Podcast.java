import javax.swing.JOptionPane;

public class Podcast extends Midia {
    private String anfitriao;
    private int episodio;



    public String getAnfitriao() {
        return anfitriao;
    }
    public void setAnfitriao(String anfitriao) {
        this.anfitriao = anfitriao;
    }
    public int getEpisodio() {
        return episodio;
    }
    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }


    public Podcast(String titulo, int ano, String anfitriao, int episodio) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setAnfitriao(anfitriao);
        this.setEpisodio(episodio);
    }

    public  void reproduzir(){
        JOptionPane.showInputDialog(null, "Reproduzindo episodio " + this.getTitulo() + "numero " + this.getEpisodio() + " com " + this.getAnfitriao(), 
                    "Menu", 
                    JOptionPane.INFORMATION_MESSAGE);



    };
    public String exibirdetalhes(){
          return "episodio " + this.getTitulo() + "numero " + this.getEpisodio() + " com " + this.getAnfitriao() + " do ano de " + this.getAno();


        
    };
    
}
