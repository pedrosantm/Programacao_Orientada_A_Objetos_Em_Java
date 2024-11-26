import javax.swing.JOptionPane;

public class Musica extends Midia {
    private String artista;
    private String album;



    

     public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }


    public Musica(String titulo, int ano, String artista, String album) {
        this.setTitulo(titulo);
        this.setAno(ano);
        this.setArtista(artista);
        this.setAlbum(album);
    }
    public  void reproduzir(){
        JOptionPane.showInputDialog(null, "Tocando musica " + this.getTitulo() + " de " + this.getArtista(), 
                    "Menu", 
                    JOptionPane.INFORMATION_MESSAGE);

     };
     public String exibirdetalhes(){
        return "musica " + this.getTitulo() + " de " + this.getArtista() + " do ano de " + this.getAno() + " do album " + this.getAlbum();

     };
}
