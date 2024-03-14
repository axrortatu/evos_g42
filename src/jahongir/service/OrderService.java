package jahongir.service;

import jahongir.model.Basket;
import jahongir.model.OrderItem;

import java.util.UUID;

public class OrderService extends BaseService {
    private Basket[] orders = new Basket[1000];
    private int indexOrders;
    OrderItemService orderItemService;

    public void setOrderItemService(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }


    public Basket[] getOrders() {
        return orders;
    }

    @Override
    public boolean add(Object object) {
        Basket ordersNew = (Basket) object;
        if (!hasOrder(ordersNew.getId())) {
            orders[indexOrders++] = ordersNew;
            return true;
        }
        return false;
    }

    private boolean hasOrder(UUID id) {
        for (Basket order : orders) {
            if (order != null && order.getId().equals(id)) {
                return true;
            }
        }
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
        Basket updateOrder = (Basket) object;
        if (updateOrder.isActive()){
            return false;
        }
        OrderItem[] parentOrderItems = (OrderItem[]) orderItemService.list(updateOrder.getId());
        return true;
    }

    @Override
    public Object[] list(UUID id) {
        Basket[] parentOrders = new Basket[100];
        int index = 0;

        return parentOrders;
    }
}
