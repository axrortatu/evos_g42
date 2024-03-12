package jahongir.service;

import jahongir.model.Basket;

import java.util.UUID;

public class OrderService extends BaseService {
    private Basket[] orders = new Basket[1000];
    private int indexOrders;

    public Basket[] getOrders() {
        return orders;
    }

    @Override
    public boolean add(Object object) {
        Basket ordersNew = (Basket) object;

        return false;
    }

    @Override
    public boolean delete(UUID id) {
        boolean check = false;
        for (int i = 0; i < indexOrders - 1; i++) {
            if (orders[i].getId().equals(id)) {
                check = true;
            }
            if (check) {
                orders[i] = orders[i + 1];
            }
        }
        if (check || orders[indexOrders].getId().equals(id)) {
            indexOrders--;
            return true;
        }
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        Basket[] updateOrder = (Basket[]) object;
        for (int i = 0; i < indexOrders; i++) {
            if (orders[i].getId().equals(id)) {
                orders[i] = updateOrder[i];
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        Basket[] parentOrders = new Basket[100];
        int index = 0;

        return parentOrders;
    }
}
