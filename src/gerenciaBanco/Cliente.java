package gerenciaBanco;

public class Cliente{
	//Corpo da classe
	private String nome;
	private String sobrenome;
	private String cpf;
    private double saldo = 0;
    
    public Cliente(String nome, String sobrenome, String cpf){
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.cpf = cpf;
    }
    
    public void consultarDados(){
    	System.out.println("Nome: " + nome);
    	System.out.println("sobrenome: " + sobrenome);
    	System.out.println("cpf: " + cpf);
    }
    
    public String getNome(){
    	return nome;
    }
    
    public double consultarSaldo() {
    	return saldo;
    }
    
    public void depositar(double valorDeposito){
    	saldo = valorDeposito;
    }
    
    public void sacar(double valorSaque){
    	if(valorSaque > saldo){
    		System.out.println("Valor excedente!\nVocê possui R$"+ saldo + " disponível!");
    	}else {
    		saldo = saldo - valorSaque;
    		System.out.println("Saque realizado com sucesso!");
    		System.out.println("valor de saque: R$" + valorSaque);
    	}
    }
}
	    