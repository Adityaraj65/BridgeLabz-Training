package stream_api.filtering_expiring_memberships;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpiringMemberships {

    public static void main(String[] args) {

        // creating list of members
        List<Member> members = new ArrayList<>();
        members.add(new Member("Amit", LocalDate.now().plusDays(10)));
        members.add(new Member("Neha", LocalDate.now().plusDays(40)));
        members.add(new Member("Rahul", LocalDate.now().plusDays(25)));
        members.add(new Member("Priya", LocalDate.now().plusDays(5)));

        // getting today's date
        LocalDate today = LocalDate.now();

        // getting date after 30 days
        LocalDate next30Days = today.plusDays(30);

        // filtering members whose membership is expiring in next 30 days
        List<Member> expiringSoon =
                members.stream()
                        .filter(m ->
                                !m.getExpiryDate().isBefore(today) &&
                                        !m.getExpiryDate().isAfter(next30Days)).collect(Collectors.toList());

        // printing members whose membership is expiring
        expiringSoon.forEach(m -> System.out.println(m.getName() + " | " + m.getExpiryDate()));
    }
}
