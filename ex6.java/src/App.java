import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        List<Midia> midias = new ArrayList<>();
        String esc;
        int control = 0;
        

        do{


            esc = JOptionPane.showInputDialog(null, 
                    "1-Cadastrar uma midia\n2-Listar todas as midias\n3-Buscar midia por titulo\n4-Reproduzir uma midia\n5-Sair", 
                    "Menu", 
                    JOptionPane.QUESTION_MESSAGE);
        int esc2 = Integer.parseInt(esc);

        switch (esc2) {
            case 1:
                cadastrarMidia(midias);
                break;
            case 2:
                listarMidias(midias);
                break;
            case 3:
                buscarPorTitulo(midias);
                break;
            case 4:
                reproduzirMidia(midias);
                break;
        
            default:
                control = 1;
                break;
        }


        }while (control == 0);
    }

    private static void cadastrarMidia(List<Midia> midias) {
        String[] tipos = {"Música", "Vídeo", "Podcast"};
        String tipo = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de mídia:", "Cadastro",
                                  JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);

        if (tipo == null) return;

        String titulo = JOptionPane.showInputDialog("Digite o título:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        switch (tipo) {
            case "Música":
                String artista = JOptionPane.showInputDialog("Digite o artista:");
                String album = JOptionPane.showInputDialog("Digite o álbum:");
                midias.add(new Musica(titulo, ano, artista, album));
                break;
            case "Vídeo":
                String diretor = JOptionPane.showInputDialog("Digite o diretor:");
                int duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração (em minutos):"));
                midias.add(new Video(titulo, ano, diretor, duracao));
                break;
            case "Podcast":
                String anfitriao = JOptionPane.showInputDialog("Digite o anfitrião:");
                int episodio = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do episódio:"));
                midias.add(new Podcast(titulo, ano, anfitriao, episodio));
                break;
        }
        JOptionPane.showMessageDialog(null, "Mídia cadastrada com sucesso!");
    }


    private static void listarMidias(List<Midia> midias) {
        if (midias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma mídia cadastrada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder sb = new StringBuilder("Mídias cadastradas:\n");
            for (Midia midia : midias) {
                sb.append(midia.exibirdetalhes()).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    private static void buscarPorTitulo(List<Midia> midias) {
        String titulo = JOptionPane.showInputDialog("Digite o título da mídia:");
        StringBuilder sb = new StringBuilder("Mídias encontradas:\n");
        for (Midia midia : midias) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                sb.append(midia.exibirdetalhes()).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, "Mídia não encontrada!");
    }

    private static void reproduzirMidia(List<Midia> midias) {
        String titulo = JOptionPane.showInputDialog("Digite o título da mídia:");
        for (Midia midia : midias) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                midia.reproduzir();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Mídia não encontrada!");
    }


}
