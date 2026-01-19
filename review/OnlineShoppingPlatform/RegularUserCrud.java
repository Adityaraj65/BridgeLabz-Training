package OnlineShoppingPlatform;

import java.util.ArrayList;

public class RegularUserCrud  {
    ArrayList<RegularUser>regularUser=new ArrayList<>();
    private Discount discount = new RegularDiscount();
    //add new regular user
    public void addRegularUser(RegularUser user){
        regularUser.add(user);
        System.out.println("User added");
    }
    public void removeRegularUser(int id){
        //check is list regularuser contain user or not
        if(regularUser.isEmpty()){
            System.out.println("no user available to delete");
            return;
        }
        for(RegularUser user:regularUser){
            if(user.getUserId()==id){
                regularUser.remove(user);
                return;
            }
        }
        System.out.println("no user found");
    }
    public void displayRegularUser(int id){
        if(regularUser.isEmpty()){
            System.out.println("no user to display");
            return;
        }
        for(RegularUser user:regularUser){
            if(user.getUserId()==id){
                user.getUserType();
                System.out.println("User Id :"+user.getUserId());
                System.out.println("UserName : "+user.getName());
                System.out.println("Final price :"+user.getAmount());
                return;
            }
        }
        System.out.println("User not found ");
    }
    public void calculateFinalPriceById(int id) {
        for (RegularUser u : regularUser) {
            if (u.getUserId() == id) {
                double finalPrice = discount.calculatePriceById(u.getAmount());
                System.out.println(
                        u.getName() + " Final Price: " + finalPrice
                );
                return;
            }
        }
        System.out.println("Regular user not found");
    }
}
