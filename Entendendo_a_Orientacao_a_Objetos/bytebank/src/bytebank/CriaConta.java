package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDoDaniel = new Conta();
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");
		
		contaDoDaniel.setTitular(daniel);
		System.out.println(contaDoDaniel.getTitular());
		
		
		
		
		

	}

}
