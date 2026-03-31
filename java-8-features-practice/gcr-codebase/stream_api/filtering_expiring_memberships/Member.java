package stream_api.filtering_expiring_memberships;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Member {

    String name;
    LocalDate expiryDate;

    // constructor to initialize member details
    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    // method to get member name
    public String getName() {
        return name;
    }

    // method to get expiry date
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}


