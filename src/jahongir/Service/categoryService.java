package jahongir.Service;

import jahongir.model.BaseModel;
import jahongir.model.Category;

public class categoryService extends BaseModel {
    private Category[] categories = new Category[100];
    private int indexCategories;

    public Category[] getCategories() {
        return categories;
    }

    public boolean add(String name) {

        return false;
    }
    private boolean validate(Object object) {

        return false;
    }


    private boolean isExist(String name) {

        return false;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }
}

