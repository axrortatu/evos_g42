package muhammad_ali.service;

import muhammad_ali.model.Order;

import java.util.UUID;

public class OrderService {
    private Order[] orders = new Order[100];
    private int index = 0;

    public void addOrder(Order order, UUID userId) {
        order.setUserId(userId);
        orders[index++] = order;
    }

    public void payOrder(UUID userId) {
        for (int i = 0; i < index; i++) {
            if (orders[i] != null && orders[i].getUserId().equals(userId)) {
                orders[i].setCompeted(true);

            }
        }
    }

    public Order[] getHistoryByUserId(UUID userId) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (orders[i] != null && orders[i].getUserId().equals(userId) && orders[i].isCompeted()) {
                count++;
            }
        }
        Order[] myHistory = new Order[count];
        int index1 = 0;
        for (int i = 0; i < index; i++) {
            if (orders[i] != null && orders[i].getUserId().equals(userId) && orders[i].isCompeted()) {
                myHistory[index1++] = orders[i];

            }
        }
        return myHistory;
    }
}
