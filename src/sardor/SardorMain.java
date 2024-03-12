package sardor;

import sardor.model.Category;
import sardor.model.Product;
import sardor.model.User;
import sardor.service.CategoryService;
import sardor.service.OrderService;
import sardor.service.ProductService;
import sardor.service.UserService;

import java.util.Scanner;
import java.util.UUID;

public class SardorMain {


    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerId = new Scanner(System.in);

    public static void main(String[] args) {
        CategoryService categoryService = new CategoryService();
        OrderService orderService = new OrderService();
        ProductService productService = new ProductService();
        UserService userService = new UserService();
        int cod = 10;
        while (cod != 0) {
            System.out.println("1.Admin 2.User 3.Login");
            cod = scannerInt.nextInt();
            switch (cod) {
                case 1 -> {
                    System.out.println("Admin login :");
                    String adminLogin = scannerStr.nextLine();
                    System.out.println("Admin password :");
                    int adminPassword = scannerInt.nextInt();
                    if (adminLogin.equals("q") && adminPassword == 123) {//admin login "q" admin paroli "123".
                        int cod1 = 10;
                        while (cod1 != 0) {
                            System.out.println("1.Category 2.Product 0.Exit");
                            cod1 = scannerInt.nextInt();
                            switch (cod1) {
                                case 1 -> {
                                    int cod3 = 10;
                                    while (cod3 != 0) {
                                        System.out.println("1.Add Category 2.Delet Category 3.Update Category 4.List Category");
                                        cod3 = scannerInt.nextInt();
                                        switch (cod3) {
                                            case 1 -> {
                                                addCategory(categoryService);
                                            }
                                            case 2 -> {
                                                printCategory(categoryService);
                                                System.out.println("Delete category id : ");
                                                String deletId = scannerId.nextLine();

                                                categoryService.delete(UUID.fromString(deletId));
                                            }
                                            case 3 -> {
                                                printCategory(categoryService);
                                                System.out.println("Update category id : ");
                                                String updateId = scannerStr.next();
                                                System.out.println("New category name : ");
                                                String updateName = scannerId.next();
                                                categoryService.update(UUID.fromString(updateId), updateName);
                                            }
                                            case 4 -> {
                                                printCategory(categoryService);
                                            }
                                        }
                                    }
                                }
                                case 2 -> {
                                    int cod4 = 10;
                                    while (cod4 != 0) {
                                        System.out.println("1 Add Product 2 Delet Product 3 Update Product 4 List Product");
                                        cod4 = scannerInt.nextInt();
                                        switch (cod4) {
                                            case 1 -> {
                                                printCategory(categoryService);
                                                System.out.println("Category name : ");
                                                String name = scannerStr.nextLine();
                                                Category category = categoryService.hasAdd(name);
                                                if (category != null) {
                                                    addProduct(category, productService);
                                                } else System.out.println("Error !!!");
                                            }
                                            case 2 -> {
                                                printCategory(categoryService);
                                                System.out.println("Category name : ");
                                                String name = scannerStr.nextLine();
                                                Category category = categoryService.hasAdd(name);
                                                if (category != null) {
                                                    printProduct(productService, category.getId());
                                                    System.out.println("Delet product id");
                                                    productService.delete(UUID.fromString(scannerId.next()));
                                                } else System.out.println("Error!!!");
                                            }
                                            case 3 -> {
                                                printCategory(categoryService);
                                                System.out.println("Category name : ");
                                                String name = scannerStr.nextLine();
                                                Category category = categoryService.hasAdd(name);
                                                if (category != null) {
                                                    printProduct(productService, category.getId());
                                                    System.out.println("Update product id");
                                                    String updateId = scannerId.nextLine();
                                                    System.out.println("New product name");
                                                    String updatename = scannerStr.nextLine();
                                                    System.out.println("New product price");
                                                    double updatePrice = scannerInt.nextInt();
                                                    productService.update(UUID.fromString(updateId), updatename);
                                                    productService.updatePrice(UUID.fromString(updateId), updatePrice);
                                                } else System.out.println("Error!!!");
                                            }
                                            case 4 -> {
                                                printCategory(categoryService);
                                                System.out.println("Category name : ");
                                                String name = scannerStr.nextLine();
                                                Category category = categoryService.hasAdd(name);
                                                if (category != null) {
                                                    printProduct(productService, category.getId());
                                                } else System.out.println("Error!!!");
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
                case 2 -> {
                    int cod1 = 10;
                    while (cod1 != 0) {
                        System.out.println("1.Add user 2.Delet user 3. Update user 4.List user");
                        cod1=scannerInt.nextInt();
                        switch (cod1){
                            case 1->{
                                addUser(userService);
                            }
                            case 2->{
                                printUser(userService);
                                System.out.println("Delet user id ");
                                String deletId=scannerId.next();
                                userService.delete(UUID.fromString(deletId));
                            }
                            case 3->{
                                printUser(userService);
                                System.out.println("Update user id ");
                                String updateId=scannerId.next();
                                System.out.println("New user name");
                                userService.update(UUID.fromString(updateId),scannerStr.next());
                            }
                            case 4->{
                                printUser(userService);
                            }
                        }
                    }
                }
                case 3->{

                }
            }
        }
    }

    public static void addCategory(CategoryService categoryService) {// Category qoshish.
        Category category = new Category();
        System.out.println("Name Category");
        category.setName(scannerStr.next());
        if (categoryService.add(category)) {
            System.out.println("Successfully");
        } else System.out.println("Error!!!");
    }

    public static void printCategory(CategoryService categoryService) {
        Category category = new Category();
        for (Category category1 : categoryService.getCategories()) {
            if (category1 != null) {
                System.out.println("Category name : " + category1.getName() + " id : " + category1.getId());
            }
        }
    }

    public static void addProduct(Category category, ProductService productService) {
        Product product = new Product();
        System.out.println("Product name : ");
        String nameProduct = scannerStr.nextLine();
        System.out.println("Product price : ");
        double priceProduct = scannerInt.nextInt();
        product.setCategoryId(category.getId());
        product.setPrice(priceProduct);
        product.setName(nameProduct);
        if (productService.add(product)) {
            System.out.println("Successfully");
        } else System.out.println("Error!!!");
    }

    public static void printProduct(ProductService productService, UUID id) {
        Product product = new Product();
        for (Product product1 : productService.getProducts()) {
            if (product1 != null && product1.getId().equals(id)) {
                System.out.println("Product name : " + product1.getName() + "Product price : " + product1.getPrice() + " id : " + product1.getId());
            }
        }
    }
    public static void addUser(UserService userService){
        User user=new User();
        System.out.print("User name :");
        String addUser=scannerStr.nextLine();
        user.setUsername(addUser);
        if (userService.add(user)) {
            System.out.println("Successfully");
        }
        else System.out.println("Error!!!");
    }
    public static void printUser(UserService userService){
        for (User user:userService.getUsers()){
            if (user!=null){
                System.out.println("User name : "+user.getUsername()+" id : "+user.getId());

            }
        }
    }
}
