public class Conta {
    /*Classe que abstrai uma Conta Bancária
    @author Marcos Davi
    @version 1.0
    */
    
    int agencia;
    int numero;
    double saldo;
    
    public Conta () {

    }
   
    public Conta (int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public void retirar (double valor){
        this.saldo -= valor;
    }

    public double verfificarSaldo (){
        return this.saldo;
    }   
}
