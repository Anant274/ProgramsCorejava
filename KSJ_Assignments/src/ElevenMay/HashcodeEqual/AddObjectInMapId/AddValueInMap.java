package ElevenMay.HashcodeEqual.AddObjectInMapId;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AddValueInMap {
    public static void main(String []arg)
    {
        Value v1=new Value(1,"name");
        Value v2=new Value(2,"kumar");
        Value v3=new Value(3,"pandey");

        HashMap<Value,String> hm=new HashMap<>();
        hm.put(v1,"anant");
        hm.put(v2,"kumar");
        hm.put(v3,"pandey");

        Iterator itr=hm.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<Value,String>  mp=(Map.Entry)itr.next();
            System.out.println(mp.getValue()+" " + mp.getKey());
        }






    }
}
