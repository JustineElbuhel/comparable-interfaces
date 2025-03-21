package MultipleInteraces;

public class Person implements Identifiable, Comparable<Person>{

    private String name;
    private String ssn;

    public Person(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String toString(){
        return name + ": " + ssn;
    }

    @Override
    public String getId() {
        return getSsn();
    }

    @Override
    public int compareTo(Person person){
        return this.getId().compareToIgnoreCase(person.getId());
    }
}

