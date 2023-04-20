package a_introduction;

public class Task5 {
    public static void main(String[] args) {

        String imie = "Krzyś";
        int wiek = 19;
        String weryfikacja;

        if (wiek<18){
            weryfikacja = "nie jest pełnoletni";
        }
        else {
            weryfikacja = "jest pełnoletni";
        }

        System.out.println(imie + " ma " + wiek + " lat i " + weryfikacja);

    }
}
