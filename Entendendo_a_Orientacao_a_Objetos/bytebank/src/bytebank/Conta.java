package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String Titular;

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
}

