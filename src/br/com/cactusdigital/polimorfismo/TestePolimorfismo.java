package br.com.cactusdigital.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		System.out.println();
		// ************************************************

		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		TestePolimorfismo.imprimirSaldo(contaCorrente);
		System.out.println();
		// ************************************************

		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2500);
		TestePolimorfismo.imprimirSaldo(contaPoupanca);
	}

	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$ " + conta.getSaldo());

		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println(cc.getLimite());
		}

		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println(cp.getRendimentos());
		}
	}

}
