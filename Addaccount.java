package taskk;

import java.util.Scanner;

public class Addaccount extends Addmoney {

    Scanner input = new Scanner(System.in);

    String name;
    int num;
    double amount;
    int option;

    public Addaccount(){
        
        
    }

    

    public void print() {
        
        
        System.out.println("\t\t\t\t\t\t\t\t\tWelcome to Bank system");
        
        
        System.out.print("Enter Your name: ");
        String user_name = input.nextLine();
        System.out.print("Enter your phone number: ");
        int user_num = input.nextInt();
        System.out.print("Enter Amount of money: ");
        double amount = input.nextDouble();
        
        System.out.println("\n\n1- Print your name on your account."
                + "\n2- print amount of money that is on your account."
                + "\n3- Print all information on your account"
                + "\n4- Add money to your Account."
                + "\n5- Withdraw money from your Account.");

        System.out.print("\nChoose an option: ");
        int option = input.nextInt();
        while (option > 5 || option < 1) {
            System.out.print("\nChoose an option:\n");
            System.out.println("1- Print your name on your account."
                    + "\n2- print amount of money that is on your account."
                    + "\n3- Print all information on your account"
                    + "\n4- Add money to your Account."
                    + "\n5- Withdraw money from your Account.");

            option = input.nextInt();
        }
        Account acc = new Account();
        acc.setrename(user_name);
        acc.setrenum(user_num);
        acc.setreamount(amount);
        acc.setoption(option);
        

        //////////////////////

   
        int theoption=acc.getoption();
        String thename=acc.getrename();
        double theamount=acc.getreamount();
        int thenumber=acc.getrenum();
        
        
        
        if (theoption== 1) {
            System.out.println("Your name is: " + thename);
        } else if (theoption == 2) {
            System.out.println("The account amount: " + theamount+" $");

        } else if (theoption == 3) {
            System.out.println("Your name is: " + thename);
            System.out.println("Your number is: 0" + thenumber);
            System.out.println("The account amount: " + theamount+" $");
        } else if (theoption == 4) {
            System.out.print("Enter amount of money you want to add: ");
            double addition = input.nextDouble();
                    
            System.out.println("Amount previous addition: " + theamount+" $");
            System.out.println("Amount added to your account: "+ addition+" $");
            System.out.println("Amount after addition: " + getmoney(theamount, addition)+" $");
        }
        
        else if(theoption == 5){
            System.out.print("Enter amount of money you want to withdraw: ");
            double withdraw = input.nextDouble();

            System.out.println("Amount previous withdraw: " + theamount+" $");
            System.out.println("Amount withdrawed to your account: "+ withdraw+" $");
            System.out.println("Amount after withdraw: " + getwithdrawmoney(theamount, withdraw)+" $");
            
            
        }
        Addaccount Bye = new end();
        Bye.print();
    }
}
