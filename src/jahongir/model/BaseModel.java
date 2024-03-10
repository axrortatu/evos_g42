package jahongir.model;

import java.util.UUID;

public class BaseModel {
    protected UUID id;
    protected UUID parentId;
    protected String name;

    protected BaseModel() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
