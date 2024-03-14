


package jahongir.service;

import jahongir.model.Category;

import java.util.UUID;

public class CategoryService extends BaseService {
    private Category[] categories = new Category[100];
    private int indexCategories;

    public Category[] getCategories() {
        return categories;
    }

    @Override
    public boolean add(Object object) {
        Category category = (Category) object;
        if (validate(category)) {
            categories[indexCategories++] = category;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        boolean check = false;
        for (int i = 0; i < indexCategories - 1; i++) {
            if (categories[i].getId().equals(id)) {
                check = true;
            }
            if (check) {
                categories[i] = categories[i + 1];
            }
        }
        if (check || categories[indexCategories].getId().equals(id)) {
            indexCategories--;
            return true;
        }
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        Category updateCategory = (Category) object;
        for (int i = 0; i < indexCategories; i++) {
            if (categories[i].getId().equals(id)) {
                categories[i].setName(updateCategory.getName());
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] list(UUID id) {


        return categories;
    }

    private boolean isExist(String name) {
        for (Category category : categories) {
            if (category != null && category.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean validate(Category category) {
        return ( category != null && !category.getName().isEmpty() || !isExist(category.getName()) );
    }

    public Category getCategoryByName(String name) {
        for (Category category : categories) {
            if (category != null && category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

    // getCategoryById
    public Category getCategoryById(UUID id) {
        for (Category category : categories) {
            if (category != null && category.getId().equals(id)) {
                return category;
            }
        }
        return null;
    }
}



