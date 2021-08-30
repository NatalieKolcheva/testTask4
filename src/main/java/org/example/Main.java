package org.example;

import java.io.InputStream;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("numbers.txt");
        Scanner scan = new Scanner(inputStream);
        Double number;
        Double sum = 0.0;

        while (scan.hasNextLine()) {
            try {
                number = Double.parseDouble(scan.nextLine());
                sum = sum + number;

            } catch (NumberFormatException ne) {

            }

            inputStream.close();
        }
        System.out.println("Sum of numbers in the file: " + sum);


    }
}