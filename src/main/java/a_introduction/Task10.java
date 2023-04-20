package a_introduction;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(bookDetails("Hobbit", "Tolkien", "David Wyatt"));
    }

    public static String bookDetails(String title, String author, String illustrator) {
        return title + ", autorstwa " + author + " ilustrowany przez " + illustrator;
    }
}

// Hobbit, autorstwa JR. Tolkien wydany przez Wydawnictwo X