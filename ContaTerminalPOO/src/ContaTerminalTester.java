import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Olá, Bem Vindo(a)!");

        System.out.println("Digite o número da conta, por favor:");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite a agência, por favor:");
        conta.setAgencia(scanner.next());

        System.out.println("Digite o nome do cliente, por favor:");
        conta.setNomeCliente(scanner.next());

        System.out.println("Por fim, digite o saldo:");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá, ".concat(conta.getNomeCliente()).concat(" obrigada por criar uma conta em nosso banco, sua agência é ").concat(conta.getAgencia()).concat(", conta ") + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque." );

        scanner.close();
    }
    
}
