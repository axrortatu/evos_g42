package muhammad_ali;

import muhammad_ali.model.Category;
import muhammad_ali.model.Order;
import muhammad_ali.model.Product;
import muhammad_ali.model.User;
import muhammad_ali.service.CategoryService;
import muhammad_ali.service.OrderService;
import muhammad_ali.service.ProductService;
import muhammad_ali.service.UserService;


import java.util.Scanner;
import java.util.UUID;


public class MuhammadAliMain {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) {
        UserService userService = new UserService();
        CategoryService categoryService = new CategoryService();
        ProductService productService = new ProductService();
        int option1 = 10;
        while (option1 != 0){
            System.out.println("1.User 2.Login User and Order 3.Category 4.Product 5.History 0.Exit");
            option1 = scannerInt.nextInt();
            switch (option1){
                case 1 -> {
                    int option2 = 10;
                    while (option2 != 0){
                        System.out.println("1.Add user 2.Delete user 3.Show users 0.Exit");
                        option2 = scannerInt.nextInt();
                        switch (option2){
                            case 1 ->{
                                User user = new User();
                                System.out.println("Enter user name : ");
                                user.setUsername(scannerStr.nextLine());
                                if (userService.addUser(user)) {
                                    System.out.println("User has been added successfully");
                                }else{
                                    System.out.println("This user already exists !!!");
                                }
                            }
                            case 2 ->{
                                System.out.println("Enter userName : ");
                                String name = scannerStr.nextLine();
                                userService.deleteUser(name);
                            }
                            case 3 ->{
                                User[] users = userService.getUsers();
                                printUsers(users);
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Enter userName :");
                    String userName = scannerStr.nextLine();
                    if (userService.login(userName) != null){
                        int option3 = 10;
                        System.out.println("1.Order 2.Show Basket 3.Confirm");
                        option3 = scannerInt.nextInt();
                        switch (option3){
                            case 1 -> {
                                Order order = new Order();

                            }
                        }
                    }
                }
                case 3 -> {
                    int option4 = 10;
                    while (option4 != 0){
                        System.out.println("1.Add category 2.Delete Category 3.Update Category 4.Category List 0.Exit");
                        option4 = scannerInt.nextInt();
                        switch (option4){
                            case 1 -> {
                                Category category = new Category();
                                System.out.println("Enter name");
                                category.setName(scannerStr.nextLine());
                                if (categoryService.addCategory(category)) {
                                    System.out.println("Successfully");
                                }else{
                                    System.out.println("Error");
                                }
                            }
                            case 2 -> {
                                Category[] categories =  categoryService.getCategories();
                                printCategories(categories);
                                System.out.println("Enter id :");
                                String Id = scannerStr.nextLine();
                                categoryService.deleteCategory(UUID.fromString(Id));
                            }
                            case 3 -> {
                                Category[] categories =  categoryService.getCategories();
                                printCategories(categories);
                                System.out.println("Enter id :");
                                String Id = scannerStr.nextLine();
                                System.out.println("Enter new name : ");
                                String name = scannerStr.nextLine();
                                categoryService.updateCategory(UUID.fromString(Id), name);
                            }
                            case 4 -> {
                                Category[] categories =  categoryService.getCategories();
                                printCategories(categories);
                            }
                        }
                    }
                }
                case 4 -> {
                    int option5 = 10;
                    while (option5 != 0){
                        System.out.println("1.Add product 2.Delete Product 3.Update Product 4.Product List 0.Exit");
                        option5 = scannerInt.nextInt();
                        switch (option5){
                            case 1 -> {
                                Category[] categories =  categoryService.getCategories();
                                printCategories(categories);
                                Product product = new Product();
                                System.out.println("Enter category Id : ");
                                String categoryId = scannerStr.nextLine();
                                product.setCategoryId(UUID.fromString(categoryId));
                                System.out.println("Enter name : ");
                                product.setName(scannerStr.nextLine());
                                System.out.println("Enter price : ");
                                product.setPrice(scannerInt.nextDouble());
                                if (productService.addProduct(product)) {
                                    System.out.println("Successfully");
                                }else{
                                    System.out.println("Error");
                                }
                            }
                            case 2 -> {
                                Product[] products = productService.getProducts();
                                printProduct(products);
                                System.out.println("Enter Id : ");
                                String productId = scannerStr.nextLine();
                                productService.deleteProduct(UUID.fromString(productId));
                            }
                            case 3 ->{
                                Product[] products = productService.getProducts();
                                printProduct(products);
                                System.out.println("Enter id : ");
                                String productId = scannerStr.nextLine();
                                System.out.println("Enter new name : ");
                                String name = scannerStr.nextLine();
                                System.out.println("Enter price : ");
                                double price = scannerInt.nextDouble();
                                productService.updateProduct(UUID.fromString(productId), name, price);
                            }
                            case 4 -> {
                                Product[] products = productService.getProducts();
                                printProduct(products);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void printUsers(User[] users){
        for (User user : users){
            if (user != null){
                System.out.println(user.getUsername() + "  Id : " + user.getId());
            }
        }
    }
    public static void printCategories(Category[] categories){
        for (Category category : categories) {
            if (category != null){
                System.out.println(category.getName() + "  Id : " + category.getId());
            }
        }
    }
    public static void printProduct(Product[] products){
        for (Product product : products) {
            if (product != null){
                System.out.println(product.getName() + "  Id : " + product.getId());
            }
        }
    }

}
