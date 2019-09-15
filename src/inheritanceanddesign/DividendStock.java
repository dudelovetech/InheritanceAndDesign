/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * A DividendStock object represents a stock purchase that also pays dividends
 * @author donny
 */
public class DividendStock extends Stock{
    private double dividends; // amount of dividends paid
    
    // constructs a new DividendStock with the given symbol and no shares purchased
    public DividendStock(String symbol, double currentPrice){
        super(symbol, currentPrice);
        dividends = 0.0;
    }
    
    // returns this DividendStock's market value, which is a normal stock's 
    // market value plus any dividends
    public double getMarketValue(){
        return super.getMarketValue() + dividends;
    }
    
    // records a dividend of the given amount per share
    public void payDividentd(double amountPerShare){
        dividends += amountPerShare * getTotalShares();
    }
}
