package bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Name: ");
        String cusName = sc.nextLine();
        System.out.println("Enter your ID:");
        String cusID = sc.nextLine();
        System.out.println("Enter your Email:");
        String cusMail = sc.nextLine();
        System.out.println("Enter your Phone No:");


    }





}
