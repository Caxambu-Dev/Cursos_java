package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDoDaniel = new Conta(3412, 11245587);
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");

		Conta contaDoPaulo = new Conta(3413, 12245587);

		System.out.println("Saldo de inicial Daniel - R$" + contaDoDaniel.getSaldo());
		System.out.println("Saldo de inicial Paulo - R$" + contaDoPaulo.getSaldo());
		contaDoDaniel.deposita(100);
		System.out.println("Saldo de Daniel após deposito de R$ 100,00 - R$" + contaDoDaniel.getSaldo());
		contaDoDaniel.saca(50);
		System.out.println("Saldo de Daniel após saque de R$ 50,00 - R$" + contaDoDaniel.getSaldo());
		contaDoDaniel.transfere(50, contaDoDaniel, contaDoPaulo);
		System.out.println("Saldo de Daniel após realizar tranferencia de R$ 50,00 - R$" + contaDoDaniel.getSaldo());
		System.out.println("Saldo de Paulo após receber tranferencia de R$ 50,00 - R$" + contaDoPaulo.getSaldo());

	}

}
