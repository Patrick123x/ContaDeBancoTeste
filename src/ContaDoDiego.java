
import java.util.Scanner;

public class ContaDoDiego {


    public static void main(String[] args) throws InterruptedException {
	  Scanner texto = new Scanner(System.in);
      long start = System.currentTimeMillis();
      System.out.println("Olá! Seja bem-vindo ao Banco do São João.\nPor favor, diga o seu nome: ");
      var nome= texto.nextLine();
	  System.out.println("Olá! " + nome);
      Thread.sleep(500);
	  System.out.println("Por favor, crie a sua nova senha: ");
      var senha= texto.nextLine();
      System.out.println("O sistema está salvando a senha, por favor, aguarde...");
      Thread.sleep(3000);
      while(true) {
    	  System.out.println("Agora, coloque o seu CPF :");
    	  var cpf= texto.nextLine();
    	  System.out.println("Coloque o seu cpf novamente :");
    	  

    }
    }
      
    }

    

