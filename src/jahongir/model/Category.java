package jahongir.model;

import java.util.UUID;


public class Category extends BaseModel {
    private String name;
    
    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
  
}
