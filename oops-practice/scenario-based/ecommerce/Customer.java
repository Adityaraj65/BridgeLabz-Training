package ecommerce;

public class Customer {

    private int customerId;
    private String customerName;
    private int age;
    private String phoneNo;

    public Customer(int customerId, String customerName, int age, String phoneNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        setCustomerAge(age);
        setPhoneNo(phoneNo);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerAge(int age) {
        if (age <= 0) {
            System.out.println("Enter valid age");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        if (phoneNo == null || phoneNo.length() < 10) {
            System.out.println("Invalid phone number");
            return;
        }
        this.phoneNo = phoneNo;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + age);
        System.out.println("Customer Phone: " + phoneNo);
    }
}
