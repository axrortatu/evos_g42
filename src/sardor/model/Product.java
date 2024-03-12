package sardor.model;

import java.util.UUID;

public class Product extends BaseModel {
    private String name;
    private double price;
    private UUID categoryId;

    public String getName() {
        return name;
    }

    @Override
    public UUID getId() {
        return super.getId();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                '}';
    }
}
