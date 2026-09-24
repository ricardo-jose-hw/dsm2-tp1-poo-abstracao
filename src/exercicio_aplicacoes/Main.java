package exercicio_aplicacoes;
import exercicio02.ContaBancaria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaBancaria cartao1 = new ContaBancaria("Joãozinho");
		System.out.println("Olá "+ cartao1.getTitular());

		System.out.println("Digite o seu saldo:");
		double depositar = scan.nextDouble();
		System.out.println("Agora o valor que quer sacar:");
		double valorSacar = scan.nextDouble();

		cartao1.DepositareSacar(depositar, valorSacar);

		System.out.println("Saldo atualizado no sistema: R$ " + cartao1.getSaldo());

		scan.close();
		
	}

}
