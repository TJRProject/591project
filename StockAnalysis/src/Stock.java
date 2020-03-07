
public class Stock {
    
    private String ticker;
    private double[] historicalPrices;
    private double priceEarningsRatio;
    
    // Add API object to collect data
    // Add Metric object to calculate the various metrics being used
    
    public Stock(String ticker) {
        this.ticker = ticker;
        this.setHistoricalData();
    }
    
    
    public void setHistoricalData() {
        //TODO : get data from API fetch
        
        historicalPrices = new double[] {1,2,3,4,5,6,7,8,9,10};
    }
    
    public double[] getHistoricalPrices() {
        return historicalPrices;
    }
    
    public double getPriceEarningsRatio() {
        return priceEarningsRatio;
    }
    

}
