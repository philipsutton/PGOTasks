import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {
    private int a,b,c,d;

    public int multiplier(int a, int b)
    {
     return(a*b);


    }

    public int multiplier(int a, int b, int c, int d)
    {
        int x = a*b;
        int y = c*d;
       return multiplier(x,y);
    }

    public double multiplier(double a, double b)
    {
      return  multiplier(a,b);
    }

    public BigDecimal multiplier (BigDecimal a, BigDecimal b)
    {
        return multiplier(a,b);
    }



    public static int multiplier(ArrayList<Integer> list)
    {
        Integer result = 1;
        for (int i =0; i<list.size(); i++)
        {
            result *= list.get(i);
        }
        return result;
    }



}
