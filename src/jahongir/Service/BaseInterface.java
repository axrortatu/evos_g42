package jahongir.Service;

import java.util.UUID;

public interface BaseInterface {
    boolean add(Object object);
    boolean delete(UUID id);
    Object[] list(UUID id);
}