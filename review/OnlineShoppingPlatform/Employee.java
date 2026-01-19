package OnlineShoppingPlatform;

public class Employee extends User{
    double amount;
    private double finalPrice;
    Employee(String name,int userId,double amount){
        super(name,userId);
        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }
    public void getUserType(){
        System.out.println("User type is Employee");
    }
}
