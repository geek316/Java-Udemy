package learningcollectionframework.practice.arraylist;

import java.util.ArrayList;

public class Level4MediumHardProblem2 {
    static void main() {

//        20. Shopping Cart
//        Create: ArrayList<String> cart
//        Operations:
//        Add item
//        Remove item
//        Display cart
//        Search item
//        Example:
//        1. Add
//        2. Remove
//        3. Search
//        4. Display

        ArrayList<String> cart = new ArrayList<>();

        ShoppingCart shoppingCart = new ShoppingCart(cart);

        shoppingCart.addCart("Milk");
        shoppingCart.addCart("Noodles");
        shoppingCart.addCart("Tissues");

        System.out.println("Displaying cart after adding items: " + shoppingCart.displayCart());

        shoppingCart.removeCart("Tissues");
        System.out.println("Displaying item after removing item: " + shoppingCart.displayCart());

        System.out.println("Is Tissue present in cart: " + shoppingCart.searchCart("Tissues"));

    }
}

class ShoppingCart {

    ArrayList<String> cart;

    public ShoppingCart(ArrayList<String> cart) {
        this.cart = cart;
    }

    public void addCart(String item) {
        cart.add(item);
    }

    public void removeCart(String item) {
        cart.remove(item);
    }

    public ArrayList<String> displayCart() {
        return cart;
    }

    public boolean searchCart(String item) {
        return cart.contains(item);
    }

}
