/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * A cash object represents an amount of money held by an investor
 * @author donny
 */
public class Cash implements Asset{
    private double amount;// amount of money held
    
    // constructs a cash investment of the given amount
    public Cash(double amount){
        this.amount = amount;
    }

    // returns this cash investment's market value, which is equal to the amount of cash
    @Override
    public double getMarketValue() {
        return amount;
    }

    // since cash is a fixed asset, it never has any profit
    @Override
    public double getProfit() {
        return 0.0;
    }
    
    // set the amount of cash invested to the given value
    public void setAmount(double amount){
        this.amount = amount;
    }
}
