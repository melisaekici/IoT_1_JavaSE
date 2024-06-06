package EdaTutas_Examples.ch2.ep2;

import lombok.Getter;
import lombok.Setter;

public class Book {

    @Setter
    @Getter
    private int id;
    @Setter
    @Getter
    private String title;
    @Setter
    @Getter
    private String author;
    @Setter
    @Getter
    private int year;
    private boolean isBorrowed; // true, false

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isBorrowed=" + isBorrowed +
                '}';
    }



}
