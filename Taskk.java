package taskk;

import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Taskk {

    public static void main(String[] args) {
        
        Account doacc = new Account();
        Addaccount a = new Addaccount();
        a.print();
        
         Account ac1 = new Account(doacc.getreamount());
                  List<Account> Accounts = new ArrayList<Account>();
           Accounts.add(ac1);
         Bank bank = new Bank(Accounts);
         
         List<Account> accs = bank.getlistofaccounts();
         
         for (Account account : accs) {
 
            // Print and display the title and author of
            // books inside List object
            System.out.println("\nAmount of money in Bank is : " + account.getreamount());
        }
    }


