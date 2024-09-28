package questão01;

public class ContaCorrente extends ContaGeral{
    public ContaCorrente(String titular, String cpf, double saldoI){
        super(titular, cpf, saldoI);
    }
    public double aPagar;
    public boolean devendo(){
        if (this.aPagar >= 0){
            this.aPagar = 0;
            return false;
        }
        else{
            return true;
        }
    }
    public void chequeEspecial(){
        if(devendo() == false && this.saldoI < 1000) {
            this.aPagar = this.saldoI - 1000;
            this.saldoI = this.saldoI - 1000;
            if (this.saldoI < 1000){
                saldoI = 0;
            }
        }
        else if(devendo() == true){
                System.out.printf("Você ainda está devendo %sR$%n", this.aPagar);
            }
        else {
            this.saldoI -= 1000;
        }
    }
}
