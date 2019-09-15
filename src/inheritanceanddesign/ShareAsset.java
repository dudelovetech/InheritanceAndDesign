/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * A ShareAsset object represents a general asset that has a symbol and holds shares. Initial version.
 * @author donny
 */
public abstract class ShareAsset implements Asset{
    private String symbol;
    double totalCost;
    private double currenPrice;    

    // constructs a new share asset with the given symbol and current price
    public ShareAsset(String symbol, double currentPrice) {
        if (symbol == null) {
            throw new NullPointerException();
        } else {
            this.symbol = symbol;
            this.currenPrice = currentPrice;
        }
        totalCost = 0.0;
    }
    
    // adds a cost of the given amount to this asset
    public void addCost(double cost){
        //check value of cost
        if (cost < 0){
            throw new IllegalArgumentException("cannot add a negative cost");
        }
        totalCost += cost;
    }
    
    // returns the price per share of this asset
    public double getCurrentPrice(){
        return currenPrice;
    }
    
    // returns the total cost of this assets for all shares
    public double getTotalCost(){
        return totalCost;
    }
    
    // sets the current share price of this asset
    public void setCurrentPrice(double currentPrice){
        this.currenPrice = currentPrice;
    }
    
    // returns the current market value of this asset
    public abstract double getMarketValue();
    
    // returns the profit earned on shares of this asset
    public double getProfit(){
        // calls an abstract getMarketValue method
        // (the subclass will provide its implementation)
        return getMarketValue() - totalCost;
    }
}
