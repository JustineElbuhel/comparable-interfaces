package Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("Michael", 182));
        members.add(new Member("Matt", 187));
        members.add(new Member("Ada", 184));

        members.stream()
                .forEach(member -> System.out.println(member));
        System.out.println();

        System.out.println("Printing a sorted stream using the sorted method");
        members.stream()
                .sorted()
                .forEach(member -> System.out.println(member));

        System.out.println();
        members.stream()
                .forEach(member -> System.out.println(member));

        System.out.println();

        System.out.println("Sorting the list with  the sort method of the Collection class");
        Collections.sort(members);
        members.stream()
                .forEach(member -> System.out.println(member));
    }
}