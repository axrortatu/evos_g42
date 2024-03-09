package sardor.service;

import java.util.UUID;

public interface InterfaceService {
    boolean add(Object object);

    Object update(Object object);

    void delete(UUID id);

    Object[] list(UUID id);
}
