package com.company;
import java.util.Scanner;


interface MenuOperation {
    static int menu() {
        return 0;
    }
}
interface WithdrawDebite {
    static long withdraw(long amount) {
        return 0;
    }
    static long credidcard(long amount) {
        return 0;
    }
}
interface Apply {
    static long AppDebitdcard(int Amount) {
        return 0;
    }
    static long AppCraditcard(int Amount) {
        return 0;
    }
}
class MainMenu implements MenuOperation {
    public static Scanner scanner = new Scanner(System.in);
    static int menu() {
        System.out.println("Please provide what you what from below menu\n0. Check Account Balance\n1. withdraw\n2. deposit\n3. Apply for debit Cart\n4. Apply for credit card\n5. quit");
        return scanner.nextInt();
    }
}
class Operation implements WithdrawDebite {
    static long WithDraw(long WithdrawAmount, long Amount) {
        long valid = Amount - WithdrawAmount;
        if (valid < 0) {
            System.out.println("Sorry, Entered Amount is More then amount in Bank So please Retry");
            return Amount;
        } else {
            System.out.println("Amount is successfully Withdraw.");
            return valid;
        }
    }

    static long Deposit(long DebitedAmount, long Amount) {
        System.out.println("Amount is Successfully Deposited.");
        return Amount + DebitedAmount;
    }
}
class Application implements Apply {
    static void AppDebitdcard(long Amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide Information:\nregistered Name: ");
        String name = scanner.nextLine();
        System.out.println("Account Number: ");
        String AccountNumber = scanner.next();
        System.out.println("Thank You for applying Debit Card\nPlease visit your near HDFC bank to take you card in this week\n You will get notification to take card from the bank\nNever share your PIN and OTP to anyone");
    }

    static void AppCraditcard(Long Amount) {
        Scanner scanner = new Scanner(System.in);
        if (Amount >= 4500) {
            System.out.println("Provide Information:\nRegistered Name: ");
            String name = scanner.nextLine();
            System.out.println("Account Number: ");
            String AccountNumber = scanner.next();
            System.out.println("Thank You for applying Credit Card\nPlease visit your near HDFC bank to take you card in this week\n You will get notification to take card from the bank\nNever share your PIN and OTP to anyone");
        } else {
            System.out.println("Sorry, We can not provide you Credit Card Account Balance is below 4,500 rs");
        }
    }
}