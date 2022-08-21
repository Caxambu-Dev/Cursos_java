package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 200;
		//System.out.println(primeiraconta.saldo);

		primeiraconta.saldo += 100;
		//System.out.println(primeiraconta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraconta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		primeiraconta.saca(100);
		System.out.println("saldo após saque (primeira conta) " + primeiraconta.saldo);
		
		primeiraconta.transfere(100, segundaConta);
		System.out.println("Após as operações, a primeira conta tem " + primeiraconta.saldo);
		System.out.println("Após as operações, a segunda conta tem " + segundaConta.saldo);
		

	}

}
