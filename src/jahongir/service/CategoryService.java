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
        boolean check=false;
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
        int index = 0;
        for (int i = 0; i < indexCategories; i++) {
            if (categories[i] != null && categories[i].getId() != null) {
                if (categories[i].getId().equals(id)) {
                    index++;
                }
            }
        }
         Category[] categories1 = new Category[index];
        int res = 0;
        for(int i= 0; i<indexCategories; i++){
            if(categories[i]!=null&&categories[i].getId()!=null){
                if(categories[i].getId().equals(id)){
                    categories1[res++]=categories[i];
                }
            }
        }
        return categories1;

    }


    private boolean validate(Category category) {

        return false;
    }

}

