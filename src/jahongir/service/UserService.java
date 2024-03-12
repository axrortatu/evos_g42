package jahongir.service;

import jahongir.model.User;

import java.util.UUID;

public class UserService extends BaseService {

    private User[] users = new User[100];
    private int indexUsers;

    public boolean userLogin(String userName) {
        for (User user : users) {
            if (user != null && user.getUserName().equals(userName)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        boolean check = false;
        for (int i = 0; i < indexUsers - 1; i++) {
            if (users[i].getId().equals(id)) {
                check = true;
            }
            if (check) {
                users[i] = users[i + 1];
            }
        }
        if (check || users[indexUsers].getId().equals(id)) {
            indexUsers--;
            return true;
        }
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        User updateUser = (User) object;
        for (int i = 0; i < indexUsers; i++) {
            if (users[i].getId().equals(id)) {
                users[i].setUserName(updateUser.getUserName());
                return true;
            }
        }

        return false;
    }



    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }
}
