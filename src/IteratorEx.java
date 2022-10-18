import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/16 19:12
 */
public class IteratorEx {
    public static void main(String[] args) {
        Book book1 = new Book("红楼梦", "曹雪芹", 28.0);
        Book book2 = new Book("西游记", "吴承恩", 38.0);
        Book book3 = new Book("百万英镑", "马克吐温", 18.0);

        Collection col = new ArrayList();

        col.add(book1);
        col.add(book2);
        col.add(book3);

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}

class Book {
    String name;
    String author;
    double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;


    }
}