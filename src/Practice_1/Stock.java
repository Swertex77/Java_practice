package Practice_1;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name,  double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    double getChangePercent() {
        return (currentPrice / previousClosingPrice) / 100;
    }
}

class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк", 281.50, 282.87);
        System.out.println(stock.getChangePercent());

    }
}
