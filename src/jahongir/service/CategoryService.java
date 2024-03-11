



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
        int count = 0;
        for (int i = 0; i < indexCategories; i++) {
            if (categories[i].getId() != null && categories[i].getId().equals(id)) {
                count++;
            }
        }
        Category[] result = new Category[count];
        int index = 0;
        for (int i = 0; i < indexCategories; i++) {
            if (categories[i].getId() != null && categories[i].getId().equals(id)) {
                result[index++] = categories[i];
            }
        }
        return result;
    }


    private boolean isExist(UUID name) {
        for (int i = 0; i < indexCategories; i++) {
            if (categories[i].getId().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean validate(Category category) {
        return category != null && category.getName() != null || category.getName().isEmpty() ;
    }
}


