package task5;

public class InventTest {
    public static void main(String[] args) {
        Inventory someShit = new Inventory();
        Product bread = new Product("bread", 5,5);
        Product potato = new Product("potato", 0.5,50);
        Product coffee = new Product("coffee", 10,10);

        someShit.addProductToInventory(bread,potato,coffee);

        System.out.println(someShit.getAverage());
        System.out.println(someShit.getMostExpensive());
        System.out.println(someShit.getProductsLessThan(10));
    }
}
