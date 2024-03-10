package muhammad_ali.service;

import muhammad_ali.model.Category;

import javax.print.DocFlavor;
import java.util.UUID;

public class CategoryService {
    private Category[] categories = new Category[100];

    private int index=0;
    public boolean addCategory(Category category){
        if (!hasCategory(category.getName())){
            categories[index++]=category;
            return true;
        }
        return false;
    }
    public boolean hasCategory(String categoryName){
        for (Category category : categories) {
            if (category.getName().equals(categoryName)){
                return true;
            }
        }
        return false;
    }



}
