import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite a sua Agência: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo para saque: ");
        double saldo = scanner.nextDouble();

        // utilizando string com concatenação normal
        //System.out.println("Olá "S+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroAgencia + "e seu saldo "+ saldo +" já está disponível para saque.");

        //usando string com um método de saida formatado
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroAgencia, saldo);


    }
}