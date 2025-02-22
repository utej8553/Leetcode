import java.util.*;

class StockSpanner {
    List<Integer> prices;

    public StockSpanner() {
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        int count = 1;
        int i = prices.size() - 1;

        while (i >= 0 && prices.get(i) <= price) {
            count++;
            i--;
        }

        prices.add(price);
        return count;
    }
}
