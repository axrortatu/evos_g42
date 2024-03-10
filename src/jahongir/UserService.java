package jahongir;

import java.util.UUID;

public class UserService {
    User user = new User();
    public User[] users = new User[100];
    private int indexUsers = 0;

    public User[] getProducts() {
        return users;
    }

    public boolean addUser(User user) {
        if (!hasUser(user.getUsername())) {
            users[indexUsers++] = user;
            return true;
        }
        return false;
    }

    private boolean hasUser(String name) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean validate(Object object) {
        User user = (User) object;
        return (user != null && !isExist(user.getUsername()));
    }

    private boolean isExist(String name) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(name)) {
                return true;

            }
        }

        return false;
    }

    public boolean delete(UUID id) {
        User deleteUser = getUserById(id);

        if (deleteUser == null) {
            return false;
        }

        int deleteIndex = getIndexUsers(deleteUser);

        if (deleteIndex == -1) {
            return false;
        }

        for (int i = deleteIndex; i < indexUsers; i++) {
            if (users[i] != null) {
                users[i] = users[i++];
            }
        }

        return true;
    }

    public User getUserById(UUID id) {
        for (User user1 : users) {
            if (user1 != null && user1.getId().equals(id)) {
                return user1;
            }
        }

        return null;
    }

    public User getUserByUsername(String username) {
        for (User user1 : users) {
            if (user1 != null && user1.getUsername().equals(username)) {
                return user1;
            }
        }

        return null;
    }

    private int getIndexUsers(User user) {
        if (user == null) {
            return -1;
        }

        for (int i = 0; i < indexUsers; i++) {
            if (users[i].getUsername().equals(user.getUsername())) {
                return i;
            }
        }

        return -1;
    }

}
