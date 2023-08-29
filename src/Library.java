public class Library {
    public static void main(String[] args) {
        Author author = new Author("John", "john@gmail.com", 'M');
        Book book = new Book("Java for Beginners", author, 19.99, 99);
        System.out.println(book.toString());
        Book book1 = new Book("Java for Beginners Part 2", author, 29.99);
        System.out.println(book1.toString());

        /*Aggregation is a subset of association, is a collection of different things.
        It represents has a relationship. It is more specific than an association.
        It describes a part-whole or part-of relationship. It is a binary association,
        i.e., it only involves two classes. It is a kind of relationship in
        which the child is independent of its parent.
         */
    }
}
