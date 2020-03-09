//package to pull data:
//https://github.com/sstrickx/yahoofinance-api


/**
 * Class for holding stock specific data for use in User presented data and alerts.
 * 
 * @author robertstanton
 *
 */
public class Stock {
    
    private String ticker;
    private double[] historicalPrices;
    private double priceEarningsRatio;
    
    // Add API object to collect data
    // Add Metric object to calculate the various metrics being used
    
    /**
     * Constructs stock object by assigning ticker and setting historical data.
     * 
     * @param ticker
     */
    public Stock(String ticker) {
        this.ticker = ticker;
        this.setHistoricalData();
    }
    
    /**
     * Retrieves historical data for the specified stock.
     */
    public void setHistoricalData() {
        //TODO : get data from API fetch
        
        historicalPrices = new double[] {1,2,3,4,5,6,7,8,9,10};
    }
    
    /**
     * Returns an array of historical prices.
     * 
     * @return
     */
    public double[] getHistoricalPrices() {
        return historicalPrices;
    }
    
    /**
     * Returns the stocks current Price to Earnings Ratio.
     * @return
     */
    public double getPriceEarningsRatio() {
        return priceEarningsRatio;
    }
    

}
