package jahongir.model;

import java.util.UUID;

public class Order extends BaseModel {
    private UUID userId;
    private UUID productId;
    private int countProduct;
    private double deliveryPrice;
    private boolean competed;

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public int getCnt() {
        return countProduct;
    }

    public void setCnt(int cnt) {
        this.countProduct = countProduct;
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
