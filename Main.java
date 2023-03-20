public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Ivan Vazov");
        Author author2 = new Author("Stoyan Kolev");
        Author author3 = new Author("Stefan Avramov");
        Author author4= new Author("Nikola Karadzhov");

        Book book1 = new Book("Istoriqta na Marginite", author4);
        Book book2 = new Book("Tutorial on 05", author3);
        Book book3 = new Book("Gangsta", author2);
        Book book4 = new Book("Az sum Bulgarche", author1);

        Library library = new Library();

        library.addABook(book1);
        library.addABook(book2);
        library.addABook(book3);

        library.reserveABook(book2);
        library.reserveABook(book2); //error unavailable
        library.reserveABook(book4); //error unavailable

        library.returnABook(book2);
        library.returnABook(book2); //can't return
        library.returnABook(book4); //can't return

        library.getABook(book3, "Krustio");
        library.getABook(book3, "Krustio"); //error unavailable
        library.returnABook(book3);
        library.returnABook(book3); //can't return

        Book book5 = new Book("Pod igoto", book4.getAuthor());
        library.addABook(book5);
        System.out.println(book5.getBookName());
        System.out.println(book5.getAuthorName());
    }
}