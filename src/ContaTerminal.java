import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta contaUsuario = new Conta();


        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        contaUsuario.setNumero(numeroAgencia);

        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.next();
        contaUsuario.setAgencia(agencia);

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        contaUsuario.setNomeCliente(nomeCliente);

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        contaUsuario.setSaldo(saldo);

        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

    }
}
