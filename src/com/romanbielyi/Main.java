package com.romanbielyi;

public class Main {

    public static void main(String[] args) {

        System.out.print("Task #1\n*** Integer type ***\n");
        MyList<Integer> myIntegerList = new MyList<>();
        myIntegerList.add(5);
        myIntegerList.add(10);
        myIntegerList.add(-15);
        myIntegerList.add(-5);
        myIntegerList.add(33);
        myIntegerList.add(-2);

        for (Integer elem : myIntegerList.getList()) {
            System.out.printf("elem %d\n", elem);
        }

        System.out.printf("Min: %d\n", myIntegerList.smallest());
        System.out.printf("Max: %d\n", myIntegerList.largest());

        System.out.println("*** Float type ***");
        MyList<Float> myFloatList = new MyList<>();
        myFloatList.add(.0f);
        myFloatList.add(-15.003f);
        myFloatList.add(100.5f);
        myFloatList.add(-4.060f);

        for (Float elem : myFloatList.getList()) {
            System.out.printf("elem %f\n", elem);
        }

        System.out.printf("Min: %f\n", myFloatList.smallest());
        System.out.printf("Max: %f\n", myFloatList.largest());

        System.out.print("\nTask #2\n*** Integer type ***\n");
        MyComparableList<Integer> myComparableList = new MyComparableList<>();
        myComparableList.add(15);
        myComparableList.add(-100);
        myComparableList.add(-1543);
        myComparableList.add(-743);
        myComparableList.add(77);

        for (Integer elem : myComparableList.getList()) {
            System.out.printf("elem %d\n", elem);
        }
        System.out.printf("Min: %d\n", myComparableList.smallest());
        System.out.printf("Max: %d\n", myComparableList.largest());

        System.out.println("*** String type ***");
        MyComparableList<String> myComparableStringList = new MyComparableList<>();


        myComparableStringList.add("Lima");
        myComparableStringList.add("Omega");
        myComparableStringList.add("Alpha");
        myComparableStringList.add("Delta");
        myComparableStringList.add("Foxtrot");
        myComparableStringList.add("Charley");

        for (String elem : myComparableStringList.getList()) {
            System.out.printf("elem %s\n", elem);
        }

        System.out.printf("Min: %s\n", myComparableStringList.smallest());
        System.out.printf("Max: %s\n", myComparableStringList.largest());

        System.out.print("\nTask #3\n*** Long type ***\n");
        Long[] longs = new Long[]{1L, 2L, 300L, -5L, 14L, -44L, 99L};
        Byte[] bytes = new Byte[]{1, 6, 10, 123, -8, 3};

        TComparableArray<Long> tComparableArrayLongs = new TComparableArray<>(longs);
        for (Long elem : tComparableArrayLongs.getArr()) {
            System.out.printf("elem %d\n", elem);
        }

        System.out.printf("Highest %d\n", tComparableArrayLongs.getHighest());
        System.out.printf("Lowest %d\n", tComparableArrayLongs.getLowest());

        System.out.println("*** Type byte ***");
        TComparableArray<Byte> tComparableArrayBytes = new TComparableArray<>(bytes);

        for (Byte elem : tComparableArrayBytes.getArr()) {
            System.out.printf("elem %d\n", elem);
        }

        System.out.printf("Highest %d\n", tComparableArrayBytes.getHighest());
        System.out.printf("Lowest %d\n", tComparableArrayBytes.getLowest());

    }
}
