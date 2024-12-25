package view;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String name;
    private final boolean isCatalog; // если true это каталог, если продукт false
    private List<Product> productList = new ArrayList<>();


    public Product(String name, boolean isCatalog) {
        this.name = name;
        this.isCatalog = isCatalog;

    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public boolean isCatalog() {
        return isCatalog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        for (Product product : productList){
            sb.append("\n").append(product.getName());
        }
        
        return sb.toString();
    }


    //todo доработать чтобы можно было передать путь со слешем
    public Product getProductByPath(String path) {
        if (isCatalog) {
            path.split("/");
            for (Product product : productList) {
                if (product.getName().equals(path)) {
                    return product;
                }
            }
            for (Product product1 : productList){
                if (product1.getName().equals(path)){
                    return product1;
                }
            }
        }
        return null;
    }
}
