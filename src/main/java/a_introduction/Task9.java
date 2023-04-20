package a_introduction;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(minFrom(10, 20, 5));
    }

    public static double minFrom(double a, double b, double c) {

            return Math.min(Math.min(a, b), c);

    }
}
