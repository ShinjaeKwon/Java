import java.util.ArrayList;
import java.util.Iterator;

public class BookCollector {
    private ArrayList<Book> books;
    public BookCollector(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void showBooks(){
        //for (int i = 0; i<books.size();i++) System.out.println(books.get(i));
        //for(Book book : books) System.out.println(book);
       // Iterator<Book> iterator = books.iterator(); //순환자, 원소를 처음부터 순환해서 방문하는 인터페이스
        Iterator iterator = books.iterator();
        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book);
        }
    }
    public void removeBook(int idx){
        books.remove(idx);
    }
    public Book getBook(int idx){
        return books.get(idx);
    }
    public Book getBook(String title){
        for(Book book : books)
            if(book.getTitle().equals(title)) return book;

            return null;
    }


}

