/*O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota. 
 * Ele descobriu no site da receita:

De 1900.0 até 2800.0, o IR é de 7.5%
De 2800.01 até 3751.0, o IR é de 15% 
De 3751.01 até 4664.00, o IR é de 22.5% */

public class TesteIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 4000;
		double descontoIR = 0;

		if (salario < 1900) {
			System.out.println("Não há IR a ser aplicado para o seu salário");
		} else if (salario < 2800) {
			descontoIR = (7.5 * salario) / 100;
			System.out.println("O IR cobrado sera de " + descontoIR + " R$");
		} else if (salario < 3751) {
			descontoIR = (15 * salario) / 100;
			System.out.println("O IR cobrado sera de " + descontoIR + " R$");
		} else if (salario < 4664) {
			descontoIR = (22.5 * salario) / 100;
			System.out.println("O IR cobrado sera de " + descontoIR + " R$");
		}

	}

}
