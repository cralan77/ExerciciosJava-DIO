package main;

public class AccountTerminal {
    private int number;
    private String branch;
    private String nameClient;
    private double balance;

    public AccountTerminal(int number, String branch, String nameClient, double balance) {
        this.number = number;
        this.branch = branch;
        this.nameClient = nameClient;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Olá "+ nameClient + " obrigado por criar uma conta em nosso banco, sua agência é "+branch+
                ", conta "+number+" e o seu saldo "+balance+" já está disponível para saque.";
    }
}
