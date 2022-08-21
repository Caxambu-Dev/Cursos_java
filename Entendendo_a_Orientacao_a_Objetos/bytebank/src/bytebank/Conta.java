package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente Titular;

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
	

}

