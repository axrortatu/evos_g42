package jahongir.Service;


import java.util.UUID;

import java.util.UUID;

public abstract class BaseService implements BaseInterface {
    public abstract boolean add(Object object);
    public abstract boolean delete(UUID id);
    public abstract Object[] list(UUID id);

    protected abstract boolean validate(Object object);
}