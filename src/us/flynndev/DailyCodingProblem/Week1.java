package us.flynndev.DailyCodingProblem;

import java.util.ArrayList;

public class Week1 {
    public static boolean day1(ArrayList<Integer> list, Integer k) {
        for(Integer current : list) if(list.contains(k - current)) return true;
        return false;
    }
    public static ArrayList<Integer> day2(ArrayList<Integer> in) {
        ArrayList<Integer> out = new ArrayList<>();
        for(int i = 0; i < in.size(); i++) {
            Integer current = 1;
            for(int i2 = 0; i2 < in.size(); i2++) {
                if(i == i2) continue;
                current = current * in.get(i2);
            }
            out.add(current);
        }
        return out;
    }

    public static void main(String[] args){
        ArrayList<Integer> i1 = new ArrayList<>();
        i1.add(10);
        i1.add(15);
        i1.add(3);
        i1.add(7);
        System.out.println(day1(i1, 17));

        ArrayList<Integer> i2 = new ArrayList<>();
        i2.add(1);
        i2.add(2);
        i2.add(3);
        i2.add(4);
        i2.add(5);
        System.out.println(day2(i2));
    }
}
