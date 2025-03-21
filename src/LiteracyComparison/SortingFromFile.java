package LiteracyComparison;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SortingFromFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            Files.lines(Paths.get("src/literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .sorted((p1, p2) -> {
                        return p1[5].compareToIgnoreCase(p2[5]);
                    })
                    .forEach(p -> System.out.println(
                            String.format("%s (%d), %s, %.2f", p[3], Integer.valueOf(p[4]), p[2], Double.valueOf(p[5]))));
        } catch (Exception e){
            System.out.println("Error: " + e.toString());
        }
    }
}