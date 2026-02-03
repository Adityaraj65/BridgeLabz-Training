package annotation;

import java.util.ArrayList;

public class SuppressWarning {
    public static void main(String[] args) {

        // Suppressing unchecked warning for raw ArrayList usage
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList();

        // Adding different types of data (not type-safe)
        list.add(10);
        list.add("Hello");
        list.add(25.5);

        // Printing all elements from the list
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
