import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Mercadoria[] m = new Mercadoria[10];
        Serviço[] s = new Serviço[10];
        String esc;
        int esc2 = 0, num_serviços = 0,num_mercadorias = 0, control = 0;


        do{
        esc = JOptionPane.showInputDialog(null, 
                "1-Cadastrar mercadoria\n2-Cadastrar serviço\n3-Buscar por mercadoria\n4-Buscar por serviço\n5-Sair", 
                "Menu", 
                JOptionPane.QUESTION_MESSAGE); // Input do menu

         esc2 = Integer.parseInt(esc);


         switch (esc2) {
            case 1:
                    if (num_mercadorias>= 10) {
                        JOptionPane.showMessageDialog(null, "Limite de mercadorias atingido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                    m[num_mercadorias] = new Mercadoria(); // Inicializa o objeto Mercadoria

                    String nome = JOptionPane.showInputDialog(null, "Digite o nome", "Informações", JOptionPane.QUESTION_MESSAGE);
                    
                    String codigo_str = JOptionPane.showInputDialog(null, "Digite o codigo", "Informações", JOptionPane.QUESTION_MESSAGE);
                    int codigo = Integer.parseInt(codigo_str);

                    String peso_str = JOptionPane.showInputDialog(null, "Digite o peso", "Informações", JOptionPane.QUESTION_MESSAGE);
                    double peso = Double.parseDouble(peso_str);


                    m[num_mercadorias].cadastrarmercadoria(codigo, nome, peso);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Informações", JOptionPane.INFORMATION_MESSAGE);
                    num_mercadorias ++;
           
                    break;
            case 2:
                    if (num_serviços>= 10) {
                        JOptionPane.showMessageDialog(null, "Limite de serviços atingido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                    s[num_serviços] = new Serviço(); // Inicializa o objeto serviço

                    String nomeS = JOptionPane.showInputDialog(null, "Digite o nome", "Informações", JOptionPane.QUESTION_MESSAGE);
                    
                    String codigo_strS = JOptionPane.showInputDialog(null, "Digite o codigo", "Informações", JOptionPane.QUESTION_MESSAGE);
                    int codigoS = Integer.parseInt(codigo_strS);

                    String valhora_strS = JOptionPane.showInputDialog(null, "Digite o valor/hora", "Informações", JOptionPane.QUESTION_MESSAGE);
                    double valhora = Double.parseDouble(valhora_strS);


                    s[num_serviços].cadastrarmercadoria(codigoS, nomeS, valhora);
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Informações", JOptionPane.INFORMATION_MESSAGE);
                    num_serviços ++;
           
                    break;
                
                case 3:
                    String buscaNome = JOptionPane.showInputDialog(null, "Digite o nome para buscar", "Buscar por Nome", JOptionPane.QUESTION_MESSAGE);
                    boolean encontrado = false;

                    for (int i = 0; i < num_mercadorias; i++) {
                        if (m[i].getNome().equalsIgnoreCase(buscaNome)) {
                            JOptionPane.showMessageDialog(null, 
                                "Mercadoria encontrada:\n" +
                                "Nome: " + m[i].getNome() + "\n" +
                                "Codigo: " + m[i].getCodigo() + "\n" +
                                "Peso: " + m[i].getPeso(),"Informações", JOptionPane.INFORMATION_MESSAGE);
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false) {
                        JOptionPane.showMessageDialog(null, "Mercadoria nao encontrada!", "Informações", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            case 4:
                String buscaNomeS = JOptionPane.showInputDialog(null, "Digite o nome para buscar", "Buscar por Nome", JOptionPane.QUESTION_MESSAGE);
                boolean encontradoS = false;

                for (int i = 0; i < num_serviços; i++) {
                    if (s[i].getNome().equalsIgnoreCase(buscaNomeS)) {
                        JOptionPane.showMessageDialog(null, 
                            "Serviço encontrado:\n" +
                            "Nome: " + s[i].getNome() + "\n" +
                            "Codigo: " + s[i].getCodigo() + "\n" +
                            "Peso: " + s[i].getValorhora(),"Informações", JOptionPane.INFORMATION_MESSAGE);
                        encontradoS = true;
                        break;
                    }
                }
                if(encontradoS == false) {
                    JOptionPane.showMessageDialog(null, "Serviço nao encontrado!", "Informações", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case 5:
                control = 1;

            }
        } while(control == 0);
        
    }
}
