package OnlineShoppingPlatform;

public class RegularUser extends User{
    double amount;
    RegularUser(String name,int userId,double amount){
        super(name,userId);
        this.amount=amount;
    }
    public double calculateFinalPrice(double price){
        return price;
    }

    public double getAmount(){
        return amount;
    }
    public void getUserType(){
        System.out.println("User type is regular");
    }

}
