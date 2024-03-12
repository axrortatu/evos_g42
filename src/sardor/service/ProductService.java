package sardor.service;

import sardor.model.Product;

import java.util.UUID;

public class ProductService implements InterfaceService {
    private Product[] products = new Product[1000];
    private int indexProduct = 0;

    public Product[] getProducts() {
        return products;
    }

    @Override
    public boolean add(Object object) {
        Product product = (Product) object;
        if (validateProduct(product)) {
            products[indexProduct++] = product;
            return true;
        }
        return false;
    }

    public boolean validateProduct(Product newProduct) {
        if (newProduct == null) {
            return false;
        }
        for (Product product : products) {
            if (product != null) {
                if (product.getName().equals(newProduct.getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void update(UUID uuid, String name) {
        for (Product product : products) {
            if (product != null && product.getId().equals(uuid) && !product.getName().equals(name)) {
                product.setName(name);
            }
        }
    }

    public boolean updatePrice(UUID id, double price) {
        for (Product product : products) {
            if (product != null && product.getId().equals(id) && product.getPrice() != price) {
                product.setPrice(price);
                return true;
            }
        }
        return false;
    }

    public int getProductIndexByProductId(UUID productId) {
        for (int i = 0; i < indexProduct; i++) {
            if (products[i] != null && products[i].getId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }


    public boolean isExistProduct(UUID id) {
        for (Product product : products) {
            if (product != null && product.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(UUID id) {
        if (!isExistProduct(id)) {
            return false;
        }
        int indexDelete = getProductIndexByProductId(id);

        if (indexDelete == -1) {
            return false;
        }
        for (int i = indexDelete; i < indexProduct; i++) {
            if (products[i] != null) {
                products[i] = products[i + 1];
            }

        }
        if(products[indexProduct - 1].equals(products[indexProduct - 2])){
            products[indexProduct - 1] = null;
        }

        indexProduct--;
        return true;
    }

    @Override
    public Object[] list(UUID id) {
        Product[] categoryProduct = new Product[100];
        int index = 0;
        for (Product product : products) {
            if (product != null && product.getCategoryId() != null) {
                if (product.getCategoryId().equals(id)) {
                    categoryProduct[index ++] = product;
                }
            }

        }
        return categoryProduct;
    }
}
