package main;

import java.util.Scanner;

public class AccountBank {
    public static void main(String[] args){

        int number;
        String branch, nameClient;
        double balance;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        number = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o numero da agencia: ");
        branch = sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nameClient = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        balance = sc.nextDouble();

        AccountTerminal account = new AccountTerminal(number, branch, nameClient, balance);

        System.out.println(account);


    }
}
