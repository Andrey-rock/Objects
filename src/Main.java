public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Фрэнк", "Герберт");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Дюна", author1, 1963);
        Book book2 = new Book("Евнений Онегин", author2, 1833);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book1.setYearPublication(1965);

        System.out.println(book1.toString());
    }
}