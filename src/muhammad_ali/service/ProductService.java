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
    public void deleteProduct(UUID id){
        for (int i = 0; i <index ; i++) {
          if (products[i]!=null&&products[i].getId().equals(id)){
              for (int j = i; j <index ; j++) {
                products[j]=products[j+1];
              }
              products[index-1]=null;
              index--;
              return;
          }
        }

    }
}
