package questão01;
import java.util.Random;

public class ContaPoupança extends ContaGeral{
    public ContaPoupança(String titular, String cpf, double saldoI){
        super(titular, cpf, saldoI);
    }
    private int selic(){
        Random x = new Random();
        return x.nextInt(1,9);
    }
    int tempo = 0;
    public void mes(){
        tempo++;
    }
    public double rendimento(){
        int valorSelic = selic();
        if (valorSelic > 8){
            return 0.005 * saldoI;
        }
        else {
            return 0.007 * valorSelic * saldoI;
        }
    }
}
