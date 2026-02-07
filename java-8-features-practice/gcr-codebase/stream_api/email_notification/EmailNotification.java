package stream_api.email_notification;

import java.util.ArrayList;
import java.util.List;

public class EmailNotification {
    public static void main(String[] args) {
        // creating list of user emails
        List<String>list=new ArrayList<String>();
        list.add("ar850732@gmail.com");
        list.add("shayam@gmail.com");
        list.add("ram@gmail.com");
        list.add("guru@gmail.com");
        // sending email notification to each user
        list.forEach(email->sendEmailNotification(email));
    }
    // method to send email notification
    public static void sendEmailNotification(String email){
        System.out.println("email Send to "+email);
    }
}
