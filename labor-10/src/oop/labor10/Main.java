package oop.labor10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        double sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            for (String s : line.split(" ")) {
                try {
                    sum += Double.parseDouble(s.trim());
                } catch (NumberFormatException ignore){  }
            }
            
            System.out.println(sum);

        }
    }
}