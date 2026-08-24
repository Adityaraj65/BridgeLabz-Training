package day16;

import java.util.Arrays;
import java.util.List;

class NumericBox<T extends Number> {

    private T value;

    NumericBox(T value) {
        this.value = value;
    }

    double doubled() {
        return value.doubleValue() * 2;
    }
}

public class BoundedTypeParameter {

    static double sumOfList(List<? extends Number> list) {

        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        // Bounded Type Parameter
        NumericBox<Integer> intBox = new NumericBox<>(5);
        NumericBox<Double> doubleBox = new NumericBox<>(3.5);

        System.out.println("Integer doubled: " + intBox.doubled());
        System.out.println("Double doubled: " + doubleBox.doubled());

        // Wildcard / bounded wildcard
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.5, 2.5);

        System.out.println("Integer list sum: " + sumOfList(intList));
        System.out.println("Double list sum: " + sumOfList(doubleList));

        // This will NOT compile
        // NumericBox<String> stringBox = new NumericBox<>("Hello");
    }
}
