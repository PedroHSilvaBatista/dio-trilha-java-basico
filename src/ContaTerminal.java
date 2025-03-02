import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta contaUsuario = new Conta();


        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        contaUsuario.setNumero(numeroAgencia);
        scanner.nextLine();

        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();
        contaUsuario.setAgencia(agencia);

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        contaUsuario.setNomeCliente(nomeCliente);

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        contaUsuario.setSaldo(saldo);

        System.out.println("Olá " + contaUsuario.getNomeCliente() + ", obrigado por criar uma conta em " +
                "nosso banco" + ", sua agência é " + contaUsuario.getAgencia() + ", " +
                "conta " + contaUsuario.getNumero() + " e seu saldo de R$ " + contaUsuario.getSaldo() +
                " já está disponível para saque");

    }
}
