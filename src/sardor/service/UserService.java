package sardor.service;

import sardor.model.Product;
import sardor.model.User;

import java.util.UUID;

public class UserService implements InterfaceService {
    static User[] users = new User[1000];
    static int userCount = 0;

    public static User[] getUsers() {
        return users;
    }

    @Override
    public boolean add(Object object) {
        User user = (User) object;
        if (!hasUser(user.getUsername())) {
            users[userCount++] = user;
            return true;
        }
        return false;
    }

    private boolean hasUser(String username) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public User loginUser(String username) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(UUID id, String name) {
        for (User user : users) {
            if (user != null && user.getId().equals(id) && !user.getUsername().equals(name)) {
                user.setUsername(name);
            }
        }
    }

    public boolean isExistUser(UUID id) {
        for (User user : users) {
            if (user != null && user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public int getUserIndexByUserId(UUID userId) {
        for (int i = 0; i < userCount; i++) {
            if (users[i] != null && users[i].getId().equals(userId)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean delete(UUID id) {
        if (!isExistUser(id)) {
            return false;
        }
        int indexDelete = getUserIndexByUserId(id);

        if (indexDelete == -1) {
            return false;
        }

        for (int i = indexDelete; i < userCount; i++) {
            if (users[i] != null) {
                users[i] = users[i + 1];
            }
        }
        userCount--;
        return true;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }
}
