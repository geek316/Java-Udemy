package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level5HardProblem4 {
    static void main() {

//        26. Inventory Management System
//        Create:
//        class Product {
//            int id;
//            String name;
//            int quantity;
//        }
//        Store products in: ArrayList<Product>
//        Features:
//        Add
//        Update
//        Delete
//        Search
//        Low stock warning

        ArrayList<Product> appleProducts = new ArrayList<>();
        appleProducts.add(new Product(1,"iPhone", 100));
        appleProducts.add(new Product(2,"iPad", 80));
        appleProducts.add(new Product(3,"MacBook", 230));
        appleProducts.add(new Product(4,"MacBook Pro", 560));

        System.out.println("\nProducts in Inventory:");
        for(Product product: appleProducts){
            System.out.println(product);
        }

        ArrayList<Product> accessories = new ArrayList<>();
        accessories.add(new Product(5, "EarPods", 230));

        ArrayList<Product> accessoriesLot2 = new ArrayList<>();
        accessories.add(new Product(5, "EarPods", 170));

        InventoryManagementSystem system = new InventoryManagementSystem(appleProducts);
        system.addInventory(accessories);
        system.updateInventory(accessoriesLot2);
        system.deleteInventory(5);
        System.out.println("\nMatching value for Id:2 is:\n" + system.searchInventory(2));
        System.out.println("\nStock of item id:2 is low?: " + system.lowStockWarning(2));

    }
}

class InventoryManagementSystem {

    ArrayList<Product> productList;

    public InventoryManagementSystem(ArrayList<Product> list){
        productList = list;
    }

    public void addInventory(ArrayList<Product> list){
        productList.addAll(list);
        System.out.println("\nInventory after add: ");
        for(Product product : productList){
            System.out.println(product);
        }
    }

    public void updateInventory(ArrayList<Product> list){

        for (Product value : list) {
            for (Product product : productList) {
                if (value.id == product.id) {
                    product.quantity = value.quantity;
                }
            }
        }
        System.out.println("\nInventory after update: ");
        for(Product product: productList){
            System.out.println(product);
        }
    }

    public void deleteInventory(int id){

        for (Product value : productList) {
            if(value.id == id){
                productList.remove(value);
            }
        }
        System.out.println("\nInventory after deletion: ");
        for(Product product: productList){
            System.out.println(product);
        }
    }

    public Product searchInventory(int id){
        Product matchingValue = null;
        for ( Product value : productList){
            if(value.id == id){
                matchingValue = value;
            }
        }
        return matchingValue;
    }

    public boolean lowStockWarning(int id){
        boolean isLow = true;
        for(Product val : productList){
            if(val.id == id){
                if(val.quantity>100){
                    isLow = false;
                } else {
                    isLow = true;
                }
            }
        }
        return isLow;
    }
}

class Product {

    int id;
    String name;
    int quantity;

    public Product(int id, String name, int qty){
        this.id = id;
        this.name = name;
        this.quantity = qty;
    }

    public String toString() {
        return "Id: "+id+", Name: "+name+", Quantity: "+quantity;
    }
}
