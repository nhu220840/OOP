package Labwork2.Ex4;

import java.util.ArrayList;

public class ShoppingCart {
    private String cartContents;
    ArrayList<String> cartContentList = new ArrayList<>();

    public ShoppingCart(){

    }

    public ShoppingCart(String cartContents){
        this.cartContents = cartContents;
    }

    public String getCartContents() {
        return cartContents;
    }

    public void setCartContents(String cartContents) {
        this.cartContents = cartContents;
    }

    public void addToCart(String cart){
        cartContentList.add(cart);
    }

    public void removeFromCart(String cart){
        // boolean found = false;
        // for(String item : cartContentList){
        //     if(cart.equals(item)){
        //         cartContentList.remove(cart);
        //         found = true;
        //         break;
        //     }
        // }
        // if(!found) System.out.println("Item is not in shopping cart");
        if(cartContentList.contains(cart) == true){
            cartContentList.remove(cart);
            System.out.println(cart + " is removed successfully!!!");
        }
        else{
            System.out.println("Item is not in shopping cart");
        }
    }

    public void checkOut(){
        if(cartContentList.size() != 0){
            System.out.println("Total product(s): " + cartContentList.size() + "\nDetail:");
            for(String product : cartContentList){
                System.out.println(product);
            }
        }
        System.out.println("Thank you for your purchase");
    }
}
