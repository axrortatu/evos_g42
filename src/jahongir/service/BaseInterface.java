package jahongir.service;

import java.util.UUID;

public interface BaseInterface {
    boolean add(Object object);
    boolean delete(UUID id);
    boolean update(UUID id, Object object);
    Object[] list(UUID id);


}