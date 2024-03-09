package muhammad_ali.model;

import java.util.UUID;

public class Basket extends BaseModel {
    private UUID productId;
    private int cnt;
    private boolean active;
    private double deliveryPrice;
    private UUID userId;

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public int getCnt() {
        return cnt;
    }

    public UUID getProductId() {
        return productId;
    }
}
