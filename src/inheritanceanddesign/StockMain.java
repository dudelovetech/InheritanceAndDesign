/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

import java.util.Scanner;

/**
 * This program tracks the user's purchases of two stocks, computing and reporting
 * which stock was more profitable.
 * 
 * @author donny
 */
public class StockMain {
   
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        //first stock
        System.out.println("First Stock's Symbol: ");
        String symbol1 = console.next();
        Stock stock1 = new Stock(symbol1);
        double profit1 = makePurchases(stock1, console);
        
        //second stock
        System.out.println("First Stock's Symbol: ");
        String symbol2 = console.next();
        Stock stock2 = new Stock(symbol2);
        double profit2 = makePurchases(stock2, console);       
        
        //report which stock made more money
        if (profit1 > profit2){
            System.out.println(symbol1 + " was more profitable than " + symbol2 + ".");
        } else if (profit2 > profit1){
            System.out.println(symbol2 + " was more profitable than " + symbol1 + ".");
        }else{//profit1 == profit2
            System.out.println(symbol1 + " and " + symbol1 + " are equally profitable.");
        }
    }

    //make purchases of stock and return the profit
    private static double makePurchases(Stock currentStock, Scanner console) {
        System.out.println("How many purchases did you make? ");
        int numPurchases = console.nextInt();
        
        //ask about each purchases
        for (int i = 1; i <= numPurchases; i++){
            System.out.println(i + ": How many shares, at waht price per share? ");
            int numShares = console.nextInt();
            double pricePerShare = console.nextDouble();
            
            // ask the Stock object to record this purchases
            currentStock.purchase(numShares, pricePerShare);
        }
       
        //use the Stock object to compute profit
        System.out.println("What is today's price per share? ");
        double currentPrice = console.nextDouble();
        
        double profit = currentStock.getProfit(currentPrice);
        System.out.println("Net profit/loss: &" + profit);
        System.out.println();
        return profit;
    }
}
