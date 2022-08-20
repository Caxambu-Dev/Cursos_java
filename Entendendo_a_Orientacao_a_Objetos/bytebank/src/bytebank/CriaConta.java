package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200;
		System.out.println(primeiraconta.saldo);

		primeiraconta.saldo += 100;
		System.out.println(primeiraconta.saldo);
		
		Conta segundaConta = primeiraconta;
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraconta);
		System.out.println("A segunda conta tem " + segundaConta);
		

	}

}
