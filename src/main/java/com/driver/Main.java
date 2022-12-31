package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // CurrentAccount obj = new CurrentAccount("Erwin", 6000, "YyX");
            // System.out.println(obj.getTradeLicenseId());
            // obj.withdraw(500);
            // obj.deposit(200);
            // System.out.println(obj.getBalance());

            BankAccount bo = new BankAccount("Rommel0", 500, 100);

            bo.generateAccountNumber(123, 2);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}