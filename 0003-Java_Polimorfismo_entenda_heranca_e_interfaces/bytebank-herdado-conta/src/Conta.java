

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente Titular;	
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100; //a menos que seja modificado, toda conta será iniciada com um saldo de R$100,00
		System.out.println("Conta " + numero + " criada com sucesso");
		total ++;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta origem, Conta destino) {
		if (this.saldo >= valor) {
			origem.saca(valor);
			destino.deposita(valor);
			return true;			
		}else {
			return false;
		}
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return Titular;
	}

	public void setTitular(Cliente titular) {
		Titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}

