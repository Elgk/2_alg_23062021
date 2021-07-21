package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Double d = -78.0;
//
//        System.out.println(Integer.toHexString(d.hashCode()));

//        Long l = -78L;
//        System.out.println(Integer.toHexString(l.hashCode()));

//        int x = Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(Math.abs(x));
        MyChainingHashMap<Integer, String> mhm = new MyChainingHashMap<>(7);
        mhm.put(1, "one");
        mhm.put(22, "twenty_to");
        mhm.put(11, "eleven");
        mhm.put(15, "fff");
        System.out.println(mhm.get(15));
        mhm.put(15,"fifteen");
        System.out.println(mhm.get(15));
        System.out.println(mhm.contain(111));
        System.out.println(mhm);


        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            mhm.put(random.nextInt(1000), ".");
//        }

// при оптимальном заполнении
        for (int i = 0; i < 10; i++) {
            mhm.put(random.nextInt(1000), ".");
        }
        System.out.println(mhm.toString());
        System.out.println("-----");
        MyLinearProbingHashMap<Integer, String> lpm = new MyLinearProbingHashMap();
        lpm.put(1, "one");
        lpm.put(4545, "five");
        lpm.put(20, "twenty");

        System.out.println(lpm.get(4545));
    }
}
