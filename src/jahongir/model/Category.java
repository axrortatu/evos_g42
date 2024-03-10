package jahongir.model;

import java.util.UUID;


public class Category extends BaseModel {
    
    public Category(String name) {
        super.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + super.name + '\'' +
                '}';
    }
  
}
