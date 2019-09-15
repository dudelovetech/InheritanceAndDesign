/* The MutualFund class receives similar treatment, but with a double for its total shares (the two classes are highly redundant; we'll improve them in the next section):
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 *  A MutualFund object represents a mutual fund asset.
 * @author donny
 */
public class MutualFund extends ShareAsset implements Asset{
    private double totalShares;
    
    // constructs a new MutualFund investment with the given symbol and price per share
    public MutualFund(String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares = 0.0;
    }
    
    // returns the market value of this mutual fund, which is the number of shares
    // times the price per share
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }
    
    // returns the number of shares of this mutual fund
    public double getTotalShares(){
        return totalShares;
    }
    
    // records purchase of the given shares at the given price
    public void purchase(double shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
