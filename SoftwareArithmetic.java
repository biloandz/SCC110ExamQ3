public class SoftwareArithmetic
{
    private boolean debugOutput;

    public SoftwareArithmetic()
    {
        debugOutput = false;
    }

    public void setDebugOutput(boolean d)
    {
        debugOutput = d;
    }

    public int multiply(int n1, int n2)
    {
        int result = 0;
        boolean d = false;

        if (debugOutput)
            System.out.print("SoftwareArithmetic: "  + n1 + " x " + n2);

        while (d != true)
        {
            if (n2 > 0)
            {
                result = result + n1;
                n2--;
            }
            else
            {
                d = true;
            }

        }
            
        if (debugOutput)
            System.out.println(" = " + result); 

        return result;
    }

    public static void main (String[] args)
    {
        SoftwareArithmetic a = new SoftwareArithmetic();

        a.setDebugOutput(true);

        a.multiply(5,4);
        a.multiply(10,0);
        a.multiply(4,-5);
    }
}