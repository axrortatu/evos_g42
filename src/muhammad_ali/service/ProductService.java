package muhammad_ali.service;

import muhammad_ali.model.Product;

import java.util.UUID;

public class ProductService {
    private Product[] products=new Product[100];
    private int index=0;

    public boolean addProduct(Product product){
        if (!hasProduct(product.getName())){
            products[index++]=product;
            return true;
        }
        return false;
    }

    private boolean hasProduct(String productName) {
        for (Product product : products) {
            if (product != null && product.getName().equals(productName)){
                return true;
            }
        }
        return false;
    }
    public Product[] getProducts(){
        return products;
    }
    public void updateProduct(UUID Id, String name, double price){
        Product existingProduct = getProductById(Id);
        if (existingProduct != null){
            existingProduct.setName(name);
            existingProduct.setPrice(price);
        }
    }
    public Product getProductById(UUID Id){
        for (Product product : products){
            if (product != null && product.getId().equals(Id)){
                return product;
            }
        }
        return null;
    }
}
