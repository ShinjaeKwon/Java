public class Library {
    public static void main(String[] args) {
        BookCollector collecotr = new BookCollector();
        collecotr.addBook(new Book("B001", "Python",18500));
        collecotr.addBook(new Book("B002", "Java",18500));
        collecotr.addBook(new Book("B003", "C++",18500));
        collecotr.addBook(new Book("B004", "Web Design",18500));
        //collecotr.showBooks();
        collecotr.removeBook(0);
        collecotr.showBooks();
        Book book = collecotr.getBook(0);
        book = collecotr.getBook("C++");
        System.out.println(book);
        
        BookTable table = new BookTable();
        table.addBook(new Book("B001", "Python",18500));
        table.addBook(new Book("B002", "Java",18500));
        table.addBook(new Book("B003", "C++",18500));
        table.addBook(new Book("B004", "Web Design",18500));
        table.showBooks();
        book = table.getBook("B003");
        book = table.getBookByTitle("C++"); //제목으로 책을 가져오기
        System.out.println(book);

    }
}
