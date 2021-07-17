package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(5, "five");
        map.put(3, "three");
        map.put(9, "nine");
        map.put(4, "four");
        map.put(7, "seven");
        System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
        System.out.println(map.contains(9));

        Random random = new Random();
        int n = 10000 ;// number of trees
        int rand = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            MyTreeMap<Integer, Integer> mapp = new MyTreeMap<>();
            for (int j = 0; j < 13; j++) {
                rand = random.nextInt(100) - random.nextInt(100);
                mapp.put(rand, rand);
            }
            if (!mapp.isBalanced()) {
                cnt++;
            }
        }
        double percent = (double) 100 * cnt / n;
        System.out.printf("number of nonbalanced trees: %d, percent: %10.4f", cnt, percent);

    }
}
