package jahongir.service;

import jahongir.model.Product;

import java.util.UUID;

public class ProductService extends BaseService {
    private Product[] products = new Product[100];
    private int indexProducts;

    public Product[] getProducts() {
        return products;
    }

    @Override
    public boolean add(Object object) {
        Product product = (Product) object;

        return false;
    }

    @Override
    public boolean delete(UUID id) {
        boolean check = false;
        for (int i = 0; i < indexProducts - 1; i++) {
            if (products[i].getId().equals(id)) {
                check = true;
            }
            if (check) {
                products[i] = products[i + 1];
            }
        }
        if (check || products[indexProducts].getId().equals(id)) {
            indexProducts--;
            return true;
        }
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        Product updateProduct = (Product) object;
        for (int i = 0; i < indexProducts; i++) {
            if (products[i].getId().equals(id)) {
                products[i].setName(updateProduct.getName());
                return true;
            }
        }

        return false;
    }

    @Override
    public Object[] list(UUID id) {
        Product[] parentProducts = new Product[100];
        int index = 0;

        for(Product product: products){
            if(product.getCategoryId().equals(id)){
                parentProducts[index++] = product;
            }
        }

        return parentProducts;
    }
}
