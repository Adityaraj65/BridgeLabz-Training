package stream_api.event_attendee;

import java.util.ArrayList;

public class EventAttendee {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("aditya");
        list.add("ram");
        list.add("ghansayam");
        list.add("chandu");
        list.add("saket");
        list.forEach(name-> System.out.println("welcome :"+name));
    }
}
