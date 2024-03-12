package sardor.service;

import sardor.model.Order;

import java.util.UUID;

public class OrderService implements InterfaceService{
    public Order[] orders = new Order[100];
    private int indexOrder =0;
    @Override
    public boolean add(Object object) {
        Order order = (Order) object;
        if (order!=null){
            orders[indexOrder++]=order;
            return false;
        }
        return false;
    }

    public void payOrder(UUID id) {
        for (int i = 0; i < indexOrder; i++) {
            if (orders[i] != null && orders[i].getUserId() != null && orders[i].getUserId().equals(id)) {
                orders[i].setCompeted(true);
            }
        }
    }

    @Override
    public void update(UUID id ,String name) {
        for (Order order : orders){
            if(order!=null&&order.getUserId()!=null){
                if(order.getUserId().equals(id)){

                }
            }
        }
    }

    @Override
    public boolean delete(UUID id) {
        for (int i = 0; i < indexOrder; i++) {
            if(orders[i]!=null&&orders[i].getUserId()!=null){
                if(orders[i].getUserId().equals(id)){
                    orders[i]=null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        int step = 0;
        for (int i = 0; i < indexOrder; i++) {
            if(orders[i]!=null&&orders[i].getUserId()!=null){
                if(orders[i].getUserId().equals(id)){
                    step++;
                }
            }
        }
        Order[] orders1 = new Order[step];
        int index = 0;
        for (int i = 0; i < indexOrder; i++) {
            if(orders[i]!=null&&orders[i].getUserId()!=null){
                if(orders[i].getUserId().equals(id)){
                    orders1[index++]=orders[i];
                }
            }
        }

        return orders1;
    }
}
