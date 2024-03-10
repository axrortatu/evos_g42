package muhammad_ali.service;
import muhammad_ali.model.User;

public class UserService {
    private User[] users = new User[1000];
    private int userIndex = 0;

    public boolean addUser(User user) {
        if (!hasUser(user.getUsername())) {
            users[userIndex++] = user;
            return true;
        }
        return false;
    }

    private boolean hasUser(String username) {
        for (User user : users) {
            return user != null && user.getUsername().equals(username);
        }
        return false;
    }

    public boolean userLogin(String username) {
        for (User user : users) {
            return user != null && user.getUsername().equals(username);
        }
        return false;
    }

    public boolean deleteUser(String username) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(username)) {
                int indexToRemove = -1;
                for (int i = 0; i < userIndex; i++) {
                    if (users[i] == user) {
                        indexToRemove = i;
                        break;
                    }
                }
                if (indexToRemove != -1) {
                    for (int i = indexToRemove; i < userIndex - 1; i++) {
                        users[i] = users[i + 1];
                    }
                    users[--userIndex] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public User[] getUsers() {
        return users;
    }

}
