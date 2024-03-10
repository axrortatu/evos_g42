package jahongir.service;

import jahongir.model.User;

import java.util.UUID;

public class UserService extends BaseService {
    private User[] users = new User[100];
    private int indexUsers;

    public boolean userLogin(String userName) {
        for (User user: users) {
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
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }
}
