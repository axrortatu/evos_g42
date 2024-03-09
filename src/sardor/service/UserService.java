package sardor.service;

import sardor.model.User;

public class UserService {
    static User[] users = new User[1000];
    static int userCount = 0;

    public boolean addUser(User user){
        if (!hasUser(user.getUsername())){
            users[userCount++] = user;
            return true;
        }
        return false;
    }

    private boolean hasUser(String username){
        for (User user : users){
            if (user != null && user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
}
