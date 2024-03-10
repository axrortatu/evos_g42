package muhammad_ali.service;

import muhammad_ali.model.Product;

public class ProductService {
    private Product[] products=new Product[100];
    private int index=0;

    public boolean addProduct(Product product){
        if (hasProduct(product.getName())){
            products[index++]=product;
            return true;
        }
        return false;
    }

    private boolean hasProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)){
                return true;
            }
        }
        return false;
    }
}
