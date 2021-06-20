public class GenericTest {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(new Integer[5]);
        box.put(17); // autoboxing : put(new Integer(17))
        box.put(21);
        box.put(22);
        box.put(25);
        box.put(26);
        box.sizeup(new Integer[box.capacity()*2]);
        box.put(28);

        box.show();
        System.out.println(box.get(3));
        box.remove(2);
        box.show();
        box.clear();
        System.out.println("-----------------");
        box.show();


        Box<Book> bookBox = new Box<>(new Book[5]);
        bookBox.put(new Book("해리포터", 23000));
        bookBox.put(new Book("해리포터2", 23000));
        bookBox.put(new Book("해리포터3", 23000));
        bookBox.put(new Book("해리포터4", 23000));
        bookBox.show();
    }
}
