
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario daniel = new Funcionario();
		daniel.setNome("Daniel Carvalho de Souza");
		daniel.setCpf("122.456.789-10");
		daniel.setSalario(10000.0);

		System.out.println(daniel.getNome());
		System.out.println(daniel.getBonificacao());

	}

}
