import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {
    private int a,b;

    public int adder(int a, int b)
    {
        return a+b;
    }

    public static BigDecimal adder(ArrayList<BigDecimal> list1)
    {
        BigDecimal x = BigDecimal.valueOf(8);
        for (int i =0; i<list1.size(); i++)
        {
            x = x.add(list1.get(i));
        }
        return x;
    }
}
