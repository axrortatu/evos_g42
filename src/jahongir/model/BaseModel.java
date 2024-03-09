package jahongir.model;

import java.util.UUID;

public abstract class BaseModel {
    protected UUID id;

    protected BaseModel() {
        this.id = UUID.randomUUID();
    }
}