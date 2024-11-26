import javax.swing.JOptionPane;

public class Carro extends Veiculo implements iFinaciavel{
    public  void vender(){};
    public  void exibirdetalhes(){};

    public double calcularparcela(double preço, int meses){
        double resultado = (preço*0.10)*meses;
        return resultado;
    };
    public String exibircondicoesfinanciamento(double preço, int meses){     
        double resultado = calcularparcela(preço, meses);
        return "Taxa de juros: 10%, preço final " + resultado;

    };
}
