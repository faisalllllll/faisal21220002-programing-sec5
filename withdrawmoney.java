package taskk;

public class withdrawmoney  {
    
    
     public withdrawmoney(){

    }

 
    
    public double getwithdrawmoney(double money,double withdraw){
        Addaccount am =new  Addaccount();
        double certainly_money= money - withdraw;
        
        return certainly_money;
    }
    
    
}
