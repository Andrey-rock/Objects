public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Фрэнк", "Герберт");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Дюна", author1, 1963);
        Book book2 = new Book("Евнений Онегин", author2, 1833);

        System.out.println(book1);
        System.out.println(book2);

        book1.setYearPublication(1965);

        System.out.println(book1);
        System.out.println();

        Author author3 = author1;
        Author author4 = new Author("Александр", "Пушкин");

        System.out.println(author1.equals(author2)); // false
        System.out.println(author1.equals(author3)); // true
        System.out.println(author2.equals(author4)); // true
        System.out.println();

        Book book3 = new Book("Дюна", author1, 1965);
        System.out.println(book2.equals(book1)); // false
        System.out.println(book3.equals(book1)); // true
    }
}