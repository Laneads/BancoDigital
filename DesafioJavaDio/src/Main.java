package src;

public class Main {

        public static void main(String[] args) {
            Cliente P = new Cliente();
            P.setNome("Liz");

            Conta cc = new ContaCorrente(P);
            Conta poupa = new ContaPoupanca(P);

            cc.depositar(100);   
            cc.transferir(100, poupa);
            cc.depositar(250);

            cc.imprimirExtrato();
            poupa.imprimirExtrato();

        }
    
}
