import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso úsuario

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem final("Conta criada")

        int num;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scn = new Scanner(System.in);
        System.out.println("Todas vez que o senhor(a) tiver certeza de que deseja prosseguir aperte 'Enter'.");
        System.out.println("Digite o seu nome:\n");
        nomeCliente = scn.next();
        System.out.println("Por favor digite o numero da agência:\n");
        agencia = scn.next();
        System.out.println("Agora digite seu numero da conta: ");
        num = scn.nextInt();
        System.out.println("Agora digite o seu saldo: ");
        saldo = scn.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}
