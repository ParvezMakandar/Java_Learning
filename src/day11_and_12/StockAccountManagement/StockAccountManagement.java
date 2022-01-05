package day11_and_12.StockAccountManagement;

public interface StockAccountManagement
{
    void addStocks(Stocks share);

    void getStockDetails();

    void calculateShareValue();

    void removeStock(String name);

    void sellStocks(String shareName, int count);

    void buyStocks(String shareName, int count);

}
