import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    Scanner digitar = new Scanner(System.in).useLocale(Locale.US); 
    Random random = new Random();
        
    int conta = random.nextInt(1000, 2000);


    System.out.println("Por Favor, digite o numero da Agencia !");
     int Ag = digitar.nextInt();
     digitar.nextLine();
     
    
    System.out.println("Por Favor, Digite seu nome completo! ");
      String nome = digitar.next();
      digitar.nextLine();
      

    System.out.println("Por Favor, Digite o valor do seu primeiro deposito !");
      double saldo =  digitar.nextDouble();
    
       System.out.println("Seu Saldo Atual é :" + saldo );
       
    int numero;
    System.out.println("Óla " + nome + ", obrigado por criar conta em nosso banco,\nSua agencia é " + Ag + "\nE sua conta é " +conta+ "\nSeu saldo Atual é " + saldo + " é esta disponivel para saque! ");
}
}
