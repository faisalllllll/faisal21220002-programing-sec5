
package taskk;
import java.io.*;
import java.util.*;


public class Bank {
    
    private final List<Account> Accounts;
    
   public Bank(List<Account> Accounts){
        this.Accounts=Accounts;
    }
    
    public List<Account> getlistofaccounts(){
        return Accounts;
    }
}
