package SortingByMultipleCriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Film {
    private String name;
    private int releaseYear;

    public Film (String name, int year){
        this.name = name;
        this.releaseYear = year;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String toString(){
        return name + "(" + releaseYear  + ")";
    }

    public static void main(String[] args){
        List<Film> films = new ArrayList<>();
        films.add(new Film("a", 2000));
        films.add(new Film("b", 1999));
        films.add(new Film("c", 2001));
        films.add(new Film("d", 2000));

        for(Film film : films){
            System.out.println(film);
        }

        Comparator<Film> comparator  = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        System.out.println();

        for(Film film : films)
            System.out.println(film);
    }
}
