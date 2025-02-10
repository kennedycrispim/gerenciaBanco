package gerenciaBanco;
import java.util.Scanner;

public class main {
  public static void main(String args[]) {
	int menu = 0;
	boolean verificador = false;
	
	Scanner scanner = new Scanner(System.in);

    //Inicio do sistema
    System.out.println("Bem-vindo ao Sistema Bancário");
    
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    
    System.out.print("Digite seu sobrenome: ");
    String sobrenome = scanner.nextLine();
    
    System.out.print("Digite seu CPF sem caracteres espeiais. Ex.: 12345678912\n");
    	String cpf = scanner.nextLine();
    	
    //Validação do CPF com 11digitos
	if(cpf.length() < 11 || cpf.length() > 11) {
    	System.out.print("CPF inválido!\nDigite um CPF com exatos 11 digitos");
    	while(verificador == false) 
        {
	    	if(cpf.length() < 11 || cpf.length() > 11) {
	        	System.out.print("CPF inválido!\nDigite um CPF com exatos 11 digitos");
	            System.out.print("Digite seu CPF sem caracteres espeiais. Ex.: 12345678912\n");
	        	cpf = scanner.nextLine();
	        	
	    	}else {
	    		verificador = true;
	    	}
        }
	}
    //Instância da classe Cliente. Criação do objeto
    Cliente cliente = new Cliente(nome, sobrenome, cpf); 
    
    System.out.println("");
    System.out.println("Bem-vindo " + cliente.getNome() + "!\nO que deseja fazer?");

    //Menu de opções
    while(menu != 5) {
    	System.out.println("1)Verificar Dados | 2)Consultar Saldo | 3)Depositar | 4)Sacar | 5)Sair do Sistema");
    	menu = scanner.nextInt();
    	
    	if(menu == 1) {
    		//Consulta de dados do cliente
    	    System.out.println("\nSeguem dados cadastrados: ");
        	System.out.println("Nome: " + cliente.getNome());
        	System.out.println("sobrenome: " + cliente.getSobrenome());
        	System.out.println("cpf: " + cliente.getCpf());
    	    System.out.println("");
    	}else if(menu == 2){
    		//Verificação do saldo
    	    System.out.println("\nSaldo: ");
    	    System.out.println("R$" + cliente.consultarSaldo());
    	    System.out.println("\n");
    	}else if(menu == 3){
    		//Realizar deposito
    		System.out.println("\nQuanto deseja depositar: ");
    		double valorDeposito =  scanner.nextDouble();
    		cliente.depositar(valorDeposito);
    	    System.out.println("Você depositou R$" + valorDeposito);
    	    System.out.println("\n");
    	}else if(menu == 4) {
    		//Realizar Saque
    		System.out.println("\nQuanto deseja sacar: ");
    		double valorSaque = scanner.nextDouble();
    		cliente.sacar(valorSaque);
    	}else if(menu == 5) {
    		//Finaliza o programa
    	    System.out.println("\nFim do programa! ");
    		break;
    	}
    }
  }
}
