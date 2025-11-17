public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal (double tarifa){
        setSaldoConta((getSaldoConta()-tarifa));
    }
}
