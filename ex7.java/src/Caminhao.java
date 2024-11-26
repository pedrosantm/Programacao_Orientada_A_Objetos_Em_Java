import javax.swing.JOptionPane;

public class Caminhao extends Veiculo implements iFinaciavel{
    public  void vender(){};
    public  void exibirdetalhes(){};

    public double calcularparcela(double preço, int meses){
        double resultado = (preço*0.15)*meses;
        return resultado;
    };
    public String exibircondicoesfinanciamento(double preço, int meses){
        double resultado = calcularparcela(preço, meses);
        return "Taxa de juros: 15%, preço final " + resultado;


    };
}
