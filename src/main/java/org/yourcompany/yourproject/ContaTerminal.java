package org.yourcompany.yourproject;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o numero da sua conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada por nextInt()

        System.out.print("Informe o numero da agência: ");
        agencia = scanner.next();
        scanner.nextLine(); // Consumir a nova linha deixada por next()

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = scanner.nextLine(); // Ler o nome completo

        System.out.print("Informe o deposito inicial do cliente: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
