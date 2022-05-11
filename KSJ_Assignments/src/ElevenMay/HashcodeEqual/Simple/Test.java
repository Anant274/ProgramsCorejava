package ElevenMay.HashcodeEqual.Simple;

public class Test {

    public static void main(String arg[])
    {
        Hash hs=new Hash(1001,"anant");
        hs.hashCode();
        System.out.println(hs);
        int anantcode=hs.hashCode();
        System.out.println(anantcode);

        Hash sh2=new Hash(1002,"kumar");
        int kumarcode=sh2.hashCode();
        System.out.println(kumarcode);

        //String anant=new String("anant");
        //int ap=anant.hashCode();
        //System.out.println(ap);

        //String kumar=new String("kumar");
        //int ku=kumar.hashCode();
        //System.out.println(ku);

        String st1="anant";
        String st2="anan";

        System.out.println(st1.hashCode()+" "+st2.hashCode());











    }

}
