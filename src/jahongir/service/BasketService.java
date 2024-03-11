package jahongir.service;

import jahongir.model.Basket;

import java.util.UUID;

public class BasketService extends BaseService {
    private Basket[] orders = new Basket[100];
    private int indexBaskets;

    public Basket[] getBaskets() {
        return orders;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        boolean check = false;
        for (int i = 0; i < indexBaskets - 1; i++) {
            if (orders[i].getId().equals(id)) {
                check = true;
            }
            if (check) {
                orders[i] = orders[i + 1];
            }
        }
        if (check || orders[indexBaskets].getId().equals(id)) {
            indexBaskets--;
            return true;
        }
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
