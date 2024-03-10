package muhammad_ali.service;
import muhammad_ali.model.User;

import java.util.UUID;

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
    public User[] getUsers(){
        return users;
    }
    public void deleteUser(String userName){
        for (int i=0; i < index; i++){
            if ( users[i] != null && users[i].getUsername().equals(userName)){
                for (int j = i; j < index -1; j++){
                    users[j] = users[j+1];
                }
                users[index - 1] = null;
                index--;
                return;
            }
        }
    }
}
