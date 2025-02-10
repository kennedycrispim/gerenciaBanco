package gerenciaBanco;
import java.util.Scanner;

public class main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int menu = 0;

    //Inicio do sistema
    System.out.println("Bem vindo ao Sistema Bancário");
    
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    
    System.out.print("Digite seu sobrenome: ");
    String sobrenome = scanner.nextLine();
    
    System.out.print("Digite seu CPF: ");
    String cpf = scanner.nextLine();
    
    Cliente cliente = new Cliente(nome, sobrenome, cpf); 
    
    System.out.println("");
    System.out.println("Bem vindo " + cliente.getNome() + "!\nO que deseja fazer?");

    while(menu != 5) {
    	System.out.println("1)Verificar Dados | 2)Consultar Saldo | 3)Depositar | 4)Sacar | 5)Sair do Sistema");
    	menu = scanner.nextInt();
    	
    	if(menu == 1) {
    	    System.out.println("Seguem dados cadastrados: ");
    	    cliente.consultarDados();
    	    System.out.println("");
    	    
    	}else if(menu == 2){
    	    double saldo = cliente.consultarSaldo();

    	    System.out.println("Saldo: ");
    	    System.out.println("R$" + saldo);
    	    System.out.println("\n");
    	}else if(menu == 3){
    		System.out.println("Quanto deseja depositar: ");
    		double valorDeposito =  scanner.nextDouble();
    		cliente.depositar(valorDeposito);
    	    System.out.println("Você depositou R$" + valorDeposito);
    	    System.out.println("\n");
    	}else if(menu == 4) {
    		System.out.println("Quanto deseja sacar: ");
    		double valorSaque = scanner.nextDouble();
    		cliente.sacar(valorSaque);
    	}else if(menu == 5) {
    	    System.out.println("Encerrou o programa! ");
    		break;
    	}
    }
  }
}



//Descubra como transformar os atributos da clase cliente para privado e em seguida crie metodos publicos do tipo get para que classes esternas tenham o acesso(pelo método e não pelo atributo direto como cliente.nome  A seguinte abordagem está errada)
