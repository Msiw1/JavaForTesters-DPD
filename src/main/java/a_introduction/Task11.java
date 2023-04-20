package a_introduction;

public class Task11 {
    public static void main(String[] args) {
        boolean test3 = validateSumWithDiscount(10, 10, 0.5, 50);
        System.out.println(test3);
    }

    public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum) {
        return Math.round((pcs * price) * discount) == expectedSum;
    }
}
