import java.util.Scanner;

public class Codingal_Banking_Services {

    public static void main(String[] args) {
        boolean infinteloop = true;
        double[] accountbalance = new double[1000]; //this array will contain the holders name
        String[] accountName = new String[1000]; //array to store account holder names
        int option, size = 100; //size will be the first account you want to begin from
        //infinte loop to keep our program to keep our program running until the user wants to exit
        while(infinteloop) {
            System.out.println("Welcome to Codingal Banking Services");
            System.out.println("Banking Menu:  ");
            System.out.println("Select any of the option from below: ");
            System.out.println("1 -> Create Account");
            System.out.println("2 -> Change Customer Name");
            System.out.println("3 -> Check Account Balance");
            System.out.println("4 -> Update Account Balance");
            System.out.println("5 -> Summary of All Acounts");
            System.out.println("6 -> Exit");

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter your option to proceed: ");

                option = sc.nextInt();
                //instead of if we can even use switch case here
                if (option == 1) {
                    System.out.println("\nAdd Customer \nMenu --->");

                    sc.nextLine();

                    System.out.println("\nEnter Customer Name: ");
                    String name = sc.nextLine();
                    accountName[size] = name;
                    System.out.println("Enter Opening Balance Amount: ");
                    double amt = sc.nextDouble();
                    accountbalance[size] = amt;

                    System.out.println("Account Created Successfully! \n");
                    System.out.println("Account Details:- \n");
                    System.out.println("Account Number: " + size);
                    System.out.println("Account Name:" + accountName[size]);
                    System.out.println("Account Balance: Rs. " + accountbalance[size]);
                    System.out.println("====================================");

                    size = size + 1;

                } else if (option == 2) {
                    
                    System.out.println("\nCharge Customer Name Menu");
                    System.out.println("\nEnter your Account Number: ");

                    //this is infact the logic of swapping
                    int accountIndex;
                    String temp;

                    accountIndex = sc.nextInt();
                    sc.nextLine();

                    if (accountIndex > size) {
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating the program...");
                    } else {
                        temp = accountName[accountIndex];
                        System.out.println("Enter the new name: ");
                        String name = sc.nextLine();
                        accountName[accountIndex] = name;
                        System.out.println("Name is successfully updates from " + temp + "to " + name + ". \n");

                    }
                System.out.println("====================================");
                } else if (option == 3) {
                    System.out.println("\nCHeck Account Balance Menu");
                    System.out.println("Enter your Account Number: ");

                    int accountIndex;
                    accountIndex = sc.nextInt();

                    if (accountIndex > size) {
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating the program...");
                    } else {
                        System.out.println(accountName[accountIndex] + "Your balance is " + accountbalance[accountIndex] + "Rs.");
                    }
                System.out.println("====================================");
                } else if (option == 4) {

                    System.out.println("\nUpdate Account Balance Menu");
                    System.out.println("\nEnter your Account Number: ");

                    int accountIndex;
                    accountIndex = sc.nextInt();

                    if (accountIndex > size) {
                        System.out.println("Account does not exist.");
                        System.out.println("Terminating the program...");
                    } else {
                        System.out.println("Enter the amount to be deposited: ");
                        double amt = sc.nextDouble();

                        accountbalance[accountIndex] += amt;
                        System.out.println(accountName[accountIndex] + "Your updated balance is : " + accountbalance[accountIndex] + " Rs. \n");
                    }
                System.out.println("====================================");
                } else if (option == 5) {
                    System.out.println("Accounts Registered \n");

                    for (int i = 100; i < size; i++) {
                        System.out.println("Account Number: " + i + ", Name: " + accountName[i] + ", Balance: " + accountbalance[i] + "Rs. \n");
                    }
                    System.out.println("====================================");
                } else if (option == 6) {

                    System.out.println("Terminating");
                    System.out.println("Developed & Managed by Muhammad");
                    System.out.println("Built with care in Pakistan");
                    infinteloop = false; //instead of this "System.exit(0);" Can also be used
                    // "
                } else {

                    System.out.println("\n Invalid input.");
                    System.out.println("Terminating...");
                    System.out.println("Developed & Managed by Muhammad");
                    System.out.println("Built with care in Pakistan");
                    System.exit(0);
                }
            }
        }
    }
}
