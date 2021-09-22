/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehungryknight;

/** The Hungry Knight
 * CS 232-001
 *
 * @author Jailon Lawrence
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class TheHungryKnight {
    public static void main(String[] args) {
        String name;
        String ability;
        int quantity;
        double phesant_price = 15.15;
        double beef_stew = 3.79;
        double bread_price = 5.37;
        double fruit_price = 1.29;
        double tax;
        double sub = 0;
    /**
     * @param args the command line arguments
     */
    // Print Welcome Message to User
        System.out.println("Welcome to the Red Barons Inn and Tavern, Sir.  We are honored to serve the Kings men during these trying days");
        System.out.println("as our Kingdom readies itself for War.Your warhorses shall be looked after at our stable and your rooms prepared");
        System.out.println("for you once you have broken your fast with us for the night. Please free to encourage your men to eat and drink");
        System.out.println("as much as desired, Sir Knight. The Crown will pay for your meal and lodging for you and your horses, Sir. We");
        System.out.println("merely need to keep our accounting accurate for the Barons tax collector.\n");
        Scanner in = new Scanner(System.in);
        System.out.println("May I get your name for our records, Sir Knight? ");
        name = in.next();
        ability = in.next();
        
        // Get Plate Numbers & Prices
        System.out.println("\nHow many plates of Roast Pheasant will your party require us to prepare, Sir "+ name + " the " + ability + "?");
        quantity = in.nextInt();
        phesant_price = (phesant_price * quantity);
        sub = sub + phesant_price;
        
        
        System.out.println("How many bowls of Beef Stew will your party require us to prepare, Sir " + name + " the " + ability + "?");
        quantity = in.nextInt();
        beef_stew = (beef_stew * quantity);
        sub = sub + beef_stew;
        
        
        System.out.println("How many loafs of fine bread will your party require us to prepare, Sir " + name + " the " + ability + "?");
        quantity = in.nextInt();
        bread_price = (bread_price * quantity);
        sub = sub + bread_price;
        
        System.out.println("How many pieces of fresh fruit will your party require us to prepare, Sir " + name + " the " + ability + "?");
        quantity = in.nextInt();
        fruit_price = (fruit_price * quantity);
        sub = sub + fruit_price;
        
        
        // Get Subtotal & Tax and add them Together
        System.out.println("\nYour Sub-Total is: " + sub + " silver pieces.");
        
        tax = sub * 0.05;
        
        System.out.println("\nThe Baron’s 5% tax on your order is: " + tax + " silver pieces.");
        sub = sub + tax;
        
        // Print Final total
        System.out.println("\nThe final tally for the meal tonight is: " + sub + " silver pieces.");
        
        
        
    // TODO code application logic here
    }
    
}
