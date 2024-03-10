package jahongir.model;

import java.util.UUID;

public abstract class BaseModel {
    protected UUID id;
    protected UUID parentId;
    protected String name;

    protected BaseModel() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
