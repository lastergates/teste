
public class testeconta {
    public static void main(String[] args) {
        projetobanco contaCorrente = new projetobanco();
        projetobanco contaPoupanca = new projetobanco();
        projetobanco contaInvestimento = new projetobanco();
        
        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.50;
        contaCorrente.cliente.nome = "Leandro";
        contaCorrente.cliente.idade = 36;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "Fulano";
        contaPoupanca.cliente.idade = 40;

        contaInvestimento.numero =33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 40;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}