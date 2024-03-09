package jahongir.service;

import sardor.model.Category;

public class CategoryService {
    private Category[] categories = new Category[100];

    private int index;

    public Category[] getCategories() {
        return categories;
    }
}
