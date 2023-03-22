package org.example;
import java.util.Scanner;
public class ScannerExamples {
    public static void main(String[] args){
        String x = new String("zxxx");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
