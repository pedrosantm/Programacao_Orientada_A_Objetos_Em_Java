import javax.swing.JOptionPane;

public class Moto extends Veiculo implements iFinaciavel{
    public  void vender(){};
    public  void exibirdetalhes(){};

    public double calcularparcela(double preço, int meses){
        double resultado = (preço*0.5)*meses;
        return resultado;
    };
    public String exibircondicoesfinanciamento(double preço, int meses){
        double resultado = calcularparcela(preço, meses);
        return "Taxa de juros: 0,5%, preço final " + resultado;
    };
}
