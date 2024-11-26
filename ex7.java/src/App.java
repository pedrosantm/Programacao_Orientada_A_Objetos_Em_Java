import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       List<Veiculo> veiculos = new ArrayList<>();
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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        
            default:
                control = 1;
                break;
        }


        }while (control == 0);
    }
    
}
