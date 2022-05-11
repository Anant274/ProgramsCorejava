package TenMay.Collection;

import java.util.ArrayList;

public class RemoveDuplEle {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(7);
        li.add(7);
        li.add(6);

        ArrayList<Integer> lis=DulpiArr(li);
        System.out.println(lis);

    }
    public static ArrayList<Integer> DulpiArr(ArrayList<Integer> li)
    {
        ArrayList<Integer> lim=new ArrayList<>();
        for (Integer i:li)
        {
            if(!lim.contains(i)) {
                lim.add(i);
            }
        }
        return lim;
    }

}
