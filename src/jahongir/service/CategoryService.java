package jahongir.service;

import jahongir.model.Category;

import java.util.UUID;

public class CategoryService extends BaseService {
    private Category[] categories = new Category[100];
    private int indexCategories;

    public String[] getCategories() {
        String[] categories1;
        categories1 = new String[indexCategories];
        for (int i = 0; i < indexCategories; i++) {
            Category category = categories[i];
            String str = (i + 1) + ". " + category.getName() + " ";
            categories1[i] = str;

        }

        return categories1;
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
        if (!isExist(id)) {
            return null;
        }
        Category[] parentCategories = new Category[100];
        int index = 0;

        return parentCategories;
    }

    private boolean isExist(UUID name) {
        for (Category category : categories) {
            if (category != null && category.getId().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean validate(Category category) {
        return category != null && category.getName() != null || category.getName().isEmpty();
    }

    public Category getCategoryByName(String name) {
        for (Category category : categories) {
            if (category != null && category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }
}



