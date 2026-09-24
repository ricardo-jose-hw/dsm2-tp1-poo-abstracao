package exercicio01;

public class Carro {
	public Carro(String mc,String md, String plc) {

		this.marca = mc;

		this.modelo = md;

		this.placa = plc;

		this.ligar = false;
		
		this.capacidadeTanque = 0;

	}
	
	private String marca;
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
	    this.marca = marca;
	}
	
	private String modelo;
	public String getModelo() {
		return this.modelo;
	}

	private boolean ligar;

	private String placa;

	public String getPlaca() {
		return this.placa;
	}
	
	private double capacidadeTanque;

	public double getTanque() {
		return this.capacidadeTanque;
	}
	
	public void acelerar(int velocidade) {
		System.out.println("ACELEROU " + velocidade);

	}

	
	public double abastecer(double combustivel) {
		if(combustivel > 0) {
		this.capacidadeTanque += combustivel;
		return capacidadeTanque;
		}
		else {
			System.out.println("Não é possível abastecer.");
			return 0.0;
		}
	}

	

	public void ligar() {

	if(ligar == false) {

		System.out.println("TENTANDO LIGAR: LIGANDO CARRO");

		ligar = true;

	}

	else {

		System.out.println("TENTANDO LIGAR: NÃO É POSSIVEL. DESLIGUE PRIMEIRO");

	}

	}

	public void desligar() {

		if(ligar == true) {

			System.out.println("TENTANDO DESLIGAR: DESLIGANDO..");

			ligar = false;

		}

		else {

			System.out.println("TENTANDO DESLIGAR: LIGUE PRIMEIRO PARA DESLIGAR");

		}
		

	}

	public void buzinar() {

		System.out.println("BEEEEEEEEEEEEEEEEEEEEEEEE");

	}
}


