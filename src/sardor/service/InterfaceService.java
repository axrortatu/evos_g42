package sardor.service;

import java.util.UUID;

public interface InterfaceService {
    boolean add(Object object);

    void update(UUID uuid,String name);

    boolean delete(UUID id);

    Object[] list(UUID id);
}
