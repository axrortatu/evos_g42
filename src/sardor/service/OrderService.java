package sardor.service;

import java.util.UUID;

public class OrderService implements InterfaceService{
    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public void update(UUID id ,String name) {
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
