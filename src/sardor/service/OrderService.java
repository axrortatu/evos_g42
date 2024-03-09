package sardor.service;

import java.util.UUID;

public class OrderService implements InterfaceService{
    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public Object update(Object object) {
        return null;
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
