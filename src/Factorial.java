import java.util.*;

/**
 * Created by Соня on 17.10.2014.
 */
public class Factorial implements Iterable<Long> {
    private final int lowerLimit;
    private final int upperLimit;
    private ArrayList<Long> factorials;

    public Iterator<Long> iterator() {
        Iterator<Long> f = factorials.iterator();
        return f;
    }

    public Factorial(int lowerLimit, int upperLimit)
    {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.factorials = new ArrayList<Long>();
        this.fillFact();
    }

    private void fillFact()
    {
            for (int i = this.lowerLimit; i< this.upperLimit; i++)
            {
                this.factorials.add(factCount(i));
            }
    }
    private long factCount(int n)
    {
        if (n == 1) return 1;
        return n*factCount(n-1);
    }

}
