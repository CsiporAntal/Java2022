package oop.labor04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        readFromCSVFile("lab4_1_input.csv");
    }

    public static void readFilePrintItsLineNumbered( String lab4_1_input ){
        try (Scanner scanner = new Scanner( new File(lab4_1_input))){
            int n=1;
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (line.isEmpty()){
                continue;
            }
                System.out.println(n+" "+line);
                n++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String lab4_1_input) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("lab4_1_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)

                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
                System.out.println(persons);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }


}
