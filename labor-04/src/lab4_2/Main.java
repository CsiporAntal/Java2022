package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        readFilePrintItsLineNumbered("lab4_2_input.txt");
        System.out.println();
    }
    public static void readFilePrintItsLineNumbered( String lab4_2_input ){
        try (Scanner scanner = new Scanner( new File(lab4_2_input))){

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
