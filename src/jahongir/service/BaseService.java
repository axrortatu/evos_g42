package jahongir.service;

import java.util.UUID;

public abstract class BaseService implements BaseInterface {
    public abstract boolean add(Object object);
    public abstract boolean delete(UUID id);
    public abstract boolean update(UUID id, Object object);
    public abstract Object[] list(UUID id);
}