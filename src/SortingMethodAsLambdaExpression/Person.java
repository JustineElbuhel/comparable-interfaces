package SortingMethodAsLambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Person {

    private String name;
    private int year;

    public Person(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return name + "(" + year + ")";
    }

    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jessica", 1892));
        people.add(new Person("Ada", 1955));
        people.add(new Person("Jasmine", 1928));
        people.add(new Person("Matt", 2012));

        people.stream().sorted((p1,p2) -> {
            return p1.getYear() - p2.getYear();
        }).forEach(p -> System.out.println(p));

        System.out.println();

        people.stream().forEach(p -> System.out.println(p));

        System.out.println();

        Collections.sort(people, (p1, p2) -> p1.getYear() - p2.getYear());

        people.stream().forEach(p -> System.out.println(p));

        System.out.println();

        //When comparing strings, we can use the compareTo method from the String class.
        //It returns an integer that describes the order of the compared strings
        people.stream().sorted((p1, p2) -> {
            return p1.getName().compareToIgnoreCase(p2.getName());
        }).forEach(p -> System.out.println(p));
    }
}
