package questão01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente x = new ContaCorrente("a", "a", 999);
        x.mostrarDados();
        x.chequeEspecial();
        System.out.println(x.aPagar);
        System.out.println(x.saldoI);
        ContaPoupança y = new ContaPoupança("a", "a", 100);
    }
}
