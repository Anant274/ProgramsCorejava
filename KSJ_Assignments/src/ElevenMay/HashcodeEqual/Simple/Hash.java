package ElevenMay.HashcodeEqual.Simple;

public class Hash {
    public int aadhar;
    public String name;

    Hash(int aadhar,String name)
    {
        this.aadhar=aadhar;
        this.name=name;
    }

    @Override
    public int hashCode() {
        return aadhar;
    }
}
