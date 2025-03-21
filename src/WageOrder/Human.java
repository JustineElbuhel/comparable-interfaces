package WageOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Comparable<Human>{

    private String name;
    private int wage;

    public Human (String name, int wage){
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public String toString(){
        return name + ": " + wage;
    }

    @Override
    public int compareTo(Human human){
        return this.wage - human.getWage();
    }

    public static void main(String[] args){
        List<Human> people = new ArrayList<>();
        Human jess = new Human("Jessica", 13);
        Human tom = new Human("Tom", 12);
        Human jasmine = new Human("Jasmine",  14);

        people.add(jess);
        people.add(tom);
        people.add(jasmine);

        Collections.sort(people);
        System.out.println(people);
    }
}
