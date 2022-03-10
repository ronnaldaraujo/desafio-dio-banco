public class Main {

	public static void main(String[] args) {
		Cliente ronnald = new Cliente();
		ronnald.setNome("Ronnald");
		
		Conta cc = new ContaCorrente(ronnald);
		Conta poupanca = new ContaPoupanca(ronnald);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
