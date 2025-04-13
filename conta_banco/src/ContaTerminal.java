import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
       // Criação do objeto Scanner para receber entrada do usuário.
       @SuppressWarnings("resource")
       Scanner scanner = new Scanner(System.in);

       // Solicita e armazena o número da conta.
       System.out.println("Por favor, digite o número da conta: ");
       int numero = scanner.nextInt();

       // Limpa o buffer do scanner.
        scanner.nextLine();

       // Solicita e armazena a agência.
       System.out.println("Por favor, digite o número da Agência:");
         String agencia = scanner.nextLine();

       // Solicita e armazena o nome do cliente.
       System.out.println("Por favor, digite o seu nome completo:");
       String nomeCliente = scanner.nextLine();
       
       // Solicita e armazena o saldo.
       System.out.println("Por favor, digite o saldo da conta:");
       double saldo = scanner.nextDouble();

       // Exibe mensagem final com os dados devidamente inseridos.
       /* 
       System.out.println("\nOlá" + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + 
       agencia + ", conta " + numero + "e seu saldo R$" + String.format("%¨.2f", saldo) + "Já está disponível para saque.");
        */
       // Exibe mensagem final conforme enunciado
        System.out.println("\nDepois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + ", conta " + numero + " e seu saldo " + String.format("R$ %.2f", saldo) 
                        + " já está disponível para saque.");

       scanner.close(); // Fecha o scanner para evitar vazamento de recursos.
    }
}
