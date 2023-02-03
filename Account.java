package taskk;

public class Account {
      private String namee;
      private int numm;
      private double amountt;
      private int optionn;
     public double amountofmoney;
    public Account(){
        super();
       
              

    }
    
    public Account(double amount){
        

             this.amountofmoney= getreamount();

    }
    
    
    
    
     public String getrename(){
        return namee;
    }
    
    
    public int getrenum(){
        return numm;
    }
    
    public double getreamount(){
        return amountt;
    }
   
    public int getoption(){
        return optionn;
    }
   ////////////////////////////
    
     public void setrename(String name){
        namee= name;
    }
    
    
    public void setrenum(int num){
        numm=num;
    }
    
    public void setreamount(double amount){
        amountt=amount;
    }
    
    public void setoption(int option){
        optionn=option;
        Addaccount b = new Addaccount();
        
    }
}
