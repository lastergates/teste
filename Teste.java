public class Teste {
    public static void main(String[] args) {
        //Este é a classe principal de Conta.java

        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 123;
        cc.numero =321; 
        
        cc.depositar(1000);

        System.out.println(cc.verfificarSaldo ());

        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);

        System.out.println(poupanca.verfificarSaldo());

    }
}
