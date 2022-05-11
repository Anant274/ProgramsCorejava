package ElevenMay.Collection;

import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String []arg)
    {
        CollectionProgram cs1=new CollectionProgram(1,"anant","pandey");
        CollectionProgram cs2=new CollectionProgram(2,"kumar","pandey");

        System.out.println(cs1.equals(cs2));

        int a=cs1.hashCode();
        int b=cs2.hashCode();



        int c=cs1.getAadhar();

        String d=cs1.getName();

        String e=cs2.getName();



        System.out.println("adhar number "+c);

        System.out.println("name of anant = "+d);
        System.out.println("name of ku = "+e);

        System.out.println("hashcode of a "+a);
        System.out.println("hashcode of b " +b);

        String str[]=null;
        str=d.split("");

        String str1[]=null;
        str1=e.split("");



        System.out.println("is they are equal : "+str.equals(str1));

        if(Arrays.equals(str,str1));
            System.out.println("both str and str1 is equal");

    }
}
