package muhammad_ali.model;

import java.util.UUID;

public abstract class BaseModel {
    protected UUID id;

    protected BaseModel() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
