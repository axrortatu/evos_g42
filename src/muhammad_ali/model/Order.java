package muhammad_ali.model;

import java.util.UUID;

public class Order extends BaseModel {
    private UUID productId;
    private int cnt;
    private boolean competed;
    private double deliveryPrice;
    private UUID userId;
}
