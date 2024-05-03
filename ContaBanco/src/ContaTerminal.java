import java.util.Scanner;
public class ContaTerminal{
	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.next();
        
        System.out.print("Por favor, digite o número da Agência !: ");
        String agencia = scanner.next();
        
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.print("sua agência " + agencia + ", conta " + numero + " e seu saldo " + saldo+ " já está disponível para saque.");
    }
}

