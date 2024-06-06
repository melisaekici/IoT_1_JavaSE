package EdaTutas_Examples;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {

    // User class
    static class User{
        @Setter
        private int id;
        @Setter
        private String name;
        @Setter
        private String email;

        // Constructor (parametreli)
        public User(int id, String name, String email){
            this.id = id;
            this.name = name;
            this.email = email;
        }

        // GETTER SETTER (dış erişim olduğu için getter setter public)
        public int getId(){
            return id;
        }

        public void setID(int id){
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }

    }

    @Override
    public String toString() {
        return "UserManager{" +
                "userList=" + userList +
                '}';
    }

    private List<User> userList = new ArrayList<User>();

    private static final Logger logger = Logger.getLogger(UserManager.class.getName());

    // Kullanıcı ekleme
    public void addUser(User user){
        userList.add(user);
        logger.log(Level.INFO,"User added " + user);
    }

    // Kullanıcı listeleme
    public void listUsers(){
        if(userList.isEmpty()){
            System.out.println("No users available");
        }else{
            for(User user : userList){
                System.out.println(user);
            }
        }
    }

    // Kullanıcı silme methodu
    public void deleteUser(int id){
        User userToRemove = null;
        if(userToRemove != null){
            userList.remove(userToRemove);
            logger.log(Level.INFO, "User deleted " + userToRemove);
        }
    }

    public void updateUser(int id, String newName, String newEmail){
        for(User user: userList){
            if(user.getId() == id){
                user = new User(id, newName, newEmail);
                logger.log(Level.INFO, "User updated " + user);
                break;
            }
        }
    }

    public static void main(String[] args) {
    UserManager userManager = new UserManager();
    Scanner scanner = new Scanner(System.in);

    int userID = 1;
    while(true){
        System.out.println("1. Add User");
        System.out.println("2. List Users");
        System.out.println("3. Delete User");
        System.out.println("4. Update User");
        System.out.println("5. Exit");
        System.out.println("Please choose an option");
        int x = scanner.nextInt();
        scanner.nextLine();
        switch(x){
            case 1:
                System.out.println("Please enter user name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter email: ");
                String email = scanner.nextLine();
                User newUser = new User(userID++, name, email); // atadıktan sonra 1 artır
                userManager.addUser(newUser);
                //System.out.println("User info: " + name + email);
                System.out.println("User successfully added");
                break;
            case 2: // listeleme
                userManager.listUsers();
                break;
            case 3 : // silme
                System.out.println("Please enter userID to delete: ");
                int idToDelete = scanner.nextInt();
                userManager.deleteUser(idToDelete);
                break;
            case 4:
                System.out.println("Please enter userID to update: ");
                int idToUpdate = scanner.nextInt();
                System.out.println("Please enter new user name: ");
                String newName = scanner.nextLine();
                System.out.println("Please enter new email: ");
                String newEmail = scanner.nextLine();
                userManager.updateUser(idToUpdate, newName, newEmail);
                break;
            case 5:
                System.out.println("Exit...");
                scanner.close();
                break;
        }
    }
    }
}
