import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        String esc;
        int esc2, control = 0;
        




        do{
            esc = JOptionPane.showInputDialog(null, 
                    "1-Criar conta corrente\n2-Criar conta poupança\n3-Sacar\n4-Depositar\n5-Verificar saldo\n6-Sair", 
                    "Menu", 
                    JOptionPane.QUESTION_MESSAGE); // Input do menu
    
             esc2 = Integer.parseInt(esc);
             switch (esc2) {
                case 1:
                    
                    break;
             
                default:
                    break;
             }
    
    
             switch (esc2){}
    }while(control == 0);
 }
}
