import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int escolha = 0;
        Equacao equacao = new Equacao();//criação do objeto
        do{
            String a = JOptionPane.showInputDialog(null, "Digite a", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

            String b = JOptionPane.showInputDialog(null, "Digite b", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

            String c = JOptionPane.showInputDialog(null, "Digite c", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

            double a1 = Double.parseDouble(a);//conversoes
            double b1 = Double.parseDouble(b);
            double c1 = Double.parseDouble(c);

            equacao.setA(a1);//sets nos atributos   
            equacao.setB(b1);          
            equacao.setC(c1);

            double delt = equacao.delta(equacao.getA(), equacao.getB(), equacao.getC());//calculos
            double x1 = equacao.retornax1(equacao.getA(), equacao.getB(), equacao.getC(), delt);
            double x2 = equacao.retornax2(equacao.getA(), equacao.getB(), equacao.getC(), delt);


            if (x1 != 0|| x2 != 0) {//verificação de resultado possivel
                JOptionPane.showMessageDialog(null, "As raízes da equação são:\nX1 = " + x1 + "\nX2 = " + x2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            
            }else{
                JOptionPane.showConfirmDialog(null, "Delta negativo", "Error", JOptionPane.ERROR_MESSAGE);
            }

            escolha = JOptionPane.showConfirmDialog(null, "Deseja calcular outra equação?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (escolha == JOptionPane.YES_OPTION);//verificação de continuidades


    }

      
}
