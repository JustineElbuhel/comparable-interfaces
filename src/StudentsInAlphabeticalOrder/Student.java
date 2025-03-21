package StudentsInAlphabeticalOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Student compare) {
        return this.name.compareTo(compare.getName());
    }

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Student z = new Student("z");
        Student a = new Student("a");
        Student f = new Student("f");
        Student c = new Student("c");
        Student t = new Student("t");

        students.add(z);
        students.add(a);
        students.add(f);
        students.add(c);
        students.add(t);

        Collections.sort(students);
        System.out.println(students);

    }
}
