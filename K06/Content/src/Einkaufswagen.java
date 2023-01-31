import java.util.List;

public class Einkaufswagen {
    List<Integer> shoppingCart;

    public void addToCart(int a){
        shoppingCart.add(a);
        deleteBierFromShoppingCart(a);
    }

    public void deleteBierFromShoppingCart(int a){
        shoppingCart.remove(a);
    }
}
