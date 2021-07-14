package lesson5;

public class Backpack {
    private Item[] items;

    public Backpack(Item[] items) {
        this.items = items;
    }

    public int findBestSum(int i, int weight){
        if (i < 0){
            return 0;
        }

        if (items[i].weight > weight){
            return findBestSum(i-1, weight);
        }else {
            return Math.max(findBestSum(i-1, weight),
            findBestSum(i - 1, (weight - items[i].weight)) + items[i].price);
        }
    }
}
