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
        return false;
    }

    @Override
    public boolean update(UUID id, Object object) {
        Product updateProduct = (Product) object;

        return false;
    }

    @Override
    public Object[] list(UUID id) {
        Product[] parentProducts = new Product[100];
        int index = 0;

        return parentProducts;
    }
}
