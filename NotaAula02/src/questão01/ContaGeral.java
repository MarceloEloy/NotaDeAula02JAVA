package questão01;

public class ContaGeral {
    protected ContaGeral(String titular, String cpf, double saldoI){
        this.cpf = cpf;
        this.titular = titular;
        this.saldoI = saldoI + 0.0;

    }
    String titular, senha, cpf;
    double saldoI = 0.0;
    public void mostrarDados(){
        System.out.printf("O titular %s, de cpf %s, tem em conta %sR$%n", this.titular, this.cpf, this.saldoI);
    }
    public void sacar(double dinheiro) {
        if (this.saldoI >= dinheiro) {
            this.saldoI = this.saldoI - dinheiro + 0.0;
            System.out.printf("Seu saldo agora é de %s%n", this.saldoI);
        }
        else {
            System.out.println("Saque inválido, verifique seu saldo para transações futuras");
        }
    }
    public void depositar(double dinheiro){
        this.saldoI = this.saldoI + dinheiro +0.0;
    }
}
