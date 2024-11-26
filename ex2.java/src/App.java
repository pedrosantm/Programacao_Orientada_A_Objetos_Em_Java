import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String a, b, c;
        String esc = "0";
        int a2;
        boolean resposta;
        float a3,b3,c3;
        Soluçoes s = new Soluçoes();//criação do objeto
        do{
            esc = JOptionPane.showInputDialog(null, "1- Primo\n2-Perfeito\n3-Fatorial\n4-Fibonacci\n5-X1\n6-X2\n7-Finalizar", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
            int esc2 = Integer.parseInt(esc);
    
            switch(esc2){
                case 1:
                     a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                     a2 = Integer.parseInt(a);
                    s.setA = a2;
                    resposta = s.primo();
                    JOptionPane.showMessageDialog(null, "Primo: " + resposta, "informaçoes", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                     a2 = Integer.parseInt(a);
                    s.setA = a2;
                     resposta = s.perfeito();
                    JOptionPane.showMessageDialog(null, "Perfeito: " + resposta, "informaçoes", JOptionPane.INFORMATION_MESSAGE);	
                    break;
                case 3:
                    a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                     a2 = Integer.parseInt(a);
                    s.setA = a2;
                    int resultado = s.fatorial();
                    JOptionPane.showMessageDialog(null, "Fatorial: " + resultado, "informaçoes", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                     a2 = Integer.parseInt(a);
                    s.setA(a2);
                    resultado = s.fibonacci();
                    JOptionPane.showMessageDialog(null, "Fibonacci: " + resultado, "informaçoes", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                     b = JOptionPane.showInputDialog(null, "Digite B", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                     c = JOptionPane.showInputDialog(null, "Digite C", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                    a3 = Integer.parseInt(a);
                    b3 = Integer.parseInt(b);
                    c3 = Integer.parseInt(c);
                    s.setA(a3);
                    s.setA(b3);
                    s.setC(c3);
                    //s.retornax1();
                    JOptionPane.showMessageDialog(null, "x1: " + s.retornax1(), "informaçoes", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                        b = JOptionPane.showInputDialog(null, "Digite B", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                        c = JOptionPane.showInputDialog(null, "Digite C", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
                    a3 = Float.ParseFloat(a);
                    b3 = Float.PareseFloat(b);
                    c3 = Float.ParseFloat(c);
                    s.setA(a3);
                    s.setA(b3);
                    s.setC(c3);
                    //s.retornax1();
                    JOptionPane.showMessageDialog(null, "x1: " + s.retornax2(), "informaçoes", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    esc = "1";
            

                    
            }
                
            
        }while(esc.equals("0"));

    }
}




