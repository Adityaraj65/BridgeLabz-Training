package OnlineShoppingPlatform;

import java.util.ArrayList;

public class PremiumUserCrud {
    ArrayList<PremiumUser> premiumUser=new ArrayList<>();
    private Discount discount = new PremiumDiscount();
    //add new premium user
    public void addPremiumUser(PremiumUser user){
        premiumUser.add(user);
        System.out.println("Premium user added");
    }
    public void removePremiumUser(int id){
        //check is list premiumUser contain user or not
        if(premiumUser.isEmpty()){
            System.out.println("no user available to delete");
            return;
        }
        for(PremiumUser user:premiumUser){
            if(user.getUserId()==id){
                premiumUser.remove(user);
                System.out.println("Premium user removed");
                return;
            }
        }
        System.out.println("no user found");
    }
    public void displayPremiumUser(int id){
        if(premiumUser.isEmpty()){
            System.out.println("no user to display");
            return;
        }
        for(PremiumUser user:premiumUser){
            if(user.getUserId()==id){
                user.getUserType();
                System.out.println("User id "+user.getUserId());
                System.out.println("User name :"+user.getName());
                System.out.println("Final price : "+user.getAmount());
                return;
            }
        }
        System.out.println("User not found ");
    }
    public void calculateFinalPriceById(int id) {
        for (PremiumUser u : premiumUser) {
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

