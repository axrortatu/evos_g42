package sardor.service;

import sardor.model.User;

import java.util.UUID;

public class UserService implements InterfaceService{
    static User[] users = new User[1000];
    static int userCount = 0;


    @Override
    public boolean add(Object object) {
        User user = (User) object;
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
    public User loginUser(String username){
        for (User user : users){
            if(user != null && user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(UUID id , String name) {
         }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }
}
