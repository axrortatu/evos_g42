package jahongir.service;

import jahongir.model.User;

public class UserService {
    private User[] users = new User[100];
    private int indexUsers;




    public boolean userLogin(String userName) {
        for (User user: users){
            if (user!=null && user.getUserName().equals(userName)){
                return true;
            }
        }
        return false;
    }
}
