package jahongir.service;

import jahongir.model.OrderItem;

import java.util.UUID;

public class OrderItemService extends BaseService {
    private OrderItem[] orderItems = new OrderItem[10000];
    private int indexOrderItems;

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        boolean check = false;
        for (int i = 0; i < indexOrderItems - 1; i++) {
            if (orderItems[i].getId().equals(id)) {
                check = true;
            }
            if (check) {
                orderItems[i] = orderItems[i + 1];
            }
        }
        if (check || orderItems[indexOrderItems].getId().equals(id)) {
            indexOrderItems--;
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
