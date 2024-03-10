package jahongir.service;

import jahongir.model.OrderItem;

import java.util.UUID;

public class OrderService extends BaseService {
    private OrderItem[] orders = new OrderItem[1000];
    private int indexOrders;

    public OrderItem[] getOrders() {
        return orders;
    }

    @Override
    public boolean add(Object object) {
        OrderItem[] ordersNew = (OrderItem[]) object;

        return false;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        OrderItem[] updateOrder = (OrderItem[]) object;

        return false;
    }

    @Override
    public Object[] list(UUID id) {
        OrderItem[] parentOrders = new OrderItem[100];
        int index = 0;

        return parentOrders;
    }
}
