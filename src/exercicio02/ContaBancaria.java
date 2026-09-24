package exercicio02;

public class ContaBancaria {
    private double saldo = 0;
    private String titular;
    
public void DepositareSacar(double depositar,double valorSacar){
    if(depositar > 0){
        this.saldo += depositar;
    }
    else if(depositar < 0){
        System.out.println("Só é possível depositar valores positivos.");
    }
    if(valorSacar > 0 && valorSacar <= this.saldo){
            this.saldo -= valorSacar;
    }
    else if (valorSacar > this.saldo){
        System.out.println("Só é possível saques até no máximo o valor do seu saldo.");
    }
}
}
