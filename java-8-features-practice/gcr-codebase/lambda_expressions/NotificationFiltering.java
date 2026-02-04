package lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFiltering {
    public static void main(String[] args) {
        // Storing the Objects of Alert into the List
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("High Blood Pressure", "critical", "vitals"));
        alerts.add(new Alert("Low Oxygen Level", "critical", "vitals"));
        alerts.add(new Alert("Medication Reminder", "normal", "medication"));
        alerts.add(new Alert("Appointment Reminder", "normal", "schedule"));
        alerts.add(new Alert("Fever Spike Detected", "critical", "vitals"));
        alerts.add(new Alert("Lab Reports Ready", "normal", "reports"));

        Predicate<Alert> criticalAlert = a -> a.severity.equals("critical");
        Predicate<Alert> medicationAlert = a -> a.category.equals("medication");
        Predicate<Alert> criticalAndVitalAlert = a -> a.severity.equals("critical") && a.category.equals("vitals");

        System.out.println("All Alerts : ");
        alerts.forEach(System.out::println);

        System.out.println("All Critical Alerts : ");
        filterAndDisplay(alerts, criticalAlert);

        System.out.println("All Medication Alerts : ");
        filterAndDisplay(alerts, medicationAlert);

        System.out.println("All Critical And Vitals Alerts : ");
        filterAndDisplay(alerts, criticalAndVitalAlert);
    }


    public static void filterAndDisplay(List<Alert> alerts , Predicate<Alert> predicate){
        List<Alert> filtered = alerts.stream().filter(predicate).collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}



class Alert {
    String message;                                  // Stores the main message of alert
    String severity;                                 // Stores the severity of alert for e.g. critical / normal
    String category;                                 // Stores the category of alert for e.g. vitals / medication / schedule / reports

    // Constructor of Alert class to initialize the instance variable
    public Alert(String message, String severity, String category) {
        this.message = message;
        this.severity = severity;
        this.category = category;
    }

    // Overriding the method toString to represent the Alert object in String
    @Override
    public String toString() {
        return "Message : "+ message + "\nSeverity : " + severity + "\nCategory : " + category;
    }
}