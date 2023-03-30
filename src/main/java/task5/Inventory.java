package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    //Product product = new Product();
    private List<Product> productsList;

    public Inventory(){
        productsList = new ArrayList<>();
    }

    public void addProductToInventory(Product...products){
        this.productsList.addAll(Arrays.asList(products));
    }

    public List<Product> getProductsLessThan(double price){
        return this.productsList
                .stream()
                .filter(product -> product.getPrice() < price)
                .collect(Collectors.toList());
    }

    public List<Product> getProductsWithQuantityGreater(int units) {
        return this.productsList
                .stream()
                .filter(product -> product.getQuantity() >= units)
                .collect(Collectors.toList());
    }

    public double totalPrice() {
        return productsList
                .stream()
                .mapToDouble(product -> product.getPrice())
                .sum();
    }

    public double getAverage() {
        return this.productsList
                .stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
    }

    public Product getMostExpensive() {
        return this.productsList
                .stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

}
