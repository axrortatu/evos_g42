package jahongir.service;

import jahongir.model.Basket;
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
        OrderItem orderItem = (OrderItem) object;
        if (!hasOrderItem(orderItem.getId())) {
            orderItems[indexOrderItems++] = orderItem;
            return true;
        }
        return false;
    }

    private boolean hasOrderItem(UUID id) {
        for (OrderItem orderItem : orderItems) {
            if (orderItem != null && orderItem.getId().equals(id)) {
                return true;
            }
        }
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
        OrderItem updateOrderItem = (OrderItem) object;

        for (int i = 0; i < indexOrderItems; i++) {
            if (orderItems[i].getUserId().equals(id) && orderItems[i].getId().equals(id)) {
                orderItems[i].setCountProduct(updateOrderItem.getCountProduct());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }

    public OrderItem getOrderItemByName(String name) {
        for (OrderItem orderItem : orderItems) {
            if (orderItem != null && orderItem.getName().equals(name)) {
                return orderItem;
            }
        }
        return null;
    }
}
