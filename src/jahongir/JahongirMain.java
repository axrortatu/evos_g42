package jahongir;

import jahongir.service.*;

import java.util.Scanner;

public class JahongirMain implements Frontend {
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanDouble = new Scanner(System.in);
    static Scanner scanStr = new Scanner(System.in);

    static int getOptionMainManu() {
        System.out.print(MainMenu);

        return scanInt.nextInt();
    }

    static int getOptionLoginMenu() {
        System.out.print(LoginMenu);

        return scanInt.nextInt();
    }

    static int getOptionAdministratorMenu() {
        System.out.print(AdministratorMenu);

        return scanInt.nextInt();
    }

    static int getOptionProductMenu() {
        System.out.print(ProductMenu);

        return scanInt.nextInt();
    }

    static int getOptionCategoryMenu() {
        System.out.print(CategoryMenu);

        return scanInt.nextInt();
    }

    public static void main(String[] args) {
        BasketService basketService = new BasketService();
        CategoryService categoryService = new CategoryService();
        OrderService orderService = new OrderService();
        ProductService productService = new ProductService();
        UserService userService = new UserService();

        int optionMainMenu = -1;

        while (optionMainMenu != 0) {
            optionMainMenu = getOptionMainManu();

            switch (optionMainMenu) {
                // CREATE USER
                case 1 -> {}
                // LOGIN AS USER
                case 2 -> {
                    int optionLoginMenu = -1;

                    while (optionLoginMenu != 0) {
                        optionMainMenu = getOptionLoginMenu();

                        switch (optionLoginMenu) {
                            // ORDER
                            case 1 -> {}
                            // BASKET
                            case 2 -> {}
                            // CURRENT ORDERS
                            case 3 -> {}
                            // ORDERS HISTORY
                            case 4 -> {}
                        }
                    }
                }
                // LOGIN AS ADMINISTRATOR
                case 3 -> {
                    int optionAdministratorMenu = -1;

                    while (optionAdministratorMenu != 0) {
                        optionAdministratorMenu = getOptionAdministratorMenu();

                        switch (optionAdministratorMenu) {
                            // MENU
                            case 1 -> {}
                            // PRODUCT DETAILS
                            case 2 -> {
                                int optionProductMenu = -1;

                                while (optionProductMenu != 0) {
                                    optionProductMenu = getOptionProductMenu();

                                    switch (optionProductMenu) {
                                        // CREATE PRODUCT
                                        case 1 -> {}
                                        // UPDATE PRODUCT
                                        case 2 -> {}
                                        // DELETE PRODUCT
                                        case 3 -> {}
                                        // SET PRODUCT TO CATEGORY
                                        case 4 -> {}
                                    }

                                }

                            }
                            // CATEGORY DETAILS
                            case 3 -> {
                                int optionCategoryMenu = -1;

                                while (optionCategoryMenu != 0) {
                                    optionCategoryMenu = getOptionCategoryMenu();

                                    switch (optionCategoryMenu) {
                                        // CREATE CATEGORY
                                        case 1 -> {}
                                        // UPDATE CATEGORY
                                        case 2 -> {}
                                        // DELETE CATEGORY
                                        case 3 -> {}
                                        // PRINT ALL CATEGORIES
                                        case 4 -> {}
                                    }

                                }

                            }
                            // CURRENT ORDERS
                            case 4 -> {}
                            // ORDERS HISTORY
                            case 5 -> {}
                        }
                    }
                }
            }
        }

    }
}
