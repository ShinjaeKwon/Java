import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookTable {
    private HashMap<String, Book> books;
    public BookTable(){
        books = new HashMap<>();
    }
    public void addBook(Book book) {
        books.put(book.getCode(), book);
    }
    public void showBooks(){
        //for(Map.Entry<String, Book> book : books.entrySet())
            //System.out.println(book.getValue());
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Book> book = iterator.next();
            System.out.println(book.getValue());
        }
    }
    public Book getBook(String code){
        return books.get(code);
    }
    public Book getBookByTitle(String title){
        for(Map.Entry<String, Book> book : books.entrySet())
            if(book.getValue().getTitle().equals(title))
                return book.getValue();

        return null;
    }

}