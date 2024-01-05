import java.util.*;
public class fractionalKnapsack {
    public static class Item{
        Integer value;
        Integer weight;

        public String toString(){
            return value+" "+weight;
        }
    }
    public static class itemComparator implements Comparator<Item>{//sort them in descending order pf value by weight ratio
        public int compare(Item i1,Item i2){
            if ((i1.value/i1.weight) < (i2.value/i2.weight)) return 1;
            else if ((i1.value/i1.weight) > (i2.value/i2.weight)) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> value = List.of(60,120,100);
        List<Integer> weight = List.of(10,30,20);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0;i < value.size();i++){
            Item item = new Item();
            item.value = value.get(i);;
            item.weight = weight.get(i);
            itemList.add(item);
        }
        itemList.sort(new itemComparator());
        System.out.println(itemList);

        int W = 50;//total capacity of knapsack
        int profit = 0;
        while(W > 0){
            for (int i = 0;i < itemList.size();i++){
                if(itemList.get(i).weight < W){
                    profit += itemList.get(i).value;
                    W -= itemList.get(i).weight;
                }
                else{
                    profit += (itemList.get(i).value/itemList.get(i).weight) * W;//calculate the profit for the remaining W and add that in the profit
                    W = 0;
                }
            }
        }
        System.out.println(profit);
    }
}