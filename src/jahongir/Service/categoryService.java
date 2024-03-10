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

        if (validate(category)) {}

        return false;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        Category updateCategory = (Category) object;

        return false;
    }

    @Override
    public Object[] list(UUID id) {
        Category[] parentCategories = new Category[100];
        int index = 0;

        return parentCategories;
    }

    private boolean validate(Category category) {

        return false;
    }

}

