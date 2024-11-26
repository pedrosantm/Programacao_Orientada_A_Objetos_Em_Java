import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] f = new Funcionario[10]; // Array de objetos Funcionario
        String esc, titulo, nome, cpf, a;
        int esc2 = 0, num_funcionarios = 0, control =0;
        double sal;

        do {
            esc = JOptionPane.showInputDialog(null, 
                "1-Cadastrar funcionario\n2-Listar todos os funcionarios\n3-Buscar por nome\n4-Sair", 
                "Menu", 
                JOptionPane.QUESTION_MESSAGE); // Input do menu

            esc2 = Integer.parseInt(esc);

            switch (esc2) {
                case 1:
                    if (num_funcionarios >= 10) {
                        JOptionPane.showMessageDialog(null, "Limite de funcionários atingido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                    f[num_funcionarios] = new Funcionario(); // Inicializa o objeto Funcionario

                    titulo = JOptionPane.showInputDialog(null, "Digite título", "Informações", JOptionPane.QUESTION_MESSAGE);
                    f[num_funcionarios].setTitulo(titulo);

                    a = JOptionPane.showInputDialog(null, "Digite o salário", "Informações", JOptionPane.QUESTION_MESSAGE);
                    sal = Double.parseDouble(a);
                    f[num_funcionarios].setSalario(sal);

                    nome = JOptionPane.showInputDialog(null, "Digite o nome", "Informações", JOptionPane.QUESTION_MESSAGE);
                    f[num_funcionarios].setNome(nome);

                    cpf = JOptionPane.showInputDialog(null, "Digite o CPF", "Informações", JOptionPane.QUESTION_MESSAGE);
                    f[num_funcionarios].setCpf(cpf);

                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Informações", JOptionPane.INFORMATION_MESSAGE);
                    num_funcionarios++;
                    break;

                case 2:
                    StringBuilder listaFuncionarios = new StringBuilder();
                    for (int i = 0; i < num_funcionarios; i++) {
                        listaFuncionarios.append("Funcionário ").append(i + 1).append(":\n")
                                .append("Título: ").append(f[i].getTitulo()).append("\n")
                                .append("Nome: ").append(f[i].getNome()).append("\n")
                                .append("Salário: ").append(f[i].getSalario()).append("\n")
                                .append("CPF: ").append(f[i].getCpf()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, listaFuncionarios.toString(), "Lista de Funcionários", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    String buscaNome = JOptionPane.showInputDialog(null, "Digite o nome para buscar", "Buscar por Nome", JOptionPane.QUESTION_MESSAGE);
                    boolean encontrado = false;

                    for (int i = 0; i < num_funcionarios; i++) {
                        if (f[i].getNome().equalsIgnoreCase(buscaNome)) {
                            JOptionPane.showMessageDialog(null, 
                                "Funcionário encontrado:\n" +
                                "Título: " + f[i].getTitulo() + "\n" +
                                "Nome: " + f[i].getNome() + "\n" +
                                "Salário: " + f[i].getSalario() + "\n" +
                                "CPF: " + f[i].getCpf(), 
                                "Informações", 
                                JOptionPane.INFORMATION_MESSAGE);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado.", "Informações", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 4:
                    control = 1; // Sair do programa
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (control == 0);
    }
}
