package lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String>employeeName=new ArrayList<>();
        employeeName.add("ram");
        employeeName.add("abhishek");
        employeeName.add("shayam");
        employeeName.add("aditya");
        employeeName.forEach(p->System.out.print(p+" "));
        List<String>upperCase=employeeName.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("-------name in upper case-------");
        upperCase.forEach(p->System.out.print(p+" "));
    }

}
