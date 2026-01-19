package OnlineShoppingPlatform;

public class Main {
    public static void main(String[] args) {


        Employee e1=new Employee("Sahil",101,10000);
        Employee e2=new Employee("mani",102,10000);
        Employee e3=new Employee("monu",103,1000);
        EmployeeCrud emp1=new EmployeeCrud();
        //adding employee
        emp1.addEmployee(e1);
        emp1.addEmployee(e2);
        emp1.addEmployee(e3);
        //demonstrating remove employee
        emp1.removeEmployee(102);

        PremiumUser p1=new PremiumUser("Vivek",2,10000);
        PremiumUser p2=new PremiumUser("Vivek",2,20000);
        PremiumUserCrud pc=new PremiumUserCrud();
        System.out.println("------------------------");
        pc.addPremiumUser(p1);
        pc.addPremiumUser(p2);
        RegularUser r1=new RegularUser("Aditya",3,500000);
        RegularUserCrud rc=new RegularUserCrud();
        System.out.println("--------------------");
        rc.addRegularUser(r1);
        emp1.calculateFinalPriceById(1);
        pc.calculateFinalPriceById(2);
        rc.calculateFinalPriceById(3);
        System.out.println("=================================");
        emp1.displayEmployee(101);
        emp1.displayEmployee(102);
        System.out.println("====================================");
        pc.displayPremiumUser(2);

        System.out.println("==================================");
        rc.displayRegularUser(3);


    }
}
