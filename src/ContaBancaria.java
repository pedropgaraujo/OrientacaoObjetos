/*1 - Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados. */

public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;
    public String titular;

    public void depositar(double valor){
        this.saldoConta += valor;
        System.out.println("Deposito realizado");
    }

    public void sacar(double valor){
        if (valor <= this.saldoConta){
            this.saldoConta -= valor;
        } else {
            System.out.println("Saldo Indisponivel");
        }
    }

    public void consultarSaldo(){
        System.out.println("O saldo da conta e de: " + this.saldoConta);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
