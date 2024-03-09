package jahongir.Service;

import jahongir.model.Category;

import java.util.UUID;

public class categoryService extends BaseService {
    private Category[] categories = new Category[100];
    private int indexCategories;

    public Category[] getCategories() {
        return categories;
    }

    @Override
    public boolean add(Object object) {
        if (validate(object)) {
            Category category = (Category) object;
            if (indexCategories < categories.length) {
                categories[indexCategories++] = category;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        return false;
    }

    @Override
    public Object[] list(UUID id) {
        return new Object[0];
    }


    @Override
    protected boolean validate(Object object) {

        return false;
    }



}

