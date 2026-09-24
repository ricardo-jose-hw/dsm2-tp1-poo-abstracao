package exercicio03;

public class Produto {
	public Produto(String nome, int valor, int quantia) {
		this.nomeProduto = nome;
		this.valorProduto = valor;
		this.quantiaEstoque = quantia;
	}
	private String nomeProduto;
	private int valorProduto;
	private int quantiaEstoque;
	
	//getters
	public String getNome() {
		return this.nomeProduto;
	}
	public int getValor() {
		return this.valorProduto;
	}
	public int getQuantia() {
		return this.quantiaEstoque;
	}
	//setters
	public void setNome(String nome) {
		this.nomeProduto = nome;
	}
	public void setValor(int valor) {
		if(valor > 0) {
		this.valorProduto = valor;
		}
		else {
			System.out.println("Insira um valor positivo.");
		}
		}
	public void setQuantia(int quantia) {
		if(quantia >= 0) {
		this.quantiaEstoque = quantia;
		}
		else {
			System.out.println("Não altere de forma negativa, apenas adicione ao estoque.");
		}
	}
}