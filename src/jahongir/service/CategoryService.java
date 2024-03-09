package jahongir.service;

import jahongir.model.Category;

import javax.sound.midi.VoiceStatus;
import java.util.UUID;

public class CategoryService {
    private Category[] categories = new Category[100];
    private int indexCategories = 0;


    public boolean deleteCategory(UUID id) {
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
}



