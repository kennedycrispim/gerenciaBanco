package gerenciaBanco;

//Classe Cliente
public class Cliente{
	//Atributos da classe Cliente
	private String nome;
	private String sobrenome;
	private String cpf;
    private double saldo = 0;
    
    //Método construtor
    public Cliente(String nome, String sobrenome, String cpf){
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.cpf = cpf;
    }
    
    //Métodos da classe Cliente
    //getNome - Retorna o nome do cliente cadastrado.
    public String getNome(){
    	return nome;
    }
    
    //getSobrenome - Retorna o sobrenome do cliente.
    public String getSobrenome(){
    	return sobrenome;
    }

    //getCpf - Retorna o cpf do cliente cadastrado
    public String getCpf(){
    	return cpf;
    }
    
    //consultarSaldo - Retorna o saldo disponível em conta.
    public double consultarSaldo() {
    	return saldo;
    }
    
    //depositar - Realiza um deposito na conta do cliente com base no valor
    //            informado no argumento 'valorDeposito'
    public void depositar(double valorDeposito){
    	saldo = saldo + valorDeposito;
    }
    
    //sacar - Realiza um saque com base no valor disponível
    public void sacar(double valorSaque){
    	//Verificação para caso o valor de saque seja maior que o disponível na conta
    	if(valorSaque > saldo){
    		System.out.println("Valor excedente!\nVocê possui R$"+ saldo + " disponível!");
    		System.out.println("");
    	}else if(valorSaque <= 0){
    		System.out.println("Digite um valor maior que 0!");
    		System.out.println("");
    	}else{
    		saldo = saldo - valorSaque;
    		System.out.println("Saque realizado com sucesso!");
    		System.out.println("valor de saque: R$" + valorSaque);
    		System.out.println("");
    	}
    }
}
