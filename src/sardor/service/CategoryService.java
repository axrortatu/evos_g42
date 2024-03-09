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
    public void delete(UUID id) {
        int index=0;
        for (int i = 0; i < index; i++) {
            if(categories[i]!=null&&categories[i].getId().equals(id)){
                categories[i]=null;
                index=i;
            }
        }
        for (int i = index; i < index-1; i++) {
            categories[i]=categories[i+1];
        }

    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }

}
