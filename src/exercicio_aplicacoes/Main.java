package exercicio_aplicacoes;
import exercicio02.ContaBancaria;
import exercicio03.Produto;
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
		
		
		
		//TESTE DA CLASSE PRODUTO
		Produto produto1 = new Produto("Betoneira", 235, 5);
		System.out.println("VERIFICANDO PRODUTO. . .");
		System.out.println("Verificando valor original");
		
		System.out.println(produto1.getValor());
		produto1.setValor(0);
		System.out.println(produto1.getValor());
		produto1.setValor(405);
		System.out.println(produto1.getValor());
		System.out.println("Verificando quantia original");
		System.out.println(produto1.getQuantia());
		produto1.setQuantia(0);
		System.out.println(produto1.getQuantia());
		
	}

}
