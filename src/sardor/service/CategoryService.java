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
        boolean deleteCategory=false;
        for (int i = 0 ; i < index ; i++){
            if (categories[i].getId().equals(id)){
                deleteCategory=true;
                categories=null;
                for (int j = i ;  j < categories.length-1; j++ ){
                    categories[j]=categories[j+1];
                }
                categories[categories.length-1]=null;
            }
        }
        return deleteCategory;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }

}
