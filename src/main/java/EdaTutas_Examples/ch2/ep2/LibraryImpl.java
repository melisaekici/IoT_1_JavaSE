package EdaTutas_Examples.ch2.ep2;

import java.util.List;

public class LibraryImpl implements Library {

    @Override
    public void addBook(Book book) {

    }

    @Override
    public List<Book> listBooks() {
        return List.of();
    }

    @Override
    public void deleteBook(int id) {

    }

    @Override
    public void updateBook(int id, String newTitle, String newAuthor, int newYear) {

    }

    @Override
    public Book findBookByTitle(String title) {
        return null;
    }

    @Override
    public Book listBooksByAuthor(String author) {
        return null;
    }

    @Override
    public void borrowBook(int bookId, int userId) {

    }

    @Override
    public void returnBook(int bookId) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public List<User> listUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(int id, String newName, String newMail) {

    }

    @Override
    public User findUserByName(String Name) {
        return null;
    }
}
