package Labwork2.Ex4;

import java.util.Scanner;

public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("=====================");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Check out");
            System.out.println("=====================");

            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 1){
                System.out.print("Enter the cart's contents that you want to add: ");
                String contentAdd = scanner.nextLine();
                cart.addToCart(contentAdd);
            }
            else if(option == 2){
                if(cart.cartContentList.isEmpty() == true){
                    System.out.println("Empty!!! Cannot remove");
                    continue;
                }
                System.out.print("Enter the cart's contents that you want to remove: ");
                String contentRemove = scanner.nextLine();
                cart.removeFromCart(contentRemove);
            }
            else{
                cart.checkOut();
                break;
            }
        }
        scanner.close();
    }
}
