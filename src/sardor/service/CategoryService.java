package sardor.service;

import sardor.model.Category;

import java.util.UUID;

public class CategoryService implements InterfaceService {
    private Category[] categories= new Category[100];
    private int index=0;
    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public Object update(Object object) {
        return null;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }

}
