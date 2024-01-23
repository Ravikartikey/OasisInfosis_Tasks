
import java.util.Scanner;

public class ATMInterface {
    public static int[] TransArrDeposit = new int[10];
    public static int TADCount = 0;
    public static int currentBalance = 1000;
    public static void TransactionHistory() {
        for (int i = 0; i <TADCount; i++) {
            System.out.println("Transaction: "+TransArrDeposit[i]);
            System.out.println("----------------------------");
        }
        System.out.println("Total Balance is: "+currentBalance);
        System.out.println();
    }

    public static void CheckBalance() {
        System.out.println("your Balance is " + currentBalance);
        System.out.println();
    }

    public static void DepositBalance() {
        System.out.println("Enter Amount You Want to Deposit....");
        Scanner sc = new Scanner(System.in);
        int depositAmount = sc.nextInt();
        currentBalance = currentBalance + depositAmount;
        System.out.println("Your Amount " + depositAmount + " is Successfully Deposit");
        System.out.println("Current Balance Is: "+currentBalance);
        System.out.println();
        TransArrDeposit[TADCount] = +depositAmount;
        TADCount++;
    }

    public static void WithdrawAmount() {
        System.out.println("Enter Amount you want to Without....");
        Scanner sc = new Scanner(System.in);
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount > currentBalance) {
            System.out.println("Insufficient Balance");
            System.out.println();
        } else {
            currentBalance = currentBalance - withdrawAmount;
            System.out.println("your Amount " + withdrawAmount + " is Successfully Withdraw");
            System.out.println("Current Balance Is: "+currentBalance);
            System.out.println();
            TransArrDeposit[TADCount] = -withdrawAmount;
            TADCount++;
        }
    }

    public static void TransferAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int AcNumber = sc.nextInt();
        System.out.println("Enter Amount You Want To Transfer");
        int amount = sc.nextInt();
        if (amount > currentBalance) {
            System.out.println("Insufficient Fund!!!!");
            System.out.println();
        } else {
            currentBalance = currentBalance - amount;
            TransArrDeposit[TADCount] = -amount;
            TADCount++;
            System.out.println("Your Amount "+amount+" Is Successfully Transferred To "+AcNumber+" Acc Number .");
            System.out.println("Current Balance Is: "+currentBalance);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int PINCode = 1234;
        System.out.println("Welcome to SBI ATM");
        System.out.println("Enter 4 Digit PIN Code: ");
        Scanner sc = new Scanner(System.in);
        int TypePin = sc.nextInt();
        while(true) {
            if(TypePin == PINCode) {
                System.out.println("Welcome Mr. Ravi Kartikey");
                System.out.println("1:Transaction History");
                System.out.println("2:Check Balance");
                System.out.println("3:Deposit Amount");
                System.out.println("4:Withdraw Amount");
                System.out.println("5:Transfer Amount");
                System.out.println("6:Exit Program");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        TransactionHistory();
                        break;
                    case 2:
                        CheckBalance();
                        break;
                    case 3:
                        DepositBalance();
                        break;
                    case 4:
                        WithdrawAmount();
                        break;
                    case 5:
                        TransferAmount();
                        break;
                    case 6:
                        System.out.println("Thanks For Coming");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input");
                }
            }
            else{
                System.out.println("Wrong Password");
                System.out.println("Thanks For Coming");
                        System.exit(0);
                 }
        }
    }
}