package Task6;

public class UserDatabase {

    private User[] users;

    public UserDatabase() {
        users = new User[3];
        users[0] = new User("Alice", 25);
        users[1] = new User("Bob", 30);
        users[2] = new User("Charlie", 35);
    }

    public User findUserByName(String name) throws UserNotFoundException {
        for(User user : users) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found: " + name);
    }

}
