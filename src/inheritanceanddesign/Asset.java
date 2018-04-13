/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * Represents financial assets that investors hold.
 * @author donny
 */
public interface Asset {
    // how much the asset is worth
    public double getMarketValue();
    
    // how much meoney has been made on this asset
    public double getProfit();
}
