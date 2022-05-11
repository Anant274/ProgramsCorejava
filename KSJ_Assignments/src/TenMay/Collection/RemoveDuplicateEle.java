package TenMay.Collection;

import java.util.ArrayList;

public class RemoveDuplicateEle {
    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(5);
        li.add(3);

        ArrayList<Integer> al = ArrayDupli(li);
        System.out.println(al);
    }

    public static ArrayList<Integer> ArrayDupli(ArrayList<Integer> li) {
        ArrayList<Integer> lim = new ArrayList<>();
        for (Integer i:li)
        {
            if(!lim.contains(i))
            {
                lim.add(i);
            }
        }
        return lim;

    }

}
