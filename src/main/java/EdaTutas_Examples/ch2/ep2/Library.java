package EdaTutas_Examples.ch2.ep2;

import java.util.List;

public interface Library {

    /*
    Interface
    1. Hangi methodları kullanacağını belirteceğim
    2. Bu methodların nasıl kullanılacağomo yazmayacağız
    3. Farklı sınıfların ortak bir işlevini paylaşmasını sağlar
    Hayvanlar;
    Interface Sound - makesound(){}
    Interface Move - move()
    4. classlardan çağırıp makesound(){kedi miyavlar, kuş cikcikler}
    5. class implements ederler
    yılan classında sound ve move interfacelerini implements edersek -> yılan tıslar, yılan sürünür

     */

    // BOOKS
    void addBook(Book book);
    List<Book> listBooks();
    void deleteBook(int id);
    void updateBook(int id, String newTitle, String newAuthor, int newYear);

    Book findBookByTitle(String title);
    Book listBooksByAuthor(String author);

    void borrowBook(int bookId, int userId); // 1 numaralı kitabı 5 numaralı kişi alabilsin
    void returnBook(int bookId);

    // USERS
    void addUser(User user);
    List<User> listUsers();
    void deleteUser(int id);
    void updateUser(int id, String newName, String newMail);

    User findUserByName(String Name);











}
