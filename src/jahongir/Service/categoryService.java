package jahongir.Service;

import jahongir.model.BaseModel;
import jahongir.model.Category;

public class categoryService extends BaseModel {
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
    private boolean validate(Object object) {

        return false;
    }


    private boolean isExist(String name) {

        return false;
    }
}

