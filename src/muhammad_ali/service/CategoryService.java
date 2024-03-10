package muhammad_ali.service;

import muhammad_ali.model.Category;

import java.util.UUID;

public class CategoryService {
    private Category[] categories = new Category[100];
    private Category findCategoryById(UUID categoryId) {
        for (Category category : categories) {
            if (category != null && category.getId().equals(categoryId)) {
                return category;
            }
        }
        return null;
    }
    public boolean updateCategory(UUID categoryId, String name) {
        Category existingCategory = findCategoryById(categoryId);
        if (existingCategory != null) {
            existingCategory.setName(name);
            return true;
        } else {
            return false;
        }
    }


}
