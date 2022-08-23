
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Doidera");
		g1.setCpf("109.876.543-21");
		g1.setSalario(20000);
		
		System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());

	}

}
