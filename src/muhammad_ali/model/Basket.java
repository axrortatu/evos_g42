package muhammad_ali.model;

import java.util.UUID;

public class Basket extends BaseModel {
    private UUID productId;
    private int cnt;
    private boolean active;
    private double deliveryPrice;
    private UUID userId;
}
