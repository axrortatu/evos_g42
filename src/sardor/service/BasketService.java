package sardor.service;

import sardor.model.Basket;

import java.util.UUID;

public class BasketService implements InterfaceService{

    private Basket[] baskets =new Basket[100];
    private int index=0;

    @Override
    public boolean add(Object object) {
      Basket basket=  (Basket) object;
      baskets[index++] = basket;
      return true;
    }

    @Override
    public void update(UUID uuid, String name) {
     return;
    }

    @Override
    public boolean delete(UUID userId) {
        for (int i = 0; i < index ; i ++){
            if (baskets[i].getUserId().equals(userId)){
                baskets[i] = null;
            }
        }
        return true;
    }

    @Override
    public Object[] list(UUID userId) {
        int basketIndex = 0;
        for (Basket basket : baskets){
            if (basket.getUserId().equals(userId)){
                basketIndex ++ ;
            }
        }
        Basket[] getBasket = new Basket[basketIndex];
        basketIndex = 0;
        for (Basket basket : baskets){
            if (basket.getUserId().equals(userId)){
                getBasket[basketIndex ++] = basket ;
            }
        }
        return getBasket;
    }

    public double getBasketDeliveryPrice(UUID userId){
       double allDeliveryPrice = 0;
       for (Basket basket : baskets){
           if (basket.getUserId().equals(userId)){
               allDeliveryPrice += basket.getDeliveryPrice();
           }
       }
       return allDeliveryPrice;
    }
}
