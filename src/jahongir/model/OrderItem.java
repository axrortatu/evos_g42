package jahongir.model;

import java.util.UUID;

public class OrderItem extends BaseModel {
    private UUID userId;
    private UUID productId;
    private UUID basketId;
    private int countProduct;
    private boolean competed;

    public OrderItem(int countProduct) {
        this.countProduct = countProduct;
    }

    public UUID getBasketId() {
        return basketId;
    }

    public void setBasketId(UUID basketId) {
        this.basketId = basketId;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }

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

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
