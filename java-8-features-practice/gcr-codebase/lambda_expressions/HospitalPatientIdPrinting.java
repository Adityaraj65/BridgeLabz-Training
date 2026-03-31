package lambda_expressions;

import java.util.List;
import java.util.ArrayList;
public class HospitalPatientIdPrinting {
    public static void main(String[] args) {
        List<String>patientId=new ArrayList<>();
        patientId.add("101");
        patientId.add("103");
        patientId.add("104");
        patientId.add("105");
        patientId.add("106");
        patientId.forEach(System.out::println);
    }

}
