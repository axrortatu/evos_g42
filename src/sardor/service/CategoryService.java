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

    public Object update(Object object, String name) {
        Category updateCategory = (Category) object;
        if(hasCategory(updateCategory) != null){
            updateCategory.setName(name);
            return updateCategory;
        }


        return null;
    }

    private Category hasCategory(Category category){
        for(int i = 0; i < index; i++){
            if(categories[i] != null && categories[i].getName().equals(category.getName())){
                return categories[i];
            }
        }
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
