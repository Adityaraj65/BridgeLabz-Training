package stream_api.sensor_reading;

import java.util.ArrayList;

public class IotReading {
    public static void main(String[] args) {
        ArrayList<Double>temp=new ArrayList<Double>();
        temp.add(98.0);
        temp.add(97.1);
        temp.add(109.0);
        temp.add(107.1);
        temp.add(88.0);
        temp.add(104.1);
        temp.add(96.0);
        temp.add(99.1);
        double threshold=100;
        temp.stream().filter(r->r>threshold).forEach(r -> System.out.println(r));

    }
}
