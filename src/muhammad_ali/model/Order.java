package muhammad_ali.model;

import java.util.UUID;

public class Order extends BaseModel {
    private UUID productId;
    private int cnt;
    private boolean competed;
    private double deliveryPrice;
    private UUID userId;

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public boolean isCompeted() {
        return competed;
    }

    public void setCompeted(boolean competed) {
        this.competed = competed;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
