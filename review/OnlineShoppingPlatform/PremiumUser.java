package OnlineShoppingPlatform;

public class PremiumUser extends User{
    double amount;
    PremiumUser(String name,int userId,double amount){
        super(name,userId);
        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }
    public void getUserType(){
        System.out.println("User type is Premium");
    }
}
