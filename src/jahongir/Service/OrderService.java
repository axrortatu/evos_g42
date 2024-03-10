package jahongir.service;

import jahongir.model.BaseModel;
import jahongir.model.Basket;
import jahongir.model.OrderItem;

import java.util.UUID;

public class OrderService extends BaseService {
    private Basket[] orders = new Basket[1000];
    private int indexOrders;

    public Basket[] getOrders() {
        return orders;
    }

    @Override
    public boolean add(Object object) {
        Basket[] ordersNew = (Basket[]) object;

        return false;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        Basket[] updateOrder = (Basket[]) object;

        return false;
    }

    @Override
    public Object[] list(UUID id) {
        Basket[] parentOrders = new Basket[100];
        int index = 0;

        return parentOrders;
    }
}
