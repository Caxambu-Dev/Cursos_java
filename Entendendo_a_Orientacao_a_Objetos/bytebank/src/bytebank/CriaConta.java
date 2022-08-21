package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDoDaniel = new Conta(3412,11245587);
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");

		Conta contaDoPaulo = new Conta(3413,12245587);
		
		System.out.println(Conta.getTotal());
		
		
		
		
		

	}

}
