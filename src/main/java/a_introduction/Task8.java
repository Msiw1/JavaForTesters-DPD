package a_introduction;

import java.time.Year;

import static java.lang.System.out;

public class Task8 {

    public static void main(String[] args) {

        out.println(calculatePrice(100,0.75));

    }


    // metoda obliczania zniżki
    public static double calculatePrice(int price, double discount) {

        return price * discount;

    }

}

