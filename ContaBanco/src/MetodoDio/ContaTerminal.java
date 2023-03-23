package MetodoDio;
import java.util.Locale;
import java.util.Scanner;

class ContaTerminal{
    public static void main(String[] args){
        //Todo: Conhecer e importar a class Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o usuário e obter pela scanner os valores digitados no terminal
        System.out.println("Olá, digite o número da conta, por favor:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println(("Olá " + nomeCliente).concat(", obrigada por criar uma conta em nosso banco, sua agência é ") + (agencia).concat(", conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque."); 

        scanner.close();
    }

}

