/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestax;

import java.util.Scanner;

/**
 *
 * @author New User
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double TAX_RATE = 0.55;
        double price;
        double tax;
        double total;
        String item;
        // Create scanner object to read from the kryboard.
        Scanner keyboard = new Scanner(System.in);
        // Display propmts and get input
        System.out.print("Item description: ");
        item = keyboard.nextLine();
         System.out.print("Item price: $");
        price= keyboard.nextDouble();
        //perform calculations.
        tax = price * TAX_RATE;
        System.out.print(tax);
        total = price + tax;
        System.out.println(item + "$");
        System.out.println(price);
        System.out.print("Tax $");
        System.out.println(tax);
        System.out.print("Total $ ");
        System.out.println(total);
    }

}
