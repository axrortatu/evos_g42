package muhammad_ali.service;
import muhammad_ali.model.User;

public class UserService {

    private User[] users = new User[100];
    private int index = 0;
    public boolean addUser(User user){
        if (!hasUser(user.getUsername())) {
            users[index++] = user;
            return true;
        }
        return false;
    }
    private boolean hasUser(String userName){
        for (User user : users){
            if (user != null && user.getUsername().equals(userName)){
                return true;
            }
        }
        return false;
    }
}
