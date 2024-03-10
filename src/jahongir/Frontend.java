package jahongir;

public interface Frontend {
    String MainMenu =
            "1. Create Account \t" +
            "2. Login \t" +
            "3. Login as Administrator \t" +
            "0. Exit \n" +
            "Choose option: ";

    String LoginMenu =
            "1. Order \t" +
            "2. Basket \t" +
            "3. My Current Orders \t" +
            "4. My Orders History \t" +
            "0. Exit \t" +
            "Choose option: ";

    String AdministratorMenu =
            "1. Menu \t" +
            "2. Product Details \t" +
            "3. Category Details \t" +
            "4. Current Orders \t" +
            "5. Orders History \t" +
            "0. Exit \t" +
            "Chose option: ";

    String ProductMenu =
            "1. Add Product \t" +
            "2. Update Product \t" +
            "3. Delete Product \t" +
            "4. Set Product to Category \t" +
            "0. Exit \t" +
            "Chose option: ";

    String CategoryMenu =
            "1. Add Category \t" +
            "2. Update Category \t" +
            "3. Delete Category \t" +
            "4. Show All Categories \t" +
            "0. Exit \t" +
            "Chose option: ";



}

