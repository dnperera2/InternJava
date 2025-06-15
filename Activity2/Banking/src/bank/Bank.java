package bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bank {

    private ArrayList<Customer> customerList;
    private ArrayList<BankAccount> bankAccountList;

    public Bank() {
        this.customerList = new ArrayList<>();
        this.bankAccountList = new ArrayList<>();
    }

    public void addAccount(BankAccount acc){
        bankAccountList.add(acc);
    }

    public void removeAccount(BankAccount acc) {
        bankAccountList.remove(acc);
    }

    public void addCustomers(Customer cus)
    {
        customerList.add(cus);
    }

    public void removeCustomers(Customer cus){
        customerList.remove(cus);
    }

    public void displayCustomerInfo(Customer cus){
        for(Customer c : customerList){
            if(c.equals(cus)){
                System.out.println(c);
            }
        }
    }



    // Validators
    public static boolean isValidName(String name){
        return Pattern.matches("^[a-zA-Z ]{3,60}$",name);
    }

    public static boolean isValidMail(String mail){
        return Pattern.matches("^[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",mail);
    }

    public static boolean isValidAmount(double amount){
        return(amount>0);
    }

    public static boolean isValidPhone(String phone){
        return Pattern.matches("^\\+?[0-9]{7,15}$", phone);
    }


    public static boolean isvalidAcc(String accType){
        String[] arr = {"saving", "fixed", "Loan"};
        String acc = accType.toLowerCase();

        for(String s : arr){
            if (s.equals(acc)){
                return true;
            }
        }
        return false;
    }



    public void displayAccountInfo(BankAccount acc){
        System.out.println("Account Info");
        for(BankAccount b : bankAccountList){
            if(b.equals(acc)){
                System.out.println(b);
            }
        }

    }

    public void displayAllAccountInfo(){
        System.out.println("Account Info");
        for(BankAccount b : bankAccountList){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        System.out.println("BOC Banking System !");
        System.out.println("========================================\n");

        Bank boc = new Bank();

        Scanner sc = new Scanner(System.in);


        try {
            String cusName;
            String cusMail;
            double accBal;
            String AccType;
            String accNo;
            String cusPhone;
            String cusID;


            //Name ===============================================
            while (true) {
                System.out.println("\nEnter your Name: ");
                cusName = sc.nextLine();
                if (isValidName(cusName)) {
                    break;
                }
                System.out.println("Try Again");
            }


            while (true) {
                System.out.println("\nEnter your ID:");
                cusID = sc.nextLine();

                if (Pattern.matches("^[0-9]{12}$", cusID)) {  // accept 12 digit
                    break;
                }
                System.out.println("Try with Correct ID (12 digits)");
            }


            //Mail ===============================================
            while (true) {
                System.out.println("\nEnter your Email:");
                cusMail = sc.nextLine();
                if (isValidMail(cusMail)) {
                    break;
                }
                System.out.println("Try Again");
            }

            //phone ===============================================
            while (true) {
                System.out.println("\nEnter your Phone No:");
                cusPhone = sc.nextLine();

                if (isValidPhone(cusPhone)) {
                    break;
                }
                System.out.println("Try with correct number format (07########)");
            }

            //Account No===============================================
            while (true) {
                System.out.println("\nEnter your Account No:");
                accNo = sc.nextLine();

                if (Pattern.matches("^[0-9]{6,15}$", accNo)) {  // accept 6-15 digit account numbers
                    break;
                }
                System.out.println("Try with Correct Account Number (6-15 digits)");
            }

            //Acc Type ===============================================
            while (true) {
                System.out.println("\nEnter your Account Type: ");
                AccType = sc.nextLine();
                if (isvalidAcc(AccType)) {
                    break;
                }
                System.out.println("Try Again Corrected Account Type");
            }


            //Balance ===============================================
            while (true) {
                try {
                    System.out.println("\nEnter your Account Balance: ");
                    String balInput = sc.nextLine();
                    accBal = Double.parseDouble(balInput);

                    if (isValidAmount(accBal)) {
                        break;
                    }
                    System.out.println("Enter a proper value (> 0)");

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format. Try again.");
                }

            }


            Customer c1 = new Customer(cusID, cusName, cusMail, cusPhone);
            BankAccount b1 = new BankAccount(accNo, cusName, accBal, AccType);

            boc.addAccount(b1);
            boc.addCustomers(c1);

            boc.displayAllAccountInfo();


            b1.bankDeposit(2300);
            b1.bankWithdraw(200);
            b1.displayTransaction();




        }catch (Exception e){
            System.out.println(e);
        }






    }


}
