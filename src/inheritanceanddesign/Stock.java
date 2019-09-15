/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * A stock object represents purchases of shares of a stock.
 * @author donny
 */
public class Stock extends ShareAsset implements Asset{
    private int totalShares; // total shares purchased
    
    // initializes a new stock with no shares purchased
    // pre: symbol != null
    public Stock(String symbol, double currentPrice){

        super(symbol, currentPrice);
        totalShares = 0;
    }
    
    //returns the total profit or loss earned on this stock, based on the given price per share.
    // pre: currentPrice >= 0.0
    public double getProfit(double currentPrice){
        if (currentPrice < 0.0){
            throw new IllegalArgumentException("the curren price cannot be negative");
        }
        return currentPrice * this.totalShares - this.totalCost;
    }
    
    //records a purchase of a given number of shares of this stock at the given price per share
    // pre: shares >= 0 && pricePerShare >= 0.0
    public void purchase(int shares, double pricePerShare){
        if (shares < 0){
            throw new IllegalArgumentException("number of shares cannot be negative");
        }
        if (pricePerShare < 0.0){
            throw new IllegalArgumentException("price per share cannot be negative");
        }
        
        this.totalShares = this.totalShares + shares;
        addCost(shares * pricePerShare);
    }
    
    // returns the market value of this stock, which is the number of total shares
    // times the share price
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }
    
    // returns the total number of shares purchased
    public int getTotalShares(){
        return totalShares;
    }
}
