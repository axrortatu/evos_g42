package sardor.service;

import sardor.model.Category;
import sardor.model.Product;

import java.util.UUID;

public class CategoryService implements InterfaceService {
    private Category[] categories= new Category[100];
    private int index=0;

    public Category[] getCategories() {
        return categories;
    }

    private Object object;

    @Override
    public boolean add(Object object) {
        Category category=(Category) object;
        if (null == hasAdd(category.getName())) {
            categories[index++] = category;
            return true;
        }
        return false;
    }
    public Category hasAdd(String name) {
        for (Category category : categories) {
            if (category!=null&&category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

    @Override
    public void update(UUID uuid, String name) {
        for (Category category : categories) {
            if (category != null && category.getId().equals(uuid) && !category.getName().equals(name)) {
                category.setName(name);
            }
        }
    }

    @Override       public boolean delete(UUID id) {
        boolean deleteCategory = false;
        for (int i = 0 ; i < index ; i++){
            if (categories[i]!=null&&categories[i].getId().equals(id)){
                deleteCategory = true;
                categories[i] = null;
                for (int j = i ;  j < categories.length-1; j++ ){
                    categories [j] =categories[j+1];
                }
                categories[categories.length-1] = null;
            }
        }
        return deleteCategory;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }

}
