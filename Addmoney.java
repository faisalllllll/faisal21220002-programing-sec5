package taskk;

public class Addmoney extends withdrawmoney  {
           

    public Addmoney(){

    }

 
    
    public double getmoney(double money,double addition){
        Addaccount am =new  Addaccount();
        double certainly_money= money + addition;
        
        return certainly_money;
    }

}
