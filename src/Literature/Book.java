package Literature;

import java.util.*;

public class Book {
    private String title;
    private int recAge;

    public Book(String title, int recAge){
        this.title  = title;
        this.recAge  = recAge;
    }

    public String getTitle() {
        return title;
    }

    public int getRecAge() {
        return recAge;
    }

    public String toString(){
        return String.format("%s (Recommended for ages %d or older)", title, recAge);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Input the name of the book (Empty stops): ");
            String title = scanner.nextLine();

            if(title.isEmpty()){
                break;
            }

            System.out.print("Input the recommended age: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, age));
        }

        System.out.println(books.size() + " books in total.");

        System.out.println();
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecAge)
                .thenComparing(Book::getTitle);

        Collections.sort(books,comparator);
        books.stream().forEach(b -> System.out.println(b));
    }
}
