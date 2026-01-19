package OnlineShoppingPlatform;

import java.util.ArrayList;

public class EmployeeCrud {

    ArrayList<Employee> employees=new ArrayList<>();
    private Discount discount = new EmployeeDiscount();
    //add new premium user
    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("employee added");
        return;
    }
    public void removeEmployee(int id){
        //check is list premiumUser contain user or not
        if(employees.isEmpty()){
            System.out.println("no employee available to delete");
            return;
        }
        for(Employee e:employees){
            if(e.getUserId()==id){
                employees.remove(e);
                System.out.println("employee removed");
                return;
            }
        }
        System.out.println("no user found");
    }
    public void displayEmployee(int id){
        if(employees.isEmpty()){
            System.out.println("no user to display");
            return;
        }
        for(Employee user:employees){
            if(user.getUserId()==id){
                user.getUserType();
                System.out.println("User id :"+user.getUserId());
                System.out.println("User name :"+user.getName());
                System.out.println("Final price : "+user.getAmount());
                return;
            }
        }
        System.out.println("User not found ");
    }

    public void calculateFinalPriceById(int id) {
        for (Employee u :employees) {
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
