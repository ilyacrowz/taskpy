package ru.geekbrains;

import java.util.ArrayList;
import java.util.Random;

public class main3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 != 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list1);
    }
}



UnaryOperator<List<String>> trimHeader = (inList) -> {
    List<String> outList = new ArrayList<>();
    for (String s : inList) {
        String[] elements = s.split(" ");
        outList.add(Arrays.stream(elements).skip(1).collect(Collectors.joining(" ")));
    }
    return outList;
};

List<String> list = new ArrayList<>();
list.add("01 Hello 88");
trimHeader.apply(list).forEach(System.out::println);