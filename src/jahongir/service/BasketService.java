package jahongir.service;

import jahongir.model.Basket;

import java.util.UUID;

public class BasketService extends BaseService {
    private Basket[] baskets = new Basket[100];
    private int indexBaskets;

    public Basket[] getBaskets() {
        return baskets;
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
