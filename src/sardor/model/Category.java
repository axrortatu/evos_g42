package sardor.model;

import java.util.UUID;

public class Category extends BaseModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public UUID getId() {
        return super.getId();
    }
}
