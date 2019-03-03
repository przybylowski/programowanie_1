package zadania3;

import java.util.Scanner;

public class Zadania3 {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        String wyraz = wejscie.nextLine();
        System.out.println(wyraz);
        String odwracanie = new StringBuilder(wyraz).reverse().toString();
        System.out.println(odwracanie);
        char [] w =  wyraz.toCharArray();
        int counter_upper = 0;
        int counter_lower = 0;
        int counter_digits = 0;
        int counter_space = 0;
        int counter_char = 0;
        for (int i = 0; i < wyraz.length(); i++) {
            if (Character.isUpperCase(w[i])) counter_upper++;
            if (Character.isLowerCase(w[i])) counter_lower++;
            if (Character.isDigit(w[i])) counter_digits++;
            if (Character.isSpaceChar(w[i])) counter_space++;
        }
        int special = w.length - counter_upper - counter_digits - counter_lower - counter_space;
        System.out.println("Duże = " + counter_upper);
        System.out.println("Małe = " + counter_lower);
        System.out.println("Cyfry = " + counter_digits);
        System.out.println("Spacje = " + counter_space);

        System.out.println("Znak specjalny = " + special);
    }





}
